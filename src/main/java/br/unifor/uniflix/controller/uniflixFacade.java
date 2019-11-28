package br.unifor.uniflix.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.unifor.uniflix.model.Filme;
import br.unifor.uniflix.model.TvShow;
import okhttp3.Call;

public class uniflixFacade {
	
	
	public Object getTvShows() throws IOException {
        RequestFactory tvShows = new RequestFactory();
        Call call = tvShows.requesteCreate("/tv/airing_today");
        okhttp3.Response response = call.execute();


        if (response.isSuccessful()) {
            JSONObject jsonResponse = new  JSONObject(response.body().string());
            JSONArray result = jsonResponse.getJSONArray("results");

            TvShowsAdapter tvshowAdp = new TvShowsAdapter();
            List<TvShow> tvshowsList = tvshowAdp.adapterJsonArray(result);

            return tvshowsList;
        }
        return null;
	}
	
	public Object getMovies() throws IOException {
        RequestFactory movies = new RequestFactory();
        Call call = movies.requesteCreate("/movie/popular");
        okhttp3.Response response = call.execute();

        if (response.isSuccessful()) {
            JSONObject jsonResponse = new  JSONObject(response.body().string());
            JSONArray result = jsonResponse.getJSONArray("results");


            FilmeAdapter filmesAdp = new FilmeAdapter();
            List<Filme> filmesList = filmesAdp.adapterJsonArray(result);

            return filmesList;
        }
        return null;
	}
}
