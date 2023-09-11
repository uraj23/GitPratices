package arrays;

import java.util.Arrays;

public class Copy_Elements_Into_Another_Array {
	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
