package ch05.test;

import ch05.Score5;

public class ScoreTest5 {
	public static void main(String[] args) {
		Score5 kim = new Score5(100, 90, 71);
		System.out.println("kim 평균: " + kim.avg());

		Score5 lee = new Score5(90, 80, 99);
		System.out.println("lee 평균: " + lee.avg());
		
		System.out.println(kim);
//		System.out.println(kim.toString());
	}
}
















