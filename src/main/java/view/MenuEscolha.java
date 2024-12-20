package view;

/**
 * Classe responsável por exibir as opções do menu para o usuário.
 */
public class MenuEscolha extends javax.swing.JFrame {

    /**
     * Construtor da classe MenuEscolha.
     */
    public MenuEscolha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        JBCadastroFerramentas = new javax.swing.JButton();
        JBCadastroAmigos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBRelatoriosGerais = new javax.swing.JButton();
        JBMenuEscolhasVoltar = new javax.swing.JButton();
        JBRealizarEmprestimos = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton6.setText("Cadastro de Amigos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIADOR");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JBCadastroFerramentas.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroFerramentas.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBCadastroFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroFerramentas.setText("Cadastro de Ferramentas");
        JBCadastroFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroFerramentasActionPerformed(evt);
            }
        });

        JBCadastroAmigos.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroAmigos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBCadastroAmigos.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroAmigos.setText("Cadastro de Amigos");
        JBCadastroAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroAmigosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERENCIADOR DE CADASTROS E RELATÓRIOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBRelatoriosGerais.setBackground(new java.awt.Color(255, 255, 255));
        JBRelatoriosGerais.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBRelatoriosGerais.setForeground(new java.awt.Color(0, 0, 0));
        JBRelatoriosGerais.setText("Relatórios Gerais");
        JBRelatoriosGerais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRelatoriosGerais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRelatoriosGeraisActionPerformed(evt);
            }
        });

        JBMenuEscolhasVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBMenuEscolhasVoltar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBMenuEscolhasVoltar.setForeground(new java.awt.Color(255, 51, 51));
        JBMenuEscolhasVoltar.setText("VOLTAR");
        JBMenuEscolhasVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuEscolhasVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuEscolhasVoltarActionPerformed(evt);
            }
        });

        JBRealizarEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        JBRealizarEmprestimos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBRealizarEmprestimos.setForeground(new java.awt.Color(0, 0, 0));
        JBRealizarEmprestimos.setText("Realizar Empréstimos ");
        JBRealizarEmprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRealizarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRealizarEmprestimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBCadastroAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRealizarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBCadastroFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRelatoriosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(JBMenuEscolhasVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCadastroFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadastroAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBRelatoriosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBRealizarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(JBMenuEscolhasVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastroFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroFerramentasActionPerformed
        CadastroFerramenta objeto = new CadastroFerramenta();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBCadastroFerramentasActionPerformed

    private void JBCadastroAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroAmigosActionPerformed
        CadastroAmigo objeto = new CadastroAmigo();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBCadastroAmigosActionPerformed

    private void JBRelatoriosGeraisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRelatoriosGeraisActionPerformed
        RelatorioGeral objeto = new RelatorioGeral();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBRelatoriosGeraisActionPerformed

    private void JBMenuEscolhasVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuEscolhasVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBMenuEscolhasVoltarActionPerformed

    private void JBRealizarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRealizarEmprestimosActionPerformed
        RealizarEmprestimo objeto = new RealizarEmprestimo();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBRealizarEmprestimosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEscolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastroAmigos;
    private javax.swing.JButton JBCadastroFerramentas;
    private javax.swing.JButton JBMenuEscolhasVoltar;
    private javax.swing.JButton JBRealizarEmprestimos;
    private javax.swing.JButton JBRelatoriosGerais;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
