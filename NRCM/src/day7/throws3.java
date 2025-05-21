package day7;
import java.util.*;
public class throws3 {
	void add()throws ArithmeticException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		throws3 t=new throws3();
		t.add();

	}

}