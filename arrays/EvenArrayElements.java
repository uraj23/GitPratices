package arrays;

public class EvenArrayElements {
public static void main(String[] args) {
	int a[]= {10,2,3,4,6,9};
	
	for(int i=0;i<a.length;i++) {
		if(i%2==0) {
			System.out.print(a[i]+" ");
		}
	}
}
}
