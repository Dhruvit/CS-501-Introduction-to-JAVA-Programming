import java.util.Scanner;


public class C4E3EstimateAreas {

	public static void main(String[] args) {
		
		/* GPS locations according to (latitude, longitude)
		1. Atlanta, Georgia = 33.7489954,-84.3879824 (x1,y1)
		2. Orlando, Florida = 28.5383355,-81.37923649999999 (x2,y2)
		3. Savannah, Georgia = 32.0835407,-81.09983419999998 (x3,y3)
		4. Charlotte, North Carolina = 35.2270869,-80.84312669999997 (x4,y4) */
		
		double x1 = Math.toRadians(33.7489954);
		double y1 = Math.toRadians(-84.3879824);
		double x2 = Math.toRadians(28.5383355);
		double y2 = Math.toRadians(-81.37923649999999);
		double x3 = Math.toRadians(32.0835407);
		double y3 = Math.toRadians(-81.09983419999998);
		double x4 = Math.toRadians(35.2270869);
		double y4 = Math.toRadians(-80.84312669999997);
		
		double radiusOfEarth = 6371.01;
		
		int repeat = -1;
		Scanner getInput = new Scanner(System.in);
		
		while(repeat < 0)
		{
			// distance between atlanta(x1, y1) and orlando(x2,y2) 
			double side1 = radiusOfEarth * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
			System.out.println("The distance between Atlanta and Orlando is "+side1+" km");
			
			//distance between orlando(x2,y2) and savannah(x3,y3)
			double side2 = radiusOfEarth * Math.acos(Math.sin(x2)*Math.sin(x3) + Math.cos(x2)*Math.cos(x3)*Math.cos(y2-y3));
			System.out.println("The distance between Orlando and Savannah is "+side2+" km");
			
			//distance between savannah(x3,y3) and charlotte(x4,y4)
			double side3 = radiusOfEarth * Math.acos(Math.sin(x3)*Math.sin(x4) + Math.cos(x3)*Math.cos(x4)*Math.cos(y3-y4));
			System.out.println("The distance between Savannah and Charlotte is "+side3+" km");
			
			//distance between charlotte(x4,y4) and atlanta(x1,y1)
			double side4 = radiusOfEarth * Math.acos(Math.sin(x4)*Math.sin(x1) + Math.cos(x4)*Math.cos(x1)*Math.cos(y4-y1));
			System.out.println("The distance between Charlotte and Atlanta is "+side4+" km");
			
			//distance between atlanta(x1,y1) and savannah(x3,y3)
			double side5 = radiusOfEarth * Math.acos(Math.sin(x1)*Math.sin(x3) + Math.cos(x1)*Math.cos(x3)*Math.cos(y1-y3));
			
			//calculate area of traingle1 using cities atlanta, orlando and savannah
			double s1 = (side1 + side2 + side5)/2;
			double area1 = Math.sqrt(s1*(s1-side1)*(s1-side2)*(s1-side5));
			System.out.println("\nThe area covered by Atlanta, Orlando, Savannah is "+area1+" km2");
			
			//calculate area of traingle2 using cities atlanta, savannah and charlotte
			double s2 = (side3 + side4 + side5)/2;
			double area2 = Math.sqrt(s2*(s2-side3)*(s2-side4)*(s2-side5));
			System.out.println("The area covered by Atlanta, Savannah and Charlotte is "+area2+" km2");
			
			//Total estimated area covered by four cities
			double area = area1 + area2;
			System.out.println("\nTotal estimated area covered by four cities is "+ area +" km2");
			
			System.out.println("\nEnter 1 for try again and 0 for exit: ");
			int get = getInput.nextInt();
			
			if(get == 0)
			{
				repeat++;
				System.out.println("\nThank You");
			}
		}
		
		getInput.close();
		
	}

}
