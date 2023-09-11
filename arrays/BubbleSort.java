package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter element " + (i + 1));
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// a[i]=a[j]-a[i]+(a[j]=a[i]);

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
