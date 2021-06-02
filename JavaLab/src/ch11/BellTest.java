package ch11;

public class BellTest {
	public static void main(String[] args) {
//		Bell b = new DoorBell();
		
		
		b.ring();
	}
}

abstract class Bell{
	/*
	 * 벨소리를 출력한다.
	 */
	abstract void ring();
}

class DoorBell extends Bell{
	public void ring() {
		System.out.println("띵동 띵동~~");
	}
}
