package day4;

public class copycons {
	int x,y;
	public copycons(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public copycons(copycons c)
	{
		this.x=c.x;
		this.y=c.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copycons c1=new copycons(15,10);
		copycons c2=new copycons(c1);
		
	}

}
