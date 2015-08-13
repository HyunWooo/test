package test.one;

public class PhoneNumber {
	
	private String localNumber;
	private String frontNumber;
	private String endNumber;
	
	public PhoneNumber(){}

	public PhoneNumber(String localNumber, String frontNumber, String endNumber) {
		this.localNumber = localNumber;
		this.frontNumber = frontNumber;
		this.endNumber = endNumber;
	}

	
	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		if(localNumber.length() > 3){
			this.localNumber = localNumber.substring(0, 3);
		}
		else{
			this.localNumber = localNumber;
		}
	}

	public String getFrontNumber() {
		return frontNumber;
	}

	public void setFrontNumber(String frontNumber) {
		this.frontNumber = frontNumber;
	}

	public String getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(String endNumber) {
		this.endNumber = endNumber;
	}

	@Override
	public String toString() {
		return localNumber + ")- " + frontNumber + " - " + endNumber;
	}

		
}

