package ch13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyPerformance {
	
	public static void main(String[] args) {
	    String org = "C:\\ajava\\jdk-15.0.2\\lib\\src.zip";
	    String dest = "C:\\ajava\\jdk-15.0.2\\lib\\javasrc.zip";
	    
	    long start = System.currentTimeMillis();
		
//		copyFile(org, dest);	// 508,486
//		copyFileUseBuffer(org, dest);	// 2,000
		copyFileCustomBuffer(org, dest);	// 200
	
		long finish = System.currentTimeMillis();
		
		System.out.println("소요시간: " + (finish-start) + "ms");
	}

	/**
	 * 1차 스트림(FileInputStream, FileOutputStream)을 이용해서 파일을 복사한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFile(String org, String dest) {
		int readData = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(org);
			fos = new FileOutputStream(dest);
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 2차 스트림(BufferedInputStream, BufferedOutputStream)을 이용해서 파일을 복사한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFileUseBuffer(String org, String dest) {
		int readData = 0;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(org));	// 8KB
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			while((readData = bis.read()) != -1) {
				bos.write(readData);
			}
			bis.close();
			bos.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 1차 스트림(FileInputStream, FileOutputStream)을 이용해서 파일을 복사한다.
	 * 복사 성능을 개선하기 위해서 직접 버퍼기능을 구현한다.
	 * @param org 원본 파일명
	 * @param dest 복사 파일명
	 */
	private static void copyFileCustomBuffer(String org, String dest) {
		int readSize = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(org);
			fos = new FileOutputStream(dest);
			byte[] buff = new byte[1024*8];
			while((readSize = fis.read(buff)) != -1) {
				fos.write(buff, 0, readSize);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


















