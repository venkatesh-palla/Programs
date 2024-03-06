package MyPrograms;
import java.util.*;
public class ReverseTheSentense {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sentense :");
		
		String str = scan.nextLine();
		
		String rev = "";
		
		String s[] = str.split(" ");
		
		
		for(int i=0;i<s.length;i++)
		{
			rev = s[i]+" "+rev;
		}
		
		System.out.println(rev);
	}

}
