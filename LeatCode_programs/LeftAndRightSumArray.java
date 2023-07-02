package LeatCode_programs;

import java.util.Arrays;

public class LeftAndRightSumArray {
	public static void main(String[] args) {
		int [] nums= {10,4,8,3};
		int a[]=new int[nums.length];
	    int sum=0;
	    for(int i=1;i<nums.length;i++){
	      sum=sum+nums[i-1];
	      a[i]=sum;
	    }
	    System.out.println(Arrays.toString(a));
	    int b[]=new int[nums.length];
          int sum1=0;
	    for(int i=nums.length-2;i>=0;i--){
		      sum1=sum1+nums[i+1];
		      b[i]=sum1;
		    }
	    System.out.println(Arrays.toString(b));
	    int c[]=new int[nums.length];
	    for(int i=0;i<nums.length;i++) {
	    	 int k=a[i]-b[i];
	    	 if(k<0) {
	    		 int k1=-(k);
	    		 c[i]=k1;
	    	 }
	    	 else {
	    		 c[i]=k;
	    	 }
	    	 
	    }
	    System.out.println(Arrays.toString(c));
	}

}
