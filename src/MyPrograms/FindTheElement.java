package MyPrograms;
import java.util.*;
public class FindTheElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = scan.nextInt();
		
		int a[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int count = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i] == num)
			{
				System.out.println("YES PRESENT");
				count++;
			}
		}
		if(count >= 1)
		{
			System.out.println("Element Present ");
		}
		else {
			System.out.println("Element not Present ");
		}
	}

}
