package inheritance6;

public class VIPCustomerOLD {
	private int customerID;			//고객 아이디
	private String customerName;	//고객 이름
	private String customerGrade;	//고객 등급
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD () {
		//super();				//상위 클래스의 생성자를 호출, super() : 상위 클래스에 기본 생성자를 호출
		customerGrade = "VIP";	// 기본 등급
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율
		saleRatio = 0.1;
	}
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;		//포인트 적립
		return price - (int)(price * saleRatio);	//10%가 할인된 가격
	}
	public int getAgentID() {		//VIP 고객을 위한 Agent ID
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
}
