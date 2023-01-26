package com.pojo;

public class Book {
	private int id;
	private String name;
	private int price;
	private int noOfCopeis;
	public Book() {
		
	}
	public Book(int id, String name, int price, int noOfCopeis) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.noOfCopeis = noOfCopeis;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfCopeis() {
		return noOfCopeis;
	}
	public void setNoOfCopeis(int noOfCopeis) {
		this.noOfCopeis = noOfCopeis;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", noOfCopeis=" + noOfCopeis + "]";
	}
	

}
