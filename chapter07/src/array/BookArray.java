package array;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];			//객체 타입의 배열 선언, 생성 / 초기화를 시키지 않았다(값을 넣지 않았다)
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
