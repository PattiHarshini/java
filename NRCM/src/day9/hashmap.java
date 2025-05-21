package day9;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(1, "cse");
		m1.put(5, "eee");
		m1.put(3, "cs");
		m1.put(null,null);
		m1.put(2, "civil");
		m1.put(6, "mech");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet())
		{
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
	}

}
