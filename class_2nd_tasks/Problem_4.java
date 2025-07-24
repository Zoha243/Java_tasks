// Take marks as input and print grade using nested if
import java.util.Scanner;
class marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks = sc.nextInt();
		if(marks >=33){
			if(marks > 92 && marks <= 100){
				System.out.println("Congratulations You Got A+");
			}else if(marks >85 && marks <=90){
				System.out.println("Congratulations You Got A");
			}else if(marks >75 && marks <= 85){
				System.out.println(" You Got B+");
		    }else if(marks> 65 && marks <= 75){
				System.out.println(" You Got B");
			}else if(marks>55 && marks <= 65){
				System.out.println(" You Got C+");
			}else if(marks >45 && marks <= 55){
				System.out.println(" You Got C");
			}else{
				System.out.print("You are Fail");
			}
		
		}else{
			System.out.println("You Are Fail");
		}
	}
	
}