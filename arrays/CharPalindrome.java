package arrays;
import java.util.Scanner;
public class CharPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char [] a= {'M','A','L','A','Y','A','L','A','M'};
		
		int i=0;
		int j=a.length-1;
		boolean flag=true;
		while(i!=j) {
			if(a[i]!=a[j]) {
				flag=false;
				break;
			}
			i++;j--;
		}
		if(flag) {
			System.out.println("Given char Array is palindrom");
		}
		else {
			System.out.println("Given char Array is not palindrom");
		}
		
//		char [] b = new char[a.length];
//		int count=0;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			b[count++]=a[i];
//		}
//		
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print(b[i]+" ");
//		}
//		boolean flag=true;
//		for(int i=0;i<a.length;i++)
//		{
//			if(b[i]==a[i])
//			{
//				
//			}
//			else {
//				flag=false;
//				break;
//			}
//		}
//		if(flag)
//		{
//			System.out.println(" palindrom character");
//		}
//		else
//		{
//			System.out.println(" not a palindrom character");
//		}
		
		
	}

}
