package day7;
import java.util.*;
public class throws4 {
	static void add(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		throws3 t=new throws3();
		try {
		add(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}