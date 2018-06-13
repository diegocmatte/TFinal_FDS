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
public class DAOVendedorException extends Exception{
    public DAOVendedorException() {
        super();
    }

    public DAOVendedorException(String mensagem) {
        super(mensagem);
    }

    public DAOVendedorException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
