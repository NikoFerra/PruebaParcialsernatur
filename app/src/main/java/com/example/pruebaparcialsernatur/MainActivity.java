package com.example.pruebaparcialsernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Spinner spa1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        spa1=(Spinner) findViewById(R.id.sp1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spa1.getSelectedItemPosition()== 0){
                    Toast.makeText(getApplicationContext(),"Deve seleccionar una Lugar",Toast.LENGTH_SHORT).show();
                }
                else{
                    String dest = spa1.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),part2.class);
                    I.putExtra("destino",dest);
                    startActivity(I);

                }
            }
        });


    }
}