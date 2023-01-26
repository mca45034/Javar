package Assigment_14JAN;

public class MyDate {
	int day;
	int month;
	int year;
	public MyDate(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
