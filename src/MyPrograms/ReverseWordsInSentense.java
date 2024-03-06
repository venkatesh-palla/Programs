package MyPrograms;
import java.util.*;
public class ReverseWordsInSentense {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter a Sentence : ");
		
		String str = scan.nextLine();
		
		String words[] = str.split(" ");
		
		String reverseString = "";
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseWord = "";
			
			for(int j=0;j<word.length();j++)
			{
				reverseWord= word.charAt(j)+reverseWord;
			}
			reverseString =reverseString+" "+reverseWord;
		}
		System.out.println(reverseString);
				
	}

}
