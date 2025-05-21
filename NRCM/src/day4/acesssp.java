package day4;
class demo2{
	void add() {
		System.out.println(10+5);
	}
	public void sub() {
		System.out.println(10-5);
	}
	protected void mul() {
		System.out.println(10*5);
	}
	private void div() {
		System.out.println(10/5);
	}
	
	
}
public class acesssp extends demo2{

	public static void main(String[] args) {
		
		acesssp a=new acesssp();
		a.add();
		a.sub();
		a.mul();
		a.div();//cannot acess private
	}

}
