package day3;

public class stringbuff {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hai";
		StringBuffer s3=new StringBuffer(s1);
		StringBuffer s4=new StringBuffer(s2);
		System.out.println(s3.append(s4));
		System.out.println(s3);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
	}

}
