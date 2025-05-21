package day5;
class bike{
	void speed() {
		System.out.println("110kmph");
	}
}
class bmw extends bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends bmw{
	void price() {
		System.out.println("30lakhs");
	}}
public class multilevel {

	public static void main(String[] args) {
		model m=new model();
		m.speed();
		m.rev();
		m.price();

	}

}
