import java.util.Scanner;

public class C7E9E10FindTheSmallestElement {

	public static void main(String[] args) {
		
		double[] findMinElement = new double[10];
		Scanner input = new Scanner(System.in);
		int repeat = -1;
		
		while(repeat < 0 ){
			
			System.out.println("Enter ten numbers: ");
			
			for(int i=0; i < findMinElement.length; i++){
				findMinElement[i] = input.nextDouble();
			}
			
			double minNumber = min(findMinElement);
			System.out.println("The minimum number is: "+minNumber);
			System.out.println("\nEnter 1 for try again and 0 for exit: ");
			int response = input.nextInt();
			
			if(response == 0)
			{
				repeat++;
				System.out.println("\nThank You");
			}
		}
		
		input.close();
		
	}
	
	public static double min(double[] array){
		// get the smallest element in the array
		
		int index = indexOfSmallestElement(array);
		System.out.println("The index of minimum number is: "+index);
		
		return array[index];
		
	}
	
	public static int indexOfSmallestElement(double[] list)
	{
			// Find the index of minimum element in the the list
			double currentMin = list[0];
			int currentMinIndex = 0;
			
			for (int i = 1; i < list.length; i++) {
				
				if (currentMin > list[i]) {
					currentMin = list[i];
					currentMinIndex = i;
				}
			}
			
			return currentMinIndex;
	}

}
