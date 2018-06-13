/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOCompradorException;
import negocio.Comprador;
import negocio.CompradorDAO;

/**
 *
 * @author 08104810
 */
public class CompradorDAOderby implements CompradorDAO {

    @Override
    public void inserir(Comprador c) throws DAOCompradorException {
        String sql = "insert into usuario(codigo,descricaoBreve,descricaoCompleta) values(?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setString(1, c.getNome());
                comando.setString(2, c.getEmail());
                comando.setString(3, c.getCpfCnpj());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOCompradorException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOCompradorException("Falha na inserção");
        }
    }
}
