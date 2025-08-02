//6. Find Maximum and Minimum in Array

//Input n elements.

//Print the maximum and minimum values.
import java.util.Scanner;
class MaxMinArray{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int[] numarry= new int[6];
	for(int i = 0; i< numarry.length; i++){
		numarry[i]=sc.nextInt();
		i >= numarry[i]
	}
	for(int j=0; j<numarry.length; j++){
		if(numarry[j] >= j){
			System.out.println("max number is "+numarry[j]);
		}
	}
  }
}
