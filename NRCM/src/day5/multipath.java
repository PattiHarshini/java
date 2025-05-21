package day5;
class fruits{
	void benefits() {
		System.out.println("healthy");
	}
}
class apple extends fruits{
	void color() {
		System.out.println("red");
	}
}
class mango extends fruits{
	void taste() {
		System.out.println("sweet");
	}
}
class grapes extends fruits{
	void price() {
		System.out.println("50");
	}
}

public class multipath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple a=new apple();
		a.color();
		a.benefits();
		mango m=new mango();
		m.taste();
		grapes g=new grapes();
		g.price();
	}

}
