package String;

public class SortCountryName {

	public static void main(String[] args) {
		String a[]= {"india","chaina","japan","usa"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].charAt(0)>a[j].charAt(0)) {
					String tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
