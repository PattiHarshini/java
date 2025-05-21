package privtest;
import day4.demo1;
public class priv1 extends demo1 {

	public static void main(String[] args) {
		
		priv1 p=new priv1();
		p.add();//we are trying to access private method from other package 
	}

}

