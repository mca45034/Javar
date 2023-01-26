package String_Assigment21JAN;

public class Assigment_2 {

	public static void main(String[] args) {
		//String is immuteble
		String s="hello";
		s.concat("world");
		System.out.println(s);
		//String is muteble
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);

	}

}
