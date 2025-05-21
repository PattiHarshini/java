package day9;
import java.util.*;
public class arraylist5 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(34);
		l1.add(67);
		l1.add(1,67);//adds 67 at index 1
		System.out.println(l1);
		List<Object> extra=Arrays.asList(9,89,90);//takes values as array and covert into list
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();//takes list and covert into array if they have same dat type elements only
		for(Object a1:arr) {
			System.out.println(a1);
			
			
		}
	}

}
