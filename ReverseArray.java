
//7. Reverse the Array
//Print the elements of the array in reverse order (without using another array).

import java.util.Scanner;
class ReverseArray{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();
			System.out.println("Array before Reverse!:"+num[i]);
		}
		
		for(int j=num.length-1; j>=0; j--){
			System.out.println(num[j]);
		
		}
	}
}
	//int[] numarray= {1,2,3,4,5};
	//int reverse = 0;
	//for(int i=4; i >= 0; i--){
	  //  System.out.println("Here is the reverseed array"+":"+numarray[i]);
	
	
	         
  