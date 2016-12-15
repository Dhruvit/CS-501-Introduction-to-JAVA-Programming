import java.util.Scanner;

public class C3E27PointsInTriangle {
	
	public static void main(String[] args) {
		
		Scanner inVariable = new Scanner(System.in);
        /* The right-angle point is placed at (0, 0), and the other two points are placed at 
         * (200, 0), and (0, 100) and line equation passing from (200, 0) and (0, 100) 
         * is according to x + 2y = 200  */
		
		int repeat = -1;
		
		while(repeat < 0)
		{
			
			System.out.print("Enter a point's x- and y-coordinates: ");
			
			double x1 = inVariable.nextDouble();
			double y1 = inVariable.nextDouble();
			
			double cal = x1 + 2*y1;  // putting point value in x + 2y 
			
			if(x1 > 0)  //check point whether is point right side of y-axis 
			{
				if(y1 > 0)  //check point whether is point above the x-axis 
				{
					if(cal < 200)  //check point whether is inside the triangle 
					{
						System.out.println("The point is in the triangle");
						
					}
					else
					{
						System.out.println("The point is not in the triangle");
						
					}
				}
				else
				{
					System.out.println("The point is not in the triangle");
					
				}
			}
			else
			{
				System.out.println("The point is not in the triangle");
				
			}
			
			System.out.println("\nEnter 1 for try again and 0 for exit: ");
			int get = inVariable.nextInt();
			
			if(get == 0)
			{
				repeat++;
				System.out.println("\nThank You....");
			}
			
		}
						
		inVariable.close();
			
	}

}
