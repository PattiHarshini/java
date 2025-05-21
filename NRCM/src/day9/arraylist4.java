package day9;
import java.util.*;
public class arraylist4 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();//object is parent class of all wrapper class so it is allowing all types of data into it
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		List<Object> l2=new ArrayList<Object>(l1);
		l2.add(12);
		l2.add(2);
		l2.add(121);
		l2.add(null);
		System.out.println(l2);
	}

}
