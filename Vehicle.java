package cw;

public class Vehicle {

	private int nmbr;
	private int txt;
	
	public Vehicle (int nmbr) {
		this.nmbr = nmbr;
	}
	
	public void setTxt(int txt) {
		this.txt = txt;
	}
	
	public int getNmbr() {
		return nmbr;
	} 
	
	public int getTxt() {
		return txt;
	}

	public static void hideMe() { //
		System.out.println("Vehicle! Maluch");
	}
	
	public static void main (String[] args) {
		Vehicle maluch = new Vehicle(2);
		maluch.setTxt(10);
		System.out.println(maluch.getNmbr());
		System.out.println(maluch.getTxt());
	}
	
}
