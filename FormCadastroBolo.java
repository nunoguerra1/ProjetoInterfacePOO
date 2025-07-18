// Aluno : Nuno Guerra - RA : a2706504
import javax.swing.JOptionPane;


public class FormCadastroBolo extends javax.swing.JFrame {
    private Bolo b1 = new Bolo();
    private BdProdutos gb = BdProdutos.geraBdProdutos();
    private BdItens gp = BdItens.geraGerProdutos();
    private static FormCadastroBolo cadBoloUnic;
    
    
    private FormCadastroBolo() {
        initComponents();
    }
    
    // Método Singleton
    public static FormCadastroBolo geraCadBolo(){
        if(cadBoloUnic == null){
            cadBoloUnic = new FormCadastroBolo();
        }
        return cadBoloUnic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtCadastroBolo = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        rtPreço = new javax.swing.JLabel();
        rtSabor = new javax.swing.JLabel();
        rtPesoFatia = new javax.swing.JLabel();
        rtCobertura = new javax.swing.JLabel();
        cxPesoFatia = new javax.swing.JTextField();
        cxCobertura = new javax.swing.JTextField();
        cxSabor = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterarPreco = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        rtCadastroBolo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rtCadastroBolo.setText("Cadastro Bolo");

        rtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtNome.setText("NOME............. :");

        rtPreço.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtPreço.setText("PREÇO............. :");

        rtSabor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtSabor.setText("SABOR............ :");

        rtPesoFatia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtPesoFatia.setText("PESO P/FATIA :");

        rtCobertura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtCobertura.setText("COBERTURA... :");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterarPreco.setText("Alterar Preço");
        btAlterarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarPrecoActionPerformed(evt);
            }
        });

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterarPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtPreço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtSabor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtPesoFatia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtCobertura))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(cxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxCobertura)
                                    .addComponent(cxPesoFatia)
                                    .addComponent(cxPreco)
                                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rtCadastroBolo)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtCadastroBolo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreço)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtSabor)
                    .addComponent(cxSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPesoFatia)
                    .addComponent(cxPesoFatia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCobertura)
                    .addComponent(cxCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btAlterarPreco)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        insBolo();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultBolo();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPrecoActionPerformed
        alterarPreco();
    }//GEN-LAST:event_btAlterarPrecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        excluirBolo();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void excluirBolo(){
        b1 = new Bolo();
        
        b1.setNome(cxNome.getText());
        
        b1 = gb.delBolo(b1);
        
        if(b1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Bolo apagado com sucesso!",
                    "Exclusão de bolo",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Nome do bolo não encontrado!",
                    "Exclusão de bolo",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        }
    } //fim excluirBolo
    
    public void alterarPreco(){
        b1 = new Bolo();
        
        b1.setNome(cxNome.getText());
        
        b1 = gb.atualizaPrecoBolo(b1);
        
        if(b1 != null){
            cxNome.setText(b1.getNome());
            cxPreco.setText(Float.toString(b1.getPreco()));
            cxSabor.setText(b1.getSabor());
            cxPesoFatia.setText(Float.toString(b1.getPeso()));
            cxCobertura.setText(b1.getTipoCobertura());
            
            JOptionPane.showMessageDialog(
                    null,
                    "Bolo encontrado, verifique os dados :",
                    "Alteração de Bolo",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Nome do bolo não encontrado!",
                    "Alteração de preço",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        }
    } // fim alterarPreco
    
    public void consultBolo(){
        b1 = new Bolo();
        
        b1.setNome(cxNome.getText());
        
        b1 = gb.consBolo(b1);
        
        if(b1 != null){
            cxNome.setText(b1.getNome());
            cxPreco.setText(Float.toString(b1.getPreco()));
            cxSabor.setText(b1.getSabor());
            cxPesoFatia.setText(Float.toString(b1.getPeso()));
            cxCobertura.setText(b1.getTipoCobertura());
            
            JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados!",
                    "Consulta de Bolo",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Não existe um bolo com esse nome!",
                    "Consulta de bolo",
                    JOptionPane.ERROR_MESSAGE
            ); 
            cxNome.setText("");
            cxNome.requestFocus();
        } 
    } //fim consultBolo
    
    public void insBolo(){
        try{
        b1 = new Bolo();
        
        b1.setNome(cxNome.getText());
        b1.setPreco(Float.parseFloat(cxPreco.getText()));
        b1.setSabor(cxSabor.getText());
        b1.setPeso(Float.parseFloat(cxPesoFatia.getText()));
        b1.setTipoCobertura(cxCobertura.getText());
        
        b1 = gb.insBolo(b1);
        b1 = (Bolo) gp.insProd(b1);
        
        if(b1 != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Bolo cadastrado com sucesso!",
                    "Cadastro de Bolo",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Já existe um bolo com esse nome!",
                    "Cadastro de Bolo",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        } 
        }//fim try
        
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : O valor deve conter apenas numeros!",
                    "Erro de dados",
                    JOptionPane.ERROR_MESSAGE
            );
            cxPreco.setText("");
            cxPreco.requestFocus();
        }
    }// fim insBolo
    
    public void limpar(){
        cxNome.setText("");
        cxPreco.setText("");
        cxSabor.setText("");
        cxPesoFatia.setText("");
        cxCobertura.setText("");
        cxNome.requestFocus();
    }
    
    public void sair(){
       int resp = JOptionPane.showConfirmDialog(
               null,
               "Deseja realmente sair?",
               "Siada do sistema",
               JOptionPane.YES_NO_OPTION
       ); 
       if (resp == 0){
           dispose();
       }
    } // fim sair
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroBolo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroBolo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarPreco;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCobertura;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPesoFatia;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxSabor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel rtCadastroBolo;
    private javax.swing.JLabel rtCobertura;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPesoFatia;
    private javax.swing.JLabel rtPreço;
    private javax.swing.JLabel rtSabor;
    // End of variables declaration//GEN-END:variables
}
