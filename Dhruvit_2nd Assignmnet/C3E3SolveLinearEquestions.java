import java.text.DecimalFormat;
import java.util.Scanner;

public class C3E3SolveLinearEquestions {

	public static void main(String[] args) {
		
		Scanner inVariable = new Scanner(System.in);
		
		int repeat = -1;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		while(repeat < 0)
		{
			System.out.println("Enter input variable for equestions ax + by = e and cx + dy = f");
			System.out.print("Enter a, b, c, d, e, f: ");
			double a = inVariable.nextDouble();
			double b = inVariable.nextDouble();
			double c = inVariable.nextDouble();
			double d = inVariable.nextDouble();
			double e = inVariable.nextDouble();
			double f = inVariable.nextDouble();
			
			if((a*d - b*c)== 0)
			{
				System.out.println("The equation has no solution");
			}
			else
			{
				//Calculating value of x and y using Cramer's rule 
				double x = (e*d - b*f) / (a*d - b*c);
				
				double y = (a*f - e*c) / (a*d - b*c);
				
				System.out.println("x is "+df.format(x)+" and y is "+df.format(y));
			}
			
			System.out.println("Enter 1 for try again and 0 for exit: ");
			int get = inVariable.nextInt();
			
			if(get == 0)
			{
				repeat++;
				System.out.print("Thank you for using Cramer's rule");
			}
		}
		inVariable.close();


	}

}
