package com.example.david_pc.valendo;

/**
 * Created by George on 12/07/2017.
 */
import android.content.Context;
import android.database.sqlite.*;

public class BancoFelix extends SQLiteOpenHelper{
    // instanciando o nome do banco e a versão do mesmo.
    private static final String NOME_BD = "banco_felix";
    private static final int VERSAO_BD = 1;

    public BancoFelix(Context cont)
    {
        // chamando o construtor da classe pai
        // Informando nome do banco e a versão,
        super(cont,NOME_BD,null,VERSAO_BD);
    }

    public void onCreate(SQLiteDatabase db) {
        // Passando o script para criação da tabela:
        db.execSQL(ScriptSQL.getCreateLogin());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
