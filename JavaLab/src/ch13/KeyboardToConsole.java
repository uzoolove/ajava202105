package ch13;

import java.io.IOException;

/**
 * 표준입력장치(키보드)에서 읽은 내용을 표준출력장치(콘솔)에 출력한다.
 * @author student
 *
 */
public class KeyboardToConsole {
	public static void main(String[] args) {	
		int readData = 0;
		try {
			while((readData = System.in.read()) != -1) {
				System.out.write(readData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
























