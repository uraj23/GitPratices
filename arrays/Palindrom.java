package arrays;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int [] a= new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	    //Reverse array
		int [] b = new int [a.length];
		int count=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count++]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]==b[i])
			{
				
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
