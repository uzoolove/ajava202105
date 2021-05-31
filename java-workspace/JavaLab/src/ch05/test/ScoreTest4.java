package ch05.test;

import ch05.Score4;

public class ScoreTest4 {
	public static void main(String[] args) {
		Score4 kim = new Score4();
		kim.kor = 100;
		kim.eng = 90;
		kim.math = 71;
		System.out.println("kim 평균: " + kim.avg());

		Score4 lee = new Score4();
		lee.kor = 90;
		lee.eng = 80;
		lee.math = 99;
		System.out.println("lee 평균: " + lee.avg());
	}
}
















