package com.example.dbv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MinhaClasseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhaclasse);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Arthur#12");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Isabella#34");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Gracon#56");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Felipe#78");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Maure#90");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinhaClasseActivity.this, RequisitosAmigoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", "Melo#123");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
