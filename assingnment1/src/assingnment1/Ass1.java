package assingnment1;
interface Cylinder1{
	void tsa();
}
interface Cylinder2{
	void lsa();

}
interface Cylinder3 extends Cylinder1,Cylinder2{
	void volume();
	
}
	

public class Ass1 implements Cylinder3{
	
	public void tsa() {
		System.out.println("tsa:"+2*3.14*2*(5+2));
	}
	public void lsa() {
		System.out.println("lsa:"+2*3.14*2*5);
	}
	public void volume() {
		System.out.println("volume:"+3.14*2*2*5);
	}
	void display() {
		System.out.println("Areas and volume of cylinder are:");
	}
	public static void main(String[] args) {
		Ass1 a=new Ass1();
		a.display();
		a.tsa();
		a.lsa();
		a.volume();
		
		
	}

}

