package assingnment2;
class empdetails{
	int eid;
	String name;
	float salary;
	long phno;
	public empdetails(int eid,String name,float salary,long phno) {
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.phno=phno;
		this.print();
	}
	void print() {
		System.out.println("eid:"+eid);
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
		System.out.println("phno:"+phno);
	}
	
}
public class employee {

	public static void main(String[] args) {
		empdetails e1=new empdetails(11,"harsha",95000,7654328912l);
		empdetails e2=new empdetails(12,"varsha",15000,76545428912l);
		empdetails e3=new empdetails(17,"harshi",235000,7654328912l);

	}

}
