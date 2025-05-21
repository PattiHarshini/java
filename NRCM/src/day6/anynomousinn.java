package day6;
class test34{
	void show() {
		System.out.println("hi");
	}
}
public class anynomousinn {
test34 t=new test34() {
	void show() {
		System.out.println("hello");
	}
};
	public static void main(String[] args) {
		anynomousinn a=new anynomousinn();
		a.t.show();
	}

}
