package assingnment1;
import java.util.*;
public class password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password:");
		String password=sc.next();
		sc.close();
		int length=password.length();
		if(length>=8 && Character.isUpperCase(password.charAt(0))&&password.matches(".*[^a-z A-Z 0-9].*")) {
			System.out.println("valid password");
			
		}
		else {
			System.out.println("Invalid password");
		}
		
	}

}
