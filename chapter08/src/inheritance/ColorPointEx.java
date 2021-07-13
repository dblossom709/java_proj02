package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();		//Point 클래스의 객체 생성
		
		p.set(1,  2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	//ColorPoint 객체
		cp.set(3,  4);						//ColorPoint 클래스에는 없는 메소드이지만, 상위 클래스인 Point 클래스에서 상속받아서 쓸 수 있다.
		cp.setColor("red");
		cp.showColorPoint();
		
	}

}
