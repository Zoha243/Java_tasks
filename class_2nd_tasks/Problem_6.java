// Check if a number is divisible by both 3 and 5
import java.util.Scanner;
class division{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int number= sc.nextInt();
		if(number%3==0 && number%5==0){
		System.out.println("This number is divided by both 3 & 5");
		}else{
		System.out.println("This number is not divisible by both required numbers!");
		}
	
	}

}