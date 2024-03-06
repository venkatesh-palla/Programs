package MyPrograms;
import java.util.*;
public class Spynumber {

	public static void main(String[] args) {			 //sum of digits == product of digits
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		int temp = num;
		
		int sum = 0,digit;
		while(temp != 0)
		{
			digit = temp%10;
			sum = sum + digit;
			temp = temp/10;
			
		}
		temp = num;
		int product = 1;
		while(temp != 0)
		{
			 digit =temp%10;
			 product = product*digit;
			 temp = temp/10;
		}
		
		if(sum == product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}

	}

}
