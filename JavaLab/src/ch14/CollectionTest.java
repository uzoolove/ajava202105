package ch14;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
//		List<String> fruits = new ArrayList<String>();
//		List<String> fruits = new LinkedList<String>();
//		List<String> fruits = new Vector<String>();
		
//		Set<String> fruits = new HashSet<String>();
//		Set<String> fruits = new LinkedHashSet<String>();
		Set<String> fruits = new TreeSet<String>();
		
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("사과");
		fruits.add("오렌지");
		fruits.add("파인애플");
		fruits.add("사과");
		fruits.add("망고");
		
		printFruits(fruits);
		
	}
	
	static void printFruits(Collection<String> fruits) {
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
//	static void printFruits(Iterator<String> fruits) {
//		while(fruits.hasNext()) {
//			String fruit = fruits.next();
//			System.out.println(fruit);
//		}
//	}
	
//	static void printFruits(Set<String> fruits) {
//		Iterator<String> it = fruits.iterator();
//		while(it.hasNext()) {
//			String fruit = it.next();
//			System.out.println(fruit);
//		}
//	}
//	
//	static void printFruits(List<String> fruits) {
//		for(var i=0; i<fruits.size(); i++) {
//			String fruit = fruits.get(i);
//			System.out.println(fruit);
//		}
//	}
	
//	static void printFruits(LinkedList fruits) {
//		for(var i=0; i<fruits.size(); i++) {
//			String fruit = (String)fruits.get(i);
//			System.out.println(fruit);
//		}
//	}
//	
//	static void printFruits(ArrayList fruits) {
//		for(var i=0; i<fruits.size(); i++) {
//			String fruit = (String)fruits.get(i);
//			System.out.println(fruit);
//		}
//	}

}















