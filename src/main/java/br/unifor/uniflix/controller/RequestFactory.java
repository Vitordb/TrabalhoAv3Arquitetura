package br.unifor.uniflix.controller;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class RequestFactory {
	public Call requesteCreate(String path){
	OkHttpClient client = new OkHttpClient();
	Request request = new Request.Builder()
                .url("https://api.themoviedb.org/3" + path +"?api_key=e87ccf6cd7b8ab9582baffda477ce6f5")
                .build();
	return client.newCall(request);
	}
	
}