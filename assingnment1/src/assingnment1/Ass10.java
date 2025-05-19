package assingnment1;
interface Sports{
	void activity1();
}
interface Cultural{
	void activity2();
}
interface Socialmedia{
	void activity3();
}
interface Sample4 extends Sports,Cultural,Socialmedia{
	void club(); 
}
public class Ass10 implements Sample4 {
	public void club() {
		System.out.println("Student activity Center(NRCM):");
	}
	public void activity1() {
		System.out.println("Sports club: kabaddi,cricket,basketball");
	}
	public void activity2() {
		System.out.println("cultural club: dance,event organising");
	}
	public void activity3() {
		System.out.println("Social media club: publicity");
	}
	void college() {
		System.out.println("NRCM");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10 a=new Ass10();
		a.college();
		a.club();
		a.activity1();
		a.activity2();
		a.activity3();
	}

}
