package ch11;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new OpenCar();
		
		cityTour(c1);
		cityTour(c2);
	}
	
	static void cityTour(Car c) {
		c.start();
		c.drive();
		c.stop();
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










