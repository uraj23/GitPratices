package arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 5, 4, 6, 10, 9 };

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					// a[i]=a[j]-a[i]+(a[j]=a[i]);
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
			System.out.println(Arrays.toString(a));
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.println("================");

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[min]) {
					// a[i]=a[j]-a[i]+(a[j]=a[i]);
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
