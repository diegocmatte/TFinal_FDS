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
public class DAOLeilaoException extends Exception{
    public DAOLeilaoException() {
        super();
    }

    public DAOLeilaoException(String mensagem) {
        super(mensagem);
    }

    public DAOLeilaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
