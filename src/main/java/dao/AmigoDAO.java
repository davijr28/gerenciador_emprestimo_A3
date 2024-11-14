package dao;

import java.sql.*;
import model.Amigos;
import java.util.ArrayList;

public class AmigoDAO {

    public ArrayList<Amigos> lista = new ArrayList<>();

    public ArrayList<Amigos> getAmigos() {
        lista.clear();
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {

                int id = res.getInt("id");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigos objeto = new Amigos(id, nome, telefone);

                lista.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return lista;
    }

    public void setMinhaLista(ArrayList<Amigos> lista) {
        this.lista = lista;
    }

    /**
     * Retorna o maior id de um aluno.
     */
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_alunos");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return maiorID;
    }

    /**
     * Retorna uma conexão com o banco de dados.
     */
    public Connection getConexao() {

        Connection connection = null;  //instância da conexão
        try {
            // Carregamento do JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emprestimoferramentas?useTimezone=true&serverTimezone=UTC", "root", "1234");
            // Testando..
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível conectar!");
            }
            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("Driver não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
            return null;
        }
    }

    // Cadastra um novo amigo
    public boolean insertAmigoBD(Amigos objeto) {
        String sql = "INSERT INTO tb_amigos (id,nome,telefone) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Deleta um aluno específico pelo seu campo ID
     */
    public boolean deleteAmigoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id = " + id);
            stmt.close();

        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return true;
    }

    /**
     * Edita um aluno específico pelo seu campo ID
     */
    public boolean updateAmigoBD(Amigos objeto) {

        String sql = "UPDATE tb_amigos set nome = ? ,telefone = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(5, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }

    /**
     * Carrega um aluno pelo ID
     */
    public Amigos carregaAmigo(int id) {
        Amigos objeto = new Amigos();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getString("telefone"));
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}