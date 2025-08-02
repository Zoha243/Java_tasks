/* 4. Accept Marks Until Total Crosses 500 (Using break)
Keep accepting marks until their total crosses 500. Use break.
*/
import java.util.Scanner;

class Marks{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int totalcross=0;
		int marks = 0;
		while(marks <= 500){
			marks = obj.nextInt();
			totalcross += marks;
			if(totalcross > 500){
			break;
			
			}
		
		}
		System.out.println("Exceeding the total Marks Try Again!");
			
		}
		
}