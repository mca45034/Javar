package Arrays_type_2;

public class MaximumSubArrys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2 ,3 ,1, 4, 5, 2, 3, 6};
		int k=3;
		int max=0;
		for(int i=0;i<arr.length-k;i++) {
		max=arr[i];
		for(int j=0;j<k;j++) {
			if(arr[i+j]>max) {
				max=arr[i+j];
			}
		}
		System.out.println(max);

		}
	}

}
