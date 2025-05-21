package day5;
class animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class dog extends animal{
	void eat() {
		System.out.println("eating");
	}
}
public class singleinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.sleep();
		d.eat();
	}

}
