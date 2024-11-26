package view;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.*;

/**
 * Classe responsável pela interface gráfica e lógica de cadastro de novos
 * empréstimos de ferramentas. Permite ao usuário registrar um novo empréstimo
 * de ferramenta para um amigo, definindo uma data de realização do empréstimo e
 * uma data para devolução da ferramenta.
 */
public class NovoEmprestimo extends javax.swing.JFrame {

    private Ferramenta objetoFerramenta;
    private Amigo objetoAmigo;
    private Emprestimo objetoEmprestimo;
    private MaskFormatter mfdata; // Formatador da caixa de texto
    Date hoje = new Date(System.currentTimeMillis()); // Data atual

    /**
     * Construtor da classe NovosEmprestimo. Inicializa os objetos e configura
     * os campos de data.
     */
    public NovoEmprestimo() {
        initComponents();
        this.objetoAmigo = new Amigo();
        this.objetoFerramenta = new Ferramenta();
        this.objetoEmprestimo = new Emprestimo();
        this.carregarAmigos(); // Carrega os amigos para o ComboBox
        this.carregarFerramentas(); // Carrega as ferramentas disponíveis para o ComboBox
        try {
            mfdata = new MaskFormatter("####-##-##"); // Define o formato da data (AAAA-MM-DD).
            JTFDatadoEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mfdata));
            JTFDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mfdata));
        } catch (ParseException e) {
            System.out.println("Ocorreu um erro inesperado.");
            e.printStackTrace();
        }
        this.JTFDatadoEmprestimo.setText(hoje.toString()); // Define a data atual no campo de data de empréstimo.
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

        JCFerramentaEmprestada.setMaximumRowCount(50);
        JCFerramentaEmprestada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JCFerramentaEmprestada.setFocusable(false);

        JCParaAmigo.setMaximumRowCount(50);
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
                        .addComponent(JCFerramentaEmprestada, 0, 161, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(JCParaAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        try {
            // Lê e valida os dados inseridos na interface.
            Ferramenta ferramenta = new Ferramenta();
            Amigo amigo = new Amigo();
            String dataEmprestimo = this.JTFDatadoEmprestimo.getText();
            Date dataEmprestimoDate = stringToDate(dataEmprestimo);
            String dataDevolucao = this.JTFDataDevolucao.getText();
            Date dataDevolucaoDate = stringToDate(dataDevolucao);
            boolean validacao = true;

            if (this.JCFerramentaEmprestada.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma ferramenta para emprestar.");
                validacao = false;
            } else {
                String idFerramenta = (String) this.JCFerramentaEmprestada.getSelectedItem();
                int indice = idFerramenta.indexOf("-");
                idFerramenta = idFerramenta.substring(4, indice);
                ferramenta = ferramenta.carregaFerramenta(Integer.parseInt(idFerramenta));
            }

            if (this.JCParaAmigo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um amigo para emprestar a ferramenta.");
                validacao = false;
            } else {
                String idAmigo = (String) this.JCParaAmigo.getSelectedItem();
                int indice = idAmigo.indexOf("-");
                idAmigo = idAmigo.substring(4, indice);
                amigo = amigo.carregaAmigo(Integer.parseInt(idAmigo));
            }

            if (!isDataValida(dataEmprestimo)) {
                JOptionPane.showMessageDialog(null, "Data de Empréstimo inválida.\nInsira uma data válida no formato AAAA-MM-DD.");
                validacao = false;
            } else {
                // Verificar se a data de empréstimo é menor ou igual à data atual
                if (dataEmprestimoDate.after(hoje)) {
                    JOptionPane.showMessageDialog(null, "A data de empréstimo não pode ser maior que a data atual.");
                    validacao = false;
                }
            }

            if (!isDataValida(dataDevolucao)) {
                JOptionPane.showMessageDialog(null, "Data de Devolução inválida.\nInsira uma data válida no formato AAAA-MM-DD.");
                validacao = false;
            } else {
                if (dataDevolucaoDate.before(hoje)) {
                    JOptionPane.showMessageDialog(null, "A data de devolução deve ser maior que a data atual.");
                    validacao = false;
                } else if (dataDevolucaoDate.before(dataEmprestimoDate)) {
                    JOptionPane.showMessageDialog(null, "A data de devolução deve ser maior que a data de empréstimo.");
                    validacao = false;
                }
            }

            if (validacao == true) {
                if (amigo.isEmprestimoAtivo()) {
                    // Confirma a ação do usuário.
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Este amigo já possui um empréstimo ativo, deseja cadastrar mesmo assim?", "Confirmar Cadastro", JOptionPane.YES_NO_OPTION);
                    if (respostaUsuario == 0) {
                        // Envia os dados para cadastrar o empréstimo
                        if (this.objetoEmprestimo.insertEmprestimoBD(amigo, ferramenta, dataEmprestimoDate, dataDevolucaoDate)) {
                            JOptionPane.showMessageDialog(null, "Empréstimo cadastrado com sucesso!");
                        }
                    }
                } else {
                    if (this.objetoEmprestimo.insertEmprestimoBD(amigo, ferramenta, dataEmprestimoDate, dataDevolucaoDate)) {
                        JOptionPane.showMessageDialog(null, "Empréstimo cadastrado com sucesso!");
                    }

                }
                // Limpa as caixas de texto.
                this.JCFerramentaEmprestada.setSelectedItem("Selecione");
                this.JCParaAmigo.setSelectedItem("Selecione");
                this.JTFDatadoEmprestimo.setText(hoje.toString());
                this.JTFDataDevolucao.setText("");

                // Carrega a lista de ferramentas atualizada.
                this.carregarFerramentas();
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
    }//GEN-LAST:event_JBNovosEmprestimosCadastrarActionPerformed

    /**
     * Carrega as ferramentas disponíveis que não estão emprestadas no
     * JComboBox. A lista de ferramentas é obtida e cada ferramenta não
     * emprestada é adicionada ao modelo do JComboBox para que o usuário possa
     * selecionar.
     */
    public void carregarFerramentas() {
        DefaultComboBoxModel modeloFerramentas = (DefaultComboBoxModel) this.JCFerramentaEmprestada.getModel();
        modeloFerramentas.removeAllElements();// Remove todos os elementos do ComboBox.
        modeloFerramentas.setSelectedItem("Selecione"); // Define a opção padrão como "Selecione".

        // Obtém a lista de ferramentas
        ArrayList<Ferramenta> minhaLista = objetoFerramenta.getFerramentas();
        if (minhaLista != null) { // Verifica se a lista não está vazia.
            for (Ferramenta a : minhaLista) {
                if (a.isEmprestada() == false) { // Verifica se a ferramenta está disponível.
                    modeloFerramentas.addElement("ID: " + a.getId() + "-  " + a.getNome()); // Adiciona ferramenta à lista do ComboBox.
                }
            }
        }
    }

    /**
     * Carrega a lista de amigos no JComboBox. A lista de amigos é obtida e cada
     * amigo é adicionado ao modelo do JComboBox para que o usuário possa
     * selecionar.
     */
    public void carregarAmigos() {
        DefaultComboBoxModel modeloAmigos = (DefaultComboBoxModel) this.JCParaAmigo.getModel();
        modeloAmigos.removeAllElements(); // Remove todos os elementos do ComboBox.
        modeloAmigos.setSelectedItem("Selecione"); // Define a opção padrão como "Selecione".

        //Obtém a lista de amigos.
        ArrayList<Amigo> minhaLista = objetoAmigo.getAmigos();
        if (minhaLista != null) { // Verifica se a lista não está vazia.
            for (Amigo a : minhaLista) {
                modeloAmigos.addElement("ID: " + a.getId() + "-  " + a.getNome()); // Adiciona o amigo à lista do ComboBox.
            }
        }
    }

    /**
     * Converte uma string no formato "yyyy-MM-dd" para um objeto java.sql.Date.
     *
     * @param dataTexto A string contendo a data no formato "yyyy-MM-dd" a ser
     * convertida
     * @return Retorna a data convertida em java.sql.Date ou null se ocorrer um
     * erro de conversão
     */
    public static Date stringToDate(String dataTexto) {
        try {
            // Cria o SimpleDateFormat para converter a data inserida.
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date data = sdf.parse(dataTexto);

            // Converte para java.sql.Date.
            return new java.sql.Date(data.getTime());
        } catch (ParseException e) {
            return null; // Retorna null caso a conversão falhar.
        }
    }

    /**
     * Verifica se uma string representa uma data válida no formato
     * "yyyy-MM-dd".
     *
     * @param dataTexto A string contendo a data no formato "yyyy-MM-dd" a ser
     * validada
     * @return Retorna true se a data for válida e estiver no formato correto,
     * caso contrário, retorna false
     */
    public static boolean isDataValida(String dataTexto) {
        try {
            // Cria um SimpleDateFormat para passar a data no formato AAAA-MM-DD.
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false); // Desativa a leniência para datas inválidas.
            java.util.Date data = sdf.parse(dataTexto);

            // Verifica se a data foi convertida corretamente para um objeto Date.
            return dataTexto.equals(sdf.format(data)); // Verifica se o formato da data é o mesmo.
        } catch (ParseException e) {
            return false; // Se ocorrer exceção, a data não é válida.
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoEmprestimo().setVisible(true);
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
