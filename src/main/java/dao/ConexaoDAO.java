package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_emprestimoferramentas", "root", "1234");
        } catch (SQLException e) {
            // Exibe mensagem de erro detalhada e captura a exceção com descrição
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            // Exibe a pilha de erro para ajudar no diagnóstico
            return null;
        }
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
}
