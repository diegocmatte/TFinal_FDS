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
public class LanceDAOderby implements LanceDAO{

    @Override
    public void inserir(Lance l) throws DAOLanceException {
        String sql = "insert into lance(comprador,valor) values(?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setObject(1, l.getC());
                comando.setDouble(2, l.getValor());
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
        String sql = "delete from lance where comprador = ?";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setObject(1, l.getC().getEmail());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLanceException("Falha na remoção", e);
        }
        if (resultado == 0) {
            throw new DAOLanceException("Falha na remoção");
        }
    }
    
    
    
}