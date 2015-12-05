package com.poutchinskaya.malik.sotunisia.Dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Malik on 21/11/2015.
 */
public class MotDao {

    private static final String TABLE_NAME = "mot";
    public static final String KEY_ID_MOT="id_mot";
    public static final String KEY_MOT_TUNISIEN="mot_tunisien";
    public static final String KEY_MOT_FRANCAIS="mot_francais";
    public static final String KEY_MOT_PHONETIQUE="mot_phonetique";
    public static final String KEY_MOT_AUDIO="mot_audio";


    public static final String CREATE_TABLE_MOT = "CREATE TABLE "+TABLE_NAME+
            " (" +
            " "+KEY_ID_MOT+" INTEGER primary key," +
            " "+KEY_MOT_TUNISIEN+" TEXT" +
            " "+KEY_MOT_FRANCAIS+" TEXT" +
            " "+KEY_MOT_PHONETIQUE+" TEXT" +
            " "+KEY_MOT_AUDIO+" TEXT" +
            ");";

    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;


    // Constructeur
    public MotDao(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }

    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }

    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }

    public Cursor getMots() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
}