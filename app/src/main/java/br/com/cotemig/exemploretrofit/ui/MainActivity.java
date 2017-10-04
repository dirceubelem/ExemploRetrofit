package br.com.cotemig.exemploretrofit.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.cotemig.exemploretrofit.R;
import br.com.cotemig.exemploretrofit.app.ExemploRetrofitApplication;
import br.com.cotemig.exemploretrofit.model.ListaUsuario;
import br.com.cotemig.exemploretrofit.services.ServiceUsuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obterUsuarios();

    }

    public void obterUsuarios() {

        ServiceUsuario s = ExemploRetrofitApplication.getInstance().getUsuarioService().getUsuario();
        Call<ListaUsuario> c = s.obterUsuarios();
        c.enqueue(new Callback<ListaUsuario>() {
            @Override
            public void onResponse(Call<ListaUsuario> call, Response<ListaUsuario> response) {

                if (response.code() == 200) {

                    ListaUsuario l = response.body();

                    Toast.makeText(MainActivity.this, "Total de Usuários " + l.getLista().size(), Toast.LENGTH_LONG).show();

                }

            }

            @Override
            public void onFailure(Call<ListaUsuario> call, Throwable t) {

            }
        });

    }
}
