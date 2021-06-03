package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 파일(output.txt) -> 파일(output2.txt)
 * @author student
 *
 */
public class FileToFile {
	public static void main(String[] args) {
		int readData = 0;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("output.txt");
			fos = new FileOutputStream("output2.txt");
			while((readData = fis.read()) != -1) {
				fos.write(readData);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
























