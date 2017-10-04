package br.com.cotemig.exemploretrofit.services;

import br.com.cotemig.exemploretrofit.model.ListaUsuario;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by usuario on 03/10/2017.
 */

public interface ServiceUsuario {

    @GET("usuario")
    Call<ListaUsuario> obterUsuarios();


}
