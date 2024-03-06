package MyPrograms;
import java.util.*;
public class EvenLenghtofString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = scan.nextLine();
		
		String s[] = str.split(" ");
		
		for(String i:s )
		{
			if(s.length-1%2==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
 	}

}
