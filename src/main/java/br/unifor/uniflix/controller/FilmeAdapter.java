package br.unifor.uniflix.controller;

import org.json.JSONObject;

import br.unifor.uniflix.model.Filme;

public class FilmeAdapter extends AdapterJson<Filme> {

    @Override
    public Filme Adapter(JSONObject jsonResponse) {
        Filme filme = new Filme();
		filme.setTitulo(jsonResponse.getString("title"));
		filme.setSinopse(jsonResponse.getString("overview"));
		filme.setAdulto(jsonResponse.getBoolean("adult"));
		filme.setNota(jsonResponse.getDouble("vote_average"));
        return filme;
    }
}
