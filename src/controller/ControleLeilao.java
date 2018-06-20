/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import negocio.Comprador;
import negocio.DAOCompradorException;
import negocio.DAOLanceException;
import negocio.Lance;
import negocio.Leilao;
import negocio.Lote;
import negocio.Vendedor;
/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class ControleLeilao {
    Leilao leilao;

    public ControleLeilao(int codigo, Lote lote, Vendedor vendedor, Lance lance, String status) {
        leilao = new Leilao(0, lote, vendedor, lance, status);
    }
    
    public void adicionaLance(ArrayList<Lance> listaLances, int codigo, Comprador comprador, Leilao leilao, double valor) throws DAOLanceException{
        Lance l = new Lance (codigo, comprador, leilao, valor);
        listaLances.add(l);
    }
    
    public void adicionaComprador(int codigo, String nome, String email, String cpfCnpj) throws DAOCompradorException{
        Comprador c = new Comprador(codigo, nome, email, cpfCnpj);
             
    }
    
}
