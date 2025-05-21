package day8;
class Test1 extends Thread{
	public void run() {
		System.out.println("hi");
	}
}
class Test2 extends Test1{
	public void run() {
		System.out.println("hello");
	}
}
class Test3 implements Runnable{
	public void run() {
		System.out.println("namsthe");
	}
}
class Test4 extends Test3{
	public void run() {
		System.out.println("gd mrng");
	}
}
public class multi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.start();
		Test2 t2=new Test2();
		t2.start();
		Test3 t3=new Test3();
		Test3 t4=new Test4();
		Thread th1=new Thread(t3);
		Thread th2=new Thread(t4);
		th1.start();
		th2.start();
	}

}
