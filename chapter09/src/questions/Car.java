package questions;

public abstract class Car {

	public void start(){
	System.out.println("시동을 켭니다.");
	}
	
	public void drive(){
		System.out.println("달립니다.");
	}
	public void stop(){
		System.out.println("멈춥니다.");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {
		System.out.println("세차를 합니다.");
	}

	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

}
