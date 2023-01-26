package Abstraction;
abstract class Mobile {
	static String name="Nokia";
	int price=35000;
	public Mobile(String color){
		System.out.println("Constractor colling");
	}
	public void FrantCamera() {
		System.out.println("Mobile with frant camera");
	}
	abstract  public void frontFlash();
}
class CamreWithFlash extends Mobile{
	CamreWithFlash(String color){
		super(color);
		
	}
	public void frontFlash() {
		//System.out.println(name);
		System.out.println(price);
		System.out.println("prividing functionlity");
		System.out.println("there camera is flash this phone");
		
	}
}

public class MobileFeature {

	public static void main(String[] args) {
		CamreWithFlash c=new CamreWithFlash("Gold");
		c.FrantCamera();
		c.frontFlash();

	}

}
