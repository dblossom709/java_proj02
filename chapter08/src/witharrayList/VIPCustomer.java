package witharrayList;

public class VIPCustomer extends Customer{

	
	private int agentID;		//VIP 고객 상담원 ID
	double saleRatio;			//VIP 할인율(물품의 가격을 할인 비율)
	
	public VIPCustomer (int customerID, String customerName, int agentID) {
		//super();				//상위 클래스의 생성자를 호출,
		super(customerID, customerName);		//반드시 첫라인에 위치해야함.
		customerGrade = "VIP";	// 기본 등급
		bonusRatio = 0.05;		//보너스 포인트 기본 적립 비율(5%)
		saleRatio = 0.1;		//할인율 10%
		this.agentID = agentID;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);		// VIP 고객일 때 가격할인 (10%)
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 번호는 " + agentID + " 입니다.";
	}
	
	public int getAgentID() {		//VIP 고객을 위한 Agent ID
		return agentID;
	}
}
