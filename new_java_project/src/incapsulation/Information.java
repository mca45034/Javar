package incapsulation;

public class Information {
	String name;
	String location;
	int i_id;
	int price;
	
	Information(String n,String l,int id,int p){
		name=n;
		location=l;
		i_id=id;
		price=p;
	}
	void print() {
		System.out.println("Name is.."+name);
		System.out.println("Location is.."+location);
		System.out.println("trcket id.."+i_id);
		System.out.println("price.."+price);
	}
	int getprice() {
		return price;
	}

}
