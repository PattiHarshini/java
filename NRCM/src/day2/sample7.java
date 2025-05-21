package day2;

public class sample7 {

	public static void main(String[] args) {
		int n=10;
		if(n%2==0) {
			if(n>=10) {
			System.out.println("divisble by 2 and greater than or equals to  10");
		}
		}
		else {
			if(n%3==0) {
				if(n>10) {
					System.out.println("divisible by 3 and greater than 10");
				}
				else {
					System.out.println("divisible by 3 and less than 10");
				}
			}
			else if(n<10) {
				
					System.out.println("not divisible by 3 and less than 10");
				}
			}
		}

	}


