package ArraysBasic;

public class PeakValue {

	public static void main(String[] args) {
		int arr[]={10, 20, 15, 2, 23, 90, 67};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i-2]) {
				System.out.println(arr[i]);
			}
		}
		}

	}

}
