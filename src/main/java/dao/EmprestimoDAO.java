package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;

public class EmprestimoDAO {

    public ArrayList<Emprestimo> lista = new ArrayList<>();
    public Amigo objetoAmigo;
    public Ferramenta objetoFerramenta;

    private final ConexaoDAO dao = new ConexaoDAO();

    /**
     * Obtém a lista de totais dos empréstimos.
     *
     * @return ArrayList de Emprestimo contendo os dados dos empréstimos.
     */
    public ArrayList<Emprestimo> getEmprestimosLista() {
        lista.clear(); // Limpa a lista antes de preenchê-la com os dados mais recentes.
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
                while (res.next()) {
                    int idEmprestimo = res.getInt("id_emprestimo");
                    int idAmigo = res.getInt("id_amigo");
                    int idFerramenta = res.getInt("id_ferramenta");
                    Date dataEmprestimo = res.getDate("data_emprestimo");
                    Date dataDevolucao = res.getDate("data_devolucao");
                    boolean entregue = res.getBoolean("entregue");
                    Date dataFinalizado = res.getDate("data_finalizado");

                    // Inicializa os objetos Amigo e Ferramenta
                    Amigo amigo = new Amigo();
                    Ferramenta ferramenta = new Ferramenta();

                    // Carrega os dados dos objetos Amigo e Ferramenta a partir dos IDs
                    amigo = amigo.carregaAmigo(idAmigo);  // Retorna o objeto Amigo com os dados preenchidos
                    ferramenta = ferramenta.carregaFerramenta(idFerramenta);  // Retorna o objeto Ferramenta com os dados preenchidos

                    // Cria o objeto Emprestimo com os objetos carregados
                    Emprestimo objeto = new Emprestimo(idEmprestimo, amigo, ferramenta, dataEmprestimo,
                            dataDevolucao, entregue, dataFinalizado);
                    lista.add(objeto);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar a lista de empréstimos: " + ex.getMessage());
            ex.printStackTrace();
        }
        return lista;
    }

    public void setMinhaLista(ArrayList<Emprestimo> lista) {
        this.lista = lista;
    }

    public int maiorID() {
        int maiorID = 0;
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) AS id_emprestimo FROM tb_emprestimos");
                if (res.next()) {
                    maiorID = res.getInt("id_emprestimo"); // Obtém o maior ID.
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao obter o maior ID: " + ex.getMessage());
        }
        return maiorID;
    }

    public boolean insertEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimos (id_emprestimo, id_amigo, id_ferramenta, data_emprestimo, data_devolucao, entregue, data_finalizado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlAmigos = "UPDATE tb_amigos SET contador = contador + 1, emprestimo_ativo = true WHERE id_amigo = ?";
        String sqlFerramentas = "UPDATE tb_ferramentas SET emprestada = true WHERE id_ferramenta = ?";
        try {
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setInt(1, objeto.getId());
                stmt.setInt(2, objeto.objetoAmigo.getId());
                stmt.setInt(3, objeto.objetoFerramenta.getId());
                stmt.setDate(4, objeto.getDataEmprestimo());
                stmt.setDate(5, objeto.getDataDevolucao());
                stmt.setBoolean(6, false);
                stmt.setDate(7, null);
                stmt.execute(); // Executa a inserção no banco de dados.
            }
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sqlAmigos)) {
                stmt.setInt(1, objeto.objetoAmigo.getId());
                stmt.executeUpdate(); // Executa a atualização do amigo no banco de dados.
            }
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sqlFerramentas)) {
                stmt.setInt(1, objeto.objetoFerramenta.getId());
                stmt.executeUpdate(); // Executa a atualização da ferramenta no banco de dados.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            erro.printStackTrace();
            return false;
        }
    }

    public boolean updateEmprestimoBD(Emprestimo objeto) {
        String sqlEmprestimo = "UPDATE tb_emprestimos SET entregue = true, data_finalizado = ? WHERE id_emprestimo = ?";
        String sqlAmigos = "UPDATE tb_amigos SET emprestimo_ativo = false WHERE id_amigo = ?";
        String sqlFerramentas = "UPDATE tb_ferramentas SET emprestada = false WHERE id_ferramenta = ?";
        try {
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sqlEmprestimo)) {
                stmt.setDate(1, objeto.getDataFinalizado());
                stmt.setInt(2, objeto.getId());
                stmt.executeUpdate(); // Executa a atualização no banco de dados.
            } // Atualiza o status do empréstimo para finalizado.
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sqlAmigos)) {
                stmt.setInt(1, objeto.objetoAmigo.getId());
                stmt.executeUpdate(); // Executa a atualização no banco de dados.
            }
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sqlFerramentas)) {
                stmt.setInt(1, objeto.objetoFerramenta.getId());
                stmt.executeUpdate(); // Executa a atualização no banco de dados.
            }
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar amigo: " + erro.getMessage());
            erro.printStackTrace();
            return false;
        }
    }

    public Emprestimo carregaEmprestimo(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.objetoAmigo = new Amigo();
        objeto.objetoFerramenta = new Ferramenta();
        objeto.setId(id); // Define o ID do empréstimo.
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE id_emprestimo = " + id);
                if (res.next()) {
                    objeto.objetoAmigo.setId(res.getInt("id_amigo"));
                    objeto.objetoFerramenta.setId(res.getInt("id_ferramenta"));
                    objeto.setDataEmprestimo(res.getDate("data_emprestimo"));
                    objeto.setDataDevolucao(res.getDate("data_devolucao"));
                    objeto.setEntregue(res.getBoolean("entregue"));
                    objeto.setDataFinalizado(res.getDate("data_finalizado"));
                }
                objeto.objetoAmigo.carregaAmigo(objeto.objetoAmigo.getId());
                objeto.objetoFerramenta.carregaFerramenta(objeto.objetoFerramenta.getId());
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao carregar empréstimo: " + erro.getMessage());
            erro.printStackTrace();
        }
        return objeto;
    }
}
