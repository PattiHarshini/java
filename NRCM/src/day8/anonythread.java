package day8;

public class anonythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("task one");
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				System.out.println("task one");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
