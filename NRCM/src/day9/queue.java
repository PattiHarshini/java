package day9;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(45);
		q1.offer(78);
		q1.offer(78);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
	}

}
