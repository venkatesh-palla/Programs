package MyPrograms;
import java.util.*;
public class LeapYearOrNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		if(num%4==0 && num%100!=0 || num%400== 0)
		{
			System.out.println(num+" = Leap year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
