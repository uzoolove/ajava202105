package ch12.multi;

/*
 * Thread 만드는 방법 1
 * 	- extends Thread
 * 	- run() 오버라이드
 */
public class OddNum extends Thread{
//	public OddNum() {
//		super();
//	}
	// 1~10 까지의 홀수 출력
	public void run(){
		System.out.println("2. 홀수 출력 시작.");
		for(int i=1; i<=10; i+=2) {
			System.out.println("3. 홀수: " + i);
		}
		System.out.println("4. 홀수 출력 종료.");
	}
}
