package day5;
class i3{
	void add() {
		System.out.println(6+4);
	};
}
interface i4{
	void sub();
}
public class interf  extends i3 implements i4 {
	public void sub() {
		System.out.println(6-4);
	}
	public static void main(String[] args) {
		interf i=new interf();
		i.add();
		i.sub();

	}

}
