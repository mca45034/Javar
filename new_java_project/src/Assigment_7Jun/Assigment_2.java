package Assigment_7Jun;
class IPLTeam{
	IPLTeam(){
		System.out.println("--IPL sesson 2023--");
	}
	void String() {
		System.out.println("--WEL COME TO IPL TEAM--");
	}
	
}
class CSK extends IPLTeam{
	String name;
	int member;
	CSK(){
		
	}
	public CSK(String name,int member){
		this.name=name;
		this.member=member;
	}
	public void Display() {
		System.out.println("Team Name is : "+name);
		System.out.println("Total Team MEmbers : "+member);
	}
}
class RCB extends IPLTeam{
	String name;
	int members;
	RCB(){
		
	}
	public RCB(String name,int members){
		this.name=name;
		this.members=members;
	}
	void display() {
		System.out.println("Team Name is : "+name);
		System.out.println("Total Team MEmbers : "+members);
	}
	
}

public class Assigment_2 {

	public static void main(String[] args) {
		//IPLTeam t;

		CSK t=new CSK("CSK Team", 11);
		t.String();
		t.Display();
		System.out.println("-----------------------------");
		RCB r=new RCB ("RCB Team", 11);
		t.String();
		r.display();
		

	}

}
