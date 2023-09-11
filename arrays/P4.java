package arrays;
import java.util.Scanner;
public class P4 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=2;j<i;j++)
			{
				boolean flag=true;
				if(i%2==0)
				{
					flag=false;
					break;
				}
				if(flag==true)
				{
					System.out.println(a[i]);
				}
			}
             
		}
	}
}
