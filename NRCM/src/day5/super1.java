package day5;
class sample1{
	public sample1() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class super1 extends sample1{
	public  super1(){
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}


	public static void main(String[] args) {
		super1 s=new super1();
		s.show();
		
	}

}
