package model;

import dao.FerramentaDAO;
import java.util.ArrayList;

/**
 * Classe que representa uma ferramenta, contendo atributos de ID, nome, marca,
 * preço e status de empréstimo. Ela também inclui métodos para interagir com o
 * banco de dados por meio da classe AmigoDAO, permitindo operações como
 * inserção, atualização, exclusão e consulta de ferramentas.
 */
public class Ferramenta {

    /**
     * ID único da ferramenta.
     */
    private int id;

    /**
     * Nome da ferramenta.
     */
    private String nome;

    /**
     * Marca da ferramenta.
     */
    private String marca;

    /**
     * Preço da ferramenta.
     */
    private double preco;

    /**
     * Status de disponibilidade da ferramenta.
     */
    private boolean emprestada;

    /**
     * Objeto responsável pelas operações de banco de dados relacionadas à
     * ferramenta.
     */
    private FerramentaDAO dao;

    /**
     * Construtor que inicializa a ferramenta com valores padrão: ID igual a 0,
     * nome e marca vazios, preço igual a 0, e status de empréstimo definido
     * como falso (não emprestada).
     */
    public Ferramenta() {
        this(0, "", "", 0, false);
    }

    /**
     * Construtor que inicializa a ferramenta com os valores fornecidos.
     *
     * @param id ID único da ferramenta
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param preco Preço da ferramenta
     * @param emprestada Status indicando se a ferramenta foi emprestada ou está
     * disponível para empréstimo
     */
    public Ferramenta(int id, String nome, String marca, double preco, boolean emprestada) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.emprestada = emprestada;
        this.dao = new FerramentaDAO();
    }

    /**
     * Obtém o ID da ferramenta.
     *
     * @return ID da ferramenta
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID da ferramenta.
     *
     * @param id ID da ferramenta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome da ferramenta.
     *
     * @return Nome da ferramenta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da ferramenta.
     *
     * @param nome Nome da ferramenta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a marca da ferramenta.
     *
     * @return Marca da ferramenta
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca da ferramenta.
     *
     * @param marca Marca da ferramenta
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o preço da ferramenta.
     *
     * @return Preço da ferramenta
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço da ferramenta.
     *
     * @param preco Preço da ferramenta
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Determina se a ferramenta foi emprestada ou está disponível para
     * empréstimo.
     *
     * @return Status da ferramenta
     */
    public boolean isEmprestada() {
        return emprestada;
    }

    /**
     * Define se a ferramenta foi emprestada ou devolvida.
     *
     * @param emprestada Status da ferramenta
     */
    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    /**
     * Obtém a lista de todas as ferramentas registradas no banco de dados. Este
     * método consulta o banco de dados através do DAO e retorna uma lista de
     * objetos Ferramenta.
     *
     * @return Lista de objetos Ferramenta
     */
    public ArrayList<Ferramenta> getFerramentas() {
        return dao.getFerramentasLista();
    }

    /**
     * Insere uma nova ferramenta no banco de dados com os dados fornecidos. O
     * ID da ferramenta é gerado automaticamenta a partir do maior ID presente
     * no banco.
     *
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param preco Preço da ferramenta
     * @param emprestada Status da ferramenta (se está emprestada ou não)
     * @return true se a ferramenta foi inserida com sucesso
     */
    public boolean insertFerramentaBD(String nome, String marca, double preco, boolean emprestada) {
        int novoId = this.maiorID() + 1; // Renomeia a variável local para 'novoId'
        Ferramenta objeto = new Ferramenta(novoId, nome, marca, preco, emprestada);
        dao.insertFerramentaBD(objeto);
        return true;
    }

    /**
     * Exclui uma ferramenta do banco de dados com base no ID fornecido.
     *
     * @param id ID da ferramenta a ser excluída
     * @return true se a ferramenta foi excluída com sucesso
     */
    public boolean deleteFerramentaBD(int id) {
        dao.deleteFerramentaBD(id);
        return true;
    }

    /**
     * Atualiza os dados de uma ferramenta no banco de dados com base no ID
     * fornecido.
     *
     * @param id ID da ferramenta a ser atualizada
     * @param nome Novo nome da ferramenta
     * @param marca Nova marca da ferramenta
     * @param preco Novo preço da ferramenta
     * @return true se a ferramenta foi atualizada com sucesso
     */
    public boolean updateFerramentaBD(int id, String nome, String marca, double preco) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, preco, false);
        dao.updateFerramentaBD(objeto);
        return true;
    }

    /**
     * Carrega os dados de uma ferramenta específica com base no ID. O método
     * retorna um objeto Ferramenta com os dados carregados do banco.
     *
     * @param id ID da ferramenta a ser carregada
     * @return Objeto Ferramenta com os dados carregados
     */
    public Ferramenta carregaFerramenta(int id) {
        return dao.carregaFerramenta(id);
    }

    /**
     * Obtém o maior ID existente no banco de dados.
     *
     * @return Maior ID encontrado
     */
    public int maiorID() {
        return dao.maiorID();
    }
}
