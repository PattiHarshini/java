package assingnment1;
import java.util.*;
public class alarm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter time:");
		int t=sc.nextInt();
		switch(t) {
		case 5:
			System.out.println("Wakeup");
			break;
		case 8:
			System.out.println("breakfast");
			break;
		case 10:
			System.out.println("Study");
			break;
		case 1:
			System.out.println("lunch");
		default:
			System.out.println("sleeping");
		}

	}

}
