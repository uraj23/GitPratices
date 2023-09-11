package arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 70 };

		int target = 50;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Target was Found in array ");
		} else {
			System.out.println("Target was not Found in array ");
		}
	}

}
