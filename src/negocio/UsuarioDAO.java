/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 08104810
 */
public interface UsuarioDAO {
    
    void inserir(Usuario u) throws DAOUsuarioException;
}
