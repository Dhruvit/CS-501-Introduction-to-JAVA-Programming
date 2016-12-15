import java.text.DecimalFormat;
import java.util.Scanner;


public class C1E13SolveLinearEquations {

	public static void main(String[] args) {
		
		Scanner inVariable = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		//Getting the values of a,b,c,d,e,f for calculating to two linear equations 
		
		System.out.println("Enter input variable for equation : ax + by = e");
		System.out.print("Enter a = ");
		double a = inVariable.nextDouble();
		
		System.out.print("Enter b = ");
		double b = inVariable.nextDouble();
		
		System.out.print("Enter e = ");
		double e = inVariable.nextDouble();
		
		System.out.println("Enter input variable for equation : cx + dy = f");
		System.out.print("Enter c = ");
		double c = inVariable.nextDouble();
		
		System.out.print("Enter d = ");
		double d = inVariable.nextDouble();
		
		System.out.print("Enter f = ");
		double f = inVariable.nextDouble();
		
		if((a*d)-(b*c)==0)
		{
			System.out.println("The equation does not have solution");
		}
		else
		{
			//Calculating value of x and y using Cramer's rule 
			double x = (e*d - b*f) / (a*d - b*c);
			
			double y = (a*f - e*c) / (a*d - b*c);
			
			System.out.print("x = "+df.format(x)+" and y = "+df.format(y));
		}

	}

}
