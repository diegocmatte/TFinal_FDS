/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOLoteException;
import negocio.Lote;
import negocio.LoteDAO;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class LoteDAOderby implements LoteDAO{

    @Override
    public void inserir(Lote l) throws DAOLoteException {
        String sql = "insert into lote(codigo,bens,precoMinimo) values(?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, l.getCodigo());
                comando.setObject(2, l.getListaBens());
                comando.setDouble(3, l.getPrecoMinimo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOLoteException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOLoteException("Falha na inserção");
        }
    }
    
}
