/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOVendedorException;
import negocio.Vendedor;
import negocio.VendedorDAO;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class VendedorDAOderby implements VendedorDAO{

    @Override
    public void inserir(Vendedor v) throws DAOVendedorException {
        String sql = "insert into vendedor(codigo,nome) values(?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, v.getCodigo());
                comando.setString(2, v.getNome());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOVendedorException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOVendedorException("Falha na inserção");
        }
    }
    
}
