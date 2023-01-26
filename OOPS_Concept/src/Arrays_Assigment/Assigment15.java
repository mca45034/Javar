package Arrays_Assigment;

public class Assigment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {72, 69, 76, 76, 79};
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] % 10 ==9) {
			//	System.out.println(arr[i]);
				arr[i]=0;
	
			}
			
		}
		for(int a:arr) {
			System.out.print( " "+a);
			}
		

	}

}
 