package MyPrograms;
import java.util.*;
public class CountTheVowels2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = scan.nextLine();
		
		str = str.toLowerCase();
		
		int count = 0;
		
		String vow = "aeiou";
		
		ArrayList<Character> vowels = new ArrayList<Character>();
		
		for(int i=0;i<vow.length();i++)
		{
			vowels.add(vow.charAt(i));
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(vowels.contains(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
