package ci.esatic.formulaire;

import androidx.appcompat.app.AppCompatActivity;


/*importation des biblios importantes*/
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*creation des variables*/
    Button vbutton;
    Button abutton;
    EditText ninput;
    EditText pinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*R est la pour lier le fichier java a l'interface*/
        setContentView(R.layout.activity_main);

        /*liaison des variables du java avec les id du xml(interface)*/
        /*un peu comme getElementById de javascript*/
        vbutton=findViewById(R.id.vbutton);
        abutton=findViewById(R.id.abutton);
        ninput=findViewById(R.id.ninput);
        pinput=findViewById(R.id.pinput);


        /*Creation des evenements*/
         /*le boutton annuler*/
        abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ninput.setText("");
                pinput.setText("");
            }
        });
        vbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*recuperer les valeurs des inputs*/
             String nom=ninput.getText().toString();
             String prenom=pinput.getText().toString();

             /*creation de l'objet dialog*/
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                /*le message a l'interieur de la boite de dialogue*/
                builder.setMessage("Votre nom est "+nom+" et votre prenom est "+prenom);
                /*titre de la boite de dialogue*/
                builder.setTitle("Etudiant de la SIGL3");
                /*si l'utilisateur appuie n'importe ou la boite se ferme*/
                builder.setCancelable(true);
                // creer la boite de dialogue
                AlertDialog alertDialog = builder.create();
                // montre la boite dialogue
                alertDialog.show();

            }
        });
    }
    public void openDialog(){

    }
}