import java.util.Scanner;

public class DisplayPrimeNumber {

	static Scanner input = new Scanner(System.in);
	static StackOfIntegers stack = new StackOfIntegers(50);
	
	public static void main(String[] args) {
		
		int repeat = -1;
		
		while(repeat < 0){
			
			enterPrimeNumerInStack();
			
			System.out.println("\nAll the prime numbers less than 120 in decreasing order :: ");
			
			displayPrimeNumberInReverse();
			
			System.out.println("\n\nEnter 1 for try again and 0 for exit: ");
			int response = input.nextInt();
			
			if(response == 0)
			{
				repeat++;
				System.out.println("\nThank You");
			}
			
		}
		
	}
	
	public static void enterPrimeNumerInStack(){
		
	    int number ; // = 2;  A number to be tested for primeness

	    // Repeatedly find prime numbers and print first 50 prime number 
	    for(number = 2; number <= 120 ; number++) {
	    	
	    	// Print the prime number and increase the count
		      if (isPrimeOrNot(number)) {
		        
		        //add prime number to stack
		        stack.push(number);
		        
		      }
	    }
	}
	
	public static boolean isPrimeOrNot(int number)
	{
	      // Assume the number is prime
	      boolean isPrime = true; // Is the current number prime?

	      // Test if number is prime
	      for (int divisor = 2; divisor <= number / 2; divisor++) {
	        if (number % divisor == 0) { // If true, number is not prime
	          isPrime = false; // Set isPrime to false          
	          break; // Exit the for loop
	        }
	      }
	      return isPrime;
	}
	
	public static void displayPrimeNumberInReverse(){
		while(!stack.empty()){
			
			System.out.print(stack.pop()+"  ");
		}
	}
}
