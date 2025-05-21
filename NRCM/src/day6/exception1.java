package day6;

public class exception1 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			//System.out.println(e.toString());//System.out.println(e)or;
			//e.printStackTrace();//we get exception and message in red color
			System.out.println(e.getMessage());//prints only method without exception
		}
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}

}
