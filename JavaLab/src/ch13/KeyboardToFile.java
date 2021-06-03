package ch13;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 표준입력장치(키보드) -> 파일(output.txt)
 * @author student
 *
 */
public class KeyboardToFile {
	public static void main(String[] args) {
		int readData = 0;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output.txt");
			while((readData = System.in.read()) != -1) {
				fos.write(readData);
			}
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
























