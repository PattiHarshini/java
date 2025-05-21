package day5;
interface i5{
	void add();
}
interface i6{
	void sub();

}
interface i7 extends i5,i6{
	void mul();
	
}
class demo1 implements i7{
	public void add() {
		System.out.println(6+4);
	}
	public void sub() {
		System.out.println(6-4);
	}
	public void mul() {
		System.out.println(6*4);
	}
}
public class interf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d=new demo1();
		d.add();
		d.sub();
		d.mul();
	}

}
