package cw;
import java.lang.Math;


/*
 Utw�rz klas� o nazwie MyNumber, kt�rej jedyny konstruktor przyjmuje liczb�. 
 Klasa powinna mie� nast�puj�ce metody
MyNumber isOdd() - true je�li atrybut jest nieparzysty,
MyNumber isEven() - true je�li atrybut jest parzysty,
MyNumber sqrt() - pierwiastek z atrybutu,
MyNumber pow(MyNumber x) - atrybut podniesiony do pot�gi x
MyNumber add(MyNumber x) - zwraca sum� atrybutu i x opakowan� w klas� MyNumber,
MyNumber subtract(MyNumber x) - zwraca r�nic� atrybutu i x opakowan� w klas� MyNumber. 
 */

public class MyNumber {

	double number;
	
	public MyNumber(double number) {
		
		this.number = number;
	}
	
	public boolean isOdd() {
		if ((this.number)%2==0) return false; else return true;
	}
	public boolean isEven() {
		if ((this.number)%2==0) return true; else return false;
	}
	
	public double numbersqrt() {
		
		return (Math.sqrt(this.number));
	}
	
	public double powerab(double b) {
		
		return (Math.pow(this.number,b));
	}
	
	public double addnumber(double b) {
		
		return (this.number+b);
	}
	
	public double substractnumber(double b) {
		
		return (this.number - b);
	}
	
	public static void main(String args[]) {
		
		MyNumber number = new MyNumber(32.0);
		System.out.println("Is Even?: "+number.isEven());
		System.out.println("Is Odd?: "+number.isOdd());
		System.out.println("The number sqrt: "+number.numbersqrt());
		System.out.println("Numbers power: "+number.powerab(2.0));
		System.out.println("Add two numbers: "+number.addnumber(4.7));
		System.out.println("Substract two numbers: "+number.substractnumber(6.8));
		
		
	}
	
}
