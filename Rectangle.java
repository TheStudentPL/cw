package cw;
import java.lang.Math;

/*
 Utw�rz klas� reprezentuj�c� prostok�t, musi posiada� atrybuty d�ugo�� i szeroko��. 
 Klasa powinna posiada� metody obliczaj�ce pole, obw�d i d�ugo�� przek�tnej.
   */


public class Rectangle {
	
	double lenght;
	double width;
	
	public Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
		}

	public double field() {
		
		return (this.lenght*this.width);
	}
	
	public double circut() {
		
		return 2*(this.lenght)+2*(this.width);
		
	}
	
	public double diagonal() {
		
		return (Math.sqrt(Math.pow(this.lenght, 2.0)+Math.pow(this.width, 2.0)));
		
	}
	
public static void main(String[] args) {
	
	Rectangle rectone = new Rectangle(4.0, 7.0);
	System.out.println(rectone.field());
	System.out.println(rectone.circut());
	System.out.println(rectone.diagonal());
}

}

