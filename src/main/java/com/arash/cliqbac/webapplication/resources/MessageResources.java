package com.arash.cliqbac.webapplication.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arash.cliqbac.webapplication.model.Message;
import com.arash.cliqbac.webapplication.service.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }
}
