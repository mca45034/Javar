package class_object;

public class cafeAndHotal {
	String star;
	String reating;
	String review;
	void print() {
		System.out.println("Cafe And Hotal Take Star :"+star);
		System.out.println("Cafe And Hotal Take Reating :"+reating);
		System.out.println("Cafe And hotal Take Review :"+review);
	}
	public static void main(String[] args) {
		cafe c= new cafe();
		Hotel h=new Hotel();
		cafeAndHotal ch= new cafeAndHotal();
		c.print();
		System.out.println("-------------------------------------");
		h.print();
		System.out.println("-----------------------------------");
		ch.star="*****";
		ch.reating="Five";
		ch.review="Very Good";
		ch.print();
	}
}
