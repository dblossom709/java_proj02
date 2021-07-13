package arraylist;

import java.util.ArrayList;

public class Student {

		int studentID;
		String studentName;
		ArrayList<Subject> subjectList;		//ArrayList 객체형 타입을 선언(해당 과목의 이름과 점수를 담은 객체형 배열)
		
	public Student(int studentID, String studentName) {		//Student 생성자
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();		//new라는 키워드를 subject 클래스를 ArrayList로 임포트 
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 총점은 " +s.getName()+ " 과목 성적은 " +s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
	}
		
	}

