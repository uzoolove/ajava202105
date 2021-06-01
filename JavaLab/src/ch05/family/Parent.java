package ch05.family;

/*
 * 추상클래스
 * 	추상메소드를 하나라도 가지고 있는 클래스는 반드시 추상클래스로 선언해야 한다.
 * 	추상메소드가 없더라도 추상클래스로 선언 가능.
 * 	객체를 생성할 수 없다.(new Parent() 불가능)
 */
public abstract class Parent extends Object{
	String name;
	public Parent(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + ": 집밥을 먹는다.");
	}
	public void play() {
		System.out.println(name + ": 캬바레에 간다.");
	}
	public void sleep() {
		System.out.println(name + ": 잔다.");
	}
	
	/*
	 * 추상메소드: 메소드 선언부만 있고 내용을 구현하지 않은 메소드
	 * 	자식클래스에서 반드시 구현해야 한다.
	 * 	abstract 키워드 추가.
	 * 	추상메소드를 하나라도 가지고 있는 클래스는 추상클래스로 선언해야 한다.
	 */
	public abstract void study();
}
