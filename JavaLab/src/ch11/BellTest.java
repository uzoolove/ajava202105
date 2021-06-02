package ch11;

public class BellTest {
	public static void main(String[] args) {
//		Bell b = new DoorBell();
		Bell b = new AlarmBell();
		
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

// Bell을 상속받는 클래스 정의
class AlarmBell extends Bell{

	@Override
	void ring() {
		System.out.println("띠리리리 띠리리리~~");
	}
	
}









