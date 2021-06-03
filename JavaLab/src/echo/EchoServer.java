package echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {
	private ServerSocket ss;
	private Socket s;
	private InputStream in;
	private OutputStream out;
	
	private void startServer(){
		try{
			// 서버소켓 생성
			ss = new ServerSocket(1234);
			System.out.println("서버 구동 완료. 1234");
			
			while(true) {
				// 클라이언트 접속 대기
				s = ss.accept();
				System.out.println("클라이언트 접속. " + s.getInetAddress().getHostAddress());
				
				EchoServerThread t = new EchoServerThread();
				t.start();
			}
		}catch(SocketException e) {
			System.out.println(s.getInetAddress().getHostAddress() + " 접속 종료.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoServer().startServer();
	}
}





















