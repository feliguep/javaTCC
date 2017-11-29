/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import model.Pagamentomod;
import model.CPFmod;
import model.CNPJmod;
import model.MarcaMod;
import model.ModParceiro;
import java.sql.*;
import java.sql.PreparedStatement;
import Cadastro.CadastroBd;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class FormMarca extends javax.swing.JFrame {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    
    public FormMarca() throws ClassNotFoundException, SQLException {
        initComponents();
         conexao = CadastroBd.cadastrobd();
    listarMarca();
    }

     public void listarMarca(){
    String sql = "select  *marca;\n" +
"inner join ncl_sub_conj \n" +
"on marca.id_marca =  ncl_sub_conj.ncl_subconj";
    try
    {
    pst = conexao.prepareStatement(sql);
    rs = pst.executeQuery();
   jTableMarca.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException error)
    {
    JOptionPane.showMessageDialog (null, error);
    }
    }
    
    
     public void cadastrarMarca()
    {
       
 String sql = "INSERT INTO marca (id_marca, nome_marca, num_processo, status_processo,num_protocolo, num_gru) VALUES (?,?,?,?,?,?)";
try
{
    pst = conexao.prepareStatement(sql);
     pst = conexao.prepareStatement(sql);
    pst.setInt(1,Integer.parseInt(jTextFieldNum.getText())); 
    pst.setString(2, jTextFieldMarcaNome.getText());
    pst.setString(3, jTextFieldNUMPRO.getText());
    pst.setString(4, (String) jComboBoxStatus.getSelectedItem());
    pst.setString(5, jTextFieldNumProto.getText());
    pst.setString(6, jTextFieldGRU.getText());
    pst.execute();
              JOptionPane.showMessageDialog (null, "Cadastro Realizado");
              listarMarca();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
  
}

       public void mostarItens(){
     int seleciona = jTableMarca.getSelectedRow();
    jTextFieldNum.setText(jTableMarca.getModel().getValueAt(seleciona,0).toString());
     jTextFieldMarcaNome.setText(jTableMarca.getModel().getValueAt(seleciona,1).toString());
     jTextFieldNUMPRO.setText(jTableMarca.getModel().getValueAt(seleciona,2).toString());
     jComboBoxStatus.setSelectedItem(jTableMarca.getModel().getValueAt(seleciona,3).toString());
     jTextFieldNumProto.setText(jTableMarca.getModel().getValueAt(seleciona,4).toString());
     jTextFieldGRU.setText(jTableMarca.getModel().getValueAt(seleciona,5).toString());
     
    }
       
       public void editarMarca(){
    String sql = "UPDATE marca set nome_marca=?, num_processo=?, status_processo=?,num_protocolo=?, num_gru=? WHERE id_marca =?";
    try
{
    pst = conexao.prepareStatement(sql);  
  
    pst.setString(1,  jTextFieldMarcaNome.getText());
    pst.setString(2,  jTextFieldNUMPRO.getText());
    pst.setString(3, (String) jComboBoxStatus.getSelectedItem());
     pst.setString(4,  jTextFieldNumProto.getText());
      pst.setString(5,  jTextFieldGRU.getText());
    pst.setInt(6,Integer.parseInt(jTextFieldNum.getText()));
            pst.executeUpdate();
              JOptionPane.showMessageDialog (null, "Cadastro Atualizado com sucesso");
              listarMarca();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
    }

     public void deletarMarca(){
         String sql = "DELETE FROM marca WHERE id_marca =?";
           try
{
    pst = conexao.prepareStatement(sql); 
    pst.setInt(1,Integer.parseInt(jTextFieldNum.getText()));
            pst.executeUpdate();
              JOptionPane.showMessageDialog (null, "Marca apagada com sucesso");
              listarMarca();
}catch(SQLException error)
{
JOptionPane.showMessageDialog (null, error);
}
     }
    
    
    public void limparCampos(){
    
        jTextFieldNum.setText("");
     jTextFieldMarcaNome.setText("");
     jTextFieldNUMPRO.setText("");
     jComboBoxStatus.setSelectedItem("");
     jTextFieldNumProto.setText("");
     jTextFieldGRU.setText("");
      
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonNCL1 = new javax.swing.JButton();
        jButtonNCL31 = new javax.swing.JButton();
        jButtonNCL32 = new javax.swing.JButton();
        jButtonNCL33 = new javax.swing.JButton();
        jButtonNCL35 = new javax.swing.JButton();
        jButtonNCL37 = new javax.swing.JButton();
        jTextFieldMarcaNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumProto = new javax.swing.JTextField();
        jTextFieldNUMPRO = new javax.swing.JTextField();
        jTextFieldGRU = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMarca = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro Marca");

        jLabel2.setText("Marca:");

        jLabel3.setText("Escolha o(s) segmento(s) de atividade(s) da sua marca:");

        jButtonNCL1.setText("1- Substâncias químicas destinadas à indústria, às ciências, à fotografia, assim como à agricultura, à horticultura e à silvicultura; resinas artificiais não processadas, matérias plásticas não processadas; adubo; composições extintoras de fogo; preparações para temperar e soldar; substâncias químicas destinadas a conservar alimentos; substâncias tanantes; substâncias adesivas destinadas à indústria.");
        jButtonNCL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL1ActionPerformed(evt);
            }
        });

        jButtonNCL31.setText("31 - Produtos agrícolas, hortícolas, florestais e grãos não incluídos em outras classes; animais vivos; frutas, legumes e verduras frescos; sementes, plantas e flores naturais; alimentos para animais, malte.");
        jButtonNCL31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL31ActionPerformed(evt);
            }
        });

        jButtonNCL32.setText("32- Cervejas; águas minerais e gasosas e outras bebidas não alcoólicas; bebidas de frutas e sucos de fruta; xaropes e outras preparações para fabricar bebidas.");
        jButtonNCL32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL32ActionPerformed(evt);
            }
        });

        jButtonNCL33.setText("33- Bebidas alcoólicas (exceto cervejas).");
        jButtonNCL33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL33ActionPerformed(evt);
            }
        });

        jButtonNCL35.setText("35 - Propaganda; gestão de negócios; administração de negócios; funções de escritório.");
        jButtonNCL35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL35ActionPerformed(evt);
            }
        });

        jButtonNCL37.setText("37 - Construção civil; reparos; serviços de instalação.");
        jButtonNCL37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNCL37ActionPerformed(evt);
            }
        });

        jTextFieldMarcaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Numéro da marca:");

        jTextFieldNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumActionPerformed(evt);
            }
        });

        jLabel5.setText("Status do processo:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------", "Arquivada", "Registrada", "Registro em andamento", "Exame de mérito" }));

        jLabel6.setText("Num do Processo:");

        jLabel7.setText("Num do protocolo:");

        jLabel8.setText("GRU:");

        jTextFieldNUMPRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNUMPROActionPerformed(evt);
            }
        });

        jTextFieldGRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGRUActionPerformed(evt);
            }
        });

        jButton7.setText("Incluir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Alterar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Excluir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jTableMarca.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMarca);

        jButton1.setText("Limpar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButtonNCL1)
                            .addComponent(jButtonNCL31)
                            .addComponent(jButtonNCL32)
                            .addComponent(jButtonNCL33)
                            .addComponent(jButtonNCL35)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNCL37)
                                .addGap(237, 237, 237)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMarcaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumProto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldGRU, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNUMPRO, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMarcaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButtonNCL1)
                .addGap(18, 18, 18)
                .addComponent(jButtonNCL31)
                .addGap(18, 18, 18)
                .addComponent(jButtonNCL32)
                .addGap(18, 18, 18)
                .addComponent(jButtonNCL33)
                .addGap(18, 18, 18)
                .addComponent(jButtonNCL35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNCL37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton1))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButtonFechar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNUMPRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNumProto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNCL35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL35ActionPerformed
         Visual.FormNCLsub35 formNCLsub35 = new Visual.FormNCLsub35();
        formNCLsub35.setVisible(true); 
    }//GEN-LAST:event_jButtonNCL35ActionPerformed

    private void jButtonNCL37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL37ActionPerformed
        Visual.FormNCLsub37 formNCLsub37 = new Visual.FormNCLsub37();
        formNCLsub37.setVisible(true);
    }//GEN-LAST:event_jButtonNCL37ActionPerformed

    private void jTextFieldMarcaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaNomeActionPerformed

    private void jTextFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumActionPerformed

    private void jTextFieldNUMPROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNUMPROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNUMPROActionPerformed

    private void jTextFieldGRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGRUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGRUActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
cadastrarMarca();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
editarMarca();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
deletarMarca();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonNCL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL1ActionPerformed
        Visual.FormNCLsub1 formNCLsub1 = new Visual.FormNCLsub1();
        formNCLsub1.setVisible(true);
    }//GEN-LAST:event_jButtonNCL1ActionPerformed

    private void jButtonNCL31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL31ActionPerformed
        Visual.FormNCLsub31 formNCLsub31 = new Visual.FormNCLsub31();
        formNCLsub31.setVisible(true);
    }//GEN-LAST:event_jButtonNCL31ActionPerformed

    private void jButtonNCL32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL32ActionPerformed
        Visual.FormNCLsub32 formNCLsub32 = new Visual.FormNCLsub32();
        formNCLsub32.setVisible(true);
    }//GEN-LAST:event_jButtonNCL32ActionPerformed

    private void jButtonNCL33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNCL33ActionPerformed
        Visual.FormNCLsub33 formNCLsub33 = new Visual.FormNCLsub33();
        formNCLsub33.setVisible(true);
    }//GEN-LAST:event_jButtonNCL33ActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTableMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcaMouseClicked
mostarItens();        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMarcaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
limparCampos();        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormMarca().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormMarca.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FormMarca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNCL1;
    private javax.swing.JButton jButtonNCL31;
    private javax.swing.JButton jButtonNCL32;
    private javax.swing.JButton jButtonNCL33;
    private javax.swing.JButton jButtonNCL35;
    private javax.swing.JButton jButtonNCL37;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMarca;
    private javax.swing.JTextField jTextFieldGRU;
    private javax.swing.JTextField jTextFieldMarcaNome;
    private javax.swing.JTextField jTextFieldNUMPRO;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldNumProto;
    // End of variables declaration//GEN-END:variables
}
