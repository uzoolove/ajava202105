package ch05.family;

public class Parent {
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
}
