package com.arash.cliqbac.webapplication.resources;
import com.arash.cliqbac.webapplication.model.*;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arash.cliqbac.webapplication.service.MessageService;
import com.arash.cliqbac.webapplication.service.UserDAO;

@Path("/messages")
public class MessageResources {
	
	UserDAO users = new UserDAO();
	
	MessageService messageService = new MessageService();
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//    public List<Message> getMessages() {
//        return messageService.getAllMessages();
//    }
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<User> getMessages() throws ClassNotFoundException, SQLException {
        users.getConnection();
		return users.findAll();
    }
}
