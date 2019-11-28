package br.unifor.uniflix.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/tvshows")
public class TvShowsController {
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Object airingToday() throws IOException {
		
		uniflixFacade unifac = new uniflixFacade();
		return unifac.getTvShows();
	}
}