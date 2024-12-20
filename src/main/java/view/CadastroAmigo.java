package view;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Amigo;

/**
 * Classe responsável pelo cadastro de novos amigos. Esta classe permite que o
 * usuário insira o nome e telefone de um amigo, aplicando uma máscara ao campo
 * de telefone e validando os dados antes de salvar no banco de dados.
 */
public class CadastroAmigo extends javax.swing.JFrame {

    private Amigo objetoAmigo; // Declara um objeto da classe Amigo.
    private MaskFormatter mftelefone; // Objeto para formatação da caixa de texto de telefone.

    /**
     * Construtor da classe CadastroAmigo. Inicializa os componentes e
     * configura a máscara para o campo de telefone.
     */
    public CadastroAmigo() {
        initComponents();
        this.objetoAmigo = new Amigo(); // Cria um novo objeto Amigo para o cadastro.
        try {
            // Define a máscara de telefone para o formato brasileiro.
            mftelefone = new MaskFormatter("+55 (##) #####-####");
            JTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mftelefone));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro inesperado.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBCadastroAmigosVoltar = new javax.swing.JButton();
        JBCadastroAmigosInserir = new javax.swing.JButton();
        JTFNome = new javax.swing.JFormattedTextField();
        JTFTelefone = new javax.swing.JFormattedTextField(mftelefone);
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE AMIGOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE AMIGOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Telefone");

        JBCadastroAmigosVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroAmigosVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroAmigosVoltar.setText("VOLTAR");
        JBCadastroAmigosVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroAmigosVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroAmigosVoltarActionPerformed(evt);
            }
        });

        JBCadastroAmigosInserir.setBackground(new java.awt.Color(255, 255, 255));
        JBCadastroAmigosInserir.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastroAmigosInserir.setText("INSERIR");
        JBCadastroAmigosInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastroAmigosInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastroAmigosInserirActionPerformed(evt);
            }
        });

        JTFNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        JTFTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(JBCadastroAmigosVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(JBCadastroAmigosInserir)
                .addGap(92, 92, 92))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160))
                    .addComponent(JTFNome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(147, 147, 147)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCadastroAmigosVoltar)
                    .addComponent(JBCadastroAmigosInserir))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCadastroAmigosVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroAmigosVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBCadastroAmigosVoltarActionPerformed

    private void JBCadastroAmigosInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastroAmigosInserirActionPerformed
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
                // Envia os dados para cadastrar
                if (this.objetoAmigo.insertAmigoBD(nome, telefone, 0)) {
                    JOptionPane.showMessageDialog(null, "Amigo cadastrado com sucesso!");
                    // Limpa as caixas de texto
                    this.JTFNome.setText("");
                    this.JTFTelefone.setText("");
                }
                // Exibe o amigo cadastrado no console
                System.out.println(this.objetoAmigo.getAmigos().toString());
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
    }//GEN-LAST:event_JBCadastroAmigosInserirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastroAmigosInserir;
    private javax.swing.JButton JBCadastroAmigosVoltar;
    private javax.swing.JFormattedTextField JTFNome;
    private javax.swing.JFormattedTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}
