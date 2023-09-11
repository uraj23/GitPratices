package arrays;

public class HihestSum {

	public static void main(String[] args) {

		int[] a = { 2, 2, 10, 15, 6, 7 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (sum > sum1) {
					sum1 = sum;
				}
			}
		}
		System.out.println(sum1);

	}

}
