package questions;

public abstract class Car {

	public void start(){
	System.out.println("�õ��� �մϴ�.");
	}
	
	public void drive(){
		System.out.println("�޸��ϴ�.");
	}
	public void stop(){
		System.out.println("����ϴ�.");
	}
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {
		System.out.println("������ �մϴ�.");
	}

	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

}
