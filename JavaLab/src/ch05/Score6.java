package ch05;

public class Score6 {
	private int kor;
	private int eng;
	private int math;
	
	public Score6(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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

	@Override
	public String toString() {
		return "Score6 [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
