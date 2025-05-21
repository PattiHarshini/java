package assingment2;

class employeeException extends Exception{
	public employeeException(String message) {
		super(message);
	}
}

public class Ass2 {
	public static void numCheck(int num) throws employeeException{
		if(num<0 ||num>999) {
			throw new employeeException("Exception caught\nInvalid Employee ID");
			
		}
		else {
			throw new employeeException("Valid Employee ID");
		}
	}
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		try {
			numCheck(a);
			
			}catch(employeeException e) {
				System.out.println(e.getMessage());
				
			}
		}

	}


