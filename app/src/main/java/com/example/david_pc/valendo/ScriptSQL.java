package com.example.david_pc.valendo;

/**
 * Created by George on 12/07/2017.
 */
public class ScriptSQL {

    //static para evitar a criação da instancia Scrip.
    public static String getCreateLogin()
    {
        // Serve para concatenar o script.
        // Conteudo muito grande de String
        // Adicionar um espaço para pular linha
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("Create table if not exists login ");
        sqlBuilder.append("_id  integer not null ");
        sqlBuilder.append("primary key autoincrement ");
        sqlBuilder.append("login varchar (60), ");
        sqlBuilder.append("Senha varchar (60), ");
        sqlBuilder.append("); ");

        //retornando o conteudo criado acima.
        return sqlBuilder.toString();
    }
}