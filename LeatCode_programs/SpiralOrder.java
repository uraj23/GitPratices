package LeatCode_programs;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	public static void main(String[] args) {
		
		List <Integer> li=new ArrayList();
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a.length; c++) {
				if(r==0 && c>=a.length-1)
				{
					li.add(a[r][c]);
				}
			 else if(r==a.length-2 || c==a.length-1) {
					li.add(a[r][c]);
				}
			 else if(r==a.length-1 ) {
				 
			 }
				
			}
			
		}
	}

}
