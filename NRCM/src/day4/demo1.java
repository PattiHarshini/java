package day4;
class priv{
	private void add() {
		System.out.println("hi");
	}
}
public class demo1 extends priv {

	public static void main(String[] args) {
		
		demo1 p=new demo1();
		p.add();//we are trying to access but it is private method
	}

}
