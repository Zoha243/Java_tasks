// 2. Print Reverse of a Number
// Input a number like 123 → Output should be 321
import java.util.Scanner;

class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse = number % 10; //3
		int division = number / 10; // 12
		int sec_reverse  = division % 10; //32
		int sec_division = division / 10; // 1.2
		int third_reverse = sec_division % 10;
		int third_division = sec_division /10;
		  String concatenatedString = "" + reverse + sec_reverse+ third_reverse;
		
		System.out.println(concatenatedString);
	/*	System.out.println(reverse);
		System.out.println(division);
		System.out.println(sec_reverse);
		System.out.println(sec_division);
		System.out.println(third_reverse);
		System.out.println(third_division);
			*/
	}
}