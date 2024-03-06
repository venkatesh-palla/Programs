package MyPrograms;
import java.util.*;
public class CountTheNumbersInAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		String str = scan.nextLine();
		
		int count = 0;
		
		char a[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(a[i]>=48&&a[i]<=57)
			{
				count++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("Count = "+count);
	}

}
