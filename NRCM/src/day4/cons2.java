package day4;

public class cons2 {
	int a,b;
	public cons2(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons2 c=new cons2(5,10);
		c.add();
	}

}
