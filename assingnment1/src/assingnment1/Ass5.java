package assingnment1;
interface Study1{
	void primary();
}
interface Study2{
	void secondary();
}
class Study3{
	void inter() {
		System.out.println("intermediate or 12th");
	}
}
class Study4 extends Study3 implements Study1,Study2{
	void bachelours() {
		System.out.println("btech or degree");
	}
	public void primary() {
		System.out.println("primary till 5th");
	}
	public void secondary() {
		System.out.println("secondary till 10th");
	}
}
public class Ass5 extends Study4 {
	void education() {
		System.out.println("path of education :");
	}
	public static void main(String[] args) {
		Ass5 s=new Ass5();
		s.education();
		s.primary();
		s.secondary();
		s.inter();
		s.bachelours();
		

	}

}
