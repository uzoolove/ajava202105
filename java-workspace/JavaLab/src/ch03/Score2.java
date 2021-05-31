package ch03;

public class Score2 {
	int kor;
	int eng;
	int math;

	int sum() {
		int total = kor + eng + math;
		return total;
	}
	
	double avg() {
		double result = sum() / 3.0;
		return result;
	}
}
