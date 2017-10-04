package br.com.cotemig.exemploretrofit.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by usuario on 03/10/2017.
 */

public class UsuarioRestClient {

    private ServiceUsuario usuario;

    public UsuarioRestClient(String endPoint) {

        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit adapter = new Retrofit.Builder().
                baseUrl(endPoint).
                addConverterFactory(GsonConverterFactory.create(gson)).
                build();

        usuario = adapter.create(ServiceUsuario.class);

    }

    public ServiceUsuario getUsuario() {
        return usuario;
    }
}
