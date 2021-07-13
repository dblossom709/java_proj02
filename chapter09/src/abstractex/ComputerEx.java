package abstractex;

public class ComputerEx {
	public void display();		//abstract가 들어가야 오류나지 않음
	public void typing();
	public void turnOn() {		//{} 실행부가 있어서 오류나지 않음
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
