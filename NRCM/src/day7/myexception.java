package day7;
class chepthaException extends Exception{
	public chepthaException(String message) {
		super(message);
	}
}

public class myexception {
	public static void ageCheck(int age) throws chepthaException{
		if(age>18) {
			throw new chepthaException("nenu cheptha");
		}
		else {
			throw new chepthaException("na age 18 below");
		}
	}
	public static void main(String[] args) {
		try {
			ageCheck(245);
			}catch(chepthaException e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("happy coding");
			}
		}

	}


