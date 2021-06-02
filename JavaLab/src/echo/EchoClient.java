package echo;

import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class EchoClient {
	private Socket s;
	private InputStream in;		// 서버로부터 읽는다.
	private OutputStream out;	// 서버로 보낸다.
	private InputStream key;	// 키보드로부터 읽는다.

	// 객체 생성 후 호출할 메소드
	private void onCreate() {
		final String SERVER = "localhost:1234";
		final String NICKNAME = "김철수";
		connect(SERVER, NICKNAME);
	}

	// 서버에 메세지 전송
	private void sendMsg(String msg){

	}
	
	private void connect(String server, String nickname){
		String host = server.split(":")[0];
		int port = Integer.parseInt(server.split(":")[1]);
		
		try{
			// 소켓 생성(서버 접속 요청)			
			
			// 소켓에서 입출력 스트림 생성
			
			// 키보드에서 입력한 문자를 꺼내기 위한 입력 스트림 생성
			
			// 키보드에서 입력한 데이터를 출력 스트림으로 전송
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		EchoClient ec = new EchoClient();
		ec.onCreate();
	}
}




























