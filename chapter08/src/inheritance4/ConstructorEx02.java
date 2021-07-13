package inheritance4;

class A {

	public A() {
		System.out.println("생성자 A");
	}
	
}

class B extends A {
	
	public B() {
	super();	
		System.out.println("생성자 B");
	}
	
}


class C extends B {

	public C() {
		super();			// 슈퍼클래스(부모 클래스), 부모클래스의 생성자 호출, 반드시 첫번째 라인.
		
		System.out.println("생성자 C");
	}
}


public class ConstructorEx02 {

	public static void main(String[] args) {
		C c;
		c = new C();
		
	}

}
