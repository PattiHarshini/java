package day6;

public class this1 {
	int a=89;
	void add() {
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this1 t=new this1();
		t.add();
		t.sub();
		System.out.println(t.a);
	}

}
