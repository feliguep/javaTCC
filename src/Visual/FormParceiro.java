
package Visual;
import model.Parceiromod;
import model.Pagamentomod;
import model.CPFmod;
import model.CNPJmod;
import model.MarcaMod;
import java.sql.*;
import Cadastro.CadastroBd;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class FormParceiro extends javax.swing.JFrame {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
    public FormParceiro() throws ClassNotFoundException, SQLException {
        initComponents();
         conexao = CadastroBd.cadastrobd();
         listarParceiro();
    }
    
     public void listarParceiro(){
    String sql = "SELECT *from parceiro";
    try
    {
    pst = conexao.prepareStatement(sql);
    rs = pst.executeQuery();
    jTableParceiro.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException error)
    {
    JOptionPane.showMessageDialog (null, error);
    }
    }
    
 public void cadastrarParceiro  ()
    {
      
 String sql = "INSERT INTO parceiro (codigo_indica,nome_parceiro,telefone_parceiro,senha,email_parceiro) VALUES (?,?,?,?,?)";
try
{
    pst = conexao.prepareStatement(sql);
     pst = conexao.prepareStatement(sql);
    pst.setInt(1,Integer.parseInt(jTextFieldCodInd.getText())); 
    pst.setString(2, jTextFieldNomePar.getText());
    pst.setString(3, jTextFieldTelPar.getText());
    pst.setString(4, jTextFieldSenha.getText());
    pst.setString(5, jTextFieldEmailPar.getText());
     pst.execute();
              JOptionPane.showMessageDialog (null, "Cadastro Realizado");
              listarParceiro();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
  
}
 
   public void mostarItens(){
     int seleciona = jTableParceiro.getSelectedRow();
     jTextFieldCodInd.setText(jTableParceiro.getModel().getValueAt(seleciona,0).toString());
     jTextFieldNomePar.setText(jTableParceiro.getModel().getValueAt(seleciona,1).toString());
     jTextFieldTelPar.setText(jTableParceiro.getModel().getValueAt(seleciona,2).toString());
     jTextFieldSenha.setText(jTableParceiro.getModel().getValueAt(seleciona,3).toString());
     jTextFieldEmailPar.setText(jTableParceiro.getModel().getValueAt(seleciona,4).toString());
     
    
    }
       
       public void editarParceiro(){
    String sql = "UPDATE parceiro set nome_parceiro=?,telefone_parceiro=?,senha=?,email_parceiro=? WHERE codigo_indica =?";
    try
{
    pst = conexao.prepareStatement(sql);  
    pst.setString(1, jTextFieldNomePar.getText());
    pst.setString(2, jTextFieldTelPar.getText());
    pst.setString(3, jTextFieldSenha.getText());
    pst.setString(4, jTextFieldEmailPar.getText());
     pst.setInt(5,Integer.parseInt(jTextFieldCodInd.getText()));
            pst.executeUpdate();
              JOptionPane.showMessageDialog (null, "Cadastro Atualizado com sucesso");
              listarParceiro();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
    }

     public void deletarParceiro(){
         String sql = "DELETE FROM parceiro WHERE codigo_indica =?";
           try
{
    pst = conexao.prepareStatement(sql); 
    pst.setInt(1,Integer.parseInt(jTextFieldCodInd.getText()));
            pst.executeUpdate();
              JOptionPane.showMessageDialog (null, "Parceiro apagado com sucesso");
              listarParceiro();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
     }
    
    
    public void limparCampos(){
      
      jTextFieldCodInd.setText("");
     jTextFieldNomePar.setText("");
     jTextFieldTelPar.setText("");
     jTextFieldSenha.setText("");
     jTextFieldEmailPar.setText("");    
        
        }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldSenha = new javax.swing.JTextField();
        jTextFieldCodInd = new javax.swing.JTextField();
        jTextFieldTelPar = new javax.swing.JTextField();
        jTextFieldNomePar = new javax.swing.JTextField();
        jTextFieldEmailPar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParceiro = new javax.swing.JTable();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Codigo de indicação:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Senha:");

        jLabel6.setText("Email:");

        jButtonCadastrar.setText("Incluir");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Editar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        jTextFieldTelPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelParActionPerformed(evt);
            }
        });

        jTableParceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableParceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParceiroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableParceiro);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTelPar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmailPar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonAlterar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(31, 31, 31)
                                        .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addComponent(jButtonExcluir)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonFechar)))
                        .addContainerGap(1128, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomePar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodInd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodInd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomePar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldEmailPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jTextFieldTelParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelParActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelParActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
                 editarParceiro();        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        deletarParceiro();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        cadastrarParceiro ();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTableParceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParceiroMouseClicked
        mostarItens();
    }//GEN-LAST:event_jTableParceiroMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
      limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormParceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormParceiro().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormParceiro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FormParceiro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParceiro;
    private javax.swing.JTextField jTextFieldCodInd;
    private javax.swing.JTextField jTextFieldEmailPar;
    private javax.swing.JTextField jTextFieldNomePar;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTelPar;
    // End of variables declaration//GEN-END:variables
}
