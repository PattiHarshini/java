package day7;
import java.util.*;

public class exception2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
	try{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}/*catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch(InputMismatchException e) {
		System.out.println(e.getMessage());
	}*/
	catch(ArithmeticException|InputMismatchException e) {
		System.out.println(e.getMessage());
	

}
}
}