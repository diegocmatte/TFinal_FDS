/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOLeilaoException;
import negocio.Leilao;
import negocio.LeilaoDAO;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class LeilaoDAOderby implements LeilaoDAO{

    @Override
    public void inserir(Leilao l) throws DAOLeilaoException {
        String sql = "insert into lance(codigo,cod_lote,cod_vendedor,cod_lance,status) values(?,?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, l.getCodigo());
                comando.setInt(2, l.getLote().getCodigo());
                comando.setInt(3, l.getVendedor().getCodigo());
                comando.setInt(4, l.getLance().getCodigo());
                comando.setString(5, l.getStatus());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLeilaoException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOLeilaoException("Falha na inserção");
        }
    }

    @Override
    public void encerrarLeilao(Leilao l) throws DAOLeilaoException {
        String sql = "update leilao set status = ? where codigo = ?";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setString(1, "Encerrado");
                comando.setInt(1, l.getCodigo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLeilaoException("Falha na atualização", e);
        }
        if (resultado == 0) {
            throw new DAOLeilaoException("Falha na atualização");
        }
    }

    @Override
    public void buscarLeilao(Leilao l) throws DAOLeilaoException {
        String sql = "select * from leilao where codigo = ?";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, l.getCodigo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLeilaoException("Falha na busca", e);
        }
        if (resultado == 0) {
            throw new DAOLeilaoException("Falha na busca");
        }
    }
    
}
