package arrays;
import java.util.Scanner;
public class P1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		double []a=new double[n];
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextDouble();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
	}

}
