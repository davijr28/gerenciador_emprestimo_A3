package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe responsável pela conexão com o banco de dados.
 */
public class ConexaoDAO {

    /**
     * Método que estabelece a conexão com o banco de dados.
     * 
     * @return Objeto Connection para o banco de dados ou null se a conexão falhar.
     */
    public Connection getConnection() {
        try {
            // Tenta criar uma conexão com o banco de dados.
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_emprestimoferramentas", "root", "1234");
        } catch (SQLException e) {
            // Exibe uma mensagem de erro detalhada em caso de falha na conexão.
            JOptionPane.showMessageDialog(
                null, 
                "Erro de conexão: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
            return null;
        }
    }

    /**
     * Método alternativo para obter a conexão com o banco de dados.
     * Carrega o driver JDBC e tenta estabelecer a conexão.
     * 
     * @return Objeto Connection para o banco de dados ou null se ocorrer erro.
     */
    public Connection getConexao() {
        Connection connection = null;
        try {
            // Carrega o driver JDBC.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tenta estabelecer a conexão com o banco de dados.
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_emprestimoferramentas?useTimezone=true&serverTimezone=UTC", 
                "root", "1234"
            );

            // Verifica se a conexão foi bem-sucedida.
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível conectar!");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            // Trata o erro de driver JDBC não encontrado.
            System.out.println("Driver não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            // Trata o erro na conexão com o banco de dados.
            System.out.println("Não foi possível conectar: " + e.getMessage());
            return null;
        }
    }
}