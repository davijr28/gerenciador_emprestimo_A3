package view;

public class EmprestimosAtivos extends javax.swing.JFrame {

    public EmprestimosAtivos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTabelaEmprestimoAtivos = new javax.swing.JTable();
        JBEmprestimosAtivosVoltar = new javax.swing.JButton();
        JBEmprestimosAtivosReceber = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRÉSTIMOS ATIVOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPRÉSTIMOS ATIVOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTTabelaEmprestimoAtivos.setBackground(new java.awt.Color(255, 255, 255));
        JTTabelaEmprestimoAtivos.setForeground(new java.awt.Color(0, 0, 0));
        JTTabelaEmprestimoAtivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Amigo", "Ferramenta", "Data de Empréstimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTTabelaEmprestimoAtivos);

        JBEmprestimosAtivosVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBEmprestimosAtivosVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBEmprestimosAtivosVoltar.setText("VOLTAR");
        JBEmprestimosAtivosVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEmprestimosAtivosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmprestimosAtivosVoltarActionPerformed(evt);
            }
        });

        JBEmprestimosAtivosReceber.setBackground(new java.awt.Color(255, 255, 255));
        JBEmprestimosAtivosReceber.setForeground(new java.awt.Color(0, 0, 0));
        JBEmprestimosAtivosReceber.setText("RECEBER");
        JBEmprestimosAtivosReceber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEmprestimosAtivosReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmprestimosAtivosReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(JBEmprestimosAtivosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(JBEmprestimosAtivosReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEmprestimosAtivosVoltar)
                    .addComponent(JBEmprestimosAtivosReceber))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBEmprestimosAtivosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmprestimosAtivosVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBEmprestimosAtivosVoltarActionPerformed

    private void JBEmprestimosAtivosReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmprestimosAtivosReceberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBEmprestimosAtivosReceberActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimosAtivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmprestimosAtivosReceber;
    private javax.swing.JButton JBEmprestimosAtivosVoltar;
    private javax.swing.JTable JTTabelaEmprestimoAtivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
