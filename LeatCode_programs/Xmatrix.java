package LeatCode_programs;

public class Xmatrix {
	public static void main(String[] args) {

		int [][] x= {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
		 boolean flag=false;
		for (int  i= 0;  i< x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if(i!=j && (i+j)!=x.length-1) {
					if(x[i][j]==0) {
						flag=true;
					}
					else {
						flag=false;
						System.out.println("THis not a x matrix");
						System.exit(0);
					}
				}
				
				
			}
			
		}
		System.out.println(flag);
	}
}
