import java.text.DecimalFormat;
import java.util.Scanner;

public class C2E15DistanceOfTwoPoints {

	public static void main(String[] args) {
		
		// Get the values of two points (x1, y1) and (x2, y2)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two points (x1, y1) and (x2, y2) for calculating distance");
		
		System.out.print("Enter x1 and y1 = ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2 = ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("Distance between 2 point = "+ Math.pow((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)),0.5));

	}

}
