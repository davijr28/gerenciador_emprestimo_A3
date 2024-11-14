package model;

import java.sql.Date;
import java.sql.Timestamp;

public class Relatorio {
    // id único amigo que pegou ferramenta
    private int idAmigo;
    
    // nome amigo
    private String nomeAmigo;
    
    // telefone amigo
    private String telefoneAmigo;
    
    // Id único ferramenta emprestada
    private int idFerramenta;
    
    // Nome ferramenta emprestada
    private String nomeFerramenta;
    
    // Preço ferramenta em dinheiro
    private double precoFerramenta;
    
    // Data e hora que o empréstimo foi feito
    private Timestamp dataEmprestimo;
    
    // Data que ferramenta foi devolvida (podendo ser null se ainda não devolvida)
    private Date dataDevolucao;
    
    // ferramenta foi devolvida(true) ainda está com amigo(false)
    private boolean entregue;

    /**
     * Construtor da classe Relatorio.
     * Inicializa todos os atributos com os valores fornecidos.
     * 
     * @param idAmigo Identificador do amigo
     * @param nomeAmigo Nome do amigo
     * @param telefoneAmigo Telefone do amigo
     * @param idFerramenta Identificador da ferramenta
     * @param nomeFerramenta Nome da ferramenta
     * @param precoFerramenta Preço da ferramenta
     * @param dataEmprestimo Data e hora do empréstimo
     * @param dataDevolucao Data de devolução (pode ser null)
     * @param entregue Status do empréstimo (entregue ou não)
     */
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

    public Relatorio(String nomeAmigo, String nomeFerramenta, String telefoneAmigo, double preco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // getters e setters para cada campo da classe, getters permitem acessar os valores dos atributos fora da classe, os setters permitem modificar eles
    
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

    /**
     * Método toString.
     * Retorna uma representação em formato de String da instância de Relatorio,
     * incluindo todos os atributos com seus valores.
     * @return String representando o objeto Relatorio
     */
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