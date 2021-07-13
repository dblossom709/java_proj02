package array;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++, ch++) {		// A에서부터 Z까지 배열 방에 저장
			alphabets[i] = ch;
		}
		
		for(int i = 0; i < alphabets.length; i++) {				// 배열의 각 방에 내용을 출력
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}
}
