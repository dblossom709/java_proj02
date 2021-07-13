package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("김다영");
		
		p = s;			//업캐스팅, 다운캐스팅과는 다르게 Person 자료형을 명시 하지 않아도 묵시적으로 적용
		// 위 3줄의 Person p = new Student ("박장우");		//업캐스팅
		
		System.out.println(p.name);
		
	    // p.grade = "A";			//컴파일 오류
		// p.department= "HR";		//컴파일 오류
		p.name = "홍길동";
		p.id = "ID";
		
		s.grade = "A";
		s.department = "HR";
		s.id = "ID";
		s.name = "김똘똘";
		
	}

}
