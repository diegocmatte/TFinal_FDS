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
    private Comprador comprador;
    private Leilao leilao;
    private double valor;

    public Lance(Comprador comprador, Leilao leilao, double valor) {
        this.comprador = comprador;
        this.leilao = leilao;
        this.valor = valor;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public double getValor() {
        return valor;
    }

    public Leilao getLeilao() {
        return leilao;
    }    
}
