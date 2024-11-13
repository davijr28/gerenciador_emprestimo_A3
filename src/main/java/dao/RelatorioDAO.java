package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {
    
    private final ArrayList<RelatorioDAO> minhaLista = new ArrayList<>();
    private final ConexaoDAO db;
    
// Construtor da classe RelatorioDAO.
// Inicializa a conexão com o banco de dados.
    public ArrayList<RelatorioDAO> getTotais() {
        String query = "SELECT a.nome AS nome_amigo, f.nome AS nome_ferramenta, a.telefone AS telefone_amigo, f.preco AS preco " +
                       "FROM tb_emprestimos e " +
                       "JOIN tb_amigos a ON e.id_amigo = a.id " +
                       "JOIN tb_ferramentas f ON e.id_ferramenta = f.id " +
                       "ORDER BY nome_amigo;";
        getRelatorio(query);
        
        return minhaLista;
    }
