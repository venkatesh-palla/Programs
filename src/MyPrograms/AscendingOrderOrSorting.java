package MyPrograms;

public class AscendingOrderOrSorting {

	public static void main(String[] args) {

		int a[] = new int[] {9,8,7,6,5,4,3,2,1};
		
		
		for(int i=1;i<=a.length-1;i++)
		{
			for(int j=1;j<=a.length-1;j++)
			{
				if(a[j]<a[j-1])
				{
					int temp = a[j];           //swapping
					a[j] = a[j-1];
					a[j-1] = temp;
				
 				}
			}
			
		}
	
		
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.print(a[j]+" ");
		}
	}

}
