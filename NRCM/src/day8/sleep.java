package day8;

public class sleep extends Thread{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleep s=new sleep();
		s.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
