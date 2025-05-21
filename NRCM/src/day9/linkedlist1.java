package day9;
import java.util.*;
public class linkedlist1 {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(23);
		l1.add(12);
		l1.add(34);
		l1.add(67);
		l1.add(1,67);
		System.out.println(l1);
		l1.addFirst(2);
		l1.addLast(78);
		l1.add(3, 27);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeLastOccurrence(67);
		System.out.println(l1);
		}

	}


