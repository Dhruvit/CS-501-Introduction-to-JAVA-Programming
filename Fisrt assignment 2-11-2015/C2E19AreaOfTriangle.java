import java.text.DecimalFormat;
import java.util.Scanner;

public class C2E19AreaOfTriangle {

	public static void main(String[] args) {
		
		// Get the values of two points (x1, y1), (x2, y2), (x3, y3) 
		
				Scanner input = new Scanner(System.in);
				
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(2);
				
				System.out.println("Enter three points (x1, y1), (x2, y2), (x3, y3) for area of triangle = ");
				
				double x1 = input.nextDouble();
				double y1 = input.nextDouble();
				double x2 = input.nextDouble();
				double y2 = input.nextDouble();
				double x3 = input.nextDouble();
				double y3 = input.nextDouble();
				
				double side1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
				double side2 = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2));
				double side3 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));
				
				double s = (side1 + side2 + side3)/2;
				
				System.out.print("The area of the triangle is "+df.format(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))));
	}
}
