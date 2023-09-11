package arrays;

public class P5 {
	static int max;
	static int secondmax;
	static int secondmin;
	static int min;
	public static void main(String[] args)
	{
		//secmax();
		//int [] a = {4,5,7,1,2,3};
		//second largest element in array
//		int max=a[0];
//		int second=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(max<a[j])
//				{
//					second=max;
//					max=a[j];
//				}
//			}
//		}
//		System.out.println(max);
//		System.out.println(second);
		
		//second smallest element in array
//int[] a1= {111,110,202,2,1111};
//		int max=a[0];
//		int secondmax=a[0];
//		max=(a1[0] > a1[1] ? a1[0] :a1[1] );
//		
//		for (int i = 1; i < a1.length; i++) 
//		{
//			if(a1[i]>max)
//			{
//				secondmax=max;
//				max=a1[i];
//			}
//		}
//		System.out.println("Second maximum value = "+secondmax);
//		System.out.println("Second maximum value = "+secondmax);
		
		//remove duplicate elements
//		int[] a= {1,2,1,3,4,5,1,2,5};
//		int count=0;
//		for(int i=0;i<a.length;i++)
//		{
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j] && a[j]!=-1)
//				{
//					a[j]=-1;
//					count++;
//				}
//			}
//		}	
//			
//			
//				
//		int b [] = new int[a.length-count];
//		int temp=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]!=-1)
//			{
//				b[temp++]=a[i];
//			}
//		}
//		
//		for(int i : b)
//		{
//			System.out.println(i);
//		}
// 			print duplicate in array
		
		int [] a = {10,50,10,30,10,50};
		int [] b = new int[a.length];
		//b[0]=1;b[1]=1;b[2]=1;
		for(int i=0;i<a.length;i++)
		{
			b[i]=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[j]!=-1)
				{
					b[i]++;
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(b[i]>1 )
			{
				System.out.println(a[i]+" This element occured in "+b[i]);
			}
		}
		

	}

	private static void secmax() {
    int[] a1= {111,110,20,2,1111};
		
		max=(a1[0] > a1[1] ? a1[0] :a1[1] );
		min=(a1[0] < a1[1] ? a1[0] :a1[1] );
		
		for (int i = 1; i < a1.length; i++) 
		{
			if(a1[i]>max)
			{
				secondmax=max;
				max=a1[i];
			}
			if(a1[i]<min)
			{
				secondmin=min;
				min=a1[i];
			}
		}
		System.out.println("Second maximum value = "+secondmax);
		System.out.println("Second maximum value = "+secondmin);
		
		
	}

}
