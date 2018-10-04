package com.priyak.database.testdata;

import java.util.HashMap;
import java.util.Map;

import com.priyak.entity.MessageEntity;
import com.priyak.entity.ProfileEntity;

public class DataBaseClass {
	
	private static Map<Long, MessageEntity> messageMap = new HashMap<Long, MessageEntity>();
	private static Map<Long, ProfileEntity> profileMap = new HashMap<Long, ProfileEntity>();
	
	public static Map<Long, MessageEntity> getMessages() {
		return messageMap;
	}
	
	public static Map<Long, ProfileEntity> getProfiles() {
		return profileMap;
	}
}
