package br.unifor.uniflix.controller;

import org.json.JSONObject;

import br.unifor.uniflix.model.TvShow;

public class TvShowsAdapter extends AdapterJson<TvShow> {
	
    @Override
    public TvShow Adapter(JSONObject jsonResponse){
    	TvShow tvshow = new TvShow();
		tvshow.setName(jsonResponse.getString("name"));
		tvshow.setContadorVotos(jsonResponse.getDouble("vote_count"));
		tvshow.setResumo(jsonResponse.getString("overview"));
		tvshow.setLingua(jsonResponse.getString("original_language"));
        return tvshow;
    }
	
}
