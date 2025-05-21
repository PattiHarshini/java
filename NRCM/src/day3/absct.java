package day3;
abstract class Test3{
	abstract void display();
	abstract void show();
	}
class absct extends Test3 {
	public void display() {
		System.out.println("java is high level programming language");
	}
	public void show() {
		System.out.println("oops in java");
	}
	public static void main(String[] args) {
		
		absct a=new absct();
		a.display();
		a.show();
	}

}
