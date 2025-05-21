package day4;
class FixedAmount{
	public int amount=10000;
}
abstract class WithdrawlAmount{
	abstract void withdraw(int a);
	
}

public class bank extends WithdrawlAmount {
FixedAmount f=new FixedAmount();
public void withdraw(int a)
{
	f.amount-=a;
	System.out.println("withdrawn:"+a);
	System.out.println("available balance: "+f.amount);
}
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		bank b=new bank();
		b.withdraw(a);
		
		
	}

}
