package com.example.dbv;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RequisitosAmigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requisitosamigo);

        TextView nome = (TextView) findViewById(R.id.textView3);
        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("nome");
        nome.setText(data);
    }
}
