// Aluno : Nuno Guerra - RA : a2706504
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class FormCadastroCafe extends javax.swing.JFrame {
    private Cafe ca1 = new Cafe();
    private BdProdutos gca = BdProdutos.geraBdProdutos();
    private BdItens gp = BdItens.geraGerProdutos();
    private static FormCadastroCafe cadCafeUnic;
    
    private FormCadastroCafe() {
        initComponents();
    }
    
    // Método Singleton
    public static FormCadastroCafe geraCadCafe(){
        if(cadCafeUnic == null){
            cadCafeUnic = new FormCadastroCafe();
        }
        return cadCafeUnic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtCadastroCafe = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtTamanho = new javax.swing.JLabel();
        rtTipo = new javax.swing.JLabel();
        rtIntensidade = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxTamanho = new javax.swing.JTextField();
        cxTipo = new javax.swing.JTextField();
        cxIntensidade = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterarPreco = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtCadastroCafe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rtCadastroCafe.setText("Cadastro Café");

        rtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtNome.setText("NOME............ :");

        rtPreco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtPreco.setText("PREÇO............ :");

        rtTamanho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTamanho.setText("TAMANHO.... :");

        rtTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTipo.setText("TIPO............... :");

        rtIntensidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtIntensidade.setText("INTENSIDADE :");

        cxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTamanhoActionPerformed(evt);
            }
        });

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

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(rtCadastroCafe))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rtIntensidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cxNome)
                                    .addComponent(cxPreco)
                                    .addComponent(cxTamanho)
                                    .addComponent(cxTipo)
                                    .addComponent(cxIntensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterarPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtCadastroCafe)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreco)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTamanho)
                    .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipo)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtIntensidade)
                    .addComponent(cxIntensidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btAlterarPreco)
                    .addComponent(btExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTamanhoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        insCafe();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultCafe();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarPrecoActionPerformed
        alterarPreco();
    }//GEN-LAST:event_btAlterarPrecoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirCafe();
    }//GEN-LAST:event_btExcluirActionPerformed

    public void excluirCafe(){
        ca1 = new Cafe();
        
        ca1.setNome(cxNome.getText());
        
        ca1 = gca.delCafe(ca1);
        
        if(ca1 == null){
            JOptionPane.showMessageDialog(
                    null,
                    "Cafe apagado com sucesso!",
                    "Exclusão de cafe",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Nome do café não encontrado!",
                    "Exclusão de cafe",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        }
    }
    
    public void alterarPreco(){
        ca1 = new Cafe();
        
        ca1.setNome(cxNome.getText());
        
        ca1 = gca.atualizaPrecoCafe(ca1);
        
        if(ca1 != null){
            cxNome.setText(ca1.getNome());
            cxPreco.setText(Float.toString(ca1.getPreco()));
            cxTamanho.setText(ca1.getTamanho());
            cxTipo.setText(ca1.getTipo());
            cxIntensidade.setText(ca1.getIntensidade());
            
            JOptionPane.showMessageDialog(
                    null,
                    "Cafe encontrado, verifique os dados :",
                    "Alteração de Cafe",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Nome do café não encontrado!",
                    "Alteração de preço",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        }
    }
    
    public void consultCafe(){
        ca1 = new Cafe();
        
        ca1.setNome(cxNome.getText());
        
        ca1 = gca.consCafe(ca1);
        
        if(ca1 != null){
            cxNome.setText(ca1.getNome());
            cxPreco.setText(Float.toString(ca1.getPreco()));
            cxTamanho.setText(ca1.getTamanho());
            cxTipo.setText(ca1.getTipo());
            cxIntensidade.setText(ca1.getIntensidade());
            
            JOptionPane.showMessageDialog(
                    null,
                    "Confirme os dados!",
                    "Consulta de Cafe",
                    JOptionPane.INFORMATION_MESSAGE
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Não existe um cafe com esse nome!",
                    "Consulta de cafe",
                    JOptionPane.ERROR_MESSAGE
            ); 
            cxNome.setText("");
            cxNome.requestFocus();
        } 
    } //fim consultCafe
    
    public void insCafe(){
        try{
        ca1 = new Cafe();
        
        ca1.setNome(cxNome.getText());
        ca1.setPreco(Float.parseFloat(cxPreco.getText()));
        ca1.setTamanho(cxTamanho.getText());
        ca1.setTipo(cxTipo.getText());
        ca1.setIntensidade(cxIntensidade.getText());
        
        ca1 = gca.insCafe(ca1);
        ca1 = (Cafe) gp.insProd(ca1);
        
        if(ca1 != null){
            JOptionPane.showMessageDialog(
                    null,
                    "Cafe cadastrado com sucesso!",
                    "Cadastro de Cafe",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : Já existe um cafe com esse nome!",
                    "Cadastro de Cafe",
                    JOptionPane.ERROR_MESSAGE
            );
            cxNome.setText("");
            cxNome.requestFocus();
        } 
        }//fim try
        
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO : O preço deve conter apenas numeros!",
                    "Erro de dados",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
    } //fim insCafe
    
    public void limpar(){
        cxNome.setText("");
        cxPreco.setText("");
        cxTamanho.setText("");
        cxTipo.setText("");
        cxIntensidade.setText("");
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
            java.util.logging.Logger.getLogger(FormCadastroCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarPreco;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxIntensidade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JLabel rtCadastroCafe;
    private javax.swing.JLabel rtIntensidade;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtTamanho;
    private javax.swing.JLabel rtTipo;
    // End of variables declaration//GEN-END:variables
}
