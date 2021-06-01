package ch05.family;

public class Daughter extends Parent{

	public Daughter(String name) {
		super(name);
	}	
	
	public void play() {
		makeup();
		System.out.println(name + ": 클럽에 간다.");
	}
	
	private void makeup() {
		System.out.println(name + ": 화장한다.");
	}
	
	public void study() {
		System.out.println(name + ": 과외를 받는다.");
	}
}
