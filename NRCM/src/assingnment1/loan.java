package assingnment1;
import java.util.*;
public class loan {

	public static void main(String[] args) {
		System.out.println("Enter your credit card Score");
		Scanner sc=new Scanner(System.in);
		sc.close();
		int s=sc.nextInt();
		if(s>=750) {
			System.out.println("Full loan eligibility");
		}
		else if(s>650&& s<=749)
		{
			System.out.println("partial loan eligibility");
		}
		else {
			System.out.println("no loan eligibility");
		}
	}

}
