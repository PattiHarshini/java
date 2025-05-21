package day9;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		int [] arr= {67,89,90,34,37,89};
		Arrays.sort(arr);//sorting
		int a=Arrays.binarySearch(arr, 90);//gives index value of 90 
		System.out.println(a);
		for(int b1:arr) {
			System.out.println(b1);
			System.out.println();
		}

	}

}
