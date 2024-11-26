package view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 * Classe responsável pela alteração dos dados de um amigo. Permite ao usuário
 * alterar o nome e telefone de um amigo selecionado na tabela da classe
 * RelatorioDeAmigo.
 */
public class AlterarAmigo extends javax.swing.JFrame {

    private RelatorioDeAmigo objeto;
    private MaskFormatter mftelefone; // Objeto para formatação da caixa de texto de telefone.

    /**
     * Construtor da classe AlterarAmigo. Inicializa os componentes da
     * interface gráfica e aplica uma máscara no campo de telefone para exibir o
     * número no formato específico.
     *
     * @param objeto Objeto RelatorioDeAmigo contendo a referência ao amigo
 selecionado na tabela de relatórios.
     */
    public AlterarAmigo(RelatorioDeAmigo objeto) {
        this.objeto = objeto; // Atribui o objeto recebido como parâmetro.
        initComponents();
        try {
            // Aplica a máscara para formatar o número de telefone conforme o padrão brasileiro.
            mftelefone = new MaskFormatter("+55 (##) #####-####");
            JTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mftelefone));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro inesperado.");
            e.printStackTrace();
        }
        // Recupera o modelo da tabela e obtém a linha selecionada.
        DefaultTableModel modelo = (DefaultTableModel) objeto.JTableAmigos.getModel();
        int selectedRow = objeto.JTableAmigos.getSelectedRow();

        // Preenche os campos de texto com os dados da linha selecionada na tabela.
        JTFNome.setText(modelo.getValueAt(selectedRow, 1).toString());
        JTFTelefone.setText(modelo.getValueAt(selectedRow, 2).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFNome = new javax.swing.JTextField();
        JTFTelefone = new javax.swing.JFormattedTextField(mftelefone);
        JBVoltar = new javax.swing.JToggleButton();
        JBConfirmar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALTERAÇÃO DE AMIGOS");

        JTFNome.setText("nome");

        JTFTelefone.setText("telefone");

        JBVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBVoltar.setText("VOLTAR");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JBConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        JBConfirmar.setForeground(new java.awt.Color(0, 0, 0));
        JBConfirmar.setText("CONFIRMAR");
        JBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConfirmarActionPerformed(evt);
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
                .addComponent(JBConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JBConfirmar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        objeto.carregarTabela();
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConfirmarActionPerformed
        try {
            // Lê e valida os dados inseridos na interface.
            String nome = "";
            String telefone = "";
            boolean validacao = true;

            if (this.JTFNome.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres.");
                validacao = false;
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFTelefone.getText().length() != 19) {
                JOptionPane.showMessageDialog(null, "Número de telefone deve conter DDD mais 9 dígitos.");
                validacao = false;
            } else {
                telefone = ((String) this.JTFTelefone.getValue()).substring(4);
            }
            if (validacao == true) {
                // Envia os dados para atualizar amigo.
                if (objeto.objetoAmigo.updateAmigoBD(objeto.id, nome, telefone, objeto.objetoAmigo.getContadorEmprestimos(), objeto.objetoAmigo.isEmprestimoAtivo())) {
                    JOptionPane.showMessageDialog(null, "Amigo atualizado com sucesso!");
                }
                // Exibe o amigo no console.
                System.out.println(objeto.objetoAmigo.getAmigos().toString());
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
    }//GEN-LAST:event_JBConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBConfirmar;
    private javax.swing.JToggleButton JBVoltar;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JFormattedTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
