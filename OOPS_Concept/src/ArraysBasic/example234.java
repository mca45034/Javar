package ArraysBasic;

public class example234 {

	public static void main(String[] args) {
		int arr[]= {1,4,5,2,7,9,10,1};
		int count=0;
		for(int i=0;i<arr.length;i=i+1) {
			System.out.println(arr[i]+arr[i+2]);
			count++;
			if(count==arr.length-2)
				break;
		}
	}

}
