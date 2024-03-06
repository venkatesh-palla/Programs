package MyPrograms;
import java.util.*;
public class CapitalOfFirstAndLastLetter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String str = scan.nextLine();
		
		char a[] = str.toCharArray();
		
		int n = str.length()-1;
		
		for(int i=0;i<=n;i++)
		{
			if(Character.isLowerCase(a[0]))
			{
				a[0] = Character.toUpperCase(a[0]);
			}
			if(Character.isLowerCase(a[n]))
			{
				a[n] = Character.toUpperCase(a[n]);
			}
					
		}
		System.out.println(a);
	}

}
