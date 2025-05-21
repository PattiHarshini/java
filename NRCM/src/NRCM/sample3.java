package NRCM;

public class sample3 {
	int s=5;
	static int r=5,l=2,b=3;
	void circle() {
		System.out.println(3.14*r*r);
	}
	static void rec() {
		System.out.println(l*b);
	}
	void square() {
		System.out.println(s*s);
	}
	static void tri() {
		int h=10,b=5;
		System.out.println(0.5*(h+b));
	}
	public static void main(String[] args) {
		sample3 s=new sample3();
		s.circle();
		rec();
		s.square();
		tri();
	}

}
