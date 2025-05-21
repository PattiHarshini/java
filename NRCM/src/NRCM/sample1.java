package NRCM;

public class sample1 {
	int a=10,b=20;
	static int x=5,y=10;
	void not() {
		int m=3,n=4;
		System.out.println(!(m<n));
	}
	public static void main(String[] args) {
		sample1 s=new sample1();
		System.out.println((s.a<s.b)&&(s.a<=s.b));
		System.out.println((x>y)||(x>=y));
		s.not();
	}
}
