package assingnment1;
interface Transport{
	void travell();
}
class Vehicle1{
	void publicvehicle() {
		System.out.println("bus,train,auto,flight");
	}
}
class Vehicle2 extends Vehicle1 implements Transport{
	void privatevehicle() {
		System.out.println("bike,car,cycle");
	}
	public void travell() {
		System.out.println("we can travell across the world ");
	}
}
public class Ass3 extends Vehicle2 {
	void display() {
		System.out.println("different types of vehicles are:");
	}
	public static void main(String[] args) {
		Ass3 a=new Ass3();
		a.travell();
		a.display();
		a.publicvehicle();
		a.privatevehicle();

	}

}
