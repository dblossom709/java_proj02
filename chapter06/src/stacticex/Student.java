package stacticex;

public class Student {

	public static int serialNum = 1000;	//클래스 변수(static변수) >  프로그램이 로드 될 때 데이타 영역에 생성 
										//(모든 인스턴스에서 접근이 가능), 프로그램이 종료될 때 제거 
					
	int studentID;		//멤버 변수(인스턴스 변수) > 힙 영역에 생성
	String studentName;	//멤버 변수 > new 키워드를 통해서 인스턴스 생성 시, 힙영역에 생성됨
	int grade;			//멤버 변수 > 가비지 컬렉터에 의해서 제거가 됨
	String address;		//멤버 변수 >다른 인스턴스에 접근이 안되기 때문에 그 인스턴스 내에서만 사용
	/*
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	*/
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
	this.studentName = studentName;
}
/*
	public static int getSerialNum() {	//클래스 메소드, static 메소드
		int i = 10;
		//studentName = "aaa";
		return serialNum;
	}
	
	public static void setserialNum(int serialNum) {
	 this.serialNum = serialNum;
	
	}
	*/
}
