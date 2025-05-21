package day5;

class chocolate{
	void eat() {
		System.out.println("eating");
	}
}
class dark extends chocolate{
	void taste1() {
		System.out.println("bitter");
	}
}
class milk extends chocolate{
	void taste2() {
		System.out.println("sweet");
	}
}
class bournville extends dark{
	void price() {
		System.out.println("120");
	}
}
class amul extends dark{
	void cal() {
		System.out.println("500 cal");
	}
}
class kitkat extends milk{
	void quantity() {
		System.out.println("100 gm");
	}
}
class gems extends milk{
	void fat() {
		System.out.println("20");
	}
}
public class hierrachial {

	public static void main(String[] args) {
		amul a=new amul();
		gems g=new gems();
		a.cal();
		a.taste1();
		g.taste2();
		g.fat();
		
		

	}
}
