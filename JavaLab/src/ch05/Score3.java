package ch05;

public class Score3 {
	public int kor;
	public int eng;
	public int math;
	public static int totalCount;

	public int sum() {
		totalCount++;
		int total = kor + eng + math;
		return total;
	}
	
	public double avg() {
		double result = (kor + eng + math) / 3.0;
		return result;
	}
}
