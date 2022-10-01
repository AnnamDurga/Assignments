package p3;



public class Account {
	private long accountNumber;
	private String username;
	private String password;
	private int balance;
	private KycVerification kycdetails;
	private ContactDetails contactDetails;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(long accountNumber, String username, String password, int balance, KycVerification kycdetails,
			ContactDetails contactDetails) {
		super();
		this.accountNumber = accountNumber;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.kycdetails = kycdetails;
		this.contactDetails = contactDetails;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KycVerification getKycdetails() {
		return kycdetails;
	}
	public void setKycdetails(KycVerification kycdetails) {
		this.kycdetails = kycdetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", username=" + username + ", password=" + password
				+ ", balance=" + balance + ", kycdetails=" + kycdetails + ", contactDetails=" + contactDetails + "]";
	
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
