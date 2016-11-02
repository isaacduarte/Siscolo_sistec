/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import classJava.ExameClinico;
import formatador.classes.Formatador;
import javax.swing.JOptionPane;
import Dao.ExameClinicoDao;
/**
 *
 * @author Caio
 */
public class UPExCli1 extends javax.swing.JFrame {

    /**
     * Creates new form CadastroLab
     */
    public UPExCli1() {
        initComponents();
        Data=new Formatador(jTextFielddataColeta, "##/##/####");
    }
    private final Formatador Data;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jCheckBoxNormal = new javax.swing.JCheckBox();
        jCheckBoxAusente = new javax.swing.JCheckBox();
        jCheckBoxAlterado = new javax.swing.JCheckBox();
        jCheckBoxColonaoVisualizado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroExame = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxsim = new javax.swing.JCheckBox();
        jCheckBoxnao = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFielddataColeta = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Limpar = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Inspeção de Colo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        jCheckBoxNormal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxNormal.setText("Normal");
        jCheckBoxNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNormalActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 38, -1, -1));

        jCheckBoxAusente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxAusente.setText("Ausente (anomalias congênites ou retirado cirurgicamente)");
        jCheckBoxAusente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAusenteActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAusente, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 61, -1, -1));

        jCheckBoxAlterado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxAlterado.setText("Alterado");
        jCheckBoxAlterado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAlteradoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAlterado, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 84, -1, -1));

        jCheckBoxColonaoVisualizado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxColonaoVisualizado.setText("Colo não visualizado ");
        jCheckBoxColonaoVisualizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxColonaoVisualizadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxColonaoVisualizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 107, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Numero do Exame");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 132, 349, -1));

        jTextFieldNumeroExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroExameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumeroExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 153, 149, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 187, -1, -1));

        jCheckBoxsim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxsim.setText("Sim");
        jCheckBoxsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxsimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxsim, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 204, -1, -1));

        jCheckBoxnao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxnao.setText("Não");
        jCheckBoxnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxnaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxnao, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 204, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data da coleta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 229, -1, -1));
        getContentPane().add(jTextFielddataColeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 250, 149, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Responsavel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        getContentPane().add(jTextFieldResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 149, 28));

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/cadastrarcamp.png"))); // NOI18N
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 351, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/pesquisarcamp.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 351, -1, -1));

        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/limparcamp.png"))); // NOI18N
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 351, -1, -1));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/voltarpng.png"))); // NOI18N
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 331, -1, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sinais sugestivos de doenças sexualmente transmissiveis?");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundos/fundoexamecli3_1.jpg"))); // NOI18N
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    public void exporta(ExameClinico ec){
        ExameClinicoDao dao = new ExameClinicoDao();
        ec = dao.obter(ExameClinico.class, ec.getId());
        cod.setText(""+ec.getId());
        if(ec.getInspecaoColo().equals("Normal")){
            jCheckBoxNormal.setSelected(true);
        } else if (ec.getInspecaoColo().equals("Ausente (anomalias congênites ou retirado cirurgicamente)")){
            jCheckBoxAlterado.setSelected(true);
        } else if (ec.getInspecaoColo().equals("Alterado")){
            jCheckBoxAlterado.setSelected(true);
        } else if (ec.getInspecaoColo().equals("Colo não visualizado ")){
            jCheckBoxColonaoVisualizado.setSelected(true);
        }
        jTextFieldNumeroExame.setText(ec.getNumeroExame());
        if(ec.getSsdst().equals("Sim")){
            jCheckBoxsim.setSelected(true);
        } else if (ec.getSsdst().equals("Não")){
            jCheckBoxnao.setSelected(true);
        }
        jTextFielddataColeta.setText(ec.getDataColeta());
        jTextFieldResponsavel.setText(ec.getResponsavel());
    }
    private void jTextFieldNumeroExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroExameActionPerformed

    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        // TODO add your handling code here:
        if(jTextFieldNumeroExame.equals("") || jTextFieldResponsavel.equals("") || jTextFielddataColeta.equals("")){
            JOptionPane.showMessageDialog(this, "Há Campos Deixados em Branco");
        }else if (!jCheckBoxAlterado.isSelected() && !jCheckBoxAusente.isSelected() && !jCheckBoxColonaoVisualizado.isSelected()
                    && !jCheckBoxNormal.isSelected()){
                    JOptionPane.showMessageDialog(this, "Selecione Alguma das Opções de Inpeção de Colo");
        }else if(!jCheckBoxsim.isSelected() && !jCheckBoxnao.isSelected()){
                    JOptionPane.showMessageDialog(this, "Selecione Alguma das Opções de Inpeção de Colo");
        }else{
            ExameClinico ex = new ExameClinico();
            if(jCheckBoxNormal.isSelected()){
                ex.setInspecaoColo(jCheckBoxNormal.getText());
            }
            else if(jCheckBoxAusente.isSelected()){
                ex.setInspecaoColo(jCheckBoxAusente.getText());
            }
            else if(jCheckBoxAlterado.isSelected()){
                ex.setInspecaoColo(jCheckBoxAlterado.getText());
            }
            else if(jCheckBoxColonaoVisualizado.isSelected()){
                ex.setInspecaoColo(jCheckBoxColonaoVisualizado.getText());
            }
            ex.setNumeroExame(jTextFieldNumeroExame.getText());
            if(jCheckBoxsim.isSelected()){
            ex.setSsdst(jCheckBoxsim.getText());
            }else if(jCheckBoxnao.isSelected()){
                ex.setSsdst(jCheckBoxnao.getText());
            }
            ex.setDataColeta(jTextFielddataColeta.getText());
            ex.setResponsavel(jTextFieldResponsavel.getText());
             ExameClinicoDao dao=new ExameClinicoDao();
             ex= dao.salvar(ex);
             JOptionPane.showMessageDialog(this, "Exame Clinico editado Com Sucesso");
             dispose();
             PesquisarExameClinico cli = new PesquisarExameClinico();
             cli.setVisible(true);
        }
        
    }//GEN-LAST:event_CadastrarMouseClicked

    private void jCheckBoxNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNormalActionPerformed
        // TODO add your handling code here:
        jCheckBoxAlterado.setSelected(false);
        jCheckBoxAusente.setSelected(false);
        jCheckBoxColonaoVisualizado.setSelected(false);
    }//GEN-LAST:event_jCheckBoxNormalActionPerformed

    private void jCheckBoxAusenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAusenteActionPerformed
        // TODO add your handling code here:
        jCheckBoxAlterado.setSelected(false);
        jCheckBoxNormal.setSelected(false);
        jCheckBoxColonaoVisualizado.setSelected(false);
    }//GEN-LAST:event_jCheckBoxAusenteActionPerformed

    private void jCheckBoxAlteradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAlteradoActionPerformed
        // TODO add your handling code here:
        jCheckBoxNormal.setSelected(false);
        jCheckBoxAusente.setSelected(false);
        jCheckBoxColonaoVisualizado.setSelected(false);
    }//GEN-LAST:event_jCheckBoxAlteradoActionPerformed

    private void jCheckBoxColonaoVisualizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxColonaoVisualizadoActionPerformed
        // TODO add your handling code here:
        jCheckBoxAlterado.setSelected(false);
        jCheckBoxAusente.setSelected(false);
        jCheckBoxNormal.setSelected(false);
    }//GEN-LAST:event_jCheckBoxColonaoVisualizadoActionPerformed

    private void jCheckBoxsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxsimActionPerformed
        // TODO add your handling code here:
        jCheckBoxnao.setSelected(false);
    }//GEN-LAST:event_jCheckBoxsimActionPerformed

    private void jCheckBoxnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxnaoActionPerformed
        jCheckBoxsim.setSelected(false);
    }//GEN-LAST:event_jCheckBoxnaoActionPerformed

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        // TODO add your handling code here:
        jCheckBoxAlterado.setSelected(false);
        jCheckBoxAusente.setSelected(false);
        jCheckBoxNormal.setSelected(false);
        jCheckBoxColonaoVisualizado.setSelected(false);
        jCheckBoxsim.setSelected(false);
        jCheckBoxnao.setSelected(false);
        jTextFieldNumeroExame.setText("");
        jTextFieldResponsavel.setText("");
        jTextFielddataColeta.setText("");
        
    }//GEN-LAST:event_LimparMouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
                dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_VoltarMouseClicked

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
            java.util.logging.Logger.getLogger(UPExCli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPExCli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPExCli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPExCli1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPExCli1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastrar;
    private javax.swing.JLabel Limpar;
    private javax.swing.JLabel Voltar;
    private javax.swing.JLabel cod;
    private javax.swing.JCheckBox jCheckBoxAlterado;
    private javax.swing.JCheckBox jCheckBoxAusente;
    private javax.swing.JCheckBox jCheckBoxColonaoVisualizado;
    private javax.swing.JCheckBox jCheckBoxNormal;
    private javax.swing.JCheckBox jCheckBoxnao;
    private javax.swing.JCheckBox jCheckBoxsim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jTextFieldNumeroExame;
    private javax.swing.JTextField jTextFieldResponsavel;
    private javax.swing.JFormattedTextField jTextFielddataColeta;
    // End of variables declaration//GEN-END:variables
}
