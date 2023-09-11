package arrays;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size char array");
		int n=sc.nextInt();
		
		char [] ch=new char[n];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		for(int i=0;i<ch.length;i++)
		{
             if(ch[i]==0 || ch[i]==n-1)
             {
            	 System.out.println(ch[i]);
             }
		}


	}

}
