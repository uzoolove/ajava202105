package ch05;

public class Score4 {
	private int kor;
	private int eng;
	private int math;
	
	// setter
	public void setKor(int kor) {
		if(kor > 100) {
			kor = 100;
		}
		this.kor = kor;
	}
	
	// getter
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	private int sum() {
		int total = kor + eng + math;
		return total;
	}
	
	public double avg() {
		double result = sum() / 3.0;
		return Math.round(result);
	}
}
