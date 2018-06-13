/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;

public class InicializadorBancoDadosDataSource {

    public static String DB_NAME = "cadastro";
    public static String USER_NAME = "usuario";
    public static String PASSWORD = "senha";
    private static DataSource dataSource;

    private static DataSource criarDataSource() throws Exception {
        if (dataSource == null) {
            EmbeddedDataSource ds = new EmbeddedDataSource();
            ds.setDatabaseName(DB_NAME);
            ds.setCreateDatabase("create");
            ds.setUser(USER_NAME);
            ds.setPassword(PASSWORD);
            dataSource = ds;
        }
        return dataSource;
    }

    public static void criarBd() throws Exception {
        try (Connection con = criarDataSource().getConnection();
                Statement sta = con.createStatement()) {
            String sqlComprador = "CREATE TABLE COMPRADOR("
                    + "CODIGO int PRIMARY KEY NOT NULL,"
                    + "NOME varchar(100) NOT NULL,"
                    + "EMAIL varchar(100) NOT NULL"
                    + "CPFCNPJ varchar(100) NOT NULL)";
            sta.executeUpdate(sqlComprador);
            String sqlBens = "CREATE TABLE BENS("
                    + "CODIGO int PRIMARY KEY NOT NULL,"
                    + "DESCRICAOBREVE varchar(100) NOT NULL,"
                    + "DESCRICAOCOMPLETA varchar(300) NOT NULL,"
                    + "CATEGORIA varchar(100) NOT NULL)";
            sta.executeUpdate(sqlBens);
            String sqlLance = "CREATE TABLE LANCE("
                    + "CODIGO int PRIMARY KEY NOT NULL,"
                    + "VALOR float NOT NULL)";
            sta.executeUpdate(sqlLance);
            String sqlVendedor = "CREATE TABLE LIVROSAUTORES("
                    + "CODIGO int PRIMARY KEY NOT NULL,"
                    + "NOME varchar(100) NOT NULL)";
            sta.executeUpdate(sqlVendedor);
            String sqlLote = "CREATE TABLE LOTE("
                    + "PRECOMINIMO float NOT NULL)";
            sta.executeUpdate(sqlLote);
            String sqlLeilao = "CREATE TABLE LEILAO("
                    + "STATUS varchar(10) NOT NULL)";
            sta.executeUpdate(sqlLeilao);
        }
    }

    //atualizar tabelas: LANCE, LOTE e LEILAO
    public static void atualizarColunasTabelas() throws Exception {
        try (Connection con = criarDataSource().getConnection();
                Statement sta = con.createStatement()) {
            String updateLance = "ALTER TABLE LANCE ADD COMPRADOR COMPRADOR"
                    + "ALTER TABLE LANCE ADD LEILAO LEILAO;";
            sta.executeUpdate(updateLance);
        }
    }

    public static Connection conectarBd() throws Exception {
        return criarDataSource().getConnection();
    }
}
