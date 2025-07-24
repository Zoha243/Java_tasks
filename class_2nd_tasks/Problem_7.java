// Write a program that takes 3 numbers and prints the largest
import java.util.Scanner;
class largestnumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int number1=sc.nextInt();
		System.out.println("Enter num2:");
		int number2 =sc.nextInt();
		System.out.println("Enter num3:");
		int number3 = sc.nextInt();
		if(number1 >number2 && number1>number3){
			System.out.println("Number 1 is the largest");
		}else if(number2 >number1 && number2 > number3){
		System.out.println("Number 2 is the largest");
		}else{
		System.out.println("Number 3 is the largest");
	}
	
}
}
