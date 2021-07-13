package inheritance6;

public class VIPCustomer extends Customer{

	
	private int agentID;		//VIP 고객 상담원 ID
	double saleRatio;			//VIP 할인율
	
	public VIPCustomer () {
		customerGrade = "VIP";	// 기본 등급
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율
		saleRatio = 0.1;
	}
	public int getAgentID() {		//VIP 고객을 위한 Agent ID
		return agentID;
	}
}
