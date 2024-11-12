package principal;

import dao.ConexaoDAO;
import view.MenuPrincipal;

public class Principal {
    public static void main(String[] args) {
        // Inicializa a janela principal do programa
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }