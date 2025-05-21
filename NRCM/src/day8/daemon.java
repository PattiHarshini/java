package day8;

public class daemon extends Thread {
	String s;
	public daemon(String name) {
		s=name;
	}
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s+"is Deamon Thread");
		}
		else {
			System.out.println(s+"is user Thread");
		}
	}
	public static void main(String[] args) {
		daemon thread1=new daemon("thread1");
		daemon thread2=new daemon("thread2");
		daemon thread3=new daemon("thread3");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(false);
		thread3.start();
	}

}
