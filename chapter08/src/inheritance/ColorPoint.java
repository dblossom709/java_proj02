package inheritance;

public class ColorPoint extends Point {

	private String color; // 점의 색
	
	//public ColorPoint(){}		//기본 생성자로, 생략될 수 있음

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint(); // point 클래스의 메소드 호출
	}
	/*
	  public static void main(String[] args) { Point p = new Point();
	  
	  p.x = 1; p.y = 2;
	  
	  }
	 */
}