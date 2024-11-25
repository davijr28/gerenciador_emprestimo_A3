package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Amigo;
import java.util.ArrayList;

/**
 * Classe responsável pelas operações de banco de dados relacionadas à tabela de
 * amigos.
 */
public class AmigoDAO {

    /**
     * Lista de amigos armazenados em memória.
     */
    public ArrayList<Amigo> lista = new ArrayList<>();

    /**
     * Objeto de conexão com o banco de dados.
     */
    private final ConexaoDAO dao = new ConexaoDAO();

    /**
     * Obtém todos os amigos do banco de dados.
     *
     * @return Lista de objetos Amigo carregados do banco de dados
     */
    public ArrayList<Amigo> getAmigosLista() {
        lista.clear(); // Limpa a lista antes de preenchê-la com os dados mais recentes.
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
                while (res.next()) {
                    int id = res.getInt("id_amigo");
                    String nome = res.getString("nome");
                    String telefone = res.getString("telefone");
                    int contadorEmprestimo = res.getInt("contador");
                    boolean emprestimoAtivo = res.getBoolean("emprestimo_ativo");

                    Amigo objeto = new Amigo(id, nome, telefone, contadorEmprestimo, emprestimoAtivo); // Cria o objeto Amigo com os dados do banco.
                    lista.add(objeto); // Adiciona o objeto à lista.
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar a lista de amigos: " + ex.getMessage());
        }
        return lista;
    }

    /**
     * Define a lista de amigos.
     *
     * @param lista Lista de objetos Amigo a ser definida
     */
    public void setMinhaLista(ArrayList<Amigo> lista) {
        this.lista = lista;
    }

    /**
     * Retorna o maior ID existente no banco de dados.
     *
     * @return Maior ID encontrado na tabela de amigos
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT MAX(id_amigo) AS id_amigo FROM tb_amigos");
                if (res.next()) {
                    maiorID = res.getInt("id_amigo"); // Obtém o maior ID.
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao obter o maior ID: " + ex.getMessage());
        }
        return maiorID;
    }

    /**
     * Insere um novo amigo no banco de dados.
     *
     * @param objeto Objeto Amigo a ser inserido
     * @return true se o amigo foi inserido com sucesso, false caso contrário
     */
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos (id_amigo, nome, telefone, contador, emprestimo_ativo) VALUES (?, ?, ?, ?, ?)";
        try {
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setInt(1, objeto.getId()); // Define o ID do amigo.
                stmt.setString(2, objeto.getNome()); // Define o nome do amigo.
                stmt.setString(3, objeto.getTelefone()); // Define o telefone do amigo.
                stmt.setInt(4, 0); // Define contador de empréstimos.
                stmt.setBoolean(5, false); // Define se o amigo possui empréstimo ativo.
                stmt.execute(); // Executa a inserção no banco de dados.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao inserir amigo: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Deleta um amigo do banco de dados pelo ID fornecido.
     *
     * @param id ID do amigo a ser deletado
     * @return true se o amigo foi deletado com sucesso, false caso contrário
     */
    public boolean deleteAmigoBD(int id) {
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                stmt.executeUpdate("DELETE FROM tb_amigos WHERE id_amigo = " + id); // Deleta o amigo pelo ID.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao deletar amigo: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Atualiza os dados de um amigo no banco de dados.
     *
     * @param objeto Objeto Amigo com os dados atualizados
     * @return true se o amigo foi atualizado com sucesso, false caso contrário
     */
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigos SET nome = ?, telefone = ? WHERE id_amigo = ?";
        try {
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setString(1, objeto.getNome()); // Atualiza o nome do amigo.
                stmt.setString(2, objeto.getTelefone()); // Atualiza o telefone do amigo.
                stmt.setInt(3, objeto.getId()); // Define o ID do amigo.
                stmt.execute(); // Executa a atualização no banco de dados.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar amigo: " + erro.getMessage());
            return false;
        }
    }

    /**
     * Carrega os dados de um amigo específico com base no ID.
     *
     * @param id ID do amigo a ser carregado
     * @return Objeto Amigo carregado do banco de dados
     */
    public Amigo carregaAmigo(int id) {
        Amigo objeto = new Amigo();
        objeto.setId(id); // Define o ID do amigo.
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id_amigo = " + id);
                if (res.next()) {
                    objeto.setNome(res.getString("nome")); // Define o nome do amigo.
                    objeto.setTelefone(res.getString("telefone")); // Define o telefone do amigo.
                    objeto.setContadorEmprestimos(res.getInt("contador")); // Define o número de empréstimos realizados pelo amigo.
                    objeto.setEmprestimoAtivo(res.getBoolean("emprestimo_ativo")); // Define se o amigo possui ou não um empréstimo ativo.
                }
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao carregar amigo: " + erro.getMessage());
        }
        return objeto;
    }
}
