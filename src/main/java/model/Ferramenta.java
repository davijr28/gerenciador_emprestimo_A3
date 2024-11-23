package model;

import dao.FerramentaDAO;
import java.util.ArrayList;

/**
 * Classe que representa uma Ferramenta, com atributos básicos e métodos para
 * manipulação de dados no banco de dados.
 */
public class Ferramenta {

    /**
     * ID único da ferramenta
     */
    private int id;

    /**
     * Nome da ferramenta
     */
    private String nome;

    /**
     * Marca da ferramenta
     */
    private String marca;

    /**
     * Preço da ferramenta
     */
    private double preco;

    /**
     * Status da ferramenta
     */
    private boolean emprestada;

    /**
     * Objeto responsável pelas operações de banco de dados relacionadas à
     * ferramenta
     */
    private FerramentaDAO dao;

    /**
     * Construtor padrão que inicializa a ferramenta com valores padrão.
     */
    public Ferramenta() {
        this(0, "", "", 0, false);
    }

    /**
     * Construtor que inicializa a ferramenta com os valores fornecidos.
     *
     * @param id ID da ferramenta
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param preco Preço da ferramenta
     * @param emprestada Status da ferramenta
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
     * @param id Novo ID da ferramenta
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
     * @param nome Novo nome da ferramenta
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
     * @param marca Nova marca da ferramenta
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
     * @param preco Novo preço da ferramenta
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Determina se a ferramenta foi emprestada ou não.
     *
     * @return status da ferramenta
     */
    public boolean isEmprestada() {
        return emprestada;
    }

    /**
     * Determina se a ferramenta foi emprestada ou devolvida.
     *
     * @param emprestada Status da ferramenta
     */
    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    /**
     * Obtém a lista de ferramentas do banco de dados.
     *
     * @return Lista de ferramentas
     */
    public ArrayList<Ferramenta> getFerramentas() {
        return dao.getFerramentasLista();
    }

    /**
     * Insere uma nova ferramenta no banco de dados.
     *
     * @param nome Nome da ferramenta
     * @param marca Marca da ferramenta
     * @param preco Preço da ferramenta
     * @param emprestada Status da ferramenta
     * @return true se a ferramenta foi inserida com sucesso
     */
    public boolean insertFerramentaBD(String nome, String marca, double preco, boolean emprestada) {
        int novoId = this.maiorID() + 1; // Renomeia a variável local para 'novoId'
        Ferramenta objeto = new Ferramenta(novoId, nome, marca, preco, emprestada);
        dao.insertFerramentaBD(objeto);
        return true;
    }

    /**
     * Exclui uma ferramenta do banco de dados com base no ID.
     *
     * @param id ID da ferramenta a ser excluída
     * @return true se a ferramenta foi excluída com sucesso
     */
    public boolean deleteFerramentaBD(int id) {
        dao.deleteFerramentaBD(id);
        return true;
    }

    /**
     * Atualiza os dados de uma ferramenta no banco de dados.
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
     * Carrega os dados de uma ferramenta específica com base no ID.
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
