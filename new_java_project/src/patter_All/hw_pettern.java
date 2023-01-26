package patter_All;

public class hw_pettern {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int k=2;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(l);
			}
			System.out.println(" ");
		}

	}

}
