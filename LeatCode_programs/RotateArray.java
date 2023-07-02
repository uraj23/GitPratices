package LeatCode_programs;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {

		
		  int a[]= {1,2,3,4,5,6,7};
		  System.out.println(Arrays.toString(a));
		  System.out.println("============");
		 int r=3;
		 System.out.println(" this time rotated array ="+r);
		 System.out.println("==================");
		 
		 
		 
		  for(int k=1;k<=r;k++) {
			  int ele=a[a.length-1];
			  for(int i=a.length-2;i>=0;i--) {
				  a[i+1]=a[i];
			  }
			  a[0]=ele;
		  }
		  System.out.println(Arrays.toString(a));
		  
		  
		  
		  
		 
		  System.out.println("=============");
		  //System.out.println(Arrays.toString(a));
	}

}
