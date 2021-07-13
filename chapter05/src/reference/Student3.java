package reference;

public class Student3 {
	int studentID;			//학번
	String studentName;		//이름
	
	Subject korean;		//참조형 자료형 (subject 클래스) 국어 과목 / 점수
	Subject math;		//참조형 자료형 (subject 클래스) 수학 과목 / 점수
	
	public Student3() {
		korean = new Subject();
		math = new Subject();
		}
	public void setKorea(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
		}
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
}