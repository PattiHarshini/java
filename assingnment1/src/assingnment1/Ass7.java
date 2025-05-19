package assingnment1;

interface Person1{
	void gf();
}
interface Person2{
	void gm();
}
interface Person3 extends Person1,Person2{
	void father();
}
class Person4{
	void mother() {
		System.out.println("mother");
	}
}
public class Ass7 extends Person4 implements Person3{
	void child() {
		System.out.println("child of father and mother");
	}
	public void gf() {
		System.out.println("grandfather");
	}
	public void gm() {
		System.out.println("grandmother");
	}
	public void father() {
		System.out.println("father");
	}
	public static void main(String[] args) {
		Ass7 a=new Ass7();
		a.gf();
		a.gm();
		a.father();
		a.mother();
		a.child();
	}

}
