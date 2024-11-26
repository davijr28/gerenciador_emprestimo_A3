package view;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela alteração dos dados de uma ferramenta. Permite ao usuário
 * alterar o nome, a marca e o preço de uma ferramenta selecionada na tabela da classe
 * RelatoriosDeFerramentas.
 */
public class AlterarFerramenta extends javax.swing.JFrame {

    private RelatorioDeFerramenta objeto;

    /**
     * Construtor da classe AlterarFerramentas. Inicializa a interface gráfica,
     * e preenche os campos com os dados da ferramenta selecionada na tabela.
     *
     * @param objeto Objeto RelatorioDeFerramenta contendo a referência à
 tabela de relatório de ferramentas.
     */
    public AlterarFerramenta(RelatorioDeFerramenta objeto) {
        this.objeto = objeto; // Atribui o objeto recebido como parâmetro.
        initComponents();
        
        // Recupera o modelo da tabela e obtém a linha selecionada
        DefaultTableModel modelo = (DefaultTableModel) objeto.JTableFerramentas.getModel();
        int selectedRow = objeto.JTableFerramentas.getSelectedRow();
        
        // Preenche os campos com os dados da linha selecionada.
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALTERAÇÃO DE FERRAMENTAS");

        nome.setText("nome");

        marca.setText("marca");

        custo.setText("preço");

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setForeground(new java.awt.Color(0, 0, 0));
        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setForeground(new java.awt.Color(0, 0, 0));
        ok.setText("CONFIRMAR");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel2.setText("Novo nome da ferramenta:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel3.setText("Digite a nova marca:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel4.setText("Digite o novo valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(nome)
                        .addComponent(marca)
                        .addComponent(custo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
                if (objeto.objetoFerramenta.updateFerramentaBD(objeto.id, nome, marca, preco)) {
                    JOptionPane.showMessageDialog(null, "Ferramenta atualizada com Sucesso!");
                }
                // Exibe a ferramenta atualizada no console.
                System.out.println(objeto.objetoFerramenta.getFerramentas().toString());
            }
        } catch (HeadlessException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
     }//GEN-LAST:event_okActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nome;
    private javax.swing.JToggleButton ok;
    private javax.swing.JToggleButton voltar;
    // End of variables declaration//GEN-END:variables
}
