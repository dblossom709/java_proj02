package stacticex;

public class Student2 {
	private static int serialNum = 1000;
		//외부 클래스에서 접근 차단, setter에서 변수 값 할당, getter에서 변수 값 출력
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;	 //스텍 영역에 저장. 메소드가 실행이 끝나면 소멸
					//static 키워드가 들어간 메소드는 멤버변수(인스턴스 변수)를 사용할 수가 없음(메모리를 사용하는게 달라서)
			//studentName = "aaa";   > 오류가 난다.
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
