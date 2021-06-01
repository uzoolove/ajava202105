package ch05.test;

import ch05.Score6;

public class ScoreTest6 {
	public static void main(String[] args) {
		Score6 kim = new Score6(100, 90, 71);
		System.out.println("kim 평균: " + kim.avg());

		Score6 lee = new Score6(90, 80, 99);
		System.out.println("lee 평균: " + lee.avg());
		
		System.out.println(kim);
//		System.out.println(kim.toString());
	}
}
















