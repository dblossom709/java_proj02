package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer();		//추상클래스는 객체를 생성할 수 없다.
		Computer c2 = new DeskTop();		//
		Computer c3 = new NoteBook();		//
		Computer c4 = new MyNoteBook();
	}

}
