package LeatCode_programs;

import java.util.Arrays;

public class MonotonicArray {
public static boolean isMonotonic(int[] nums) {
        if(nums.length-1>0) {
        return increasing(nums)||decresing(nums);
        }
        else {
        	return true;
        }
    }
    public static boolean increasing(int []nums){
    	boolean flag=false;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]<=nums[i+1]) {
            	flag=true;
            }
            
            else {
            	flag=false;
            	break;
            }
            }
        return flag;
            
          
    }
    public static boolean decresing(int []nums){
    	boolean flag=false;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]>=nums[i+1]) { 
               flag=true; 
            }
            else {
            	flag=false;
            	break;
            }
            }
        return flag;
	
            
        }
	public static void main(String[] args) {
		int []nums= {9};
//		Arrays.sort(nums);
//		int sum=Arrays.binarySearch(nums, 3);
//		System.out.println(sum);
		System.out.println(isMonotonic(nums));
		
		/*public boolean isMonotonic(int[] nums) {
        return increasing(nums) || decreasing(nums);
    }

    public boolean increasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i)
            if (nums[i] > nums[i+1]) return false;
        return true;
    }

    public boolean decreasing(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i)
            if (nums[i] < nums[i+1]) return false;
        return true;
    }*/
		
			
		}
	}


