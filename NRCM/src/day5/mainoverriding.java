package day5;
public class mainoverriding {
	public static void main(String args[])
	{
		System.out.println("hi");
	}
}
class mainoverriding1 extends mainoverriding {
	public static void main(String args[]) {
	
		System.out.println("hello");
		main(args);
}
}