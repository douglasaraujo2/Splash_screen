package splash.com.splash_screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {


    private TextView tvConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);
        tvConfirmacao = (TextView) findViewById(R.id.tvConfirmacao);

        if(getIntent() != null){
            String nome = getIntent().getStringExtra("NOME");
            String idade = getIntent().getStringExtra("IDADE");
            String time =getIntent().getStringExtra("TIME");
            tvConfirmacao.setText(
                    getString(R.string.confirmacao_cadastro,
                            nome,time)
            );
        }


    

    }
}
