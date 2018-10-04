package com.priyak.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProfileEntity {

	
	private long profileId;
	private String profileName;
	private String userFirstName;
	private String userLastName;
	private Date dateOfProfileCreation;
	
	public ProfileEntity() {
		
	}

	public ProfileEntity(long profileId, String profileName, String userFirstName, String userLastName,
			Date dateOfProfileCreation) {
		
		this.profileId = profileId;
		this.profileName = profileName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.dateOfProfileCreation = dateOfProfileCreation;
	}

	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public Date getDateOfProfileCreation() {
		return dateOfProfileCreation;
	}

	public void setDateOfProfileCreation(Date dateOfProfileCreation) {
		this.dateOfProfileCreation = dateOfProfileCreation;
	}
	
	
	
	
}
