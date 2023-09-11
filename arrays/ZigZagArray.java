package arrays;

import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
//		   System.out.println("Enter the size");
//		   int size=sc.nextInt();
//		   
//		   int [] a = new int[size];
//		   for(int i=0;i<a.length;i++)
//		   {
//			   a[i]=sc.nextInt();
//		   }
//		   System.out.println("Enter the second array size");
//		   int size1=sc.nextInt();
//		   int [] b = new int [size1];
//		   for(int i=0;i<b.length;i++)
//		   {
//			   b[i]=sc.nextInt();
//		   }
				int [] a = {1,2,3,4,5,7,7,9};
				int [] b = {8,4,5,8};
		   
		   int [] c = new int [a.length+b.length];
		  
		   int j=0,k=0;
		   for(int i=0;i<c.length; )
			  {
				 if(j<a.length)
				 {
					 c[i++]=a[j++];
					 //i++; j++;
				 }
				 if(k<b.length)
				 {
					 c[i++]=b[k++];
					// i++;k++;
				 }
				
							
		        }
			  for(int i=0;i<c.length;i++)
			  {
				  System.out.print(c[i]+" ");
			  }

		   
		   
		   
		   
		   
		   
		   

//		  for(int i=0;i<c.length;i=i+2)
//		  {
//			  			  
//			  if(i<a.length)
//			  {
//				  if(i%2==0)
//				  {
//				  
//				  c[i]=a[i];
//				 
//				  }
//				  else
//				  {
//					  c[i]=b[count++];
//				  }
//				  
//			  }
//			  else
//			  {
//				  c[i]=b[count++];
//				  
//			  }
//			
//	        }
//		  for(int i=0;i<c.length;i++)
//		  {
//			  System.out.print(c[i]+" ");
//		  }

	}

}
