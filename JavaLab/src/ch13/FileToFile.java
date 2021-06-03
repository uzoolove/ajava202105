package ch13;

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
























