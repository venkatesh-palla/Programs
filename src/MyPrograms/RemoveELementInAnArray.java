package MyPrograms;
import java.util.*;
public class RemoveELementInAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a element to remove :");
		
		int num = scan.nextInt();
		
		int a[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int count = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i] != num)
			{
				a[count] = a[i];
				count++;
						
			}
		}
		for(int j=0;j<count;j++)
		{
			System.out.print(a[j]+" ");
		}
		

	}

}
