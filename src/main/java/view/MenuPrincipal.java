package view;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBMenuSair = new javax.swing.JButton();
        JBMenuIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empréstimo de Ferrametas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBMenuSair.setText("SAIR");
        JBMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuSairActionPerformed(evt);
            }
        });
        getContentPane().add(JBMenuSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 140, 60));

        JBMenuIniciar.setText("INICIAR");
        JBMenuIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(JBMenuIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 140, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBMenuSairActionPerformed

    private void JBMenuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuIniciarActionPerformed
        MenuEscolhas objeto = new MenuEscolhas();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBMenuIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMenuIniciar;
    private javax.swing.JButton JBMenuSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
