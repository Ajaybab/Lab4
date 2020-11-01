package defaultPackage;
import java.util.Scanner;

public class UsageCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: ");
		double radius = sc.nextDouble();
		Circle.setRadius(radius);
		// Demonstrate usage of class
		Circle circle = new Circle(radius);
		System.out.println(circle);
		circle.area();
		circle.diameter();
		circle.circumference();
	}
}
