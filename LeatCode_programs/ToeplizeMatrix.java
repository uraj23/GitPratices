package LeatCode_programs;

public class ToeplizeMatrix {
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = 0; j < matrix.length-1; j++) {
				if(matrix[i][j]!=matrix[i+1][j+1]) {
					System.out.println("not a toeplize matrix");
					System.exit(0);
				}
				
			}
		}
		System.out.println("toeplize matrix");
	}

}
