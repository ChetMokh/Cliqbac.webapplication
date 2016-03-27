package com.arash.cliqbac.webapplication.model;

import java.awt.Image;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Party {

	int partyId;
	int partyOwner;
	String partyName;
	String partyLocation;
	String partyDescription;
	Image partyImage;	
	Date partyDate;
	Time partyTime;
	List<User> partyGuests = new ArrayList<>();
	List<Invitation> partyInvitations = new ArrayList<>();
	List<MediaResources> partyMediaResources = new ArrayList<>();
	

	public Party () {
	
	}
	
	public Party (int partyOwner, Date partyDate, Time partyTime) {
	
		
	}

	public Party (int partyOwner, Date partyDate, Time partyTime, String partyLocation) {
		
		
	}
	
	public Party (int partyId, int partyOwner, Date partyDate, Time partyTime) {
	
		
	}

	public Party (int partyId, int partyOwner, Date partyDate, Time partyTime, String partyLocation) {
		
		
	}
	
	public Party (int partyOwner, Date partyDate, Time partyTime, 
				String partyLocation, List<User> guestList, List<Invitation> partyInvitations, Image partyImage) {
		
		setPartyOwner(partyOwner);
		setPartyDate(partyDate);
		setPartyTime(partyTime);
		setPartyImage(partyImage);
		setPartyLocation(partyLocation);
		setPartyInvitations(partyInvitations);
		setPartyGuests(guestList);
		
	}
	
	public Party (int partyId, int partyOwner, String partyLocation, String partyDescription, String partyName) {
	
		setPartyId(partyId);
		setPartyOwner(partyOwner);
		setPartyLocation(partyLocation);
		setPartyDescription(partyDescription);
		setPartyName(partyName);
}
	
	
	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public Party (int partyId, int partyOwner, Date partyDate, Time partyTime, 
			String partyLocation, List<User> guestList, List<Invitation> partyInvitations, Image partyImage) {
	
		setPartyId(partyId);
		setPartyOwner(partyOwner);
		setPartyDate(partyDate);
		setPartyTime(partyTime);
		setPartyImage(partyImage);
		setPartyLocation(partyLocation);
		setPartyInvitations(partyInvitations);
		setPartyGuests(guestList);
		
	}
	
	public int getPartyId() {
		return partyId;
	}
	
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	
	public int getPartyOwner() {
		return partyOwner;
	}
	
	public void setPartyOwner(int partyOwner) {
		this.partyOwner = partyOwner;
	}
	
	public String getPartyLocation() {
		return partyLocation;
	}
	
	public void setPartyLocation(String partyLocation) {
		this.partyLocation = partyLocation;
	}
	
	public String getPartyDescription() {
		return partyDescription;
	}
	
	public void setPartyDescription(String partyDescription) {
		this.partyDescription = partyDescription;
	}
	
	public Image getPartyImage() {
		return partyImage;
	}
	
	public void setPartyImage(Image partyImage) {
		this.partyImage = partyImage;
	}
	
	public Date getPartyDate() {
		return partyDate;
	}
	
	public void setPartyDate(Date partyDate) {
		this.partyDate = partyDate;
	}
	
	public Time getPartyTime() {
		return partyTime;
	}
	
	public void setPartyTime(Time partyTime) {
		this.partyTime = partyTime;
	}
	
	public List<User> getPartyGuests() {
		return partyGuests;
	}

	public void setPartyGuests(List<User> partyGuests) {
		this.partyGuests = partyGuests;
	}

	public List<Invitation> getPartyInvitations() {
		return partyInvitations;
	}

	public void setPartyInvitations(List<Invitation> partyInvitations) {
		this.partyInvitations = partyInvitations;
	}
	
	public List<MediaResources> getPartyMediaResources() {
		return partyMediaResources;
	}

	public void setPartyMediaResources(List<MediaResources> partyMediaResources) {
		this.partyMediaResources = partyMediaResources;
	}
	
}
