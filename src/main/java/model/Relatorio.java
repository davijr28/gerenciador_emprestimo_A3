package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Classe que representa um relatório de empréstimo de ferramentas.
 */
public class Relatorio {
    /** ID único do amigo que pegou a ferramenta */
    private int idAmigo;

    /** Nome do amigo */
    private String nomeAmigo;

    /** Telefone do amigo */
    private String telefoneAmigo;

    /** ID único da ferramenta emprestada */
    private int idFerramenta;

    /** Nome da ferramenta emprestada */
    private String nomeFerramenta;

    /** Preço da ferramenta em dinheiro */
    private double precoFerramenta;

    /** Data e hora em que o empréstimo foi feito */
    private Timestamp dataEmprestimo;

    /** Data em que a ferramenta foi devolvida (pode ser null se ainda não devolvida) */
    private Date dataDevolucao;

    /** Status do empréstimo: devolvida (true) ou ainda com o amigo (false) */
    private boolean entregue;

    /**
     * Construtor da classe Relatorio.
     * 
     * @param idAmigo         Identificador do amigo
     * @param nomeAmigo       Nome do amigo
     * @param telefoneAmigo   Telefone do amigo
     * @param idFerramenta    Identificador da ferramenta
     * @param nomeFerramenta  Nome da ferramenta
     * @param precoFerramenta Preço da ferramenta
     * @param dataEmprestimo  Data e hora do empréstimo
     * @param dataDevolucao   Data de devolução (pode ser null)
     * @param entregue        Status do empréstimo (entregue ou não)
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

    /**
     * Construtor alternativo para a classe Relatorio.
     * Este construtor foi gerado, mas ainda não está implementado.
     * 
     * @param nomeAmigo       Nome do amigo
     * @param nomeFerramenta  Nome da ferramenta
     * @param telefoneAmigo   Telefone do amigo
     * @param preco           Preço da ferramenta
     */
    public Relatorio(String nomeAmigo, String nomeFerramenta, String telefoneAmigo, double preco) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /** Métodos getters e setters
     * @return  */

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
     * Retorna uma representação em formato de String da instância de Relatorio.
     * 
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
