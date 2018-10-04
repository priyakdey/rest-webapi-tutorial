package com.priyak.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.priyak.entity.ProfileEntity;
import com.priyak.servicelayer.ProfileService;

@Path("/profiles")
public class ProfileResource {
	
	/*
	 * Method Handling GET requests
	 * @Desc : Method to fetch all Profiles
	 * @Return Type : XML
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<ProfileEntity> getAllProfiles() {
		return new ProfileService().getAllProfiles();
	}

}
