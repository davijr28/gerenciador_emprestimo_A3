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

    // inicializar todos os campos
    public Relatorio(int idAmigo, String nomeAmigo, String telefoneAmigo, int idFerramenta, 
                     String nomeFerramenta, double precoFerramenta, Timestamp dataEmprestimo, 
                     Date dataDevolucao, boolean entregue) {
        this.idAmigo = idAmigo;
        this.nomeAmigo = nomeAmigo;
        this.telefoneAmigo = telefoneAmigo;
        this.idFerramenta = idFerramenta;
        this.nomeFerramenta = nomeFerramenta;
        this.precoFerramenta = precoFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.entregue = entregue;
    }

    // getters e setters para os campo

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getTelefoneAmigo() {
        return telefoneAmigo;
    }

    public void setTelefoneAmigo(String telefoneAmigo) {
        this.telefoneAmigo = telefoneAmigo;
    }

    public int getIdFerramenta() {
        return idFerramenta;
    }

    public void setIdFerramenta(int idFerramenta) {
        this.idFerramenta = idFerramenta;
    }

    public String getNomeFerramenta() {
        return nomeFerramenta;
    }

    public void setNomeFerramenta(String nomeFerramenta) {
        this.nomeFerramenta = nomeFerramenta;
    }

    public double getPrecoFerramenta() {
        return precoFerramenta;
    }

    public void setPrecoFerramenta(double precoFerramenta) {
        this.precoFerramenta = precoFerramenta;
    }

    public Timestamp getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Timestamp dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "idAmigo=" + idAmigo +
                ", nomeAmigo='" + nomeAmigo + '\'' +
                ", telefoneAmigo='" + telefoneAmigo + '\'' +
                ", idFerramenta=" + idFerramenta +
                ", nomeFerramenta='" + nomeFerramenta + '\'' +
                ", precoFerramenta=" + precoFerramenta +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", entregue=" + entregue +
                '}';
    }
}