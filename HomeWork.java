package cw;
import java.lang.Math;
/*
0.Napisz metod�, kt�ra zwr�ci Tw�j aktualny wiek.
1.Napisz metod�, kt�ra zwr�ci Twoje imi�,
2.Napisz metod�, kt�ra jako argument przyjmuje 2 liczby i wypisuje ich sum�, r�nic� i iloczyn,
3.Napisz metod�, kt�ra jako argument przyjmuje liczb� i zwraca true je�li liczba jest parzysta,
4.Napisz metod�, kt�ra jako argument przyjmuje liczb� i zwraca true je�li metoda jest podzielna przez 3 i przez 5,
5.Napisz metod�, kt�ra jako argument przyjmuje liczb� i zwraca go podniesionego do 3 pot�gi,
6.Napisz metod�, kt�ra jako argument przyjmuje liczb� i zwraca jej pierwiastek kwadratowy,
7.Napisz metod�, kt�ra jako argument przyjmie trzy liczby. Metoda powinna zwr�ci� true je�li z odcink�w o d�ugo�ci przekazanych w argumentach mo�na zbudowa� tr�jk�t prostok�tny.
   */



public class HomeWork {
	
	public static void myAge() {
		System.out.print("I am 31 years old\n");
		}
	
	public static void twoNumbers(int a, int b) {
		System.out.println("Addition: "+ (a+b));
		System.out.println("Substraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));		
	}
	
	public static void isOdd(int a) {
		if (a%2==0) System.out.println("The number "+a+" is odd"); else
		System.out.println("The number "+a+" is even");
		
	}
	public static void isCorrect(int a) {
		if (a%3==0) System.out.println("The number "+a+" is OK"); else
		System.out.println("The number "+a+" is not OK");
		
	}
	
	public static void numberThree(int c) {
		System.out.println("The number is: "+ (c*c*c));
		
	}
	
	public static void sqrtNumber(double a) {
		System.out.println("The absolute value of: "+Math.sqrt(a));
	}
	
	public static void isTriangle(double a, double b, double c) {
		if(Math.pow(a, 2.0)+Math.pow(b, 2.0)==Math.pow(c, 2.0)) System.out.println("YES! Pitagoras is alive"); else
			System.out.println("NO! It cannot be!");
		
	}
	
	public static void main(String[] args) {
	
		myAge();
		twoNumbers(4,5);
		isOdd(6);
		isOdd(7);
		isCorrect(11);
		isCorrect(12);
		numberThree(7);
		sqrtNumber(64);
		isTriangle(4.3, 4.5, 6.7);
		isTriangle(4.0, 3.0, 5.0);
	}

	

}
