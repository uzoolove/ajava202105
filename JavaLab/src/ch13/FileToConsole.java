package ch13;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 파일(output.txt) -> 표준출력장치(콘솔)
 * @author student
 *
 */
public class FileToConsole {
	public static void main(String[] args) {
		int readData = 0;
		FileInputStream fos = null;
		try {
			fos = new FileInputStream("output.txt");
			while((readData = fos.read()) != -1) {
				System.out.write(readData);
			}
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
























