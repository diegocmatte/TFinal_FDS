/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public interface LanceDAO {
    void inserir(Lance l) throws DAOLanceException;
    void buscarLance(Lance l) throws DAOLanceException;
    void deletar(Lance l) throws DAOLanceException;
}
