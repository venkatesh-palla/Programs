package MyPrograms;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int num = scan.nextInt();
		
		int sum = 0;
		
		while(num != 0)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
			
		}
		System.out.println("Sum of Numbers = "+sum);
	}

}
