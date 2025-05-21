package day7;
public class thro1 {
	static void add(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("maths radha neku");
		}
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try {
		add(10,0);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}