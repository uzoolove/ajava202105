package ch14;

import java.util.Arrays;

import ch05.Score6;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 선언
		int[] nums;
		// 배열 생성
		nums = new int[3];
		
		// 배열 선언과 생성
		int[] nums2 = new int[3];
		// 배열 초기화
		nums2[0] = 10;
		nums2[1] = 20;
		nums2[2] = 100;
		
		// 배열 선언, 생성, 초기화
		int[] nums3 = new int[] {10, 20, 100};
		int[] nums4 = {10, 20, 100};
		
		System.out.println(Arrays.toString(nums4));
		
		// 배열의 모든 요소 출력
		for(int i=0; i<nums4.length; i++) {
			System.out.println(nums4[i]);
		}
		
		// enhanced for loop
		for(int num : nums4) {
			System.out.println(num);
		}
		
		// Score 객체를 저장할 배열
		Score6[] scores = new Score6[3];
		scores[0] = new Score6(100, 90, 80);
		scores[1] = new Score6(78, 55, 98);
		scores[2] = new Score6(89, 59, 99);
		
		for(Score6 score : scores) {
			System.out.println(score.avg());
		}
		
		// 새로운 Score 객체 추가
		///////////////////////
//		Score6[] tmp = new Score6[(int)(scores.length*1.5)];
//		for(int i=0; i<scores.length; i++) {
//			tmp[i] = scores[i];
//		}
//		scores = tmp;
		//////////////////////
		
		try {
			scores[3] = new Score6(45, 77,90);
		}catch(ArrayIndexOutOfBoundsException e) {
			Score6[] tmp = new Score6[(int)(scores.length*1.5)];
			for(int i=0; i<scores.length; i++) {
				tmp[i] = scores[i];
			}
			scores = tmp;
		}
		
		System.out.println(Arrays.toString(scores));
	}

}












