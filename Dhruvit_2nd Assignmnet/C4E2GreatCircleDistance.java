import java.util.Scanner;


public class C4E2GreatCircleDistance {

	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		
		int repeat = -1;
		
		while(repeat < 0)
		{
			System.out.println("Enter point 1 (latitude and longitude) in degrees:");
			
			double x1_Degree = getInput.nextDouble();
			double y1_Degree = getInput.nextDouble();
			
			System.out.println("Enter point 2 (latitude and longitude) in degrees:");

			double x2_Degree = getInput.nextDouble();
			double y2_Degree = getInput.nextDouble();
			
			double radiusOfEarth = 6371.01;
			
			double x1 = Math.toRadians(x1_Degree);
			double y1 = Math.toRadians(y1_Degree);
			double x2 = Math.toRadians(x2_Degree);
			double y2 = Math.toRadians(y2_Degree);
			
			double d = radiusOfEarth * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
			
			System.out.println("The distance between the two points is "+d+" km");

			System.out.println("\nEnter 1 for try again and 0 for exit: ");
			int get = getInput.nextInt();
			
			if(get == 0)
			{
				repeat++;
				System.out.println("Thank You");
			}
		}
		
		getInput.close();
	}

}
