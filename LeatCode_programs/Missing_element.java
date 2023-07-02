package LeatCode_programs;

import java.util.Arrays;

public class Missing_element 
{
	public static void main(String[] args) {
		int []nums= {9,6,4,2,3,5,7,0,1};
		 Arrays.sort(nums);
	        int count=nums[0];
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==count){
	                count++;
	            }
	            else{
	            	 System.out.println(count);
	                break;
	            }
	        }
	      
	    
	    }
	}


