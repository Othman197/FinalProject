package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView hadeeth = findViewById(R.id.text);
        TextView d = findViewById(R.id.describtion);

        Bundle t = getIntent().getExtras();
        Hadeeth item = (Hadeeth) t.getSerializable("hadeeth");
        hadeeth.setText(item.getHadeethtext());
        d.setText(item.getDescrebinon());

    }
}