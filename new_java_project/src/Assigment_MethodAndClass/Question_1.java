package Assigment_MethodAndClass;

public class Question_1 {
	String name;
	int id;
	Question_1(){
		
	}
	Question_1(String s,int i){
		name=s;
		id=i;
	}
	public static void main(String[] args) {
		Question_1 s=new Question_1("ram",230);
		System.out.println(s.name);
		System.out.println(s.id);
		
	}

}
