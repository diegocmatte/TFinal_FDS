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
public class Lance {
    private Comprador c;
    private double valor;

    public Lance(Comprador c, double valor) {
        this.c = c;
        this.valor = valor;
    }

    public Comprador getC() {
        return c;
    }

    public double getValor() {
        return valor;
    }
    
}
