package br.unifor.uniflix.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdapterJson<T> {
    abstract T Adapter(JSONObject value);

    public List<T> adapterJsonArray(JSONArray result) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < result.length(); ++i) {
            JSONObject jsonOBJ = result.getJSONObject(i);
            T adaptedObj = this.Adapter(jsonOBJ);
            list.add(adaptedObj);
        }
        return list;
    }

}
