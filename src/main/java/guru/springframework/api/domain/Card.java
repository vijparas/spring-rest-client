package guru.springframework.api.domain;

public class Card {

	private String type;
	private String number;
	private ExpirationDate expiration_date;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public ExpirationDate getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(ExpirationDate expiration_date) {
		this.expiration_date = expiration_date;
	}
	
}
