
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

    private ArrayList<Bens> listaBens;
    private double precoMinimo;

    public Lote(Bens bens, double precoMinimo) {
        listaBens = new ArrayList<>();
        this.precoMinimo = precoMinimo;
    }

    public void adicionaBens(Bens b) {
        listaBens.add(b);
    }

    public void setPrecoMinimo(double precoMinimo) {
        this.precoMinimo = precoMinimo;
    }
    
    
    
}
