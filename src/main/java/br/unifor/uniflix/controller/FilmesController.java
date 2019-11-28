package br.unifor.uniflix.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/filmes")
public class FilmesController {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object popularMovies() throws IOException {	
		
		uniflixFacade unifac = new uniflixFacade();
		return unifac.getMovies();
    }
}