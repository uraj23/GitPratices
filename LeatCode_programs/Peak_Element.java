package LeatCode_programs;


public class Peak_Element {
public static void main(String[] args) {
	int a[]= {0,0,1,1,1,2,2,3,3,4,5,9,8};
	//int a[]= {1,2,3,1};
	int max=0;
    for (int i = 0; i < a.length; i++) {
		if(a[i]>a[max]) {
			max=i;
		}	
	}
	System.out.println(a[max]);
	
//	for (int i = 0; i < a.length; i++) {
//		int count=0;
//		for (int j = i+1; j < a.length; j++) {
//			if(a[i]!=a[j]) {
//				count++;
//			}
//			a[i]=a[j];
//		}
//	//System.out.println(count);
//	}
	
	
}
}
