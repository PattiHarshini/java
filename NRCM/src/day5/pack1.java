package day5;
interface i1{
	void add();
	void sub();
}
public class pack1 implements i1{
	public void add() {
		System.out.println(5+4);
	}
	public void sub() {
		System.out.println(5-4);
	}
	public static void main(String[] args) {
		pack1 p=new pack1();
		p.add();
		p.sub();

	}

}
