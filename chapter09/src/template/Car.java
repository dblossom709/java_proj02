package template;

public abstract class Car {

	
	public abstract void drive();		//�߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���
	public abstract void stop();		//�߻� �޼���
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {		//���ø� �޼���
		startCar();					//1. �õ��� �մϴ�.
		drive();					//2. ������ �մϴ�. (�ڵ�, ����)		//���� Ŭ�������� �������̵�
		stop();						//3. ���� ����(�ڵ�, ����)			//���� Ŭ�������� �������̵�
		turnoff();					//4. �õ��� ���ϴ�.
	}
}
