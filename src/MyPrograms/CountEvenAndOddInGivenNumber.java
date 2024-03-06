package MyPrograms;
import java.util.*;
public class CountEvenAndOddInGivenNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		
		int num = scan.nextInt();
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(num != 0)
		{
			int digit = num%10;
			
			if(num%2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			
			num = num/10;
		}
		
		System.out.println("Even Numbers ="+evenCount+"  Odd Numbers ="+oddCount);
	}

}
