package com.example.listacontatos;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activityPrincipal extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EditText editNome = findViewById(R.id.camponome);
        EditText editEmail = findViewById(R.id.campoemail);
        EditText editTel = findViewById(R.id.campotelefone);
        Button salvar = findViewById(R.id.salvar);
        salvar.setOnClickListener( e -> {
                    Log.i("Agenda Contato", "Nome: " + editNome.getText());
                    Log.i("Agenda Contato", "Email: " + editEmail.getText());
                    Log.i("Agenda contato", "Telefone: " + editTel.getText());
                }
                );
        setContentView(R.layout.layout_contatos);
    }
}
