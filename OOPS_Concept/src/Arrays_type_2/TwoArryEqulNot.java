package Arrays_type_2;

public class TwoArryEqulNot {

	public static void main(String[] args) {
		int arr1[]= {0,1,5,2,4,3};
		int arr2[]= {5,4,0,1,3,2};
		int i;
		int flage=0;
		for( i=0;i<arr1.length;i++) {
		  for(int j=i+1;j<arr1.length;j++) {
			  if(arr1[i]>arr1[j]) {
				  int temp=arr1[i];
				  arr1[i]=arr1[j];
				  arr1[j]=temp;
			  }
			  
		  }
		 // System.out.print(arr1[i]+" "); 
		  
		}
		System.out.println();
		for( i=0;i<arr2.length;i++) {
			  for(int j=i+1;j<arr2.length;j++) {
				  if(arr2[i]>arr2[j]) {
					  int temp=arr2[i];
					  arr2[i]=arr2[j];
					  arr2[j]=temp;
				  }
				  
			  }
			  //System.out.print(arr2[i]+" ");

	}
		for(int j=0;j<arr1.length;j++) {
			if(arr1[i]==arr2[i]) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		

	}
}
