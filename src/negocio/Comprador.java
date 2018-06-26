package negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class Comprador {

    private int codigo;
    private String nome, email, cpfCnpj;
    private double lance;

    public Comprador(int codigo, String nome, String email, String cpfCnpj, double lance) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.lance = lance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLance() {
        return lance;
    }

    public void setLance(double lance) {
        this.lance = lance;
    }
    
}
