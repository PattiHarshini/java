package NRCM;

public class DEMO {
	int a=15,b=5;//INSTANCE
	static int x=10,y=20;
	void mod() {
		System.out.println(a%b);
	}
	void mul()
	{
		System.out.println(x*y);
	}
	void div(){
		int m=10,n=2;
		System.out.println(m/n);
	}
	public static void main(String[] args) {
		DEMO d=new DEMO();
		d.mod();
		System.out.println(d.a%d.b);
		d.mul();
		d.div();
		  
	}

}
