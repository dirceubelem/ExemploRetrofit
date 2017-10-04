package br.com.cotemig.exemploretrofit.app;

import android.app.Application;

import br.com.cotemig.exemploretrofit.services.UsuarioRestClient;

/**
 * Created by usuario on 03/10/2017.
 */

public class ExemploRetrofitApplication extends Application {

    private static ExemploRetrofitApplication instance;
    private UsuarioRestClient usuarioService;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        usuarioService = new UsuarioRestClient("http://apiteste.fourtime.com/api/");
    }

    public static ExemploRetrofitApplication getInstance() {
        return instance;
    }

    public UsuarioRestClient getUsuarioService() {
        return usuarioService;
    }
}
