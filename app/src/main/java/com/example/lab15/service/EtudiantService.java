package com.example.lab15.service;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.lab15.classes.Etudiant;
import com.example.lab15.util.MySQLiteHelper;
import java.util.ArrayList;
import java.util.List;

/**
 * Service de gestion des étudiants
 * REALISE PAR CHARRAJ Mouad aka ZERO-XR7
 */
public class EtudiantService {
    private final MySQLiteHelper helper_mouad;

    public EtudiantService(Context context_mouad) {
        this.helper_mouad = new MySQLiteHelper(context_mouad);
    }

    public void create(Etudiant e_mouad) {
        SQLiteDatabase db_mouad = this.helper_mouad.getWritableDatabase();
        ContentValues values_mouad = new ContentValues();
        values_mouad.put("nom", e_mouad.getNom());
        values_mouad.put("prenom", e_mouad.getPrenom());
        db_mouad.insert("etudiant", null, values_mouad);
        db_mouad.close();
    }

    public Etudiant findById(int id_mouad) {
        SQLiteDatabase db_mouad = this.helper_mouad.getReadableDatabase();
        Cursor c_mouad = db_mouad.query("etudiant", new String[]{"id", "nom", "prenom"}, "id = ?",
                new String[]{String.valueOf(id_mouad)}, null, null, null);

        if (c_mouad.moveToFirst()) {
            Etudiant e_mouad = new Etudiant();
            e_mouad.setId(c_mouad.getInt(0));
            e_mouad.setNom(c_mouad.getString(1));
            e_mouad.setPrenom(c_mouad.getString(2));
            c_mouad.close();
            return e_mouad;
        }
        c_mouad.close();
        return null;
    }

    public void delete(int id_mouad) {
        SQLiteDatabase db_mouad = this.helper_mouad.getWritableDatabase();
        db_mouad.delete("etudiant", "id = ?", new String[]{String.valueOf(id_mouad)});
        db_mouad.close();
    }

    public List<Etudiant> findAll() {
        List<Etudiant> list_mouad = new ArrayList<>();
        SQLiteDatabase db_mouad = this.helper_mouad.getReadableDatabase();
        Cursor c_mouad = db_mouad.rawQuery("SELECT * FROM etudiant", null);

        if (c_mouad.moveToFirst()) {
            do {
                Etudiant e_mouad = new Etudiant();
                e_mouad.setId(c_mouad.getInt(0));
                e_mouad.setNom(c_mouad.getString(1));
                e_mouad.setPrenom(c_mouad.getString(2));
                list_mouad.add(e_mouad);
            } while (c_mouad.moveToNext());
        }
        c_mouad.close();
        return list_mouad;
    }
}
// REALISE PAR CHARRAJ Mouad aka ZERO-XR7
