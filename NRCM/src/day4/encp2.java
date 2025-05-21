package day4;

public class encp2 {
	private String firstName;
	private String lastName;
	private String emailId;
	private long phNo;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmailId(String ei) {
		emailId=ei;
	}
	public void setPhNo(long ph) {
		phNo=ph;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public long getPhNo() {
		return phNo;
	}
	public static void main(String[] args) {
		encp2 e=new encp2();
		e.setFirstName("vikram");
		e.setLastName("rathod");
		e.setEmailId("pattiharshini1165@gmail.com");
		e.setPhNo(9154841080l);

		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println(e.getEmailId());
		System.out.println(e.getPhNo());
	}

}
