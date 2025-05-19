package assingnment1;
interface Herbivorous{
	void food1();
}
interface Carnivorous{
	void food2();
}
interface Omnivorous{
	void food3();
}
class Sample1 implements Herbivorous{
	public void food1() {
		System.out.println("grass,leaves");
	}
}
class Sample2 implements Carnivorous{
	public void food2() {
		System.out.println("meat,flesh");
	}
}
class Sample3 implements Omnivorous{
	public void food3() {
		System.out.println("meat,vegetables");
	}
}
public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new Sample1();
		Sample2 s2=new Sample2();
		Sample3 s3=new Sample3();
		s1.food1();
		s2.food2();
		s3.food3();
	}

}
