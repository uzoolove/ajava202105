package com.multicampus.multichat202106;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatActivity extends AppCompatActivity {
    private Socket s;
    private BufferedReader in;		// 서버로부터 읽는다.
    private PrintWriter out;	// 서버로 보낸다.

    // 메세지 출력 영역
    private EditText msgOut;
    // 메세지 입력 영역
    private EditText msgInput;
    private Button sendBtn;

    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        setView();
        setEvent();

        Intent intent = getIntent();
        final String SERVER = intent.getStringExtra("server");
        final String NICKNAME = intent.getStringExtra("nickname");

        handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                msgOut.append(msg.getData().getString("recvData") + "\n");
            }
        };

        new Thread(){
            public void run(){
                connect(SERVER, NICKNAME);
            }
        }.start();

    }

    // 화면 구성
    private void setView() {
        msgOut = findViewById(R.id.msgOut);
        msgInput = findViewById(R.id.msgInput);
        sendBtn = findViewById(R.id.sendBtn);
    }

    // 이벤트 등록
    private void setEvent() {
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = msgInput.getText().toString();
                sendMsg(msg);
                msgInput.setText("");
                msgInput.requestFocus();
            }
        });
    }

    // 서버에 메세지 전송
    private void sendMsg(String msg){
        new Thread(){
            public void run(){
                out.println(msg);
            }
        }.start();
    }

    private void connect(String server, String nickname){
        String host = server.split(":")[0];
        int port = Integer.parseInt(server.split(":")[1]);

        try{
            // 소켓 생성(서버 접속 요청)
            s = new Socket(host, port);
            System.out.println("서버에 접속 완료.");

            // 소켓에서 입출력 스트림 생성
            in = new BufferedReader(new InputStreamReader(s.getInputStream(), "UTF-8"));
            out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), "UTF-8"), true);	// auto flush

            // 로그인 요청
            sendMsg("login " + nickname);

            // 서버로부터 받은 데이터 출력
            String recvData = "";
            while((recvData = in.readLine()) != null) {
                Bundle bundle = new Bundle();
                bundle.putString("recvData", recvData);
                Message message = handler.obtainMessage();
                message.setData(bundle);
                handler.sendMessage(message);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }



}