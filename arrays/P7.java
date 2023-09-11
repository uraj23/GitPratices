package arrays;

import java.util.Arrays;
import java.util.Random;

public class P7 
{
	public static void main(String[] args) {
	/*	Random rand=new Random();
		int a [] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=rand.nextInt(100);
		}
		
	for (int i : a) {
		System.out.println(i);
		
	}*/
	int [] a1= {5,3,8,6,9,1};
	for (int i = 0; i < a1.length; i++) {
		for (int j = i+1; j < a1.length; j++) {
			
			if(a1[i]>a1[j]) {
			a1[i]=a1[j]-a1[i]+(a1[j]=a1[i]);
			}
			System.out.println(Arrays.toString(a1));
		}
		
		
	}
	//System.out.println(Arrays.toString(a1));
	}
	
	

}
