package AggerigetionInInheritence;

public class Customer {
	String name;
	String typecoffie;
	String reviews;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setTypecoffie(String typecoffie) {
		this.typecoffie=typecoffie;
	}
	public String getTypecoffie() {
		return typecoffie;
	}
	public void setReviews(String reviews) {
		this.reviews=reviews;
	}
	public String getReviews() {
		return reviews;
	}
	public String toString() {
		return name+" "+typecoffie+" "+reviews;
	}

}
