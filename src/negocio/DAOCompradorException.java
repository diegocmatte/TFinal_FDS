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
public class DAOCompradorException extends Exception {

    public DAOCompradorException() {
        super();
    }

    public DAOCompradorException(String mensagem) {
        super(mensagem);
    }

    public DAOCompradorException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
