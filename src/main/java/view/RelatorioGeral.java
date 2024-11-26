package view;

/**
 * Classe responsável por exibir ao usuário opções para relatórios de
 * ferramentas ou de amigos.
 */
public class RelatorioGeral extends javax.swing.JFrame {

    /**
     * Construtor da classe RelatorioGeral.
     */
    public RelatorioGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBRelatoriosGeraisVoltar = new javax.swing.JButton();
        JBRelatoriosDeAmigos = new javax.swing.JButton();
        JBRelatoriosDeFerramentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RELATÓRIOS GERAIS");

        JBRelatoriosGeraisVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBRelatoriosGeraisVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBRelatoriosGeraisVoltar.setText("VOLTAR");
        JBRelatoriosGeraisVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRelatoriosGeraisVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatoriosGeraisVoltarActionPerformed(evt);
            }
        });

        JBRelatoriosDeAmigos.setBackground(new java.awt.Color(255, 255, 255));
        JBRelatoriosDeAmigos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBRelatoriosDeAmigos.setForeground(new java.awt.Color(0, 0, 0));
        JBRelatoriosDeAmigos.setText("Relatórios de Amigos");
        JBRelatoriosDeAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRelatoriosDeAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatoriosDeAmigosActionPerformed(evt);
            }
        });

        JBRelatoriosDeFerramentas.setBackground(new java.awt.Color(255, 255, 255));
        JBRelatoriosDeFerramentas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBRelatoriosDeFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        JBRelatoriosDeFerramentas.setText("Relatórios de Ferramentas");
        JBRelatoriosDeFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRelatoriosDeFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatoriosDeFerramentasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIOS GERAIS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(JBRelatoriosGeraisVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBRelatoriosDeFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBRelatoriosDeAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBRelatoriosDeFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(JBRelatoriosDeAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(JBRelatoriosGeraisVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRelatoriosGeraisVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatoriosGeraisVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBRelatoriosGeraisVoltarActionPerformed

    private void JBRelatoriosDeAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatoriosDeAmigosActionPerformed
        RelatorioDeAmigo objeto = new RelatorioDeAmigo();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBRelatoriosDeAmigosActionPerformed

    private void JBRelatoriosDeFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatoriosDeFerramentasActionPerformed
        RelatorioDeFerramenta objeto = new RelatorioDeFerramenta();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBRelatoriosDeFerramentasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBRelatoriosDeAmigos;
    private javax.swing.JButton JBRelatoriosDeFerramentas;
    private javax.swing.JButton JBRelatoriosGeraisVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
