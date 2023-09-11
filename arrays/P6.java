package arrays;

public class P6 
{
	 public static void main(String[] args) {
	        int[] arr = {11, 10, 90, 10};
	        int secondMin = findSecondMinimum(arr);
	        System.out.println("Second minimum element in the array is: " + secondMin);
	    }
	    
	    public static int findSecondMinimum(int[] arr) {
	        int min = arr[0];
	        int secondMin = arr[1];
	        
	        for (int i = 2; i < arr.length; i++) 
	        {
	            if (arr[i] < min) 
	            {
	                secondMin = min;
	                min = arr[i];
	            }
	            else if (arr[i] < secondMin && arr[i] != min) 
	            {
	                secondMin = arr[i];
	            }
	        }
	        
	        return secondMin;
	    }
}
