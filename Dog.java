package cw;

public class Dog extends Animal implements AnimalRunner, AnimalEating  {

	
	@Override
	public void move() {
		System.out.println("I am use Doggy paws");
	}

	@Override
	public void eat() {
		System.out.println("I am eating bones now!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Bark Bark Bark");
		// TODO Auto-generated method stub
		
	}
}
