// Vowels and  consonants using If-Else
import java.util.Scanner;

class checkifelse{
	public static void main(String[] args){
	Scanner myobj= new Scanner(System.in);
	System.out.println("Enter the alphabet");
	char alphabet = myobj.next().charAt(0);
	if(alphabet == 'a'){
		System.out.println("It's a vowel");
		}
	else if (alphabet == 'e'){
		System.out.println("It's a vowel");
	}
	else if (alphabet == 'i'){
		System.out.println("It's a vowel");
	}
	else if (alphabet =='o'){
		System.out.println("It's a vowel");
	}
	else if (alphabet == 'e'){
		System.out.println("It's a vowel");
	}else{
		System.out.println("It's a Consonant!");
	}
  }
}