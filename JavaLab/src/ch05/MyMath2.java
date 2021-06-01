package ch05;

public class MyMath2 {
	int n1;
	int n2;
	
	/*
	 * 생성자: 객체가 생성될 때 자동으로 한번 호출되는 메소드
	 * 주로 객체의 인스턴스 변수를 초기화하는 작업을 한다.
	 * 오버로딩 가능
	 * 만드는 방법
	 * 	- 리턴타입을 기술하지 않는다.
	 * 	- 클래스명과 동일한 이름으로 만든다.
	 */
	MyMath2(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/*
	 * 기본 생성자: 매개변수가 없는 생성자
	 * 	- 생성자를 하나도 정의하지 않은 클래서는 컴파일러에 의해 자동으로 만들어진다.
	 * 	- 생성자를 명시적으로 하나라도 정의할 경우 자동으로 만들지 않는다.
	 */
	MyMath2(){
//		this.n1 = 10;
//		this.n2 = 50;
		this(10, 50);	// 자신의 생성자를 호출한다.(생성자 내부에서만 사용 가능)
	}
	
	void plus() {
		System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
	}
	
	void minus() {
		System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
	}
	
	void multiple() {
		System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
	}
	
	void division() {
		System.out.println(n1 + " / " + n2 + " = " + ((double)n1/n2));
	}

	public static void main(String[] args) {
//		MyMath2 m = new MyMath2(10, 20);
		MyMath2 m = new MyMath2();
		
//		m.n1 = 10;
//		m.n2 = 20;
		
		m.division();
		m.plus();
		m.plus();
		m.plus();
		m.plus();
		m.minus();
		m.multiple();
		
	}

}
