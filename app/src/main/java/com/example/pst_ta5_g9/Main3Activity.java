package com.example.pst_ta5_g9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void ironman(View view) {
        Intent i = new Intent(this, Main4Activity.class );
        startActivity(i);
    }
    public void infinitywar(View view) {
        Intent i = new Intent(this, Main5Activity.class );
        startActivity(i);
    }
    public void civilwar(View view) {
        Intent i = new Intent(this, Main6Activity.class );
        startActivity(i);
    }
    public void bpanther(View view) {
        Intent i = new Intent(this, Main7Activity.class );
        startActivity(i);
    }
    public void guardians(View view) {
        Intent i = new Intent(this, Main8Activity.class );
        startActivity(i);
    }
    public void endgame(View view) {
        Intent i = new Intent(this, Main9Activity.class );
        startActivity(i);
    }



}
