package Arrays_type_2;

public class CyclicallyRotateArray {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
		for(int i=0;i<arr.length;i++) {
		int a=arr[arr.length-1];
		for(int j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
			
		}
		arr[0]=a;
		//System.out.println();
		//System.out.println("After roting Arrys");
		for(int i1=0;i1<arr.length;i1++) {
			System.out.println(arr[i1]+" ");
			break;
		}
	}
	}

}
