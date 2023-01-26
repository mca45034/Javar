package Assigment_ArraysMethod;

public class Student {
	int id;
	String name;
	Boolean ispecial=false;
	Course c;
	
		public Student(int id, String name, Boolean ispecial, Course c) {
			//super();
			this.id = id;
			this.name = name;
			this.ispecial = ispecial;
			this.c = c;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", ispecial=" + ispecial + ", c=" + c + "]";
		}
	
	

}
