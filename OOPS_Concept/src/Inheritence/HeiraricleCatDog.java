package Inheritence;
class Animal {
	void display() {
		System.out.println("There are Animal ");
	}
}
class Cat extends Animal {
	String sound;
	void display () {
		super.display();
		System.out.println("Cat is sound myauuuu...");
	}
}
class Dog extends Animal {
	String dog;
	void display() {
		super.display();
		System.out.println("Dog is sound barking..");
	}
}

public class HeiraricleCatDog {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.display();
		Dog d=new Dog();
		d.display();
		

	}

}
