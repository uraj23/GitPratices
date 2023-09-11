package arrays;

public class FindDuplicates {
	public static void main(String[] args) {

		int a[] = { 10, 20, 10, 10, 20, 30, 40, 20, 30, 10, 10, 30, 50 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.print(a[i]+" ");
			}

		}
	}

}
