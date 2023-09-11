package arrays;

public class IdenticalArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 20, 40 };
		int[] b = { 10, 20, 30, 20, 40 };
		if (a.length == b.length) {
			boolean flag = true;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Identical elements");

			} else {
				System.out.println("not Identical elements");

			}
		} else {
			System.out.println("not identical");
		}

	}

}
