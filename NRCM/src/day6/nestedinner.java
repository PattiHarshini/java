package day6;

public class nestedinner {
	void show() {
		System.out.println("hi");
	}
	class nestedinner1{
		void display() {
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		nestedinner n1=new nestedinner();
		n1.show();
		nestedinner.nestedinner1 n2=new nestedinner().new nestedinner1();
		n2.display();

	}

}
