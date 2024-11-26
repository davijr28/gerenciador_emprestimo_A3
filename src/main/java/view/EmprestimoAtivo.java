package view;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Emprestimo;

/**
 * Classe responsável por exibir os empréstimos ativos. Permite visualizar,
 * gerenciar e concluir empréstimos de ferramentas.
 */
public class EmprestimoAtivo extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimo;
    private Calendar calendario = Calendar.getInstance();
    private Date hoje = new Date(calendario.getTimeInMillis()); // Define a data atual.

    /**
     * Construtor da classe EmprestimosAtivo. Inicializa os componentes e
     * carrega a tabela de empréstimos ativos.
     */
    public EmprestimoAtivo() {
        initComponents();
        this.objetoEmprestimo = new Emprestimo(); // Cria um novo objeto Emprestimo.
        this.carregarTabela(); // Carrega os empréstimos ativos na tabela.
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Amigo", "Ferramenta", "Data do Empréstimo", "Data de Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        // Verifica se um empréstimo foi selecionado.
        if (this.JTTabelaEmprestimoAtivos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Primeiro selecione uma ferramenta para receber.");
        } else {
            // Confirma a ação do usuário.
            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja receber esta ferramenta e concluir o empréstimo?", "Confirmar Finalização", JOptionPane.YES_NO_OPTION);
            if (respostaUsuario == 0) {
                int id = Integer.parseInt(this.JTTabelaEmprestimoAtivos.getValueAt(this.JTTabelaEmprestimoAtivos.getSelectedRow(), 0).toString());
                Emprestimo objeto = objetoEmprestimo.carregaEmprestimo(id);
                if (objeto.updateEmprestimoBD(id, hoje)) {
                    JOptionPane.showMessageDialog(null, "Empréstimo finalizado com sucesso!");
                    this.carregarTabela(); // Recarrega os empréstimos ativos.
                }
            }
        }
    }//GEN-LAST:event_JBEmprestimosAtivosReceberActionPerformed

    // Método para carregar a tabela de empréstimos ativos.
    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTTabelaEmprestimoAtivos.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela.

        // Carrega a lista de empréstimos.
        ArrayList<Emprestimo> minhaLista = objetoEmprestimo.getEmprestimos();
        for (Emprestimo a : minhaLista) {
            if (a.isEntregue() == false) { // Verifica se o empréstimo está ativo
                modelo.addRow(new Object[]{
                    a.getId(),
                    a.objetoAmigo.getNome(),
                    a.objetoFerramenta.getNome(),
                    a.getDataEmprestimo(),
                    a.getDataDevolucao(),});
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmprestimoAtivo().setVisible(true);
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
