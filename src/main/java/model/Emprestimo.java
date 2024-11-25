package model;

import dao.EmprestimoDAO;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Classe que representa um empréstimo de ferramentas. Contém informações sobre
 * o amigo, a ferramenta emprestada, o ID do empréstimo, as datas de realização
 * do empréstimo, devolução e data em que o empréstimo foi concluído, e o status
 * de entrega. A classe também interage com o banco de dados via `EmprestimoDAO`
 * para realizar operações como inserção, atualização e consulta de empréstimos.
 */
public class Emprestimo {

    /**
     * Declaração de um objeto da classe Amigo.
     */
    public Amigo objetoAmigo;

    /**
     * Declaração de um objeto da classe Ferramenta.
     */
    public Ferramenta objetoFerramenta;

    /**
     * Número de identificação para cada empréstimo realizado.
     */
    private int id;

    /**
     * Data em que o empréstimo foi feito.
     */
    private Date dataEmprestimo;

    /**
     * Data em que a ferramenta deverá ser devolvida.
     */
    private Date dataDevolucao;

    /**
     * Status do empréstimo: devolvida (true) ou ainda com o amigo (false).
     */
    private boolean entregue;

    /**
     * Data em que a ferramenta foi entregue.
     */
    private Date dataFinalizado;

    /**
     * Objeto DAO para interagir com o banco de dados.
     */
    private EmprestimoDAO dao;

    /**
     * Construtor vazio da classe Emprestimo. Inicializa todos os atributos com
     * valores padrão: ID igual a 0, sem amigo ou ferramenta associados, sem data de
     * empréstimo, devolução ou entrega, status da entrega igual a falso (ferramenta não devolvida).
     */
    public Emprestimo() {
        this(0, null, null, null, null, false, null);
    }

    /**
     * Construtor da classe Emprestimo.
     *
     * @param id ID único do empréstimo
     * @param objetoAmigo Objeto da classe Amigo representando quem realizou o
     * empréstimo
     * @param objetoFerramenta Objeto da classe Ferramenta representando a
     * ferramenta que foi emprestada
     * @param dataEmprestimo Data de realização do empréstimo
     * @param dataDevolucao Data prevista para devolução da ferramenta
     * @param entregue Status do empréstimo (entregue ou não)
     * @param dataFinalizado Data em que a ferramenta foi entregue e o
     * empréstimo finalizado
     */
    public Emprestimo(int id, Amigo objetoAmigo, Ferramenta objetoFerramenta, Date dataEmprestimo,
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
     * Obtém o ID do empréstimo.
     *
     * @return ID do empréstimo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do empréstimo.
     *
     * @param id Novo ID do empréstimo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém a data de realização do empréstimo.
     *
     * @return data do empréstimo
     */
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /**
     * Define a data de realização do empréstimo.
     *
     * @param dataEmprestimo data do empréstimo
     */
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /**
     * Obtém a data de devolução prevista para o empréstimo.
     *
     * @return data de devolução
     */
    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Define a data de devolução do empréstimo.
     *
     * @param dataDevolucao data de devolução
     */
    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * Obtém o status do empréstimo para definir se foi finalizado ou continua
     * ativo.
     *
     * @return status do empréstimo
     */
    public boolean isEntregue() {
        return entregue;
    }

    /**
     * Define se o empréstimo foi finalizado ou não.
     *
     * @param entregue status do empréstimo
     */
    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    /**
     * Obtém a data em que o empréstimo foi finalizado.
     *
     * @return data em que a ferramenta foi devolvida
     */
    public Date getDataFinalizado() {
        return dataFinalizado;
    }

    /**
     * Define a data de finalização do empréstimo.
     *
     * @param dataFinalizado data em que a ferramenta foi devolvida
     */
    public void setDataFinalizado(Date dataFinalizado) {
        this.dataFinalizado = dataFinalizado;
    }

    /**
     * Obtém a lista de todos os empréstimos registrados no banco de dados. Este
     * método consulta o banco de dados através do DAO e retorna uma lista de
     * objetos Emprestimo.
     *
     * @return Lista de objetos Emprestimo
     */
    public ArrayList<Emprestimo> getEmprestimos() {
        return dao.getEmprestimosLista();
    }

    /**
     * Insere um novo empréstimo no banco de dados. O ID do empréstimo é gerado
     * automaticamente com base no maior ID presente no banco.
     *
     * @param objetoAmigo Objeto da classe Amigo, que representa o amigo que
     * está realizando o empréstimo
     * @param objetoFerramenta Objeto da classe Ferramenta, que representa a
     * ferramenta emprestada
     * @param dataEmprestimo Data do empréstimo
     * @param dataDevolucao Data prevista para devolução da ferramenta
     * @return true se o empréstimo foi inserido com sucesso no banco de dados
     */
    public boolean insertEmprestimoBD(Amigo objetoAmigo, Ferramenta objetoFerramenta, Date dataEmprestimo, Date dataDevolucao) {
        int novoId = this.maiorID() + 1; // Define o id a partir do último id
        Emprestimo objeto = new Emprestimo(novoId, objetoAmigo, objetoFerramenta, dataEmprestimo, dataDevolucao, false, null);
        dao.insertEmprestimoBD(objeto);
        return true;
    }

    /**
     * Atualiza o status do empréstimo no banco de dados, marcando como
     * finalizado e atualizando a data de entrega da ferramenta.
     *
     * @param id ID do empréstimo a ser atualizado
     * @param dataFinalizado Data da devolução da ferramenta
     * @return true se o empréstimo foi atualizado com sucesso
     */
    public boolean updateEmprestimoBD(int id, Date dataFinalizado) {
        Emprestimo objeto = new Emprestimo();
        objeto = objeto.carregaEmprestimo(id);
        objeto.setEntregue(true);
        objeto.setDataFinalizado(dataFinalizado);
        objeto.objetoAmigo.setEmprestimoAtivo(false);
        objeto.objetoFerramenta.setEmprestada(false);
        dao.updateEmprestimoBD(objeto);
        return true;
    }

    /**
     * Carrega as informações de um empréstimo específico do banco de dados com
     * base no ID fornecido.
     *
     * @param id ID do empréstimo a ser carregado
     * @return Objeto Emprestimo com os dados carregados do banco de dados
     */
    public Emprestimo carregaEmprestimo(int id) {
        return dao.carregaEmprestimo(id);
    }

    /**
     * Obtém o maior ID existente no banco de dados. Esse método é utilizado
     * para gerar um novo ID único para o próximo empréstimo a ser registrado.
     *
     * @return Maior ID encontrado no banco de dados
     */
    public int maiorID() {
        return dao.maiorID();
    }
}