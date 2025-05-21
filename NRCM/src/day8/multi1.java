package day8;

public class multi1 implements Runnable{
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi1 m1=new multi1();
		//multi1 m2=new multi1();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m1);
		System.out.println("hello");
		t1.start();        //2 times 1 thread is invoked
		t2.start();
		/*Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		//Thread t2=new Thread(m);
		System.out.println("hello");
		t1.start();        
		t2.start();*/
	}

}
