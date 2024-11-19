package view;

public class RealizarEmprestimos extends javax.swing.JFrame {

    public RealizarEmprestimos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBRealizarEmprestimosVoltar = new javax.swing.JButton();
        JBNovosEmprestimos = new javax.swing.JButton();
        JBEmprestimosRealizados = new javax.swing.JButton();
        JBEmprestimosAtivos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Empréstimos");

        JBRealizarEmprestimosVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBRealizarEmprestimosVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBRealizarEmprestimosVoltar.setText("VOLTAR");
        JBRealizarEmprestimosVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBRealizarEmprestimosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRealizarEmprestimosVoltarActionPerformed(evt);
            }
        });

        JBNovosEmprestimos.setBackground(new java.awt.Color(255, 255, 255));
        JBNovosEmprestimos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBNovosEmprestimos.setForeground(new java.awt.Color(0, 0, 0));
        JBNovosEmprestimos.setText("Novos Empréstimos");
        JBNovosEmprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBNovosEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovosEmprestimosActionPerformed(evt);
            }
        });

        JBEmprestimosRealizados.setBackground(new java.awt.Color(255, 255, 255));
        JBEmprestimosRealizados.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBEmprestimosRealizados.setForeground(new java.awt.Color(0, 0, 0));
        JBEmprestimosRealizados.setText("Empréstimos Realizados");
        JBEmprestimosRealizados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEmprestimosRealizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmprestimosRealizadosActionPerformed(evt);
            }
        });

        JBEmprestimosAtivos.setBackground(new java.awt.Color(255, 255, 255));
        JBEmprestimosAtivos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JBEmprestimosAtivos.setForeground(new java.awt.Color(0, 0, 0));
        JBEmprestimosAtivos.setText("Empréstimos Ativos ");
        JBEmprestimosAtivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEmprestimosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmprestimosAtivosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REALIZAR EMPRÉSTIMOS ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(JBRealizarEmprestimosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBNovosEmprestimos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBEmprestimosRealizados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBEmprestimosAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBNovosEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEmprestimosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBEmprestimosAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JBRealizarEmprestimosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRealizarEmprestimosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRealizarEmprestimosVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBRealizarEmprestimosVoltarActionPerformed

    private void JBNovosEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovosEmprestimosActionPerformed
        NovosEmprestimos objeto = new NovosEmprestimos();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBNovosEmprestimosActionPerformed

    private void JBEmprestimosRealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmprestimosRealizadosActionPerformed
        EmprestimosRealizados objeto = new EmprestimosRealizados();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBEmprestimosRealizadosActionPerformed

    private void JBEmprestimosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmprestimosAtivosActionPerformed
        EmprestimosAtivos objeto = new EmprestimosAtivos();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBEmprestimosAtivosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmprestimosAtivos;
    private javax.swing.JButton JBEmprestimosRealizados;
    private javax.swing.JButton JBNovosEmprestimos;
    private javax.swing.JButton JBRealizarEmprestimosVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
