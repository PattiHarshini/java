package assingnment1;
interface Team1{
	void srh();
}
interface Team2 extends Team1{
	void csk();
}
class Ipl1 implements Team2{
	void state() {
		System.out.println("team states are:");
	}
	public void srh() {
		System.out.println("Telangana");
	}
	public void csk() {
		System.out.println("Tamil Nadu");
	}
}
class Ipl2 implements Team2{
	void color() {
		System.out.println("team jersey color are:");
	}
	public void srh() {
		System.out.println("orange");
	}
	public void csk() {
		System.out.println("yellow");
	}
}
public class Ass2 {

	public static void main(String[] args) {
		Ipl1 i1=new Ipl1();
		i1.state();
		i1.srh();
		i1.csk();
		Ipl2 i2=new Ipl2();
		i2.color();
		i2.srh();
		i2.csk();

	}

}
