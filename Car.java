package cw;

public class Car extends Vehicle { //Extends

	private int liczbakol; //Encapsulation
	
	public Car(int nmbr) {
		super(nmbr);
	}
	
	public void setLiczbakol(int liczbakol) { 
		this.liczbakol = liczbakol;
	}
	
	public void setLiczbakol(String liczbakol) { //Overloading
		this.liczbakol = Integer.parseInt(liczbakol);
		
	}
	@Override
	public int getTxt() { //Overriding
		System.out.println(super.getTxt());
		return 3;
	}
	
	public static void hideMe() {
		System.out.println("I am a Car!");
	}
	
	public static void main(String[] args) {
		
		Car fiat = new Car(10);
		fiat.setLiczbakol(6);
		fiat.setLiczbakol("4");
		fiat.setTxt(10);
		fiat.getTxt();
		hideMe();
		Vehicle.hideMe(); //Hiding
	}
	
}
