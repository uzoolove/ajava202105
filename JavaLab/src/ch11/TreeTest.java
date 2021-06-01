package ch11;

public class TreeTest {
	public static void main(String[] args) {
//		Tree t1 = new PineTree();
		Tree t1 = new Maple();	// 3. up casting
		t1.leafShape();	// 다형성
	}
}

interface Tree{
	void leafShape();
}

class PineTree implements Tree{	// 1. 상속
	@Override
	public void leafShape() {	// 2. override
		System.out.println("뾰족한 소나무 잎을 그린다.");
	}
}

class Maple implements Tree{
	@Override
	public void leafShape() {
		System.out.println("별모양의 단풍나무 잎을 그린다.");
	}	
}
