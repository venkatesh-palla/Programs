package MyPrograms;
import java.util.*;
public class EvenNumberNtoN {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Starting Number :");
		
		int num1 = scan.nextInt();
		
		System.out.println("Enter a Ending Number :");
		
		int num2 = scan.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
