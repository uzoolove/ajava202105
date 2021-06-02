package ch12.single;

public class SingleThreadTest {
	public static void main(String[] args) {
		System.out.println("1. main 시작.");
		OddNum odd = new OddNum();
		EvenNum even = new EvenNum();
		
		odd.printOdd();
		even.printEven();
		System.out.println("8. main 종료.");
	}
}
