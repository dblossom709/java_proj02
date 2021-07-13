package questions;

public class Grandeur extends Car{

	@Override
	public void start() {
		System.out.print("Grandeur ");
		super.start();
	}

	@Override
	public void drive() {
		System.out.print("Grandeur ");
		super.drive();
	}

	@Override
	public void stop() {
		System.out.print("Grandeur ");
		super.stop();
	}

	@Override
	public void turnoff() {
		System.out.print("Grandeur ");
		super.turnoff();
	}
	@Override
	public void washCar() {
		super.washCar();
	}
}
