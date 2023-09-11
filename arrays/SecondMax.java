package arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] a = { 40, 20, 30, 40, 30,10,20,20,15 };
		int min = Integer.MAX_VALUE;
		int secondmin = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {

				secondmin = min;
				min = a[i];

			} else if (a[i] < secondmin && min != a[i]) {
				secondmin = a[i];
			}

		}
		System.out.println("Second max " + secondmin);



//		int[] a = { 40, 20, 30, 40, 30, 40 };
//		int max = Integer.MIN_VALUE;
//		int secondmax = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > max) {
//
//				secondmax = max;
//				max = a[i];
//
//			} else if (a[i] > secondmax && max != a[i]) {
//				secondmax = a[i];
//			}
//
//		}
//		System.out.println("Second max " + secondmax);
//
		
		// System.out.println(max);

//      int [] b = {11,22,12,90,30,10,74,80};
//      int m=a[0];
//      int s=a[0];
//      int t=a[0];
//      for(int i=0;i<b.length;i++)
//      {
//    	 if(a[i]>m)
//    	 {
//    		 t=s;
//    		 s=m;
//    		 m=a[i];
//    	 }
//      }
//      System.out.println(t);
//      

	}

}
