/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author CAIO
 */
public class PrincipalADM extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalADM
     */
    public PrincipalADM() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cadastra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemDadosAnamnese = new javax.swing.JMenuItem();
        jMenuItemunidadeSaude = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        PesquisarUsuario = new javax.swing.JMenuItem();
        PesquisarPaciente = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIMG/pesquisarbutton5.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIMG/relacitopatologico.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIMG/buttonsairfinal.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        Cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIMG/cadastrarnew1.png"))); // NOI18N
        Cadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastraMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuIMG/buttonbusca1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/imagefundofinal.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Cadastrar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/usuariopng.png"))); // NOI18N
        jMenuItem1.setText("Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/patient-icon.png"))); // NOI18N
        jMenuItem2.setText("Paciente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/examepng.png"))); // NOI18N
        jMenuItem3.setText("Exame Clínico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        jMenuItem4.setText("Láboratório Clínico");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItemDadosAnamnese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/anamnesepng.png"))); // NOI18N
        jMenuItemDadosAnamnese.setText("Dados Anamnese");
        jMenuItemDadosAnamnese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDadosAnamneseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDadosAnamnese);

        jMenuItemunidadeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        jMenuItemunidadeSaude.setText("Unidade de Saúde");
        jMenuItemunidadeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemunidadeSaudeActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemunidadeSaude);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        jMenuItem7.setText("Exame Cipatológico");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        jMenuItem8.setText("Busca Ativa");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pesquisar");

        PesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/usuariopng.png"))); // NOI18N
        PesquisarUsuario.setText("Usuário");
        PesquisarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarUsuarioMouseClicked(evt);
            }
        });
        PesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(PesquisarUsuario);

        PesquisarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/patient-icon.png"))); // NOI18N
        PesquisarPaciente.setText("Paciente");
        PesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(PesquisarPaciente);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/examepng.png"))); // NOI18N
        jMenuItem11.setText("Exame Clínico");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        jMenuItem12.setText("Laboratório Clínico");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/anamnesepng.png"))); // NOI18N
        jMenuItem13.setText("Dados Anammese");
        jMenu2.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        jMenuItem14.setText("Unidade de Saúde");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        jMenuItem15.setText("Exame Cipatológico");
        jMenu2.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        jMenuItem16.setText("Busca Ativa");
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        jMenuItem17.setText("Busca Ativa");
        jMenu3.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        jMenuItem18.setText("Laudo de Exame Cipatológico");
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        CadastroUsuario1 Prin = new CadastroUsuario1();
        Prin.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroPaci Prin = new CadastroPaci();
        Prin.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         dispose();
        Login Prin = new Login();
        Prin.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
        PesquisarUsuario prin=new PesquisarUsuario();
        prin.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void PesquisarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarUsuarioMouseClicked
        
    }//GEN-LAST:event_PesquisarUsuarioMouseClicked

    private void PesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarUsuarioActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarUsuario prin=new PesquisarUsuario();
        prin.setVisible(true);
    }//GEN-LAST:event_PesquisarUsuarioActionPerformed

    private void PesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarPacienteActionPerformed
         dispose();
        PesquisarPaciente prin=new PesquisarPaciente();
        prin.setVisible(true);
    }//GEN-LAST:event_PesquisarPacienteActionPerformed

    private void CadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastraMouseClicked
        dispose();
        CadastroUsuario1 prin=new CadastroUsuario1();
        prin.setVisible(true);
    }//GEN-LAST:event_CadastraMouseClicked

    private void jMenuItemunidadeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemunidadeSaudeActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroUnid prin=new CadastroUnid();
        prin.setVisible(true);
    }//GEN-LAST:event_jMenuItemunidadeSaudeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroExCli ex = new CadastroExCli();
        ex.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroLab lab =new CadastroLab();
        lab.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemDadosAnamneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDadosAnamneseActionPerformed
        // TODO add your handling code here:
                dispose();
        CadastroAnam prin = new CadastroAnam();
        prin.setVisible(true);
    }//GEN-LAST:event_jMenuItemDadosAnamneseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel");
        } catch (Exception e) {
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastra;
    private javax.swing.JMenuItem PesquisarPaciente;
    private javax.swing.JMenuItem PesquisarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemDadosAnamnese;
    private javax.swing.JMenuItem jMenuItemunidadeSaude;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
