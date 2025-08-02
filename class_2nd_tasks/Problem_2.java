// Vowels and  consonants using switch and if else
import java.util.Scanner;
 
class check{
	public static void main(String[] args){
	Scanner myObj= new Scanner(System.in);
	System.out.println("Enter alphabet");
	String alphabet = myObj.nextLine();
		
	switch(alphabet){
	case "a":
		System.out.println("It's a vowel");
		break;
	case "e":
		System.out.println("It's a vowel");
	case "i":
		System.out.println("It's a vowel");
	case "o":
		System.out.println("It's a vowel");
	case "u":
		System.out.println("It's a vowel");
	default:
		System.out.println("It's a Consonant!");
	}
		
   }

}