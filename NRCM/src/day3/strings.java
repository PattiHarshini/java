package day3;

public class strings {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("apple");
		String s4=new String("hello");
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s3.compareTo(s1));
	}

}
