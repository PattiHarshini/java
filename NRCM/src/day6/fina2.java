package day6;
class Test1{
	 final void show() {
		 System.out.println("hi");
		
	 }
}
public class fina2 extends Test1{
	void show() {
		int a=23;
		System.out.println(a);
		a=45;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fina2 f=new fina2();
		f.show();
	}

}
