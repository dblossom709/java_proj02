package abstractex;

public abstract class Computer {			//abstract를 넣어줘야 아래가 오류가 안남
	//추상 클래스는 추상 메소드를 포함하면서 구현이 없이 선언만 한다. (템플릿, 틀이 될 수 있다, 구현은 하위클래스에서 하도록)
	// 프레임워크 구현, 인터페이스 구현, 템플릿 등에 사용
	
	public abstract void display();			//추상 메소드 : 선언부만 존재하고, 실행부{}가 없는 메소드
	abstract public void typing();			//추상 메소드
	
	//public int add(int a, int b);	//실행부는 없고 선언부만 있는 메소드
	public void add(int a, int b) {}	//실행부가 있는 메소드 > 일반 메소드 (int로 넣으면 return이 들어가야함)
	
	public void turnOn() {		//{} 실행부가 있어서 오류나지 않음
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
