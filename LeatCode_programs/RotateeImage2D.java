package LeatCode_programs;

import java.util.Arrays;

public class RotateeImage2D 
{
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		System.out.println(Arrays.deepToString(a));

		
        for (int i = 0; i < b.length; i++) {
        	int n=a.length-1;
			for (int j = 0;j<a.length;j++) {
				
				
				
				for (int k=n ;k==n; k++) {
				   
					b[i][j]=a[k][i];
					
				}
				n--;
				
			}
			
		}
System.out.println(Arrays.deepToString(b));
        	
        	
//        	
//		System.out.println(a[2][0]+" "+a[0][0]);
//		
//		 for (int i = 0; i < a.length; i++) {
//	        	int n=a.length-1;
//				for (int j = 0;j<a.length;j++) {
//					
//					
//					
//					for (int k=n ;k==n; k++) {
//					   int temp=a[i][j];
//					   a[i][j]=a[k][i];
//						a[k][i]=temp;
//						System.out.println(Arrays.deepToString(a));
//						break;
//
//					}
//					n--;
//					
//				}
//				
//			}
//	     
//		
//		System.out.println(Arrays.deepToString(a));
//		
//		
		
//        for (int i = 0; i < b.length; i++) {
//        	int n=a.length-1;
//			for (int j = 0;j<a.length;j++) {
//				
//				
//				
//				for (int k=n ;k==n; k++) {
//				   
//					b[i][j]=a[k][i];
//					
//				}
//				n--;
//				
//			}
//			
//		}
		
		
		
		
		
//		for (int i = 0; i < b.length; i++) {
//			
//			for (int j = 0;j<a.length;j++) {
//				
//				for (int k = a.length-1 ;k>=j; k--) {
//				   
//					b[i][j]=a[k][i];
//				}
//			}
//			
//		}
		
		
		
		
		
		
	//	System.out.println(Arrays.deepToString(b));
		
	}

}
