package day3;
abstract class test5{
	abstract void show1();
	static void show2() {
		System.out.println("hi");
	}
	static void show3() {
		System.out.println("hello");
	}
	void show4(){
		System.out.println("hru");
	}
	void show5() {
		System.out.println("gd evng");
	}
}
class test6 extends test5{
	public void show1() {
		System.out.println("gm");
	}
	void show6() {
		System.out.println("ga");
	}
}
public class abs2 {

	public static void main(String[] args) {
		test6 t=new test6();
		t.show1();
		t.show4();
		t.show5();
		test5.show2();
		test5.show3();

	}

}
