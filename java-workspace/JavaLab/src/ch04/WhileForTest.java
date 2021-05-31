package ch04;

public class WhileForTest {
	public static void main(String[] args) {
		// 1~100 합계(while)
		int sum = 0;
		int n = 1;
		while(n <= 100) {
			sum += n;
			n++;
		}
		
		// 1~100 합계(for)
		sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합계: " + sum);		
		
		/*
		 * 채팅앱을 구글플레이에 런칭했다.
		 * 가격은 1000원.
		 * 1일차에 1명이 다운로드 받음.
		 * 2일차에 2명이 다운로드 받음.
		 * 3일차에 4명이 다운로드 받음
		 * 4일차에 8명.
		 * 5일차에 16명.
		 * ......
		 * 20일차에 총 매출은 얼마인가?(for)
		 * 
		 */
		int price = 1000;
		long totalDownload = 0;
		int todayDownload = 1;
		for(int day=1; day<=17; day++) {
			totalDownload += todayDownload;
			todayDownload *= 2;
		}
		System.out.println("매출은 " + totalDownload * price);
		
		/*
		 * 총 매출 1억을 넘기려면 몇일이 걸리나?(while)
		 */
		int day = 1;
		totalDownload = 0;
		todayDownload = 1;
		while(totalDownload < 100000000/price) {
			totalDownload += todayDownload;
			todayDownload *= 2;
			day++;
		}
//		day--;
		System.out.println(--day + "일이 지나면 매출은 " + totalDownload*price);
	}
}









