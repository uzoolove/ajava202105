package ch04;

public class OperatorTest {

	public static void main(String[] args) {
		byte b = 100;
		short s = 30000;
		int i = 2000000000;
		long l = 2347237489238497283L;
		float f = 492837484897289.547895489F;
		double d = 23984729837489237489.78547854;
		char c1 = 'a';
		char c2 = '김';
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(b1);
		System.out.println(b2);
		
		int bb = (int)b + 100;
		System.out.println(bb);
		
		byte bbb = (byte)bb;	// 紐낆떆�쟻 �삎蹂��솚
		System.out.println(bbb);
		
		int bbbb = b;	// �븫�떆�쟻(臾듭떆�졊) �삎蹂��솚
		System.out.println(bbbb);		
		
	}

}
