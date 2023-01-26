package Assigment_28Dec1;

public class EmployeeSalaryCalculationMain {

	public static void main(String[] args) {
		EmployeeSalaryCalculation esc=new EmployeeSalaryCalculation();
		esc.setEmployee_id(1001);
		esc.setEmployee_Name("Vivek");
		esc.setSalary(20000);
		System.out.println("Id: "+esc.getEmployee_id());
		System.out.println("Name: "+esc.getEmployee_name());
		System.out.println("Salary: "+esc.getSalary());
		//esc.setNetSalary(1400);
		int x=(int) (esc.getSalary()-1400);
		esc.setSalary(x);
		System.out.println("Net Salary: "+esc.getSalary());
		

	}

}
