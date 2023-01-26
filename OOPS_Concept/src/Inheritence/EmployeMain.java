package Inheritence;

public class EmployeMain {
	String name="-----WEL COME TO CISCO-----";
	void yearlySelary(int day) {
		Employe ep=EmployeSetValue.Details();
		int total_selary=day*ep.getSelary();
		int PF=total_selary-30000;
		System.out.println("Employe id is..."+ep.getId());
		System.out.println("Employe name is..."+ep.getName());
		System.out.println("Employe department is..."+ep.getDepartment());
		System.out.println("Employe 365 day Selary.."+total_selary);
		System.out.println("PF After Selary...."+PF);
		
	}

	public static void main(String[] args) {
		EmployeMain em=new EmployeMain();
		em.yearlySelary(365);

	}

}
