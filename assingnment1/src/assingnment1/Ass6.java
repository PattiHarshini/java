package assingnment1;
interface Fruits{
	void names1();
}
class Vegetables{
	void names2() {
		System.out.println("carrot,tomato,potato");
	}
}
class Health extends Vegetables implements Fruits{
	void food1() {
		System.out.println("fruits and vegetables are good for health");
	}
	public void names1() {
		System.out.println("apple,mango,banana");
	}
}
class Junk{
	void names3(){
		System.out.println("noodles,chips,burger");
	}
}
class Unhealth extends Junk{
	void food2() {
		System.out.println("junk foods are not good for health");
	}
}
public class Ass6 {

	public static void main(String[] args) {
		Health h=new Health();
		Unhealth u=new Unhealth();
		h.names1();
		h.names2();
		h.food1();
		u.names3();
		u.food2();

	}

}
