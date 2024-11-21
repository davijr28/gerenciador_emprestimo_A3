package view;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Amigo;
import model.Ferramenta;

public class NovosEmprestimos extends javax.swing.JFrame {

    private Ferramenta objetoferramenta;
    private Amigo objetoamigo;

    public NovosEmprestimos() {
        initComponents();
        this.objetoamigo = new Amigo();
        this.objetoferramenta = new Ferramenta();
        this.carregarAmigos();
        this.carregarFerramentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JBNovosEmpréstimosVoltar = new javax.swing.JButton();
        JBNovosEmprestimosCadastrar = new javax.swing.JButton();
        JCFerramentaEmprestada = new javax.swing.JComboBox<>();
        JCParaAmigo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTFDatadoEmprestimo = new javax.swing.JFormattedTextField();
        JTFDataDevolucao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NOVOS EMPRÉSTIMOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOVOS EMPRÉSTIMOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBNovosEmpréstimosVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBNovosEmpréstimosVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBNovosEmpréstimosVoltar.setText("VOLTAR");
        JBNovosEmpréstimosVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBNovosEmpréstimosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovosEmpréstimosVoltarActionPerformed(evt);
            }
        });

        JBNovosEmprestimosCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        JBNovosEmprestimosCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        JBNovosEmprestimosCadastrar.setText("CADASTRAR");
        JBNovosEmprestimosCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBNovosEmprestimosCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovosEmprestimosCadastrarActionPerformed(evt);
            }
        });

        JCFerramentaEmprestada.setModel(JCFerramentaEmprestada.getModel());
        JCFerramentaEmprestada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JCFerramentaEmprestada.setFocusable(false);

        JCParaAmigo.setFocusable(false);
        JCParaAmigo.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("Ferramenta Emprestada: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Para o amigo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setText("Data do Empréstimo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setText("Data Devolução:");

        JTFDatadoEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        JTFDatadoEmprestimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTFDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        JTFDataDevolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTFDataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(JBNovosEmpréstimosVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBNovosEmprestimosCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCFerramentaEmprestada, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFDatadoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JCParaAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCFerramentaEmprestada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JCParaAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTFDatadoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTFDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNovosEmpréstimosVoltar)
                    .addComponent(JBNovosEmprestimosCadastrar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBNovosEmpréstimosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovosEmpréstimosVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBNovosEmpréstimosVoltarActionPerformed

    private void JBNovosEmprestimosCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovosEmprestimosCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBNovosEmprestimosCadastrarActionPerformed

    private void JTFDataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataDevolucaoActionPerformed

    public void carregarFerramentas() {
        DefaultComboBoxModel modeloFerramentas = (DefaultComboBoxModel) this.JCFerramentaEmprestada.getModel();
        modeloFerramentas.setSelectedItem(0);
        ArrayList<Ferramenta> minhaLista = objetoferramenta.getFerramentas();
        if (minhaLista != null) {
            for (Ferramenta a : minhaLista) {
                modeloFerramentas.addElement(a.getNome());
            }
        }
    }

    public void carregarAmigos() {
        DefaultComboBoxModel modeloAmigos = (DefaultComboBoxModel) this.JCParaAmigo.getModel();
        modeloAmigos.setSelectedItem(0);
        ArrayList<Amigo> minhaLista = objetoamigo.getAmigos();
        if (minhaLista != null) {
            for (Amigo a : minhaLista) {
                modeloAmigos.addElement(a.getNome());
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovosEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBNovosEmprestimosCadastrar;
    private javax.swing.JButton JBNovosEmpréstimosVoltar;
    private javax.swing.JComboBox<String> JCFerramentaEmprestada;
    private javax.swing.JComboBox<String> JCParaAmigo;
    private javax.swing.JFormattedTextField JTFDataDevolucao;
    private javax.swing.JFormattedTextField JTFDatadoEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
