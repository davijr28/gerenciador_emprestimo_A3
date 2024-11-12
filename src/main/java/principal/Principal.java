package principal;

import dao.ConexaoDAO;
import view.MenuPrincipal;

public class Principal {

    public static void main(String[] args) {
        try {
            // Inicializa a janela principal do programa
            MenuPrincipal janela = new MenuPrincipal();
            janela.setVisible(true);
            janela.setLocationRelativeTo(null);

            // Tentativa de conexão com o db
            ConexaoDAO conexaoDAO = new ConexaoDAO();
            if (conexaoDAO.getConnection() != null) {
                System.out.println("Conectado com Sucesso");
            } else {
                System.out.println("Falha ao conectar: Retorno da conexão é nulo");
            }
        } catch (Exception e) {
            // diagnóstico de erro
            System.out.println("Programa não conectado: " + e.getMessage());
            // detalhes do erro para diagnóstico
        }
    }
}
