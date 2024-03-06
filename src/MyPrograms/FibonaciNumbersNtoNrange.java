package MyPrograms;
import java.util.*;
public class FibonaciNumbersNtoNrange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Starting Number :");
		
		int num1 = scan.nextInt();
		
		System.out.println("Enter a  Ending Number :");
		
		int num2 = scan.nextInt();
		
		int a=0,b=1,sum;
		
		for(int i=1;i<num2;i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			
			if(sum>=num1 && sum<=num2)
			{
				System.out.println(sum);
			}
		}
	}

}
