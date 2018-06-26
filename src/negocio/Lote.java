package negocio;

import java.util.ArrayList;

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

    private int codigo;
    private ArrayList<Bens> listaBens;
    private ArrayList<Comprador> listaComprador;
    private double precoMinimo;
    private Vendedor vendedor;

    public Lote(int codigo, Bens bens, Vendedor vendedor, double precoMinimo) {
        this.codigo = codigo;
        listaBens = new ArrayList<>();
        listaComprador = new ArrayList<>();
        this.vendedor = vendedor;
        this.precoMinimo = precoMinimo;

    }

    public double getPrecoMinimo() {
        return precoMinimo;
    }

    public void setPrecoMinimo(double precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public ArrayList<Bens> getListaBens() {
        return listaBens;
    }

    public void setListaBens(ArrayList<Bens> listaBens) {
        this.listaBens = listaBens;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Comprador> getListaComprador() {
        return listaComprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public boolean adicionaBens(Bens b) {
        for (Bens bens : listaBens) {
            if (bens.getCodigo() == b.getCodigo()) {
                return true;
            }
        }
        return listaBens.add(b);
    }

    public boolean adicionaComprador(Comprador c) {
        for (Comprador comprador : listaComprador) {
            if (comprador.getCodigo() == c.getCodigo()) {
                return true;
            }
        }
        return listaComprador.add(c);
    }

}
