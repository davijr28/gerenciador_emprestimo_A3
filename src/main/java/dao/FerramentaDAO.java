package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Ferramenta;

public class FerramentaDAO {

    public ArrayList<Ferramenta> lista = new ArrayList<>();

    public ArrayList<Ferramenta> getFerramentasLista() {
        lista.clear();
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {
                int id = res.getInt("id_ferramenta");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double preco = res.getDouble("preco");

                Ferramenta objeto = new Ferramenta(id, nome, marca, preco);  // Cria o objeto Ferramentas com os dados do banco.
                lista.add(objeto);  // Adiciona o objeto à lista.
            }
            stmt.close();  // Fecha Statement após o uso.

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            ex.printStackTrace();
        }
        return lista;
    }

    // Define a lista de ferramentas na classe.
    public void setMinhaLista(ArrayList<Ferramenta> lista) {
        this.lista = lista;
    }

    // Retorna o maior id do banco de dados.
    public int maiorID() {
        int maiorID = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) id_ferramenta FROM tb_ferramentas");
            res.next();
            maiorID = res.getInt("id_ferramenta");  // Obtém o maior ID.
            stmt.close();  // Fecha Statement após o uso.
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            ex.printStackTrace();
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
            e.printStackTrace();
            return null;
        } catch (SQLException e) {  // Erro na conexão com o banco de dados.
            System.out.println("Não foi possível conectar: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // Cadastra uma nova ferramenta no banco de dados.
    public boolean insertFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas (id_ferramenta, nome, marca, preco) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());  // Define o ID da ferramenta.
            stmt.setString(2, objeto.getNome());  // Define o nome da ferramenta.
            stmt.setString(3, objeto.getMarca());  // Define a marca da ferramenta.
            stmt.setDouble(4, objeto.getPreco()); // Define o preço da ferramenta

            stmt.execute();  // Executa a inserção no banco de dados.
            stmt.close();  // Fecha Statement após o uso.

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            erro.printStackTrace();
            return false;
        }
    }

    // Deleta uma ferramenta do banco de dados pelo seu id.
    public boolean deleteFerramentaBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id_ferramenta = " + id);  // Deleta a ferramenta pelo ID.
            stmt.close();  // Fecha Statement após o uso.
            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            erro.printStackTrace();
            return false;
        }
    }

    // Atualiza os dados de uma ferramenta no banco de dados.
    public boolean updateFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE tb_ferramentas SET nome = ?, marca = ?, preco = ? WHERE id_ferramenta = ?";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());  // Atualiza o nome da ferramenta.
            stmt.setString(2, objeto.getMarca());  // Atualiza a marca da ferramenta.
            stmt.setDouble(3, objeto.getPreco()); // Atualiza o preço da ferramenta.
            stmt.setInt(4, objeto.getId());  // Atualiza o ID da ferramenta.

            stmt.execute();  // Executa a atualização no banco de dados.
            stmt.close();  // Fecha PreparedStatement após o uso.

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            erro.printStackTrace();
            return false;
        }
    }

    // Carrega uma ferramenta pelo seu id
    public Ferramenta carregaFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);  // Define o ID da ferramenta.

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id_ferramenta = " + id);
            res.next();  // Avança para o resultado.

            objeto.setNome(res.getString("nome"));  // Define o nome da ferramenta.
            objeto.setMarca(res.getString("marca"));  // Define a marca da ferramenta.
            objeto.setPreco(res.getDouble("preco")); // Define o preço da ferramenta.
            stmt.close();  // Fecha o Statement após o uso.
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            erro.printStackTrace();
        }
        return objeto;
    }
}