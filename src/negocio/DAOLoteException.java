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
public class DAOLoteException extends Exception{
    public DAOLoteException() {
        super();
    }

    public DAOLoteException(String mensagem) {
        super(mensagem);
    }

    public DAOLoteException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
