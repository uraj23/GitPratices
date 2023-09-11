package arrays;

public class RemoveArrayElement {

	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5,6};
		int [] b = new int[a.length-1];
		int ind=3;
		int j=0;
		if(ind<a.length) {
		for(int i=0;i<a.length;i++)
		{
			if(i!=ind)
			{
				b[j++]=a[i];
			}
					}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		}
		else {
			System.err.println("Enter the index in b/w :0 to "+a.length);
		}

	}

}
