package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("��ٿ�");
		
		p = s;			//��ĳ����, �ٿ�ĳ���ð��� �ٸ��� Person �ڷ����� ���� ���� �ʾƵ� ���������� ����
		// �� 3���� Person p = new Student ("�����");		//��ĳ����
		
		System.out.println(p.name);
		
	    // p.grade = "A";			//������ ����
		// p.department= "HR";		//������ ����
		p.name = "ȫ�浿";
		p.id = "ID";
		
		s.grade = "A";
		s.department = "HR";
		s.id = "ID";
		s.name = "��ʶ�";
		
	}

}