package SavingsBankApplication;

public class Customer {
	private String Accountno;
	private String FirstName;
	private String LastName;
	private String Address;
	private int age;
	private String gender;
	private long mobiNo;
	public String getAccountno() {
		return Accountno;
	}
	public void setAccountno(String accountno) {
		Accountno = accountno;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobiNo() {
		return mobiNo;
	}
	public void setMobiNo(long mobiNo) {
		this.mobiNo = mobiNo;
	}
	

}
