package arrays;

public class CopyArrayElement {

	public static void main(String[] args) 
	{

    int []a= {1,2,3,4};
    int []b= {5,6,7,8};
    int []c=new int[a.length+b.length];
	int temp=0;
    for(int i=0;i<c.length;i++)
    {
    
    	if(i<a.length)
    	{
    		c[i]=a[i];
    	}
    	else
    	{
    		c[i]=b[temp++];
    	}
    }
    
    for(int i=0;i<c.length;i++)
    {
    	System.out.print(c[i]+" ");
    }
   


	}

}
