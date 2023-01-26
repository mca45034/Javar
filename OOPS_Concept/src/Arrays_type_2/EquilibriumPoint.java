package Arrays_type_2;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int a[]=  {1,1,2,3,5,5,2} ;
		int count=0;
	
		for(int i=1;i<a.length;i++) {
			int leftindex=0;
			for(int j=0;j<i;j++) {
				leftindex=leftindex+a[j];
				
			}
			int rightindex=0;
			for(int j=i+1;j<a.length;j++) {
				rightindex=rightindex+a[j];
				
			}
			if(leftindex == rightindex) {
			 //count++;
				System.out.println(a[i]);
				break;
			}
			
		}
		//System.out.println(a[i]);
  
	}

}
