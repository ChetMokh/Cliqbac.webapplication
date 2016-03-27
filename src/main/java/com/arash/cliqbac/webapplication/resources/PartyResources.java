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
import com.arash.cliqbac.webapplication.service.PartyDAO;
import com.arash.cliqbac.webapplication.service.UserDAO;

@Path("/parties")
public class PartyResources {
	
	PartyDAO parties = new PartyDAO();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<Party> getAllUsers() throws ClassNotFoundException, SQLException {
		parties.getConnection();
		return parties.findAll();
    }
	
	@GET
	@Path("user/{userId}")
	@Produces(MediaType.APPLICATION_XML)
    public List<Party> getPartyByUserId(@PathParam("userId") int userId ) throws ClassNotFoundException, SQLException {
		parties.getConnection();
		return parties.findPartyByUserId(userId);
    }
	
	@GET
	@Path("/{partyId}")
	@Produces(MediaType.APPLICATION_XML)
    public List<Party> getPartyByPartyId(@PathParam("partyId") int partyId ) throws ClassNotFoundException, SQLException {
		parties.getConnection();
		return parties.findPartyByPartyId(partyId);
    }
	
}
