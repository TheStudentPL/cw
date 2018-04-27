package cw;

public class Cat extends Animal implements AnimalRunner, AnimalEating  {

	
	@Override
	public void move() {
		System.out.println("I am use Kitten paws");
	}

	@Override
	public void eat() {
		System.out.println("I am eating milk now!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Miau Miau Miau");
		// TODO Auto-generated method stub
		
	}
}
