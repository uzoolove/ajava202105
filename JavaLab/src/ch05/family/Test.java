package ch05.family;

public class Test {

	public static void main(String[] args) {
//		Parent p = new Parent("부모");
		Gamer p = new Son("아들");
//		Parent p = new Daughter("딸");
//		Gamer p = new SonFriend();
		
//		dailyPlan(p);
		
		playGame(p);
	}
	
	static void dailyPlan(Parent p) {
		p.eat();
		
		/*
		 * 다형성의 조건
		 * 	1. 상속관계
		 * 	2. up casting
		 * 	3. 메소드 오버라이딩
		 */
		p.play();	// 다형성(캬바레, 나이트, 클럽)
		
		if(p instanceof Son) {
			Son s = (Son)p;
			s.game();
		}		
		
		p.study();
		
		p.sleep();
	}
	
	static void playGame(Gamer g) {
		g.game();
	}
	
//	static void dailyPlan(Son p) {
//		p.eat();
//		p.play();
//		p.sleep();
//	}

}
