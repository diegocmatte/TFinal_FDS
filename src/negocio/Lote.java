package negocio;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Lote {

    private List<Bens> listaBens;
    private double precoMinimo;

    public Lote(Bens bens, double precoMinimo) {
        listaBens = new ArrayList<>();
        this.precoMinimo = precoMinimo;
        listaBens.add(bens);
    }

    public double getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(double precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public List<Bens> getListaBens() {
        return listaBens;
    }

    public void setListaBens(List<Bens> listaBens) {
        this.listaBens = listaBens;
    }

    public boolean adicionaBens(Bens b) {
        for (Bens bens : listaBens) {
            if (bens.getCodigo() == b.getCodigo()) {
                return true;
            }
        }
        return listaBens.add(b);
    }

}
