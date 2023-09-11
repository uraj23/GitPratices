package arrays;
import java.util.Scanner;
public class EvenIndexs 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for(int i=1;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even indexs ");
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("even indexs "+a[i]);
			}
		}
		System.out.println("product of even indexs");
		int prod=1;
	for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				prod*=a[i];
			}
		}
		System.out.println(prod);


	}

}
