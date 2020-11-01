package defaultPackage;
import java.util.Scanner;

public class Circle {
	static double radius;
	final static double PI=3.14159;
	public Circle(double radius) {
		radius=0.0;
		
	}
	public static void setRadius(double radius) {
		Circle.radius = radius;
	}
	public static double getRadius() {
		return radius;
	}
	
	static void area() {
		 double Area=PI*radius*radius;
		System.out.println("Area of Circle is : "+Area);
	}
	static void diameter() {
		double Diameter= radius*2;
		System.out.println("Diameter of Circle is : "+Diameter);
	}
	static void circumference() {
		double Circumference=2*PI*radius;
		System.out.println("Circumference of Circle is : "+Circumference);
	}
	
}
     