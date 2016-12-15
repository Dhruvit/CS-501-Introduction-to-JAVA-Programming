import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args){
		run();	
	}
	
	public static void run() {
		
		Scanner getInput = new Scanner(System.in);
		double side1,side2,side3;
		String color;
		int choice;
		
		boolean repeat = true;
		
		while(repeat){
			
			try {
				System.out.println("Enter diemensions of triangle::");
				
				System.out.println("Enter side-1:");
				side1 = getInput.nextDouble();
				
				System.out.println("Enter side-2:");
				side2 = getInput.nextDouble();
				
				System.out.println("Enter side-3:");
				side3 = getInput.nextDouble();
				
				Triangle t1 = new Triangle(side1, side2, side3);
				
				System.out.println("Enter color's name for triangle :");
				color = getInput.next();
				t1.setColor(color);
				
				System.out.println("Does traingle is filled? (Yes - 1/ No - 0) :");
				choice = getInput.nextInt();
				
				if(choice == 1){
					t1.setFilled(true);
				}else if(choice == 0){
					t1.setFilled(false);
				}
				
				System.out.println("A Triangle :: " + t1.toString());
				System.out.println("The color is :: " + t1.getColor());
				System.out.println("The perimeter is :: " + t1.getPerimeter());
				System.out.println("The area is :: " + t1.getArea());
				System.out.print("Does traingle is filled or not? :: ");
				if(t1.isFilled())
				{
					System.out.print("Filled");
				}else
				{
					System.out.print("Not Filled");
				}
				
			} catch (IllegalTriangleException e) {
				System.out.println(e.getMessage());
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("\n\nDo you want to try for next time? (Yes - 1/ No - 0) :");
			choice = getInput.nextInt();
			
			if(choice == 1){
				repeat = true;
				
			}else if(choice == 0){
				repeat = false;
				
			}
		}		
		getInput.close();
	}

}
