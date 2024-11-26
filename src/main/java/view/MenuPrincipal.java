package view;

import dao.ConexaoDAO;

/**
 * Classe responsável por inicializar a aplicação.
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Construtor da classe MenuPrincipal. Estabelece a conexão com o banco de
     * dados.
     */
    public MenuPrincipal() {
        try {
            // Tenta estabelecer conexão com o banco de dados.
            ConexaoDAO conexaoDAO = new ConexaoDAO();
            conexaoDAO.getConexao();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception e) {
            // Exibe diagnóstico de erro caso não consiga conectar.
            System.out.println("Programa não conectado: " + e.getMessage());
        }
        // Inicializa componentes da interface gráfica.
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBMenuSair = new javax.swing.JButton();
        JBMenuIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Empréstimos");

        JBMenuSair.setBackground(new java.awt.Color(255, 255, 255));
        JBMenuSair.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        JBMenuSair.setForeground(new java.awt.Color(255, 51, 51));
        JBMenuSair.setText("SAIR");
        JBMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuSairActionPerformed(evt);
            }
        });

        JBMenuIniciar.setBackground(new java.awt.Color(255, 255, 255));
        JBMenuIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBMenuIniciar.setForeground(new java.awt.Color(0, 0, 0));
        JBMenuIniciar.setText("INICIAR");
        JBMenuIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBMenuIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMenuIniciarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEM VINDO ");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FERRAMENTAS EXPRESS");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JBMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(JBMenuIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBMenuIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBMenuSairActionPerformed

    private void JBMenuIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMenuIniciarActionPerformed
        MenuEscolha objeto = new MenuEscolha();
        objeto.setVisible(true);
        objeto.setLocationRelativeTo(null);
    }//GEN-LAST:event_JBMenuIniciarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBMenuIniciar;
    private javax.swing.JButton JBMenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
