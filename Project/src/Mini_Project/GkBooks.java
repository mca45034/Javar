package Mini_Project;

import java.util.Scanner;

public interface GkBooks {
	public static final String name4="---WEL COME TO LIBRARY---";
	static void String() {
		System.out.println(name4);
	}
	void search();
	//void serch2();
}

class GkBookss implements GkBooks{

	@Override
	public void search() {
		void_dis1();
		
		
	}
	 void void_dis1() {
		System.out.println("The Guns of August");
		System.out.println(" The Liberation Trilogy");
		System.out.println("The Crusades");
		System.out.println(" Caesar and Christ");
	}
}
	 
	//@Override
//	public void serch2() {
//		void_dis2();
//		
//	}
//	void void_dis2() {
//		 System.out.println("Panchatantra Stories.");
//			System.out.println("Tenali Raman Stories For Kids");
//			System.out.println("Tulsidas Ke Dohe");
//			System.out.println("Hindi Varnamala Ki Kahaniya");
//	 }
//	 class BookssGk implements BookGk{
//
//		@Override
//		public void serch2() {
//			void_dis2();
//			
//		}
//		void void_dis2() {
//			 System.out.println("Panchatantra Stories.");
//				System.out.println("Tenali Raman Stories For Kids");
//				System.out.println("Tulsidas Ke Dohe");
//				System.out.println("Hindi Varnamala Ki Kahaniya");
//		}
//		
//		 
//	 }
//		
//	}
//	