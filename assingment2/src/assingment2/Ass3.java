package assingment2;
import java.util.*;
public class Ass3 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the value of 'a':");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of 'b':");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("result of a/b:"+c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			

		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter valid integer values");
		}

	}

}