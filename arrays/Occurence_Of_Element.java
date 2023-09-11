package arrays;

public class Occurence_Of_Element {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 10, 50 };
		int user = 10;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == user) {
				count++;
			}
		}
		System.out.println("User Given element is " + user + "  present in Array " + " -> " + count + " times");

	}

}
