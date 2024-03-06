package MyPrograms;
import java.util.*;
public class EvenNumberOrNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int num = scan.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(num+"   Is a Even Number");
		}
		else
		{
			System.out.println(num+"   Is not a Even Number");
		}
	}

}
