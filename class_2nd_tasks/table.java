// Print multiplication table of a number (input from user)
import java.util.Scanner;
class table{
    public static void main(String[] args){
		Scanner myobj = new Scanner(System.in);
		System.out.println("Hello");
		int number = myobj.nextInt();
		for(int i=1; i<=10; i++){
			int var = number * i;
			System.out.println(number+"*"+i+"="+var);
		}
	}
}