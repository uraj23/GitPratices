package LeatCode_programs;

public class SingleNumber 
{
	 public static int singleNumber(int[] nums) {
	     int ans=0; 
	        for(int i=0; i<nums.length; i++){
	        	 System.out.println(ans+"="+""+ans+"^"+nums[i]);
	            ans ^= nums[i]; 
	            System.out.println(ans);
	           System.out.println("==========");
	        }
	        return ans;
	    }
	 public static void main(String[] args) {
		int nums[]= {2,3,3,2,1};
		System.out.println(singleNumber(nums));
		System.out.println("==================");
		int j=2;
		//System.out.println(j=j^3);
	}

}
