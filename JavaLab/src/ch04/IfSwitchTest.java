package ch04;

public class IfSwitchTest {
	public static void main(String[] args) {
		byte kor = 90;
		int eng = 80;
		long math = 59;
		
//		math = math + 1;
//		math += 1;	// 대입 연산자.
//		math++;	// 증감연산자.
		
		long sum = kor + eng + math;
		double avg = sum / 3.0;
		
		// + -> 결합연산자("총점: 232")
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		
		// 각 과목의 과락은 60점.
		// 과락이 없고 평균이 70점 이상이면 "pass"를 출력하고
		// 과락이 있거나 평균이 70점 미만이면 "fail"을 출력하시오.
		if(kor>=60 && eng>=60 && math>=60 && avg>=70) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		/*
		 * 평균에 따른 학점 출력
		 * A, B, C, D, F
		 */
		if(avg >= 90) {
			System.out.println('A');
		}else if(avg >= 80){
			System.out.println('B');
		}else if(avg >= 70){
			System.out.println('C');
		}else if(avg > 60){
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		
		switch((int)avg/10) {
			case 10:
			case 9:
				System.out.println('A');
				break;
			case 8:
				System.out.println('B');
				break;
			case 7:
				System.out.println('C');
				break;
			case 6:
				System.out.println('D');
				break;
			default:
				System.out.println('F');
				break;
		}
	}
}













