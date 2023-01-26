package HomeWork_programs;

public class descendingOrderArry {

	public static void main(String[] args) {
		int arr []=new int [] {6,4,2,1,0,9,8};
		System.out.println("Original Arry ");
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.println();
			System.out.println("descending order Arry : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
