package HomeWork_programs;

public class largestElementArry {

	public static void main(String[] args) {
		int arr [] =new int [] {23,56,78,90,444};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Arry : "+max);

	}

}
