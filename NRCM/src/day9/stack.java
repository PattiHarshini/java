package day9;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(76);
		s1.push(21);
		s1.push(21);
		System.out.println(s1);
		Iterator i=s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
