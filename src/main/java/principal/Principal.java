package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import view.MenuPrincipal;

public class Principal {

    public static void main(String[] args) {
        MenuPrincipal janela = new MenuPrincipal();
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        
        
        JPanel fullScreenPanel = new JPanel();
        fullScreenPanel.setLayout(new GridBagLayout());
        JPanel centralPanel = new JPanel();
        centralPanel.setPreferredSize(new Dimension(600, 600));
        centralPanel.setBackground(Color.decode("#EEEEEE"));
    }
}
