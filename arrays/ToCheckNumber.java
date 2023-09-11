package arrays;

public class ToCheckNumber {

	public static void main(String[] args) 
	{
		//to check 30 number is present in array are not
		int [] a= {10,20,30,50,40,60};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==30)
			{
				System.out.println(a[i]);
			}
		}
		//to check 30 number count how many time present in array
		int b[]= {50,30,40,10,60,30,30};
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==30)
			{
				count++;
			}
		}
		System.out.println("count how many times repeat "+count);
	}

}
