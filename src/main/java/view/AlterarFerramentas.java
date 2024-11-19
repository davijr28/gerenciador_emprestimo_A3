package view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlterarFerramentas extends javax.swing.JFrame {

    private RelatoriosDeFerramentas objeto;

    public AlterarFerramentas(RelatoriosDeFerramentas objeto) {
        this.objeto = objeto;
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) objeto.JTableFerramentas.getModel();
        int selectedRow = objeto.JTableFerramentas.getSelectedRow();
        nome.setText(modelo.getValueAt(selectedRow, 1).toString());
        marca.setText(modelo.getValueAt(selectedRow, 2).toString());
        custo.setText(modelo.getValueAt(selectedRow, 3).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        custo = new javax.swing.JTextField();
        voltar = new javax.swing.JToggleButton();
        ok = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("nome");

        marca.setText("marca");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        custo.setText("preço");

        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        ok.setText("ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(ok))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        objeto.carregarTabela();
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
            // Recebe e valida os dados inseridos.
            String nome = "";
            String marca = "";
            double preco = 0.0;
            boolean validacao = true;

            if (this.nome.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres.");
                validacao = false;
            } else {
                nome = this.nome.getText();
            }

            if (this.marca.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome da marca deve conter ao menos 2 caracteres.");
                validacao = false;
            } else {
                marca = this.marca.getText();
            }

            if (this.custo.getText().length() < 0.01) {
                JOptionPane.showMessageDialog(null, "O valor inserido deve ser maior que zero.");
                validacao = false;
            } else if (this.custo.getText().charAt(this.custo.getText().length() - 3) != '.') {
                JOptionPane.showMessageDialog(null, "O valor deve conter apenas 2 casas decimais.\n Utilize '.' para indicar valor decimal.");
                validacao = false;
            } else {
                preco = Double.parseDouble(this.custo.getText());
            }

            if (validacao == true) {
                // Envia os dados para serem atualizados.
                if (objeto.objetoferramenta.updateFerramentaBD(objeto.id, nome, marca, preco)) {
                    JOptionPane.showMessageDialog(null, "Ferramenta atualizada com Sucesso!");
                }
                // Exibe a ferramenta no console.
                System.out.println(objeto.objetoferramenta.getFerramentas().toString());
            }
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
     }//GEN-LAST:event_okActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custo;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nome;
    private javax.swing.JToggleButton ok;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
}
