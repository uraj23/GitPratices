package arrays;
import java.util.Scanner;
public class Second2Occurence {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array size");
       int size=sc.nextInt();
       
       int [] a = new int[size];
       
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       
      System.out.println("Search in array");
      int num=sc.nextInt();
       int count=0;
       boolean flag=false;
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]==num)
    	   {
    		   count++;
    	   }
    	   if(count==2)
           {
//        	   System.out.println(count+" time occured");
        	   flag=true;
        	   break;
           }
    	}
       if(flag==true)
       {
    	   System.out.println("This number occured ");
       }
       else
       {
    	   System.out.println("This number not occured");
       }
       
    }

}
