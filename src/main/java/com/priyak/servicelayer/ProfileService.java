package com.priyak.servicelayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.priyak.entity.ProfileEntity;

public class ProfileService {
	
	public List<ProfileEntity> getAllProfiles(){
		ProfileEntity user1 = new ProfileEntity(1L, "first_user", "First", "User", new Date());
		ProfileEntity user2 = new ProfileEntity(2L, "second_user", "Second", "User", new Date());
		ProfileEntity user3 = new ProfileEntity(3L, "third_user", "Third", "User", new Date());
		ProfileEntity user4 = new ProfileEntity(4L, "fourth_user", "Fourth", "User", new Date());
		
		List<ProfileEntity> profileList = new ArrayList<ProfileEntity>(0);
		profileList.add(user1);
		profileList.add(user2);
		profileList.add(user3);
		profileList.add(user4);
		return profileList;
	}

}
