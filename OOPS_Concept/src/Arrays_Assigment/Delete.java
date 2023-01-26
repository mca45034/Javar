package Arrays_Assigment;

public class Delete {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		int pos=3;
		for(int i=pos;i<arr.length-1;i++) {
           arr[i]=arr[i+1];
	}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

  }
}
