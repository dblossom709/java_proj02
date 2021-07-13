package hiding;

public class Student {
	int studentID;
	private String studentName;		//다른 클래스에서 접근할 수 없다.
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

	
	
}
