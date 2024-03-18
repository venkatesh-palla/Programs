package MyPrograms;
import java.util.*;
public class DuplicatesCharactersInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = scan.nextLine();
		
		int charCount[]  = new int[256]; // Assuming ASCII characters
		
		for(int i=0;i<str.length();i++)
		{
			charCount[str.charAt(i)]++;
		}
		
		for(int i=0;i<charCount.length;i++)
		{
			if(charCount[i]>1)
			{
				System.out.println((char) i + ": " + charCount[i] + " times");
			}
		}
	}

}
