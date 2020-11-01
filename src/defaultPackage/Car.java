package defaultPackage;

import java.util.Scanner;

public class Car {
	static int yearModel;
	static int speed;
	String make;
	
	public static int getYearModel() {
		return yearModel;
	}
	public static void setYearModel(int yearModel) {
		Car.yearModel = yearModel;
	}
	public static int getSpeed() {
		return speed;
	}
	public static void setSpeed(int speed) {
		Car.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Car() {
		speed= 0;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter year");
		  yearModel=Sc.nextInt();
		System.out.println("Enter Make");
		make = Sc.next();
	}
	 void accessors() {
		System.out.println("YearModel"+yearModel);
		System.out.println("Car Make"+make);
		System.out.println("Speed"+speed);
	}
	static void accelerate() {
		speed+=5;
		System.out.println("Current speed of car:" +speed);
	}
	static void brake() {
		  speed-=5;
		 System.out.println("Current Speed after applying Brake: "+speed);
	}
	
}
