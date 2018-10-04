package com.priyak.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageEntity {
	
	private long messageId;
	private String messageContent;
	private Date dateOfCreation;
	private String author;
	
	public MessageEntity() {
		
	}
	
	public MessageEntity(long messageId, String messageContent, Date dateOfCreation, String author) {
		super();
		this.messageId = messageId;
		this.messageContent = messageContent;
		this.dateOfCreation = dateOfCreation;
		this.author = author;
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long id) {
		this.messageId = id;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
