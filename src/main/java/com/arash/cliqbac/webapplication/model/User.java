package com.arash.cliqbac.webapplication.model;

import java.awt.Image;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	int userId;
	String userName;
	String phoneNumber;
	String realName;
	String email;
	Image userPicture;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User () {
		
	}
	
	public User (int userId) {
		
		setUserId(userId);
		
	}
	
	public User (int userId, String userName, String phoneNumber) {
		
		setUserId(userId);
		setUserName(userName);
		setPhoneNumber(phoneNumber);
		
	}
	
	public User (int userId, String userName, String phoneNumber, String realName) {
		
		setUserId(userId);
		setUserName(userName);
		setPhoneNumber(phoneNumber);
		setRealName(realName);
		
	}

	public User (int userId, String userName, String phoneNumber,String realName, String email) {
		
		setUserId(userId);
		setUserName(userName);
		setPhoneNumber(phoneNumber);
		setRealName(realName);
		setEmail(email);
		
	}
	
	public User (int userId, String userName, String phoneNumber,String realName, String email, Image userPicture) {

		setUserId(userId);
		setUserName(userName);
		setPhoneNumber(phoneNumber);
		setRealName(realName);
		setEmail(email);
		setUserPicture(userPicture);
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public Image getUserPicture() {
		return userPicture;
	}
	
	public void setUserPicture(Image userPicture) {
		this.userPicture = userPicture;
	}
	
}
