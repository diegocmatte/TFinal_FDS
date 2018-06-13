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
public class Leilao {
    private Lote lote;
    private Vendedor vendedor;
    private Lance lance;
    private String status;

    public Leilao(Lote lote, Vendedor vendedor, Lance lance, String status) {
        this.lote = lote;
        this.vendedor = vendedor;
        this.lance = lance;
        this.status = status;
    }

    public Lote getLote() {
        return lote;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Lance getLance() {
        return lance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
