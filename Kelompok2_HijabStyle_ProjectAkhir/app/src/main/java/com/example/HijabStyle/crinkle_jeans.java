package com.example.HijabStyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class crinkle_jeans extends AppCompatActivity {

    LinearLayout pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crinkle_jeans);

        pindahHal1 =findViewById(R.id.addtochart);


        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(crinkle_jeans.this, transaksi.class);
                startActivity(i);
            }
        });


    }
}