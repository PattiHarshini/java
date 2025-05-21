package day8;
class Test6 extends Thread{
	public void run() {
		System.out.println("hi");
	}
}
class Test7 implements Runnable{
	public void run() {
		System.out.println("hello");
	}
}
public class multi2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t=new Test6();
		t.start();
		Test7 t1=new Test7();
		Thread th=new Thread(t1);
		th.start();
	}

}
