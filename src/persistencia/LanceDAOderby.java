/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOLanceException;
import negocio.Lance;
import negocio.LanceDAO;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class LanceDAOderby implements LanceDAO {

    @Override
    public void inserir(Lance l) throws DAOLanceException {
        String sql = "insert into lance(comprador,leilao,valor) values(?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, l.getComprador().getCodigo());
                comando.setInt(2, l.getLeilao().getCodigo());
                comando.setDouble(3, l.getValor());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLanceException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOLanceException("Falha na inserção");
        }
    }

    @Override
    public void deletar(Lance l) throws DAOLanceException {
        String sql = "delete from lance where "
                + "(select codigo from leilao where codigo = ?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setObject(1, l.getLeilao().getCodigo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLanceException("Falha na remoção", e);
        }
        if (resultado == 0) {
            throw new DAOLanceException("Falha na remoção");
        }
    }

    @Override
    public void buscarLance(Lance l) throws DAOLanceException {
        String sql = "select * from lance where "
                + "(select codigo from leilao where codigo = ?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setObject(1, l.getLeilao().getCodigo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLanceException("Falha na busca", e);
        }
        if (resultado == 0) {
            throw new DAOLanceException("Falha na busca");
        }

    }
}
