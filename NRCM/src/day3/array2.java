package day3;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		 int a[]= {23,65,878,90,7};
		 Scanner sc=new Scanner(System.in);
		 sc.close();
		 System.out.println("enter index");
		 int i=sc.nextInt();
		 if(i>a.length) {
			 System.out.println("Array index out of bounds");
		 }
		 else {
			 System.out.println(a[i]);
		 }
	}

}
