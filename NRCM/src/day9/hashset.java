package day9;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(12);
		s1.add(null);
		s1.add(89);
		s1.add(null);
		s1.add(89);
		System.out.println(s1);
	}

}
