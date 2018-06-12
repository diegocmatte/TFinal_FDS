/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import negocio.DAOUsuarioException;
import negocio.Usuario;
import negocio.UsuarioDAO;

/**
 *
 * @author 08104810
 */
public class UsuarioDAOderby implements UsuarioDAO {

    @Override
    public void inserir(Usuario u) throws DAOUsuarioException {
        String sql = "insert into usuario(codigo,descricaoBreve,descricaoCompleta,categoria) values(?,?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setString(1, u.getNome());
                comando.setString(2, u.getEmail());
                comando.setString(3, u.getCpfCnpj());
                comando.setString(4, u.getTipo());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOUsuarioException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOUsuarioException("Falha na inserção");
        }
    }
}
