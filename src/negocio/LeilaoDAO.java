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
public interface LeilaoDAO{
    void inserir (Leilao l) throws DAOLeilaoException;
    void encerrarLeilao (Leilao l) throws DAOLeilaoException;
    void buscarLeilao (Leilao l) throws DAOLeilaoException;
}
