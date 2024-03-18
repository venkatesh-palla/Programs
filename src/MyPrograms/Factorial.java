package MyPrograms;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan  =  new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		int facto = 1;
		
		for(int i=1;i<=num;i++)
		{
			facto = facto*i;
		}
		
		System.out.println("Factorial of "+num+" is  "+facto);
	}

}
