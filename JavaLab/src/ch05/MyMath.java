package ch05;

public class MyMath {
	
	/**
	 * 10 + 20의 결과를 출력한다.
	 */
	void printSum() {
		int n1 = 10;
		int n2 = 20;
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
	
	/**
	 * 10 + 지정한 수의 결과를 출력한다.
	 * @param n2 10에 더할 숫자
	 */
	void printSum(int n2) {
		int n1 = 10;
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
	
	/**
	 * 지정한 두 수의 합계를 출력한다.
	 * @param n1 첫번째 숫자
	 * @param n2 두번째 숫자
	 */
	void printSum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result);
	}
	
	/**
	 * 지정한 두 수의 합계를 반환한다.
	 * @param n1 첫번째 숫자
	 * @param n2 두번째 숫자
	 * @return 합계
	 */
	String getSum(int n1, int n2) {
		int result = n1 + n2;
		return (n1 + " + " + n2 + " = " + result);
	}

	public static void main(String[] args) {
		MyMath m = new MyMath();
		m.printSum();
		m.printSum(30);
		m.printSum(40);
		m.printSum(40, 50);
		m.printSum(60, 70);
		String sum = m.getSum(70, 80);
		System.out.println(sum);
	}

}











