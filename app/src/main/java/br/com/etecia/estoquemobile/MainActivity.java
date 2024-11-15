package br.com.etecia.estoquemobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //declarar as variaveis
    MaterialButton btnEntrar;
    TextInputEditText txtSenha, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //apresentando as variaveis
        btnEntrar = findViewById(R.id.btnEntrar);
        txtSenha = findViewById(R.id.txtSenha);
        txtEmail = findViewById(R.id.txtEmail);

        //criando as açoes para o botao funcionar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = txtEmail.getText().toString().trim();
                password = txtSenha.getText().toString().trim();

                if (email.equals("etecia") && password.equals("etecia")) {
                    startActivity(new Intent(getApplicationContext(), menu.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}