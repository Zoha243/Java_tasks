// 🧮 Array Programs
//5. Sum and Average of Array Elements

//Take n numbers from the user and store in an array.

//Print the sum and average of all elements.

import java.util.Scanner;

class AverageArray{
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	int[] numbers = new int[5];
	int sum = 0;
	int avg= 0;
	for(int i=0; i<numbers.length; i++){
		System.out.println("Enter the number"+i);
		numbers[i]= obj.nextInt();
		sum += numbers[i];
		avg = sum/numbers.length;
		
	}
	System.out.println("The Sum of Array Elements"+":"+sum);
	System.out.println("The Averag of Array Elements"+":"+avg);
	}

}