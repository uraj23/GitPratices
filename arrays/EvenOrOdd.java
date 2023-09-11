package arrays;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int [] a=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number "+a[i]);
			}
			else
			{
				System.out.println("odd elements "+a[i]);
			}
		}
	}

}
