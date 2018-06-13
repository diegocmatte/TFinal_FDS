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
        String sql = "insert into lance(lote,vendedor,lance,status) values(?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setObject(1, l.getLote());
                comando.setObject(2, l.getVendedor());
                comando.setObject(3, l.getLance());
                comando.setString(4, l.getStatus());
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
    public void alterarStatus(Leilao l) throws DAOLeilaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarLeilao(Leilao l) throws DAOLeilaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
