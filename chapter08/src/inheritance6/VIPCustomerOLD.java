package inheritance6;

public class VIPCustomerOLD {
	private int customerID;			//�� ���̵�
	private String customerName;	//�� �̸�
	private String customerGrade;	//�� ���
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD () {
		//super();				//���� Ŭ������ �����ڸ� ȣ��, super() : ���� Ŭ������ �⺻ �����ڸ� ȣ��
		customerGrade = "VIP";	// �⺻ ���
		bonusRatio = 0.05;			//���ʽ� ����Ʈ �⺻ ���� ����
		saleRatio = 0.1;
	}
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;		//����Ʈ ����
		return price - (int)(price * saleRatio);	//10%�� ���ε� ����
	}
	public int getAgentID() {		//VIP ���� ���� Agent ID
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}
}
