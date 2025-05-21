package day9;

import java.util.ArrayList;
import java.util.List;

public class arraylist3 {

	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		List<Object> l2=new ArrayList<Object>(l1);//adding l2 to l1 within constructor
		l2.add(12);
		l2.add(2);
		l2.add(121);
		l2.add(null);
		System.out.println(l2);

	}

}
