//3. Check if a Number is Palindrome
//After reversing the number (as done in Q2), check if it is the same as the original number.

import java.util.Scanner;

class Palindrome{
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
		int convertinteger = Integer.parseInt(concatenatedString);
		
		System.out.println(convertinteger);
		if(convertinteger == number){
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("This number is not Palindrome");
		}
			
	/*	System.out.println(reverse);
		System.out.println(division);
		System.out.println(sec_reverse);
		System.out.println(sec_division);
		System.out.println(third_reverse);
		System.out.println(third_division);
			*/
	}
}