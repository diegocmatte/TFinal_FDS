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
public class DAOLanceException extends Exception {
    public DAOLanceException() {
        super();
    }

    public DAOLanceException(String mensagem) {
        super(mensagem);
    }

    public DAOLanceException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
