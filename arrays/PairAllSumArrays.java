package arrays;
import java.util.Scanner;
public class PairAllSumArrays {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int [] a = new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+"+"+a[j]+"="+(a[i]+a[j]));
				}
					
			}
	    }

	}

}
