package com.priyak.servicelayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.priyak.database.testdata.DataBaseClass;
import com.priyak.entity.MessageEntity;

public class MessageService {
	private Map<Long, MessageEntity> messages = DataBaseClass.getMessages();
	
	
	public MessageService() {
		messages.put(1L, new MessageEntity(1L, "First Message Body", new Date(), "First Message Author"));
		messages.put(2L, new MessageEntity(2L, "Second Message Body", new Date(), "Second Message Author"));
		messages.put(3L, new MessageEntity(3L, "Third Message Body", new Date(), "Third Message Author"));
	}
	
	/*
	 * Method to retrieve all messages
	 */
	public List<MessageEntity> getAllMessages() {
		return new ArrayList<MessageEntity>(messages.values());
	}
	
	/*
	 * Method to retrieve a specific message by message id
	 */
	public MessageEntity getMessageById(long messageId) {
		
		return messages.get(messageId);
	}
	
	
	/*
	 * Method to add a new message
	 */
	public MessageEntity addMessage(MessageEntity messageEntity) {
		messageEntity.setMessageId(messages.size() + 1);
		messages.put(messageEntity.getMessageId(), messageEntity);
		return messageEntity;
	}
	
	
	/*
	 * Method to update message
	 */
	public MessageEntity updateMessage(MessageEntity messageEntity) {
		if(messageEntity.getMessageId() <= 0) {
			return null;
		}
		
		messages.put(messageEntity.getMessageId(), messageEntity);
		return messageEntity;
	}
	
	
	/*
	 * Method to update a message
	 */
	public MessageEntity deleteMessageById(long messageId) {
		return messages.remove(messageId);
	}

}
