package MyPrograms;
import java.util.*;
public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a  =  scan.nextInt();
		System.out.print("Enter B value : ");
		int b = scan.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		//other method
		//   int t = a;
		//		a = b;
		//		b = t;
		
		
		System.out.print("A  = "+a+"  B = "+b);

	}

}
