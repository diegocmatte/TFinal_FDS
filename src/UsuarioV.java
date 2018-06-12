/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class UsuarioV extends Usuario{
    private int id;

    public UsuarioV(String nome, String email, int id) {
        super(nome, email);
        this.id = id;
    }
    
    
}
