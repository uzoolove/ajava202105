package api;

public class StringTest {

	public static void main(String[] args) {
//		String str = new String("some text");
		String str = "  	 jAva ProGRaMmINg	  ";
		
		System.out.println("[" + str + "]");
		System.out.println("[" + str.length() + "]");
		System.out.println("[" + str.trim() + "]");
		System.out.println("[" + str.toUpperCase() + "]");
		System.out.println("[" + str.toLowerCase() + "]");
		System.out.println("[" + str.charAt(7) + "]");
		System.out.println("[" + str.indexOf("og") + "]");
		System.out.println("[" + str.toLowerCase().indexOf("ra") + "]");
		System.out.println("[" + str.substring(9) + "]");
		System.out.println("[" + str.substring(6, 12) + "]");
		System.out.println("[" + str.toLowerCase().replace('a', '아') + "]");
		// 'g'의 인덱스를 출력(8, 대소문자 구별안함. 앞뒤 공백을 제거한다.)
		System.out.println("[" + str.toLowerCase().trim().indexOf('g') + "]");
		// "java"라는 문자열로 시작하는가?(true, 대소문자 구별안함. 앞뒤 공백을 제거한다.)
		System.out.println("[" + (str.toLowerCase().trim().indexOf("java")==0) + "]");
		System.out.println("[" + str.toLowerCase().trim().startsWith("java") + "]");
		System.out.println("[" + str + "]");
		
		// 문자열 비교
//		String str2 = new String("hello");
		String str2 = "hello";
		System.out.println(str2 == "hello");
		System.out.println(str2.equals(("hello")));
	}

}
