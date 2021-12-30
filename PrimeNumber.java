package week1.day2.assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
int a =13;
boolean b = false;

for (int i = 2; i <= a/2 ; i++) {

	if (a%i==0) {
		b= true;
		break;
		
	}
}
if(b != true) {
System.out.println("Given Number is  Prime");

}
else {
	System.out.println("Given Number is non Prime");
}
	}
}
