package MyPrograms;
import java.util.*;
public class RemoveSpacesWhteSpacesOfString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Sentense : ");
		
		String str = scan.nextLine();
		
		char a[] = str.toCharArray();
		
		String str1 = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(a[i] != ' ')
			{
				str1 = str1+str.charAt(i);
			}
		}
		
		System.out.println(str1);

	}

}
