package arrays;
import java.util.Scanner;
public class MultiplesOf5 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
			{
				System.out.println("multiples of  5 is "+a[i]);
			}
			
		}
	}

}
