package ch03;

public class ScoreTest {

	public static void main(String[] args) {
		// 김철수의 국어, 영어, 수학 점수가 각각 100, 90, 71일때
		// 총점과 평균을 출력하시오.
		Score kim = new Score();
		kim.kor = 100;
		kim.eng = 90;
		kim.math = 71;
		kim.sum = kim.kor + kim.eng + kim.math;
		kim.avg = kim.sum / 3.0;
		
//		kim.math += 10;
//		kim.sum = kim.kor + kim.eng + kim.math;
//		kim.avg = kim.sum / 3.0;
		
		System.out.println("kim 총점: " + kim.sum);
		System.out.println("kim 평균: " + kim.avg);

		// 이영희의 국어, 영어, 수학 점수가 각각 90, 80, 99일때
		// 총점과 평균을 출력하시오.
		Score lee = new Score();
		lee.kor = 90;
		lee.eng = 80;
		lee.math = 99;
		lee.sum = lee.kor + lee.eng + lee.math;
		lee.avg = lee.sum / 3.0;
		System.out.println("lee 총점: " + lee.sum);
		System.out.println("lee 평균: " + lee.avg);

	}

}
