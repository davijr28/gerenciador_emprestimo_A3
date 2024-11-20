package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import view.MenuPrincipal;

/**
 * Classe principal do sistema que inicializa a aplicação.
 */
public class Principal {

    /**
     * Método principal que executa o programa.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        /** Cria a janela principal do menu */
        MenuPrincipal janela = new MenuPrincipal();
        
        /** Torna a janela visível */
        janela.setVisible(true);
        
        /** Centraliza a janela na tela */
        janela.setLocationRelativeTo(null);

        /** Painel para ocupar a tela inteira */
        JPanel fullScreenPanel = new JPanel();
        /** Define o layout do painel como GridBagLayout */
        fullScreenPanel.setLayout(new GridBagLayout());

        /** Painel central com dimensões fixas e cor de fundo */
        JPanel centralPanel = new JPanel();
        centralPanel.setPreferredSize(new Dimension(600, 600));
        /** Define o tamanho preferido do painel central */
        centralPanel.setBackground(Color.decode("#EEEEEE"));
        /** Define a cor de fundo do painel central */
    }
}