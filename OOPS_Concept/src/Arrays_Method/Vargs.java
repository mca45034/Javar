package Arrays_Method;

public class Vargs {
	void Show(int...a){
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	void StringMrthod(int a,String...s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(a+" "+s[i]);
		}
	}
	

	public static void main(String[] args) {
		Vargs v=new Vargs();
		v.Show(20,30,40,50);
		System.out.println("--------------");
		v.Show(40,50,60);
		System.out.println("------");
		v.StringMrthod(1,"yello","pink","red","blue");
		System.out.println("-------------------");
		v.StringMrthod(2,"ram","Sham","Rahul");
		
	}

}
