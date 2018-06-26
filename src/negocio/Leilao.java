/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Leilao {
    private int codigo;
    private String status;
    private ArrayList<Lote> listaLote;

    public Leilao(int codigo, String status) {
        this.codigo = codigo;
        this.status = status;
        listaLote = new ArrayList<>();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Lote> getListaLote() {
        return listaLote;
    }

    
}
