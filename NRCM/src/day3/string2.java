package day3;

public class string2 {

	public static void main(String[] args) {
		String s="helloworld";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='l') {
			c++;
			}
			
		}System.out.println(c);
	}
}


