package model;

import dao.EmprestimoDAO;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Classe que representa um relatório de empréstimo de ferramentas.
 */
public class Emprestimo {

    /**
     * Declaração de um objeto da classe Amigo
     */
    public Amigo objetoAmigo;

    /**
     * Declaração de um objeto da classe Ferramenta
     */
    public Ferramenta objetoFerramenta;

    /**
     * Número de identificação para cada empréstimo realizado
     */
    private int id;

    /**
     * Data e hora em que o empréstimo foi feito
     */
    private Timestamp dataEmprestimo;

    /**
     * Data em que a ferramenta deverá ser devolvida
     */
    private Date dataDevolucao;

    /**
     * Status do empréstimo: devolvida (true) ou ainda com o amigo (false)
     */
    private boolean entregue;

    /**
     * Data em que a ferramenta foi entregue
     */
    private Date dataFinalizado;

    /**
     * Objeto DAO para interagir com o banco de dados
     */
    private EmprestimoDAO dao;

    /**
     * Construtor vazio da classe Emprestimo
     */
    public Emprestimo() {
        this(0, null, null, null, null, false, null);
    }

    /**
     * Construtor da classe Emprestimo.
     *
     * @param objetoAmigo Objeto da classe Amigo
     * @param objetoFerramenta Objeto da classe Ferramenta
     * @param id Número de identificação da operação
     * @param dataEmprestimo Data e hora do empréstimo
     * @param dataDevolucao Data de devolução
     * @param entregue Status do empréstimo (entregue ou não)
     * @param dataFinalizado Data da entrega
     */
    public Emprestimo(int id, Amigo objetoAmigo, Ferramenta objetoFerramenta, Timestamp dataEmprestimo,
            Date dataDevolucao, boolean entregue, Date dataFinalizado) {
        this.id = id;
        this.objetoAmigo = objetoAmigo;
        this.objetoFerramenta = objetoFerramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.entregue = entregue;
        this.dataFinalizado = dataFinalizado;
        this.dao = new EmprestimoDAO();
    }

    /**
     * Métodos getters e setters
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataFinalizado() {
        return dataFinalizado;
    }

    public void setDataFinalizado(Date dataFinalizado) {
        this.dataFinalizado = dataFinalizado;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return dao.getEmprestimosLista();
    }

    public boolean insertEmprestimoBD(Amigo objetoAmigo, Ferramenta objetoFerramenta, Timestamp dataEmprestimo, Date dataDevolucao) {
        int novoId = this.maiorID() + 1; // Define o id a partir do último id
        Emprestimo objeto = new Emprestimo(novoId, objetoAmigo, objetoFerramenta, dataEmprestimo, dataDevolucao, false, null);
        dao.insertEmprestimoBD(objeto);
        return true;
    }

    public boolean updateEmprestimoBD(int id, boolean entregue, Date dataFinalizado) {
        Emprestimo objeto = new Emprestimo();
        objeto.carregaEmprestimo(id);
        objeto.setEntregue(entregue);
        objeto.setDataFinalizado(dataFinalizado);
        dao.updateEmprestimoBD(objeto);
        return true;
    }

    public Emprestimo carregaEmprestimo(int id) {
        return dao.carregaEmprestimo(id);
    }

    public int maiorID() {
        return dao.maiorID();
    }
}
