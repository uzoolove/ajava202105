package ch14;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
//		Map<String, String> fruits = new HashMap<>();
//		Map<String, String> fruits = new LinkedHashMap<>();
		Map<String, String> fruits = new TreeMap<>();
		
		fruits.put("월", "바나나");
		fruits.put("화", "딸기");
		fruits.put("수", "사과");
		fruits.put("목", "오렌지");
		fruits.put("화", "파인애플");
		fruits.put("금", "사과");
		fruits.put("토", "망고");
		
		System.out.println("목: " + fruits.get("목"));
		
		printFruits(fruits);
	}
	
	static void printFruits(Map<String, String> fruits) {
		Set<String> keySet = fruits.keySet();
		for(String key : keySet) {
			System.out.println(key + ": " + fruits.get(key));
		}
	}

}













