package arrays;

public class Prog233 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,1};
		
//		if(arr.length%2==0 && arr.length!=2) {
//		   
//			for(int i=0;i<arr.length;i++) {
//				
//			}
//		}
//		else if(arr.length==2) {
//			System.out.println("We cannot rob");
//			
//		}
//	 int money=0;
//		for (int i = 0; i < arr.length; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//			if(arr[i]+1>arr[j]) {
//				money=money+arr[j];
//			}
//
//		}
//		}
//		System.out.println(money);
		System.out.println(money(arr));
	}

	public static int money(int[] arr) {
		

		if(arr.length%2!=0) {
			int ele=arr[0];
						for(int i=1;i<arr.length;i++) {
				if(ele+1>arr[i]) {
					ele=+arr[i];
				}
			}
			return ele;
			
		}
		else if(arr.length!=2) {
			int ele1=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(ele1<arr[i]) {
					ele1=arr[i];
				}
			}
			return ele1;
		}
		return 0;
	
	}

}
