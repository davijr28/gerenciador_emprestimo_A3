package principal;

import view.MenuPrincipal;

/**
 * Classe principal do sistema que inicializa a aplicação e exibe janela
 * principal do menu.
 */
public class Principal {

    /**
     * Método principal que executa o programa.
     *
     * @param args Argumentos de linha de comando (não utilizados neste
     * programa).
     */
    public static void main(String[] args) {

        /**
         * Cria uma instância da janela principal do menu, que serve como
         * interface inicial do sistema e permite que o usuário interaja com as
         * funcionalidades do programa.
         */
        MenuPrincipal janela = new MenuPrincipal();

        /**
         * Torna a janela visível para o usuário, permitindo que a interface
         * gráfica do sistema seja exibida na tela.
         */
        janela.setVisible(true);

        /**
         * Centraliza a janela na tela do computador.
         */
        janela.setLocationRelativeTo(null);
    }
}
