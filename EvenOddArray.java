//8. Count Even and Odd Numbers in Array

//Count how many elements in the array are even and how many are odd.


import java.util.Scanner;
class EvenOddArray{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int counteven =0;
		int countodd=0;
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();
			//System.out.println();
			if(num[i]%2==0){
				counteven += 1;
				System.out.println("This element is Even: "+num[i]);
				
				
			}else{
				countodd += 1;
				System.out.println("This element is odd: "+num[i]);
	
			}
	
		}
		System.out.println("the count of even number is:"+counteven);
		System.out.println("the count of odd number is:"+countodd);
	
	}
}