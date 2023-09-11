package arrays;import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{

      int [] a = {1,1,1,10,10,10,2,3,4,5,7,1,3,2,7,7,7};
      int count=0;
      for(int i=0;i<a.length;i++) {
    	  
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]==a[j] && a[i]!=-1)
    		  {
    			  a[j]=-1;
    			  count++;
    		  }
    	}
      }
      int [] b = new int[a.length-count];
      int temp=0;
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]!=-1)
    	  {
    		 b[temp++]=a[i]; 
    	  }
      }
      System.out.println(Arrays.toString(b));
      
     /* for(int i=0;i<a.length;i++)
      {
    	  int j=0;
    	  for(;j<i;j++)
    	  {
    		  if(a[i]==a[j])
    		  {
    			  break;
    		  }
    	  }
    	  if(i==j)
    	  {
    		System.out.print(a[i]+" "); 
    	  }
      }*/
      
      

	}

}
