package nov21_25;
public class Encapsulation {
	public static void main(String[] args) {
		Phonepe p = new Phonepe();
		p.checkBalance();
		p.changeEmail();
	}
}
class SBI {
	private String name = "Adib";
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public long getAccount_Balance() {
		return Account_Balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	private long Account_Balance = 405268;
	private String mail_id = "Adibahmed@gmail.com";
}
class Phonepe extends SBI {
	void checkBalance() {
		System.out.println("Current Acc Balance : "+getAccount_Balance());
	}
	void changeEmail () {
		System.out.println("Current Mail id : "+getMail_id());
		setMail_id("tetadib95@gmail.com");
		System.out.println("New Mail id : "+getMail_id());
	}
	void ChangeName () {
		setName("ADIB");
	}
}