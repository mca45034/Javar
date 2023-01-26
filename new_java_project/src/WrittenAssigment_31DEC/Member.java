package WrittenAssigment_31DEC;

public class Member {
	String name;
	int accountNo;
	Member(String name,int accountNo){
		this.name=name;
		this.accountNo=accountNo;
	}
	void display() {
		System.out.println("Member name is..."+name);
		System.out.println("Member AccountNo is..."+accountNo);
	}

}
