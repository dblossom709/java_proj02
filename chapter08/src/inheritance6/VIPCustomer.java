package inheritance6;

public class VIPCustomer extends Customer{

	
	private int agentID;		//VIP �� ���� ID
	double saleRatio;			//VIP ������
	
	public VIPCustomer () {
		customerGrade = "VIP";	// �⺻ ���
		bonusRatio = 0.05;			//���ʽ� ����Ʈ �⺻ ���� ����
		saleRatio = 0.1;
	}
	public int getAgentID() {		//VIP ���� ���� Agent ID
		return agentID;
	}
}
