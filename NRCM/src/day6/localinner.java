package day6;

public class localinner {
	void show() {
		System.out.println("hi");
		class inner2{
			void display() {
				System.out.println("hello");
			}
		}
		inner2 l2= new inner2();
		l2.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localinner l=new localinner();
		l.show();
	}

}
