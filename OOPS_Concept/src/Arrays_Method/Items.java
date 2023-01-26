package Arrays_Method;

import java.util.Scanner;

class Item{
	private String name;
	private int price;
	private  String product;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setProduct(String product) {
		this.product=product;
	}
	public String getProduct() {
		return product;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", product=" + product + "]";
	}
	
}

public class Items {

	public static void main(String[] args) {
		
		Item item1[]=new Item[3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<item1.length;i++) {
			System.out.println("Item name : ");
			String name=sc.next();
			System.out.println("Item price :");
			int price=sc.nextInt();
			System.out.println("Product by : ");
			String product=sc.next();
			item1[i] =new Item();
			item1[i].setName(name);
			item1[i].setPrice(price);
			item1[i].setProduct(product);
			
		}
		for(int i=0;i<item1.length;i++) {
			System.out.println("item name is"+item1[i].getName());
			System.out.println("item price is"+item1[i].getPrice());
			System.out.println("item Product is"+item1[i].getProduct());
		}
		

	}

}
