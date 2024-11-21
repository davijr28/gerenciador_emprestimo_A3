package view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class AlterarAmigos extends javax.swing.JFrame {

    private RelatoriosDeAmigos objeto;
    private MaskFormatter mftelefone;

    public AlterarAmigos(RelatoriosDeAmigos objeto) {
        this.objeto = objeto;
        initComponents();
        try {
            mftelefone = new MaskFormatter("+55 (##) #####-####");
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mftelefone));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro inesperado.");
            e.printStackTrace();
        }
        DefaultTableModel modelo = (DefaultTableModel) objeto.JTableAmigos.getModel();
        int selectedRow = objeto.JTableAmigos.getSelectedRow();
        nome.setText(modelo.getValueAt(selectedRow, 1).toString());
        telefone.setText(modelo.getValueAt(selectedRow, 2).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        telefone = new javax.swing.JFormattedTextField(mftelefone);
        JBVoltar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALTERAÇÃO DE AMIGOS");

        nome.setText("nome");
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        telefone.setText("telefone");

        JBVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBVoltar.setText("VOLTAR");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setText("CONFIRMAR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel1.setText("Digite o novo telefone:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel2.setText("Digite o novo nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(jToggleButton2))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        objeto.carregarTabela();
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try {
            // Lê e valida os dados inseridos na interface.
            String nome = "";
            String telefone = "";
            boolean validacao = true;

            if (this.nome.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres.");
                validacao = false;
            } else {
                nome = this.nome.getText();
            }
            if (this.telefone.getText().length() != 19) {
                JOptionPane.showMessageDialog(null, "Número de telefone deve conter DDD mais 9 dígitos.");
                validacao = false;
            } else {
                telefone = ((String) this.telefone.getValue()).substring(4);
            }
            if (validacao == true) {
                // Envia os dados para atualizar amigo.
                if (objeto.objetoamigo.updateAmigoBD(objeto.id, nome, telefone)) {
                    JOptionPane.showMessageDialog(null, "Amigo atualizado com sucesso!");
                }
                // Exibe o amigo no console.
                System.out.println(objeto.objetoamigo.getAmigos().toString());
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Erro: Objeto não inicializado corretamente.");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField nome;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
