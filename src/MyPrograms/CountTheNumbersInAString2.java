package MyPrograms;
import java.util.*;
public class CountTheNumbersInAString2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = scan.nextLine();
		
		char a[] = str.toCharArray();
		
		int count = 0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(a[i]))
			{
				count++;
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("Count = "+count);
	}

}
