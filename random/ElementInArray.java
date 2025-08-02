// 9. Find an Element in Array

// Search for a specific element in the array.

// If found, print the index; otherwise print "Not Found".

import java.util.Scanner;

class ElementInArray{
	public static void main(String[] args){
		int[] arr= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=0; i< arr.length; i++){
			if(number == arr[i] ){
				System.out.println("Found on index: "+i);
				System.exit(0);
			}	
		}
		System.out.println("Not Found!");
		
		
	}
}