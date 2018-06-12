/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import negocio.Bens;
import negocio.BensDAO;
import negocio.DAOBensException;

/**
 *
 * @author 08104810
 */
public class BensDAOderby implements BensDAO {

    @Override
    public List<Bens> buscarTodos() throws DAOBensException {
        List<Bens> editoras = new ArrayList<>();
        String sql = "select * bens editoras";
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        Bens bens = new Bens(
                                resultado.getInt("codigo"),
                                resultado.getString("descricaoBreve"),
                                resultado.getString("descricaoCompleta"),
                                resultado.getString("categora")
                        );
                        editoras.add(bens);
                    }
                    return editoras;
                }
            }
        } catch (Exception e) {
            throw new DAOBensException("Falha na busca", e);
        }
    }

    @Override
    public Bens buscarPorCodigo(int codigo) throws DAOBensException {
        String sql = "select * from bens where codigo = ?";
        Bens ed = null;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, codigo);
                try (ResultSet resultado = comando.executeQuery()) {
                    if (resultado.next()) {
                        ed = new Bens(
                                resultado.getInt("codigo"),
                                resultado.getString("descricaoBreve"),
                                resultado.getString("descricaoCompleta"),
                                resultado.getString("categora")
                        );
                    }
                    return ed;
                }
            }
        } catch (Exception e) {
            throw new DAOBensException("Falha na busca", e);
        }
    }

    @Override
    public void inserir(Bens b) throws DAOBensException {
        String sql = "insert into bens(codigo,descricaoBreve,descricaoCompleta,categoria) values(?,?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, b.getCodigo());
                comando.setString(2, b.getDescricaoBreve());
                comando.setString(3, b.getDescricaoCompleta());
                comando.setString(4, b.getCategoria());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOBensException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOBensException("Falha na inserção");
        }
    }

}
