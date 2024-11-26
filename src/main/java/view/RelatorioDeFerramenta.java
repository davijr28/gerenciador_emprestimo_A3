package view;

import model.Ferramenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela exibição e manipulação de relatórios de ferramentas.
 * Ela permite que o usuário visualize, altere e apague informações sobre
 * ferramentas armazenadas no sistema.
 */
public class RelatorioDeFerramenta extends javax.swing.JFrame {

    // Objeto responsável por gerenciar os dados das ferramentas.
    public Ferramenta objetoFerramenta;

    // ID da ferramenta, utilizado para operações de alteração e exclusão.
    public int id = 0;

    /**
     * Construtor da classe RelatoriosDeFerramentass. Inicializa os componentes
     * gráficos e cria uma instância do objeto Ferramenta. Também carrega os
     * dados das ferramentas na tabela.
     */
    public RelatorioDeFerramenta() {
        initComponents();
        this.objetoFerramenta = new Ferramenta();
        this.carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        JTableFerramentas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        JBVoltar = new javax.swing.JButton();
        JBAlterar = new javax.swing.JButton();
        JBApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLTotalGasto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RELATÓRIOS DE FERRAMENTAS CADASTRADAS");

        JTableFerramentas.setBackground(new java.awt.Color(255, 255, 255));
        JTableFerramentas.setForeground(new java.awt.Color(0, 0, 0));
        JTableFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Marca", "Custo", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTableFerramentas);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RELATÓRIOS DE FERRAMENTAS CADASTRADAS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JBVoltar.setBackground(new java.awt.Color(255, 255, 255));
        JBVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBVoltar.setForeground(new java.awt.Color(0, 0, 0));
        JBVoltar.setText("Voltar");
        JBVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        JBAlterar.setBackground(new java.awt.Color(255, 255, 255));
        JBAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBAlterar.setForeground(new java.awt.Color(0, 0, 0));
        JBAlterar.setText("Alterar");
        JBAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlterarActionPerformed(evt);
            }
        });

        JBApagar.setBackground(new java.awt.Color(255, 255, 255));
        JBApagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 0, 0));
        JBApagar.setText("Apagar");
        JBApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL GASTO EM FERRAMENTAS: ");

        JLTotalGasto.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(JLTotalGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(JBApagar)
                        .addGap(46, 46, 46)
                        .addComponent(JBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JLTotalGasto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBVoltar)
                    .addComponent(JBAlterar)
                    .addComponent(JBApagar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlterarActionPerformed
        if (this.JTableFerramentas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Primeiro selecione uma ferramenta para alterar.");
        } else {
            // Obtém o ID da ferramenta.
            id = Integer.parseInt(this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 0).toString());
            Ferramenta ferramentaSelecionada = objetoFerramenta.carregaFerramenta(id); // Método para carregar a ferramenta pelo ID.
            // Verifica se a ferramenta está emprestada.
            if (ferramentaSelecionada.isEmprestada()) {
                JOptionPane.showMessageDialog(null, "Não é possível alterar uma ferramenta que atualmente está emprestada.");
            } else {
                // Cria a janela para alterar a ferramenta, utilizando o objeto RelatorioDeFerramenta como parâmetro.
                AlterarFerramenta objeto = new AlterarFerramenta(this);
                objeto.setVisible(true);
                objeto.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_JBAlterarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            // Valida os dados da interface.
            if (this.JTableFerramentas.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Primeiro selecione uma ferramenta para APAGAR.");
            } else {
                // Obtém o ID da ferramenta selecionada na tabela.
                id = Integer.parseInt(this.JTableFerramentas.getValueAt(this.JTableFerramentas.getSelectedRow(), 0).toString());
                Ferramenta ferramentaSelecionada = objetoFerramenta.carregaFerramenta(id); // Método para carregar a ferramenta pelo ID.
                // Verifica se a ferramenta selecionada está emprestada.
                if (ferramentaSelecionada.isEmprestada()) {
                    JOptionPane.showMessageDialog(null, "Não é possível apagar uma ferramenta que atualmente está emprestada.");
                } else {
                    // Confirma a ação do usuário.
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esta ferramenta?", "Confirmar Apagar", JOptionPane.YES_NO_OPTION);
                    if (respostaUsuario == 0) { // Clicou em SIM.
                        // Chama método para apagar a ferramenta do banco de dados. 
                        if (this.objetoFerramenta.deleteFerramentaBD(id)) {
                            JOptionPane.showMessageDialog(rootPane, "Ferramenta apagada com Sucesso!");
                        }
                    }
                    System.out.println(this.objetoFerramenta.getFerramentas().toString());
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        } finally {
            // Atualiza a tabela.
            carregarTabela();
        }
    }//GEN-LAST:event_JBApagarActionPerformed

    /**
     * Carrega os dados das ferramentas na tabela. Este método recupera a lista
     * de ferramentas e preenche a tabela com os dados de cada ferramenta (ID,
     * nome, marca, preço e status de empréstimo).
     */
    public void carregarTabela() {
        double totalGasto = 0; // Variável para armazenar o valor total gasto com ferramentas.
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramentas.getModel();
        modelo.setNumRows(0); // Limpa a tabela antes de carregar os dados.

        // Carrega a lista de ferramentas.
        ArrayList<Ferramenta> minhaLista = objetoFerramenta.getFerramentas();
        for (Ferramenta a : minhaLista) {
            // Adiciona uma nova linha na tabela com os dados de cada ferramenta.
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getPreco(),
                (a.isEmprestada() ? "Emprestada" : "Disponível") // Exibe "Emprestada" para true e "Disponível" pra false.
            });
            totalGasto += a.getPreco(); // Acumula o valor total gasto com ferramentas.
        }
        JLTotalGasto.setText("R$: " + String.format("%.2f", totalGasto)); // Exibe o total na interface.
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioDeFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlterar;
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBVoltar;
    private javax.swing.JLabel JLTotalGasto;
    public javax.swing.JTable JTableFerramentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
