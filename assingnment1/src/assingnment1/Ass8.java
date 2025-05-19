package assingnment1;
interface States{
	void display1();
}
interface Country{
	void display2();
}

interface World{
	void display3();
}
class Planet implements States,Country,World{
	public void display1() {
		System.out.println("states contain diferent districts");
	}
	public void display2() {
		System.out.println("country contains different states");
	}
	public void display3() {
		System.out.println("world contains different coountries");
	}
	void display4() {
		System.out.println("planet contains different countries");
	}
}
interface Galaxy{
	void display5();
}
public class Ass8 extends Planet implements Galaxy{
	public void display5() {
		System.out.println("Galaxy contains different planets");
	}
	void display6() {
		System.out.println("universe contains different galaxies");
	}
	
	public static void main(String[] args) {
		Ass8 a=new Ass8();
		a.display1();
		a.display2();
		a.display3();
		a.display4();
		a.display5();
		a.display6();

	}

}
