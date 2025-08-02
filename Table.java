// 1. Print Multiplication Table (Using while loop)
// Take a number from the user and print its multiplication table using a while loop.

import java.util.Scanner;

class Table{
	public static void main(String[] args){
		int store = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		int user_number = sc.nextInt();
		
		while(num <= 10){
		store = num * user_number;
		
		System.out.println("Here is the table:"+user_number+"*"+num+"="+store);
		num ++;
		}
	}
}