package day6;
class sample26{
	static void show() {
		System.out.println("hi");
	}
	static class test25{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class staticinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample26.test25.print();

	}

}
