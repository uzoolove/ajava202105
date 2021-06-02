package echo;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class EchoServer {
  private ServerSocket ss;
  private Socket s;
  private InputStream in;
  private OutputStream out;
	private void startServer(){
		try{
			// 서버소켓 생성
			
			// 클라이언트 접속 대기
			
			// 소켓에서 입출력 스트림 생성
			
			// 입력 스트림에서 읽고 출력 스트림으로 전송한다.
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoServer().startServer();
	}
}





















