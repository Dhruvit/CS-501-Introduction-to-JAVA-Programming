import java.util.Scanner;

public class C7E20ReviseSelectionSort {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int repeat = -1;
		while(repeat < 0){
		
			getArrayElements();
			System.out.println("\nEnter 1 for try again and 0 for exit: ");
			int response = input.nextInt();
			
			if(response == 1)
			{
				repeat++;
				System.out.println("\nThank You");
			}
			
		}
		
	}

	//get array elements
	public static void getArrayElements(){
		
		double[] list = new double[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextDouble();
		}
		printSortedArray(list);
			
	}
	
	//print sorted array
	public static void printSortedArray(double[] list){
		
		reviseSelectionSort(list);
		
		System.out.print("Sorted Array:: ");
		for(int i = 0; i < list.length; i++ ){
			System.out.print(list[i]+" ");
		}
		
	}
	
	//Revise selection sort
	public static void reviseSelectionSort(double[] list){
		
		for (int i = list.length-1 ; i >= 0; i--) {
		
			// Find the maximum in the list[i..list.length-1]
			double currentMax = list[i]; //3
			int currentMaxIndex = i; //9
		
			for (int j = 0; j < i; j++) {
				if (list[j] > currentMax) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
		
			// Swap list[i] with list[currentMaxIndex] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
		
	}
}


