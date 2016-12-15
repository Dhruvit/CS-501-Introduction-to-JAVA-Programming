import java.util.Scanner;

public class C5E20DisplayPrimeNumbers {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int repeat = -1;
		
		while(repeat < 0){
			
			System.out.println("\nThe first 50 prime numbers are :: \n");
			printAllPrimeNumbers();
			
			System.out.println("\n\nEnter 1 for try again and 0 for exit: ");
			int response = input.nextInt();
			
			if(response == 0)
			{
				repeat++;
				System.out.println("\nThank You");
			}
			
		}
		
	}
	
	public static void printAllPrimeNumbers(){
		
		final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
	    int count = 0; // Count the number of prime numbers
	    int number ; // = 2;  A number to be tested for primeness

	    // Repeatedly find prime numbers and print first 50 prime number 
	    for(number = 2; number <= 10000 && count < 50; number++) {
	    	
	    	// Print the prime number and increase the count
		      if (isPrimeOrNot(number)) {
		        count++; // Increase the count

		        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
		          // Print the number and advance to the new line
		          System.out.println(number);
		        }
		        else
		          System.out.print(number + " ");
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
		
}
	
