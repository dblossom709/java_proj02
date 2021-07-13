package thisex_t;

 class Birthday {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);	//this가 가르키는 객체의 힙 메모리 주소
	}
}
 public class ThisExample{
	 
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000);
		System.out.println(bDay);	//bDay 객체의 메모리(RAM)의 힙주소 출력
		bDay.printThis();
		
		System.out.println(bDay.year);
	}

}
