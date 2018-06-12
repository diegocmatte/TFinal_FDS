/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.List;

/**
 *
 * @author 08104810
 */
public interface BensDAO {

    List<Bens> buscarTodos() throws DAOBensException;

    Bens buscarPorCodigo(int codigo) throws DAOBensException;

    void inserir(Bens b) throws DAOBensException;

}
