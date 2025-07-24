//Find sum of numbers from 1 to 100 using loop
import java.util.Scanner;
class sum{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum = sum + i;
		}
	System.out.println("The sum of numbers are:"+sum);
	}
}