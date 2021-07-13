package questions;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.print("Sonata ");
		super.start();

	}

	@Override
	public void drive() {
		System.out.print("Sonata ");
		super.drive();
	}

	@Override
	public void stop() {
		System.out.print("Sonata ");
		super.stop();
	}

	@Override
	public void turnoff() {
		System.out.print("Sonata ");
		super.turnoff();
	}

	@Override
	public void washCar() {
		super.washCar();
	}
	

}
