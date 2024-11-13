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
}