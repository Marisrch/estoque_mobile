package br.com.etecia.estoquemobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class menu extends AppCompatActivity {

    //declarar variaveis
    CardView idCadastrar, idlocalizar, idMovimentacao, idVendas;

    MaterialToolbar IdToolBarEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.layout_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        IdToolBarEstoque = findViewById(R.id.IdToolBarEstoque);
        idCadastrar = findViewById(R.id.idCadastrar);
        idVendas = findViewById(R.id.idVendas);
        idlocalizar = findViewById(R.id.idlocalizar);
        idMovimentacao = findViewById(R.id.idMovimentacao);


        //clicar no botão

       idMovimentacao.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(), MovimentacaoActivity.class));
               finish();
           }
       });

        idlocalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LocalizarActivity.class));
                finish();
            }
        });

        idVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), VendasActivity.class));
                finish();
            }
        });

        idCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarActivity.class));
                finish();

            }
        });;

    }
}