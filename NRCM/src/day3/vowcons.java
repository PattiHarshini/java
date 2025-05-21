package day3;

public class vowcons {

	public static void main(String[] args) {
		String s="helloworld";
		String c="";
		String v="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v=v+ch;
			}
			else {
				c=c+ch;
			}
		}
		System.out.println("constants are:"+c);
		System.out.println("vowels are:"+v);

	}

}
