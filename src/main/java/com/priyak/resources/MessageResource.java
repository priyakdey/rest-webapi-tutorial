package com.priyak.resources;

/**
 * @author priyakdey
 * 
 * This class is a Resource class to expose the Message resources through web-service
 *
 */
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.priyak.entity.MessageEntity;
import com.priyak.servicelayer.MessageService;




@Path("/messages")
public class MessageResource {

	/*
	 * Method Handling GET requests
	 * @Desc : Method to fetch all Messages
	 * @Return Type : JSON
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<MessageEntity> getMessages() {
		return new MessageService().getAllMessages();
	}
	
	/*
	 * Method handling a GET request
	 * @Desc : Method to return one message
	 * @Return Type : JSON
	 */
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MessageEntity getMessageById(@PathParam("messageId") long messageId) {
		return new MessageService().getMessageById((messageId));
	}
	
	/*
	 * Method handling POST requests
	 * @Desc : Method to add/publish a new message
	 * @Return type : JSON
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageEntity addMessage(MessageEntity message) {
		return new MessageService().addMessage(message);
	}
	
	/*
	 * 
	 */
	@PUT
	//@Path("/{messageId}")
	//@Consumes(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_JSON)
	public String updateMessage() {
//		messageEntity.setMessageId(messageId);
//		return new MessageService().updateMessage(messageEntity);
		return "Hello";
	}
}
