//12. Count Duplicates in Array

// Count how many elements appear more than once in the array.

import java.util.Scanner;


class duplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int size = sc.nextInt();
		int[] user_input = new int[size];
		int countduplicates =0;
		for(int i=0; i<user_input.length; i++){
			user_input[i]=sc.nextInt();
			if(user_input == i){
				countduplicates +=1;
				System.out.println("Duplicates are: "+countduplicates);
			}
			
		}
	}
}