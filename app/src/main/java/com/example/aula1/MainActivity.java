package com.example.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHello;
    EditText editNome;
    AutoCompleteTextView autoCompletePaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = (TextView) findViewById(R.id.textHello);
        editNome = (EditText) findViewById(R.id.editNome);
        autoCompletePaises = (AutoCompleteTextView)
                                findViewById(R.id.autoCompletePaises);

        String[] paises = getResources().getStringArray(R.array.paises_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                                    android.R.layout.simple_list_item_1,
                                    paises);
        autoCompletePaises.setAdapter(adapter);


    }

    public void btnAplicarClick(View view){
        String nome = editNome.getText().toString();
        txtHello.setText("Olá, " + nome);
    }
}