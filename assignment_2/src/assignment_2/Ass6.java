package assignment_2;

public class Ass6 {

	public static void main(String[] args) {
		try {
            String c = args[0];
            if (c.equals("printer1")|| c.equals("printer2")) {
                System.out.println("Available");
            } else {
                throw new Exception("Device failure: Not Available");
            }

        } catch (Exception e) {
            System.out.println( e.getMessage());
        } 

	}

}
