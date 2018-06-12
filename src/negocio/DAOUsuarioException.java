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
public class DAOUsuarioException extends Exception {

    public DAOUsuarioException() {
        super();
    }

    public DAOUsuarioException(String mensagem) {
        super(mensagem);
    }

    public DAOUsuarioException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
