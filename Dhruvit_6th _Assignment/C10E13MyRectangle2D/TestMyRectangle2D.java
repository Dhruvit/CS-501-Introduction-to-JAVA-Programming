import java.util.Scanner;

public class TestMyRectangle2D {

	public static void main(String[] args) {
		run();
	}
	
	public static void run(){
		
		Scanner getInput = new Scanner(System.in);
		boolean repeat1 = true, repeat2 = true;
		MyRectangle2D r1 = null;
		
		while(repeat1){
			
			//Enter dimension of base rectangle
			System.out.println("Enter center point, width and height for base rectangle.");
			
			try {
					
					System.out.print("Enter x-coordinates : ");
					double x = getInput.nextDouble();
					System.out.print("Enter y-coordinates : ");
					double y = getInput.nextDouble();
					System.out.print("Enter width : ");
					double width = getInput.nextDouble();
					System.out.print("Enter height : ");
					double height = getInput.nextDouble();
					r1 = new MyRectangle2D(x, y, width, height);
					
					System.out.println("Area of base rectangle : "+r1.getArea());
					System.out.println("Perimeter of base rectangle : "+r1.getPerimeter());
				
			} catch (Exception e) {
					
					if(e.getClass().getName().compareTo("java.util.InputMismatchException") == 0){
						System.out.println("Enter number is not a number.  Please enter numeric number.");	
					}
					System.out.println(e.getMessage());
					repeat2 = false;
			}
			
			while(repeat2){
				
				//enter multiple test point
				System.out.println("\nFrom following, which test function u want to run ?\n");
				System.out.println("1.  Does a test point is inside the rectangle?");
				System.out.println("2.  Does a test rectangle is inside another rectangle?");
				System.out.println("3.  Does a test rectangle overlaps another rectangle?");
				
				int choice = getInput.nextInt();
				
				if(choice == 1){
					
					System.out.print("Enter x-coordinates : ");
					double _x = getInput.nextDouble();
					System.out.print("Enter y-coordinates : ");
					double _y = getInput.nextDouble();
					
					System.out.print("Answer :: ");
					
					if(r1.contains(_x, _y))
					{
						System.out.println("A test point is inside the base rectangle");
					}else
					{
						System.out.println("A test point is outside the base rectangle");
					}
					
				}else if(choice == 2){
					System.out.println("Enter center point, width and height for test rectangle.");
					
					try {
						System.out.print("Enter x-coordinates : ");
						double _x = getInput.nextDouble();
						System.out.print("Enter y-coordinates : ");
						double _y = getInput.nextDouble();
						System.out.print("Enter width : ");
						double _width = getInput.nextDouble();
						System.out.print("Enter height : ");
						double _height = getInput.nextDouble();
						System.out.print("Answer :: ");
						
						if(r1.contains(new MyRectangle2D(_x, _y, _width, _height)))
						{
							System.out.println("A test rectangle is inside the base rectangle");
						}else
						{
							System.out.println("A test rectangle is outside the base rectangle");
						}
						
					} catch (Exception e) {
						if(e.getClass().getName().compareTo("java.util.InputMismatchException") == 0){
							System.out.println("Enter number is not a number.  Please enter numeric number.");	
						}
						e.printStackTrace();
					}
					
				}else if(choice == 3){
					System.out.println("Enter center point, width and height for test rectangle.");
					
					try {
						System.out.print("Enter x-coordinates : ");
						double _x = getInput.nextDouble();
						System.out.print("Enter y-coordinates : ");
						double _y = getInput.nextDouble();
						System.out.print("Enter width : ");
						double _width = getInput.nextDouble();
						System.out.print("Enter height : ");
						double _height = getInput.nextDouble();
						System.out.print("Answer :: ");
						
						if(r1.overlaps(new MyRectangle2D(_x, _y, _width, _height)))
						{
							System.out.println("A test rectangle overlaps the base rectangle");
						}else
						{
							System.out.println("A test rectangle do not overlap the base rectangle");
						}
						
					} catch (Exception e) {
						if(e.getClass().getName().compareTo("java.util.InputMismatchException") == 0){
							System.out.println("Enter number is not a number.  Please enter numeric number.");	
						}
						e.printStackTrace();
						
					}
					
				}
				
				System.out.println("\nDo you want to test again (Yes = 1, No = 0) ?");
				int _choice = getInput.nextInt();
				if(_choice == 1){
					repeat2 = true;
				}else if(_choice == 0){
					repeat2 = false;
				}
				
			}
			
			System.out.println("\nDo you want to try with new base rectangle (Yes = 1, No = 0) ?");
			int _choice = getInput.nextInt();
			if(_choice == 1){
				repeat1 = true;
				repeat2 = true;
			}else if(_choice == 0){
				repeat1 = false;
				repeat2 = false;
			}
		}
		getInput.close();
	}
}
