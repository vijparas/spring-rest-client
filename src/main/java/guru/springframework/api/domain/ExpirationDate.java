package guru.springframework.api.domain;

import java.util.Date;

public class ExpirationDate {

	private String date;
	private String timezone_type;
	private String timezone;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimezone_type() {
		return timezone_type;
	}
	public void setTimezone_type(String timezone_type) {
		this.timezone_type = timezone_type;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
}
