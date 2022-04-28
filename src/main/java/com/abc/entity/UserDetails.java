package com.abc.entity;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class UserDetails {
	private int userId;
	private String userName;
	private String password;
	private String emailId;
	private int mobileNumber;
	private String userAddress;
	
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(int userId, String userName, String emailId,int mobileNumber,String userAddress) {
	super();
	
	this.userId = userId;
	this.userName = userName;
	this.emailId = emailId;
	this.mobileNumber =mobileNumber;
	this.userAddress = userAddress;
}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emailId, mobileNumber, password, userAddress, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(emailId, other.emailId) && mobileNumber == other.mobileNumber
				&& Objects.equals(password, other.password) && Objects.equals(userAddress, other.userAddress)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	
	


}




