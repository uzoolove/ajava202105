package com.multicampus.multichat202106;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.enterBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String server = ((TextView)findViewById(R.id.server)).getText().toString();
                String nickname = ((TextView)findViewById(R.id.nickname)).getText().toString();
                System.out.println(server);
                System.out.println(nickname);

                // ChatActivity 호출
                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                intent.putExtra("server", server);
                intent.putExtra("nickname", nickname);

                startActivity(intent);
            }
        });
    }
}