package inheritance5;
class A{
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자 A");
	}
	public A(int x, int y) {
		System.out.println("매개변수 생성자 2개 A");

	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		//super();
		//super(10);
		super(10,20);
		System.out.println("매개변수 생성자 B");
	}
}

public class ConstructorEx03 {

	public static void main(String[] args) {
		
		B b;
		b = new B(5);
		
		
	}

}
