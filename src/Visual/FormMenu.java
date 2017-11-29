
package Visual;

import java.sql.*;
import Cadastro.CadastroBd;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FormMenu extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public FormMenu() throws ClassNotFoundException, SQLException{
        initComponents();
        conexao = CadastroBd.cadastrobd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAdmin = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCPF = new javax.swing.JMenuItem();
        jMenuItemCNPJ = new javax.swing.JMenuItem();
        jMenuItemParceiro = new javax.swing.JMenuItem();
        jMenuItemPesquisa = new javax.swing.JMenuItem();
        jMenuItemPagemento = new javax.swing.JMenuItem();
        jMenuItemMarca = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemListCPF = new javax.swing.JMenuItem();
        jMenuItemListCNPJ = new javax.swing.JMenuItem();
        jMenuItemListPar = new javax.swing.JMenuItem();
        jMenuItemListMarc = new javax.swing.JMenuItem();
        jMenuItemListPes = new javax.swing.JMenuItem();
        jMenuItemListPag = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Cadastro");

        jMenuItemAdmin.setText("Admin");
        jMenuItemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdminActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAdmin);

        jMenu4.setText("Cliente");

        jMenuItemCPF.setText("CPF");
        jMenuItemCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCPFActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCPF);

        jMenuItemCNPJ.setText("CNPJ");
        jMenuItemCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCNPJActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCNPJ);

        jMenu2.add(jMenu4);

        jMenuItemParceiro.setText("Parceiro");
        jMenuItemParceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemParceiroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemParceiro);

        jMenuItemPesquisa.setText("Pesquisa");
        jMenuItemPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPesquisa);

        jMenuItemPagemento.setText("Pagamento");
        jMenuItemPagemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPagementoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPagemento);

        jMenuItemMarca.setText("Marca");
        jMenuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemMarca);

        jMenuBar2.add(jMenu2);

        jMenu1.setText("Listagem");

        jMenuItemListCPF.setText("Cliente CPF");
        jMenuItemListCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListCPFActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListCPF);

        jMenuItemListCNPJ.setText("Cliente CNPJ");
        jMenuItemListCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListCNPJActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListCNPJ);

        jMenuItemListPar.setText("Parceiro");
        jMenuItemListPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListParActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListPar);

        jMenuItemListMarc.setText("Marca");
        jMenuItemListMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListMarcActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListMarc);

        jMenuItemListPes.setText("Pesquisa");
        jMenuItemListPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListPesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListPes);

        jMenuItemListPag.setText("Pagamento");
        jMenuItemListPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListPagActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemListPag);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCPFActionPerformed
       Visual.FormCPF formCPF = new Visual.FormCPF();
        formCPF.setVisible(true);   
    }//GEN-LAST:event_jMenuItemCPFActionPerformed

    private void jMenuItemCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCNPJActionPerformed
       Visual.FormCNPJ formCNPJ = new Visual.FormCNPJ();
        formCNPJ.setVisible(true);  
    }//GEN-LAST:event_jMenuItemCNPJActionPerformed

    private void jMenuItemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdminActionPerformed
       Visual.FormAdmin formAdmin = null;
        try {
            formAdmin = new Visual.FormAdmin();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        formAdmin.setVisible(true); 
    }//GEN-LAST:event_jMenuItemAdminActionPerformed

    private void jMenuItemParceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemParceiroActionPerformed
        Visual.FormParceiro formParceiro = null;
        try {
            formParceiro = new Visual.FormParceiro();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        formParceiro.setVisible(true); 
    }//GEN-LAST:event_jMenuItemParceiroActionPerformed

    private void jMenuItemPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaActionPerformed
       Visual.FormPesquisa formPesquisa = null;
        try {
            formPesquisa = new Visual.FormPesquisa();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        formPesquisa.setVisible(true); 
    }//GEN-LAST:event_jMenuItemPesquisaActionPerformed

    private void jMenuItemPagementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPagementoActionPerformed
        Visual.FormPagamento formPagamento = new Visual.FormPagamento();
        formPagamento.setVisible(true);
    }//GEN-LAST:event_jMenuItemPagementoActionPerformed

    private void jMenuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaActionPerformed
        Visual.FormMarca formMarca = new Visual.FormMarca();
        formMarca.setVisible(true); 
    }//GEN-LAST:event_jMenuItemMarcaActionPerformed

    private void jMenuItemListPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListPagActionPerformed
         Visual.FormListPagamento formListPagamento = new Visual.FormListPagamento();
        formListPagamento.setVisible(true); 
    }//GEN-LAST:event_jMenuItemListPagActionPerformed

    private void jMenuItemListPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListPesActionPerformed
         Visual.FormListPesquisa formListPesquisa = new Visual.FormListPesquisa();
        formListPesquisa.setVisible(true);
    }//GEN-LAST:event_jMenuItemListPesActionPerformed

    private void jMenuItemListParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListParActionPerformed

         Visual.FormListParceiro formListParceiro = new Visual.FormListParceiro();
        formListParceiro.setVisible(true);
    }//GEN-LAST:event_jMenuItemListParActionPerformed

    private void jMenuItemListMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListMarcActionPerformed
         Visual.FormListMarca formListMarca = new Visual.FormListMarca();
       formListMarca.setVisible(true);
    }//GEN-LAST:event_jMenuItemListMarcActionPerformed

    private void jMenuItemListCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListCPFActionPerformed
        Visual. FormListCPF  formListCPF = new Visual. FormListCPF();
        formListCPF.setVisible(true);
    }//GEN-LAST:event_jMenuItemListCPFActionPerformed

    private void jMenuItemListCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListCNPJActionPerformed
        Visual. FormListCNPJ  formListCNPJ = new Visual. FormListCNPJ();
        formListCNPJ.setVisible(true);
    }//GEN-LAST:event_jMenuItemListCNPJActionPerformed

    
      
    
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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new FormMenu().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemAdmin;
    private javax.swing.JMenuItem jMenuItemCNPJ;
    private javax.swing.JMenuItem jMenuItemCPF;
    private javax.swing.JMenuItem jMenuItemListCNPJ;
    private javax.swing.JMenuItem jMenuItemListCPF;
    private javax.swing.JMenuItem jMenuItemListMarc;
    private javax.swing.JMenuItem jMenuItemListPag;
    private javax.swing.JMenuItem jMenuItemListPar;
    private javax.swing.JMenuItem jMenuItemListPes;
    private javax.swing.JMenuItem jMenuItemMarca;
    private javax.swing.JMenuItem jMenuItemPagemento;
    private javax.swing.JMenuItem jMenuItemParceiro;
    private javax.swing.JMenuItem jMenuItemPesquisa;
    // End of variables declaration//GEN-END:variables
}
