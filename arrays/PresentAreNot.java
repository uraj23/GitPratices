package arrays;
import java.util.Scanner;
public class PresentAreNot {

	public static void main(String[] args)
	{
		// wap to check one array elements present in another element
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter trhe size");
		int size=sc.nextInt();
		
		int [] a = new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the second array size");
		int size1=sc.nextInt();
		int [] b = new int [size1];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
	//comparing on both array's
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]+" is matched with another array");
				}
			}
		}

	}

}
