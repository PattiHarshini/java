package day2;

public class sample5 {

	public static void main(String[] args) {
		int n=10;
		if(n%2==0) {
			System.out.println("divisble by 2");
			if(n%3==0) {
				System.out.println("divisble by 6");
			}
			else {
				System.out.println("only divisble by 2");
			}
		}
		else {
			if(n>=10)
			{
			System.out.println(" greater or equals to 10");
			}
			else{
				System.out.println("less than 10");
			}
		}

	}

}
