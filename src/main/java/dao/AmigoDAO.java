package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Amigo;
import java.util.ArrayList;

public class AmigoDAO {

    public ArrayList<Amigo> lista = new ArrayList<>();

    // Obtém todos os amigos do banco de dados.
    public ArrayList<Amigo> getAmigosLista() {
        lista.clear();  // Limpa a lista antes de preenchê-la com os dados mais recentes.
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {
                int id = res.getInt("id_amigo");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigo objeto = new Amigo(id, nome, telefone);  // Cria o objeto Amigos com os dados do banco.
                lista.add(objeto);  // Adiciona o objeto à lista.
            }
            stmt.close();  // Fecha Statement após o uso.

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return lista;
    }

    // Define a lista de amigos na classe.
    public void setMinhaLista(ArrayList<Amigo> lista) {
        this.lista = lista;
    }

    // Retorna o maior id do banco de dados.
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_amigo) id_amigo FROM tb_amigos");
            res.next();
            maiorID = res.getInt("id_amigo");  // Obtém o maior ID.
            stmt.close();  // Fecha Statement após o uso.
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorID;
    }

    // Tenta estabelecer conexão com o banco de dados.
    public Connection getConexao() {
        Connection connection = null;
        try {
            // Carregamento do driver JDBC.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_emprestimoferramentas?useTimezone=true&serverTimezone=UTC", 
                "root", "1234"
            );

            // Testa a conexão.
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível conectar!");
            }
            return connection;

        } catch (ClassNotFoundException e) {  // Driver não encontrado.
            System.out.println("Driver não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {  // Erro na conexão com o banco de dados.
            System.out.println("Não foi possível conectar: " + e.getMessage());
            return null;
        }
    }

    // Cadastra um novo amigo no banco de dados.
    public boolean insertAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos (id_amigo, nome, telefone) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());  // Define o ID do amigo.
            stmt.setString(2, objeto.getNome());  // Define o nome do amigo.
            stmt.setString(3, objeto.getTelefone());  // Define o telefone do amigo.

            stmt.execute();  // Executa a inserção no banco de dados.
            stmt.close();  // Fecha Statement após o uso.

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    // Deleta um amigo do banco de dados pelo seu id.
    public boolean deleteAmigoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id_amigo = " + id);  // Deleta o amigo pelo ID.
            stmt.close();  // Fecha Statement após o uso.
            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    // Atualiza os dados de um amigo no banco de dados.
    public boolean updateAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigos SET nome = ?, telefone = ? WHERE id_amigo = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());  // Atualiza o nome do amigo.
            stmt.setString(2, objeto.getTelefone());  // Atualiza o telefone do amigo.
            stmt.setInt(3, objeto.getId());  // Atualiza o ID do amigo.

            stmt.execute();  // Executa a atualização no banco de dados.
            stmt.close();  // Fecha PreparedStatement após o uso.

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }
    
    // Carrega um amigo pelo seu id
    public Amigo carregaAmigo(int id) {
        Amigo objeto = new Amigo();
        objeto.setId(id);  // Define o ID do amigo.

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id_amigo = " + id);
            res.next();  // Avança para o resultado.

            objeto.setNome(res.getString("nome"));  // Define o nome do amigo.
            objeto.setTelefone(res.getString("telefone"));  // Define o telefone do amigo.
            stmt.close();  // Fecha o Statement após o uso.
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return objeto;
    }
}
