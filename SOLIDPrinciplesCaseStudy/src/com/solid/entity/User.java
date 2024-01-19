package com.solid.entity;

public class User {
	private String userId;
	private String username;
	private String emailId;
	private String password;
	private String mobileNumber;
	private String securityQuestion;
	private String securityAnswer;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
	
	public User(String userId, String username, String emailId, String password, String mobileNumber,
			String securityQuestion, String securityAnswer) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
}
