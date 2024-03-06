package MyPrograms;
import java.util.*;
public class CountTheVowels {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = scan.nextLine();
		
		int count = 0;
		
		String str1 = str.toLowerCase();
		
		char a[] = str1.toCharArray();
		
		for(int i=0;i<str1.length();i++)
		{
			if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' )
			{
				count++;
			}
		}
		System.out.println("Number of vowels = "+count);
	}

}
