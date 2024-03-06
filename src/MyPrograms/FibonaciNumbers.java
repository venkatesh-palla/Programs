package MyPrograms;
import java.util.*;
public class FibonaciNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		int a = 0, b = 1,sum;
		
		for(int i=1;i<=num;i++)
		{
			
			sum = a + b;
			System.out.print(sum+" ");
			a = b;
			b = sum;
		}
	}

}
