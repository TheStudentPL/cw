package cw;

public interface AnimalRunner {

	public default void run() {
		System.out.println("RUN animal !!!");	
	}
	void move();
}
