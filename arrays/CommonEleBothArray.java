package arrays;

import java.util.Scanner;

public class CommonEleBothArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7 };
		int b[] = { 3, 2, 4, 5, 7, 7, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");

					break;
				}
			}
		}

	}

}
