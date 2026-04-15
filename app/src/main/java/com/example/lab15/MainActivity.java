package com.example.lab15;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab15.classes.Etudiant;
import com.example.lab15.service.EtudiantService;

/**
 * Activité principale personnalisée
 * REALISE PAR CHARRAJ Mouad aka ZERO-XR7
 */
public class MainActivity extends AppCompatActivity {

    private EditText nom_mouad;
    private EditText prenom_mouad;
    private EditText id_mouad;
    private TextView res_mouad;
    private EtudiantService service_mouad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation du service
        service_mouad = new EtudiantService(this);

        // Liaison des vues
        nom_mouad = findViewById(R.id.nom);
        prenom_mouad = findViewById(R.id.prenom);
        id_mouad = findViewById(R.id.id);
        res_mouad = findViewById(R.id.res);

        // Bouton Valider (Ajout)
        findViewById(R.id.bn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = nom_mouad.getText().toString();
                String p = prenom_mouad.getText().toString();
                
                if (!n.isEmpty() && !p.isEmpty()) {
                    service_mouad.create(new Etudiant(n, p));
                    nom_mouad.setText("");
                    prenom_mouad.setText("");
                    Toast.makeText(MainActivity.this, "Ajouté par Mouad !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Bouton Chercher
        findViewById(R.id.load).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idTxt = id_mouad.getText().toString();
                if (!idTxt.isEmpty()) {
                    Etudiant e = service_mouad.findById(Integer.parseInt(idTxt));
                    if (e != null) {
                        res_mouad.setText(e.getNom() + " " + e.getPrenom());
                    } else {
                        res_mouad.setText("Étudiant inconnu");
                    }
                }
            }
        });

        // Bouton Supprimer
        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idTxt = id_mouad.getText().toString();
                if (!idTxt.isEmpty()) {
                    service_mouad.delete(Integer.parseInt(idTxt));
                    res_mouad.setText("");
                    Toast.makeText(MainActivity.this, "Supprimé avec succès", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
// REALISE PAR CHARRAJ Mouad aka ZERO-XR7
