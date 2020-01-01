package com.example.pst_ta5_g9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    //Se definen los valores del usuario y contraseña fijos para acceder a la aplicación

    private String usuario= "";
    private String clave="";
    private EditText et1,et2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1=(EditText)findViewById(R.id.user);
        et2=(EditText)findViewById(R.id.clave);

    }
    public void ingresar(View view) {


        String user = et1.getText().toString();
        String contra = et2.getText().toString();

        if(user.equals(usuario)&&contra.equals(clave)){
        Intent i = new Intent(this, Main3Activity.class );
        startActivity(i);}
        else{
            Toast.makeText(this, "Ingrese los datos correctamente",
                    Toast.LENGTH_SHORT).show();

        }
    }
}
