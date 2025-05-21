package day8;

public class thread1 extends Thread {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		thread1 t=new thread1();
		System.out.println("hello");
		t.start();//without calling run() it is automatically invoking 
	}

}
