package arrays;

public class PalindromArrray {

	public static void main(String[] args) 
	{
		int[] a= {121,234,151};
		for(int i=0;i<a.length;i++){
	    	int n=a[i];
	    	int temp=n;
	    	int rev=0;
		   	 while(n>0){
		   		int rem= n%10;
		    	rev=rev*10+rem;
		    	n/=10;
		     }
		    
		     if(temp==rev) {System.out.println(temp+"is a pallindrome");}
		      else {System.out.println(temp+"is not pallindrome");}
		}

	}

}
