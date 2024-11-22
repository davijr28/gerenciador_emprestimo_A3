package view;

import javax.swing.JOptionPane;
import model.Ferramenta;

public class CadastroFerramentas extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta; // Declara um objeto da classe Ferramenta.

    public CadastroFerramentas() {
        initComponents();
        this.objetoFerramenta = new Ferramenta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBCadastroFerramentasVoltar = new javax.swing.JButton();
        JBCadastroFerramentasInserir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JFormattedTextField();
        JTFMarca = new javax.swing.JFormattedTextField();
        JTFCusto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE FERRAMENTAS");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE FERRAMENTAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Marca");

        JBCadastroFerramentasVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroFerramentasVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroFerramentasVoltar.setText("VOLTAR");
        JBCadastroFerramentasVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroFerramentasVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroFerramentasVoltarActionPerformed(evt);
            }
        });

        JBCadastroFerramentasInserir.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroFerramentasInserir.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroFerramentasInserir.setText("INSERIR");
        JBCadastroFerramentasInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroFerramentasInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroFerramentasInserirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Custo de Aquisição");

        JTFNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTFMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTFCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(JBCadastroFerramentasVoltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBCadastroFerramentasInserir)
                                    .addGap(29, 29, 29))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                            .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastroFerramentasVoltar)
                    .addComponent(JBCadastroFerramentasInserir))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastroFerramentasVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroFerramentasVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCadastroFerramentasVoltarActionPerformed

    private void JBCadastroFerramentasInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroFerramentasInserirActionPerformed
        try {
            // Lê e valida os dados inseridos na interface.
            String nome = "";
            String marca = "";
            double preco = 0.0;
            boolean validacao = true;

            if (this.JTFNome.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome deve conter ao menos 2 caracteres.");
                validacao = false;
            } else {
                nome = this.JTFNome.getText();
            }
            if (this.JTFMarca.getText().length() < 2) {
                JOptionPane.showMessageDialog(null, "Nome da marca deve conter 2 caracteres.");
                validacao = false;
            } else {
                marca = this.JTFMarca.getText();
            }
            if (this.JTFCusto.getText().length() < 0.01) {
                JOptionPane.showMessageDialog(null, "Valor do custo deve ser maior que zero.");
                validacao = false;
            } else if (this.JTFCusto.getText().charAt(this.JTFCusto.getText().length() - 3) != '.') {
                JOptionPane.showMessageDialog(null, "O valor deve conter apenas 2 casas decimais.\n Utilize '.' para indicar valor decimal.");
                validacao = false;
            } else {
                preco = Double.parseDouble(this.JTFCusto.getText());
            }

            if (validacao == true) {
                // Envia os dados para cadastrar
                if (this.objetoFerramenta.insertFerramentaBD(nome, marca, preco, false)) {
                    JOptionPane.showMessageDialog(null, "Ferramenta cadastrada com sucesso!");
                    // Limpa as caixas de texto
                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFCusto.setText("");
                }
                // Exibe o amigo cadastrado no console
                System.out.println(this.objetoFerramenta.getFerramentas().toString());
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
        }    }//GEN-LAST:event_JBCadastroFerramentasInserirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastroFerramentasInserir;
    private javax.swing.JButton JBCadastroFerramentasVoltar;
    private javax.swing.JFormattedTextField JTFCusto;
    private javax.swing.JFormattedTextField JTFMarca;
    private javax.swing.JFormattedTextField JTFNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
