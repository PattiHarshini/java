package day7;
class harshiniException extends Exception{
	public harshiniException(String message) {
		super(message);
	}
}

public class myexception1 {
	public static void ageCheck(int num) throws harshiniException{
		if(num%2==0) {
			throw new harshiniException("no");
		}
		else {
			throw new harshiniException("yes");
		}
	}
	public static void main(String[] args) {
		try {
			ageCheck(245);
			}catch(harshiniException e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("happy coding");
			}
		}

	}


