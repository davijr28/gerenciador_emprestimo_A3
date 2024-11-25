package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável pela conexão com o banco de dados. Realiza a configuração
 * da conexão e oferece um método para obter conexão com o banco de dados.
 */
public class ConexaoDAO {

    // Credenciais de acesso ao banco de dados.
    private final String user = "root";
    private final String password = "1234";

    /**
     * Método para obter a conexão com o banco de dados. Carrega o driver JDBC e
     * tenta estabelecer a conexão com o banco de dados MySQL.
     *
     * @return Objeto Connection representando conexão com o banco de dados.
     * Retorna null se ocorrer algum erro
     */
    public Connection getConexao() {
        Connection connection;
        try {
            // Carrega o driver JDBC.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tenta estabelecer a conexão com o banco de dados utilizando as credenciais fornecidas.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_emprestimoferramentas?useTimezone=true&serverTimezone=UTC",
                    user, password
            );

            // Verifica se a conexão foi bem-sucedida.
            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível conectar!");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            // Trata a exceção caso o driver JDBC não seja encontrado.
            System.out.println("Driver não encontrado: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            // Trata exceções de erro de SQL.
            System.out.println("Não foi possível conectar: " + e.getMessage());
            return null;
        }
    }
}
