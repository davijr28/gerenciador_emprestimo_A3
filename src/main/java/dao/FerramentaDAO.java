package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Ferramenta;

/**
 * Classe responsável pelas operações de banco de dados relacionadas à tabela de ferramentas.
 */
public class FerramentaDAO {

    /** Lista de ferramentas armazenadas em memória */
    public ArrayList<Ferramenta> lista = new ArrayList<>();

    /** Conexão com o banco de dados */
    private final ConexaoDAO dao = new ConexaoDAO();

    /**
     * Obtém a lista de ferramentas do banco de dados.
     * 
     * @return Lista de objetos Ferramenta carregados do banco de dados.
     */
    public ArrayList<Ferramenta> getFerramentasLista() {
        lista.clear();
        try {
            try (Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
                while (res.next()) {
                    int id = res.getInt("id_ferramenta");
                    String nome = res.getString("nome");
                    String marca = res.getString("marca");
                    double preco = res.getDouble("preco");
                    
                    Ferramenta objeto = new Ferramenta(id, nome, marca, preco); // Cria o objeto Ferramenta com os dados do banco.
                    lista.add(objeto); // Adiciona o objeto à lista.
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return lista;
    }

    /**
     * Define uma nova lista de ferramentas.
     * 
     * @param lista Lista de ferramentas a ser definida.
     */
    public void setMinhaLista(ArrayList<Ferramenta> lista) {
        this.lista = lista;
    }

    /**
     * Obtém o maior ID existente no banco de dados.
     * 
     * @return O maior ID encontrado na tabela de ferramentas.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            try (Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) AS id_ferramenta FROM tb_ferramentas");
                if (res.next()) {
                    maiorID = res.getInt("id_ferramenta"); // Obtém o maior ID.
                }
                // Fecha Statement após o uso.
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    /**
     * Insere uma nova ferramenta no banco de dados.
     * 
     * @param objeto Objeto Ferramenta a ser inserido.
     * @return true se a ferramenta foi inserida com sucesso, false caso contrário.
     */
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas (id_ferramenta, nome, marca, preco) VALUES (?, ?, ?, ?)";
        try {
            try (PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setInt(1, objeto.getId());
                stmt.setString(2, objeto.getNome());
                stmt.setString(3, objeto.getMarca());
                stmt.setDouble(4, objeto.getPreco());
                stmt.execute(); // Executa a inserção no banco de dados.
                // Fecha Statement após o uso.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    /**
     * Deleta uma ferramenta do banco de dados com base no ID.
     * 
     * @param id ID da ferramenta a ser deletada.
     * @return true se a ferramenta foi deletada com sucesso, false caso contrário.
     */
    public boolean deleteFerramentaBD(int id) {
        try {
            try (Statement stmt = dao.getConexao().createStatement()) {
                stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id_ferramenta = " + id); // Deleta a ferramenta pelo ID.
                // Fecha Statement após o uso.
            } // Deleta a ferramenta pelo ID.
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    /**
     * Atualiza os dados de uma ferramenta no banco de dados.
     * 
     * @param objeto Objeto Ferramenta com os dados atualizados.
     * @return true se a ferramenta foi atualizada com sucesso, false caso contrário.
     */
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE tb_ferramentas SET nome = ?, marca = ?, preco = ? WHERE id_ferramenta = ?";
        try {
            try (PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setString(1, objeto.getNome());
                stmt.setString(2, objeto.getMarca());
                stmt.setDouble(3, objeto.getPreco());
                stmt.setInt(4, objeto.getId());
                stmt.execute(); // Executa a atualização no banco de dados.
                // Fecha PreparedStatement após o uso.
            }

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    /**
     * Carrega uma ferramenta específica com base no ID.
     * 
     * @param id ID da ferramenta a ser carregada.
     * @return Objeto Ferramenta carregado do banco de dados.
     */
    public Ferramenta carregaFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id); // Define o ID da ferramenta.

        try {
            try (Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id_ferramenta = " + id);
                if (res.next()) {
                    objeto.setNome(res.getString("nome"));
                    objeto.setMarca(res.getString("marca"));
                    objeto.setPreco(res.getDouble("preco"));
                }
                // Fecha o Statement após o uso.
            }
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return objeto;
    }
}