package week1.day2.assignment2;

public class PalindromeNumber {

	public static void main(String[] args) {
 int num = 34343;
 int temp = num;
 int rem = 0;
 int revNum=0;
 while (num !=0) {
	 rem = num%10;
	 revNum= revNum*10+rem;
	 num=num/10;
 } 
 if (revNum == temp) {
	System.out.println("Given Number is Palindrome");
} else {
	System.out.println("Given number is not Palindrome");


	}

}
}
	