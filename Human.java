package cw;
/*
 Utwórz klasê Human reprezentuj¹c¹ cz³owieka, 
 musi posiadaæ atrybuty takie jak wiek, waga, wzrost, 
 imiê i p³eæ. Klasa powinna tak¿e zawieraæ metody getAge, 
 getWeight, getHeight, getName, isMale.
  */


public class Human {
	
	int age;
	int weight;
	int height;
	String name;
	String sex;
	
	public Human(int age, int weight, int height, String name, String sex) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.sex = sex;
	}
	
	public void getAge() {
		System.out.println(this.age);
	}
	
	public void getWeight() {
		System.out.println(this.weight);
	}
	
	public void getHeight() {
		System.out.println(this.height);
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	
	public boolean isMale() {
		return (this.sex.equals("Male"));
	}
	
	public static void main(String[] args) {
	
	Human Staszek = new Human(34,99,187,"Stanislaw","Male");
	Staszek.getAge();
	Staszek.getWeight();
	Staszek.getHeight();
	Staszek.getName();
	System.out.println("Is staszek a Male?: "+Staszek.isMale());
	}
	
}