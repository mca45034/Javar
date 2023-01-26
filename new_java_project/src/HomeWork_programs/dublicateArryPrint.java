package HomeWork_programs;

public class dublicateArryPrint {

	public static void main(String[] args) {
  
		int arr []=new int [] {1,2,2,3,3,5,6,5,4,};
		System.out.println("dublecate Arry : ");
      for(int i=0;i<arr.length;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {  
			System.out.print(i);
			}
    	  
      }

	}

	}
}
