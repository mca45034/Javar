package HomeWork_programs;

public class ascendingOrderArry {

	public static void main(String[] args) {
		int arr []= new int [] {1,3,5,7,8,6,4};
		int temp=0;
		System.out.print("Orignal Arry : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted Arry : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
