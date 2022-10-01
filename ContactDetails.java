package p3;

public class ContactDetails {
	private String houseNumber;
	private String localityName;
	private String cityName;
	private String stateName;
	private String CountryName;
	private int pincode;
	private String emailId;
	private int mobileNumber;
	
	
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(String houseNumber, String localityName, String cityName, String stateName,
			String countryName, int pincode, String emailId, int mobileNumber) {
		
		super();
		this.houseNumber = houseNumber;
		this.localityName = localityName;
		this.cityName = cityName;
		this.stateName = stateName;
		CountryName = countryName;
		this.pincode = pincode;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLocalityName() {
		return localityName;
	}
	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "ContactDetails [houseNumber=" + houseNumber + ", localityName=" + localityName + ", cityName="
				+ cityName + ", stateName=" + stateName + ", CountryName=" + CountryName + ", pincode=" + pincode
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
	
	
	
	

}
