package arrays;

public class Average {

	public static void main(String[] args)
	{
		int a [] = {1,1,1,1,1,1};
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
			sum+=a[i];
		}
		System.out.println(sum);
		System.out.println(count);
		int avg=sum/count;
		System.out.println(avg);
		

	}

}
