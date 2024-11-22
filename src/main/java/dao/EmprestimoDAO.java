package dao;

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
                ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) AS id_emprestimo FROM tb_emprestimoferramentas");
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
        String sql = "INSERT INTO tb_emprestimoferramentas (id_emprestimo, id_amigo, id_ferramenta, data_emprestimo, data_devolucao, entregue, data_finalizado) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            return false;
        }
    }

    public boolean updateEmprestimoBD(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimoferramentas SET entregue = ?, data_finalizado = ?, WHERE id_emprestimo = ?";
        try {
            try ( PreparedStatement stmt = dao.getConexao().prepareStatement(sql)) {
                stmt.setBoolean(1, true);
                stmt.setDate(2, objeto.getDataFinalizado());
                stmt.setInt(3, objeto.getId());
                stmt.execute(); // Executa a atualização no banco de dados.
            } // Atualiza o status do empréstimo para finalizado.
            return true;
        } catch (SQLException erro) {
            System.out.println("Erro ao atualizar amigo: " + erro.getMessage());
            erro.printStackTrace();
            return false;
        }
    }

    public Emprestimo carregaEmprestimo(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setId(id); // Define o ID do empréstimo.
        try {
            try ( Statement stmt = dao.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimoferramentas WHERE id_emprestimo = " + id);
                if (res.next()) {
                    objeto.objetoAmigo.setId(res.getInt("id_amigo"));
                    objeto.objetoFerramenta.setId(res.getInt("id_ferramenta"));
                    objeto.setDataEmprestimo(res.getDate("data_emprestimo"));
                    objeto.setDataDevolucao(res.getDate("data_devolucao"));
                    objeto.setEntregue(res.getBoolean("entregue"));
                    objeto.setDataFinalizado(res.getDate("data_finalizado"));
                }
            }
        } catch (SQLException erro) {
            System.out.println("Erro ao carregar amigo: " + erro.getMessage());
            erro.printStackTrace();
        }
        return objeto;
    }
}
