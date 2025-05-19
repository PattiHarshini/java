package assingnment1;
interface Pak{
	void attack();
}
interface Ind{
	void mission();
}
class Usa{
	void ceasefire() {
		System.out.println("trump mediated for ceasefire");
	}
}
public class Ass4 extends Usa implements Ind,Pak{
	public void attack() {
		System.out.println("pahalgam attack");
	}
	public void mission() {
		System.out.println("operation sindoor");
	}
	void present() {
		System.out.println("current situation");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass4 a=new Ass4();
		a.present();
		a.attack();
		a.mission();
		a.ceasefire();

	}

}
