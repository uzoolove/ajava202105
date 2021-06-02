package ch11;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new OpenCar();
		Car c3 = new CustomCar1();
		Car c4 = new CustomCar2();
		
		cityTour(c1);
		cityTour(c2);
		cityTour(c3);
		cityTour(c4);
	}
	
	static void cityTour(Car c) {
		c.start();
		c.drive();
		
		System.out.println("벽을 만났다.");
		if(c instanceof Tank) {
			((Tank)c).shoot();
		}else {
			System.out.println("벽을 돌아간다.");
		}
		
		System.out.println("흙더미를 만났다.");
		if(c instanceof Fork) {
			((Fork)c).fork();
		}else {
			System.out.println("흙더미를 돌아간다.");
		}
		
		c.stop();
		System.out.println();
	}
}

class Car{
	void start() {
		System.out.println("출발.");
	}
	void drive() {
		System.out.println("운전중.");
	}
	void stop() {
		System.out.println("정지.");
	}
}
class OpenCar extends Car{
	void open() {
		System.out.println("open.");
	}
	void close() {
		System.out.println("close.");
	}
	void start() {
		open();
		super.start();
	}
	void stop() {		
		super.stop();
		close();
	}
}

interface Tank{
	void shoot();
}

interface Fork{
	void fork();
}

// CustomCar 클래스 정의(Car/OpenCar, Tank/Fork)
class CustomCar1 extends Car implements Fork{
	public void fork() {
		System.out.println("흙더미를 치운다.");
	}
}

class CustomCar2 extends OpenCar implements Fork, Tank{
	public void fork() {
		System.out.println("흙더미를 치운다.");
	}
	public void shoot() {
		System.out.println("포를 쏜다.");
	}
}



