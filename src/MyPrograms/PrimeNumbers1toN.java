package MyPrograms;
import java.util.*;
public class PrimeNumbers1toN {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a range :");
		
		int num = scan.nextInt();
		
		int i,j;
		
		for(i=1;i<=num;i++)
		{
			int count = 0;
			for(j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
