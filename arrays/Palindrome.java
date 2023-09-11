package arrays;
import java.util.Scanner;
public class Palindrome 
{
	public static int palindrome(int num,int rev)
	{
	
		if(num==0)
		{
			return rev;
		}
		else
		{
			int last=num%10;
		    rev=(rev*10)+last;
		    System.out.println(rev);
		    return palindrome(num/10,rev);
		}
		
		
	}

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	     int num=sc.nextInt();
	     
	    int rev=palindrome(num,0);
	    if(num==rev)
	    	System.out.println("Palindrome");
	    else
	    	System.out.println("Not palindrome");
	    
	    


	}

}
