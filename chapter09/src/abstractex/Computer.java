package abstractex;

public abstract class Computer {			//abstract�� �־���� �Ʒ��� ������ �ȳ�
	//�߻� Ŭ������ �߻� �޼ҵ带 �����ϸ鼭 ������ ���� ���� �Ѵ�. (���ø�, Ʋ�� �� �� �ִ�, ������ ����Ŭ�������� �ϵ���)
	// �����ӿ�ũ ����, �������̽� ����, ���ø� � ���
	
	public abstract void display();			//�߻� �޼ҵ� : ����θ� �����ϰ�, �����{}�� ���� �޼ҵ�
	abstract public void typing();			//�߻� �޼ҵ�
	
	//public int add(int a, int b);	//����δ� ���� ����θ� �ִ� �޼ҵ�
	public void add(int a, int b) {}	//����ΰ� �ִ� �޼ҵ� > �Ϲ� �޼ҵ� (int�� ������ return�� ������)
	
	public void turnOn() {		//{} ����ΰ� �־ �������� ����
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
}
