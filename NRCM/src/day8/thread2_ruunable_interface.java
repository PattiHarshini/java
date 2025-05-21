package day8;

public class thread2_ruunable_interface implements Runnable {
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thread2_ruunable_interface t=new thread2_ruunable_interface();
		Thread t1=new Thread(new thread2_ruunable_interface());
		System.out.println("hello");
		t1.start();
	}

}
