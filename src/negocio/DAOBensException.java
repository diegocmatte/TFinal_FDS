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
public class DAOBensException extends Exception {

    public DAOBensException() {
        super();
    }

    public DAOBensException(String mensagem) {
        super(mensagem);
    }

    public DAOBensException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
