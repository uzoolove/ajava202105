package ch05;

public class Score4 {
	public int kor;
	public int eng;
	public int math;

	private int sum() {
		int total = kor + eng + math;
		return total;
	}
	
	public double avg() {
		double result = sum() / 3.0;
		return Math.round(result);
	}
}
