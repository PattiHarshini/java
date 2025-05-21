package day3;
abstract class Test4{
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println("mul:"+2*3);
	}
	void div() {
			System.out.println("div:"+6/3);
			}
		void mod() {
			System.out.println("mod:"+6%5);
		}
}
class sample extends Test4 {
	public void add() {
		System.out.println("add:"+(2+3));
	}
	public void sub() {
		System.out.println("sub:"+(6-3));
	}

}
public class abs1{
	
	public static void main(String[] args) {
		
		sample a=new sample();
		a.add();
		a.sub();
		Test4.mul();
		a.div();
		a.mod();
		



	}

}
