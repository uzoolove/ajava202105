package ch13;


public class FileCopyPerformance {
	
	public static void main(String[] args) {
    String org = "C:\\androidjava\\jdk1.8\\src.zip";
    String dest = "C:\\androidjava\\jdk1.8\\javasrc.zip";
    long start = System.currentTimeMillis();
		
		copyFile(org, dest);
//		copyFileUseBuffer(org, dest);
//		copyFileCustomBuffer(org, dest);
	
		long finish = System.currentTimeMillis();
		System.out.println("소요시간: " + (finish-start) + "ms");
	}

	/**
	 * 1차 스트림(FileInputStream, FileOutputStream)을 이용해서 파일을 복사한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFile(String org, String dest) {
		
	}
	
	/**
	 * 2차 스트림(BufferedInputStream, BufferedOutputStream)을 이용해서 파일을 복사한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFileUseBuffer(String org, String dest) {
		
	}
	
	/**
	 * 1차 스트림(FileInputStream, FileOutputStream)을 이용해서 파일을 복사한다.
	 * 복사 성능을 개선하기 위해서 직접 버퍼기능을 구현한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFileCustomBuffer(String org, String dest) {
		
	}
}


















