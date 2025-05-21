package day2;
import java.util.*;
public class sample9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter color:");
		String color=sc.next();
		
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate chirstamas");
		default:
				System.out.println("no festival");
		}
	}

}
