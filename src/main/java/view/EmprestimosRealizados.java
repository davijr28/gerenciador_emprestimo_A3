package view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import model.Emprestimo;

public class EmprestimosRealizados extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;
    private Calendar calendario = Calendar.getInstance();
    private Date hoje = new Date(calendario.getTimeInMillis());

    public EmprestimosRealizados() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo();
        this.carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTTabelaEmprestimoRealizados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBEmprestimosRealizadosVoltar = new javax.swing.JButton();
        JTFTotaldeEmprestimosRealizados = new javax.swing.JTextField();
        JTFQuemFezMaisEmprestimos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTTabelaQuemNuncaDevolveu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRÉSTIMOS REALIZADOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPRÉSTIMOS REALIZADOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JTTabelaEmprestimoRealizados.setBackground(new java.awt.Color(255, 255, 255));
        JTTabelaEmprestimoRealizados.setForeground(new java.awt.Color(0, 0, 0));
        JTTabelaEmprestimoRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Amigo", "Ferramenta", "Data Inicial", "Data Final", "Data de Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTTabelaEmprestimoRealizados);

        jLabel2.setText("Total de Empréstimos Realizados:");

        jLabel3.setText("Quem fez mais Empréstimos:");

        JBEmprestimosRealizadosVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBEmprestimosRealizadosVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBEmprestimosRealizadosVoltar.setText("VOLTAR");
        JBEmprestimosRealizadosVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEmprestimosRealizadosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEmprestimosRealizadosVoltarActionPerformed(evt);
            }
        });

        JTFTotaldeEmprestimosRealizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFTotaldeEmprestimosRealizadosActionPerformed(evt);
            }
        });

        JTFQuemFezMaisEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQuemFezMaisEmprestimosActionPerformed(evt);
            }
        });

        jLabel4.setText("Quem nunca devolveu:");

        JTTabelaQuemNuncaDevolveu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Amigo", "Ferramenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTTabelaQuemNuncaDevolveu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFTotaldeEmprestimosRealizados))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFQuemFezMaisEmprestimos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBEmprestimosRealizadosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFTotaldeEmprestimosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTFQuemFezMaisEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(JBEmprestimosRealizadosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBEmprestimosRealizadosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEmprestimosRealizadosVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBEmprestimosRealizadosVoltarActionPerformed

    private void JTFTotaldeEmprestimosRealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFTotaldeEmprestimosRealizadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFTotaldeEmprestimosRealizadosActionPerformed

    private void JTFQuemFezMaisEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQuemFezMaisEmprestimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQuemFezMaisEmprestimosActionPerformed

    public void carregarTabela() {
        DefaultTableModel modeloFinalizados = (DefaultTableModel) this.JTTabelaEmprestimoRealizados.getModel();
        DefaultTableModel modeloNaoDevolvidos = (DefaultTableModel) this.JTTabelaQuemNuncaDevolveu.getModel();
        modeloFinalizados.setNumRows(0); // Posiciona na primeira linha da tabela.
        modeloNaoDevolvidos.setNumRows(0);
        // Carrega a lista de Empréstimos.
        ArrayList<Emprestimo> minhaLista = objetoEmprestimo.getEmprestimos();
        for (Emprestimo a : minhaLista) {
            if (a.isEntregue()) {
                modeloFinalizados.addRow(new Object[]{
                    a.getId(),
                    a.objetoAmigo.getNome(),
                    a.objetoFerramenta.getNome(),
                    a.getDataEmprestimo(),
                    a.getDataDevolucao(),
                    a.getDataFinalizado()
                });
            } else if (a.getDataDevolucao().before(hoje)) {
                modeloNaoDevolvidos.addRow(new Object[]{
                    a.objetoAmigo.getNome(),
                    a.objetoFerramenta.getNome()
                });
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimosRealizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBEmprestimosRealizadosVoltar;
    private javax.swing.JTextField JTFQuemFezMaisEmprestimos;
    private javax.swing.JTextField JTFTotaldeEmprestimosRealizados;
    private javax.swing.JTable JTTabelaEmprestimoRealizados;
    private javax.swing.JTable JTTabelaQuemNuncaDevolveu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
