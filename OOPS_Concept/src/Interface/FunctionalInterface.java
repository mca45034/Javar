package Interface;


public interface FunctionalInterface {
	public static void main(String[] args) {
	Calculater c=(a,b)->{return a+b;};
	System.out.println(c.operation(40, 70));
	
	}
}
