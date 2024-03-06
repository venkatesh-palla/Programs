package MyPrograms;
import java.util.*;
public class FibonaciNumbers2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int num = scan.nextInt();
												//small problem....
		int a=0,b=1,sum;
		
		while(a<num)
		{
			
			sum = a+b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}

}
