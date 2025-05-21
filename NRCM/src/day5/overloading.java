package day5;
class demo2{
	void show() {
		System.out.println("good morning");
	}
	void show(int a,int b)
	{
		System.out.println(a+b);
	}
	void show(double d1,double d2)
	{
		System.out.println(d1-d2);
	}
	void show(String s1,String s2)
	{
		System.out.println(s1+s2);
	}
}
public class overloading {

	public static void main(String[] args) {
		demo2 d=new demo2();
		d.show();
		d.show(2,3);
		d.show(5.432,7.907);
		d.show("hello ","harshini");

	}

}
