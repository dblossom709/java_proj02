package finalex;

import java.lang.String;
import java.lang.System;

public class Constant {		
	int num = 10;				//변수
	final int NUM = 100;		//상수

	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		//cons.NUM = 200;			//상수이므로 값을 할당 할 수 없음

		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
