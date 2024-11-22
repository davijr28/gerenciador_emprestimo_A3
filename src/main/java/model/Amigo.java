package model;

import dao.AmigoDAO;
import java.util.ArrayList;

/**
 * Classe que representa um Amigo, contendo informações básicas como ID, nome e
 * telefone. Esta classe também interage com o banco de dados por meio da classe
 * AmigoDAO.
 */
public class Amigo {

    /**
     * ID único do amigo
     */
    private int id;

    /**
     * Nome do amigo
     */
    private String nome;

    /**
     * Telefone do amigo
     */
    private String telefone;

    /**
     * Contador de empréstimos do amigo
     */
    private int contadorEmprestimos;

    /**
     * Indicador para empréstimos
     */
    private boolean emprestimoAtivo;

    /**
     * Objeto DAO para interagir com o banco de dados
     */
    private AmigoDAO dao;

    /**
     * Construtor padrão. Inicializa o objeto Amigo com valores padrão.
     */
    public Amigo() {
        this(0, "", "", 0, false);
    }

    /**
     * Construtor que inicializa o objeto Amigo com os valores fornecidos.
     *
     * @param id ID do amigo
     * @param nome Nome do amigo
     * @param telefone Telefone do amigo
     * @param contadorEmprestimo Número de empréstimo realizados pelo amigo
     */
    public Amigo(int id, String nome, String telefone, int contadorEmprestimo, boolean emprestimoAtivo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.contadorEmprestimos = contadorEmprestimo;
        this.emprestimoAtivo = emprestimoAtivo;
        this.dao = new AmigoDAO();
    }

    /**
     * Obtém o ID do amigo.
     *
     * @return ID do amigo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do amigo.
     *
     * @param id Novo ID do amigo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do amigo.
     *
     * @return Nome do amigo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do amigo.
     *
     * @param nome Novo nome do amigo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o telefone do amigo.
     *
     * @return Telefone do amigo
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do amigo.
     *
     * @param telefone Novo telefone do amigo
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o número de empréstimos realizados pelo amigo.
     *
     * @return Total de empréstimos do amigo
     */
    public int getContadorEmprestimos() {
        return contadorEmprestimos;
    }

    /**
     * Define o número total de empréstimos realizados pelo amigo.
     *
     * @param contadorEmprestimos Atualiza o número de empréstimos realizados
     */
    public void setContadorEmprestimos(int contadorEmprestimos) {
        this.contadorEmprestimos = contadorEmprestimos;
    }

    /**
     * Obtém a situação de empréstimo do amigo
     *
     * @return Situação de empréstimos do amigo
     */
    public boolean isEmprestimoAtivo() {
        return emprestimoAtivo;
    }

    /**
     * Define se o amigo possui ou não um empréstimo ativo.
     *
     * @param emprestimoAtivo Atualiza a situação de empréstimo
     */
    public void setEmprestimoAtivo(boolean emprestimoAtivo) {
        this.emprestimoAtivo = emprestimoAtivo;
    }

    /**
     * Obtém a lista de amigos do banco de dados.
     *
     * @return Lista de amigos
     */
    public ArrayList<Amigo> getAmigos() {
        return dao.getAmigosLista();
    }

    /**
     * Insere um novo amigo no banco de dados.
     *
     * @param nome Nome do amigo
     * @param telefone Telefone do amigo
     * @param contadorEmprestimo Número de empréstimo realizados pelo amigo
     * @return true se o amigo foi inserido com sucesso
     */
    public boolean insertAmigoBD(String nome, String telefone, int contadorEmprestimo) {
        int novoId = this.maiorID() + 1; // Define o id a partir do último id
        Amigo objeto = new Amigo(novoId, nome, telefone, contadorEmprestimo, false);
        dao.insertAmigoBD(objeto);
        return true;
    }

    /**
     * Exclui um amigo do banco de dados com base no ID.
     *
     * @param id ID do amigo a ser excluído
     * @return true se o amigo foi excluído com sucesso
     */
    public boolean deleteAmigoBD(int id) {
        dao.deleteAmigoBD(id);
        return true;
    }

    /**
     * Atualiza os dados de um amigo no banco de dados.
     *
     * @param id ID do amigo a ser atualizado
     * @param nome Novo nome do amigo
     * @param telefone Novo telefone do amigo
     * @param contadorEmprestimo Número total de empréstimos realizados
     * @return true se o amigo foi atualizado com sucesso
     */
    public boolean updateAmigoBD(int id, String nome, String telefone, int contadorEmprestimo, boolean emprestimoAtivo) {
        Amigo objeto = new Amigo(id, nome, telefone, contadorEmprestimo, emprestimoAtivo);
        dao.updateAmigoBD(objeto);
        return true;
    }

    /**
     * Carrega os dados de um amigo específico com base no ID.
     *
     * @param id ID do amigo a ser carregado
     * @return Objeto Amigo com os dados carregados
     */
    public Amigo carregaAmigo(int id) {
        return dao.carregaAmigo(id);
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
