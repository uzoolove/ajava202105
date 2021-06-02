package ch12.single;

public class SingleThreadTest {
	public static void main(String[] args) {
		OddNum odd = new OddNum();
		EvenNum even = new EvenNum();
		
		odd.printOdd();
		even.printEven();
	}
}
