package ci.esatic.formulaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /*Un Handler est un mécanisme Android qui permet d'exécuter
         des tâches en différé (en différé)*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*intent permet de creer des actions*/
                Intent intent=new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}