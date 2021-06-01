package ch05;
public class CallByReference {
	static void something(int first, MyObject second) {
		first += 10;
		second.value += 10;
		System.out.println("first: " + first + ", second: " + second.value);
	}

	public static void main(String[] args) {
		int n1 = 80;
		MyObject n2 = new MyObject(80);
		
		System.out.println("n1: " + n1 + ", n2: " + n2);
		something(n1, n2);
		System.out.println("n1: " + n1 + ", n2: " + n2);
	}
}

class MyObject{
	int value;
	MyObject(int value){
		this.value = value;
	}
}