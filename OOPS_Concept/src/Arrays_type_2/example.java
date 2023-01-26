package Arrays_type_2;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 1, 3, 5};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					System.out.print("("+arr[i]+" "+arr[j]+")");
				}
			}
		}

	}

}
