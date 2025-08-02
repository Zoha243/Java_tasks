// Swap two numbers
class swap {
    public static void main(String[] args){
	int num1 = 4;
	int num2 = 3;
	System.out.println("Before Swap:"+" "+num1);
	System.out.println("before Swap:"+" "+num2);
	int temp = num1; // num1 --->  empty now
	num1 = num2 ;   //num1=3 , num2---> empty
	num2 = temp;    // temp = 4 , num2-->4
	System.out.println("After Swap:"+" "+num1);
	System.out.println("After Swap:"+" "+num2);
	
	}
}