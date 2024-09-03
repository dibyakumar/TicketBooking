package _TicketBooking.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserEntity {
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("name")
	private String userName;
	private String password;
	@JsonProperty("email_id")
	private String emailId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailId="
				+ emailId + "]";
	}
	
	
}