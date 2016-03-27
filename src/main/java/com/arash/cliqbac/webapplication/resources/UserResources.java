package com.arash.cliqbac.webapplication.resources;
import com.arash.cliqbac.webapplication.model.*;

import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arash.cliqbac.webapplication.service.MessageService;
import com.arash.cliqbac.webapplication.service.UserDAO;

@Path("/users")
public class UserResources {
	
	UserDAO users = new UserDAO();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<User> getAllUsers() throws ClassNotFoundException, SQLException {
        users.getConnection();
		return users.findAll();
    }
	
	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_XML)
    public List<User> getUserById(@PathParam("userId") int userId ) throws ClassNotFoundException, SQLException {
        users.getConnection();
		return users.findById(userId);
    }

}
