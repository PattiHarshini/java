package day5;
class movie{
	void gener() {
		System.out.println("action and thiller");
	}
}
class hit extends movie{
	void action() {
		System.out.println("investigation");
	}
}
class hero extends hit{
	void name() {
		System.out.println("nani");
	}
}
class heroine extends hit{
	void acting() {
		System.out.println("excllent");
	}
}

public class hybrid {

	public static void main(String[] args) {
		hero h=new hero();
		heroine hi=new heroine();
		h.gener();
		h.action();
		h.name();
		hi.gener();
		hi.action();
		hi.acting();

	}

}
