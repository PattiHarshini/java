package NRCM;

public class sample2 {
	int a=10,b=20;
	static int x=5,y=10;
	void add() {
		int n=10,m=5;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(n+m);
	}
	static void sub() {
		int n=10,m=5;
		System.out.println(x-y);
		System.out.println(n-m);
	}
	public static void main(String[] args) {
		sample2 s=new sample2();
		s.add();
		sub();
		
	}

}
