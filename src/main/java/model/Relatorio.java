package model;

import java.sql.Date;
import java.sql.Timestamp;

public class Relatorio {
    private int idAmigo;
    private String nomeAmigo;
    private String telefoneAmigo;
    private int idFerramenta;
    private String nomeFerramenta;
    private double precoFerramenta;
    private Timestamp dataEmprestimo;
    private Date dataDevolucao;
    private boolean entregue;
    private double preco;

    public Relatorio(String nomeAmigo, String nomeFerramenta, String telefoneAmigo, double preco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
// Getters e Setters para cada campo
    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public String getTelefoneAmigo() {
        return telefoneAmigo;
    }
    public void setTelefoneAmigo(String telefoneAmigo) {
        this.telefoneAmigo = telefoneAmigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}