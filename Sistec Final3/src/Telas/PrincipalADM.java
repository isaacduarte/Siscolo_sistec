/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import classJava.Usuario;
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
//public void nivelAcesso(Usuario u){
  //  nivel.setText(u.getNivelDeAcesso());
//}
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
        nivel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UsuarioMenu = new javax.swing.JMenuItem();
        PacienteMenu = new javax.swing.JMenuItem();
        ExameClinicoMenu = new javax.swing.JMenuItem();
        LaboratorioClinicoMenu = new javax.swing.JMenuItem();
        DadosAnamineseMenu = new javax.swing.JMenuItem();
        UnidadeSaudeMenu = new javax.swing.JMenuItem();
        exameCipatologicoMenu = new javax.swing.JMenuItem();
        BuscaAtivaMenu = new javax.swing.JMenuItem();
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
        Sobre = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Administrador");
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

        nivel.setText("nivel");
        getContentPane().add(nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Cadastrar");

        UsuarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/usuariopng.png"))); // NOI18N
        UsuarioMenu.setText("Usuário");
        UsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioMenuActionPerformed(evt);
            }
        });
        jMenu1.add(UsuarioMenu);

        PacienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/patient-icon.png"))); // NOI18N
        PacienteMenu.setText("Paciente");
        PacienteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteMenuActionPerformed(evt);
            }
        });
        jMenu1.add(PacienteMenu);

        ExameClinicoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/examepng.png"))); // NOI18N
        ExameClinicoMenu.setText("Exame Clínico");
        ExameClinicoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExameClinicoMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ExameClinicoMenu);

        LaboratorioClinicoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        LaboratorioClinicoMenu.setText("Láboratório Clínico");
        LaboratorioClinicoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaboratorioClinicoMenuActionPerformed(evt);
            }
        });
        jMenu1.add(LaboratorioClinicoMenu);

        DadosAnamineseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/anamnesepng.png"))); // NOI18N
        DadosAnamineseMenu.setText("Dados Anamnese");
        DadosAnamineseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DadosAnamineseMenuActionPerformed(evt);
            }
        });
        jMenu1.add(DadosAnamineseMenu);

        UnidadeSaudeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        UnidadeSaudeMenu.setText("Unidade de Saúde");
        UnidadeSaudeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnidadeSaudeMenuActionPerformed(evt);
            }
        });
        jMenu1.add(UnidadeSaudeMenu);

        exameCipatologicoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        exameCipatologicoMenu.setText("Exame Cipatológico");
        exameCipatologicoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exameCipatologicoMenuActionPerformed(evt);
            }
        });
        jMenu1.add(exameCipatologicoMenu);

        BuscaAtivaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        BuscaAtivaMenu.setText("Busca Ativa");
        BuscaAtivaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaAtivaMenuActionPerformed(evt);
            }
        });
        jMenu1.add(BuscaAtivaMenu);

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
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        jMenuItem12.setText("Laboratório Clínico");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/anamnesepng.png"))); // NOI18N
        jMenuItem13.setText("Dados Anammese");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        jMenuItem14.setText("Unidade de Saúde");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        jMenuItem15.setText("Exame Cipatológico");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        jMenuItem16.setText("Busca Ativa");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/documentpng.png"))); // NOI18N
        jMenuItem17.setText("Busca Ativa");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/icon_011.png"))); // NOI18N
        jMenuItem18.setText("Laudo de Exame Cipatológico");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(Sobre);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioMenuActionPerformed
        dispose();
        CadastroUsuario1 Prin = new CadastroUsuario1();
        Prin.setVisible(true);
    }//GEN-LAST:event_UsuarioMenuActionPerformed

    private void PacienteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteMenuActionPerformed
        // TODO add your handling code here:
        dispose();
       // Usuario u = new Usuario();
       // u.setNivelDeAcesso(nivel.getText());
        
        CadastroPaci Prin = new CadastroPaci();
        //Prin.nivelAcesso(u);
        Prin.setVisible(true);
    }//GEN-LAST:event_PacienteMenuActionPerformed

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
         //Usuario u = new Usuario();
        //u.setNivelDeAcesso(nivel.getText());
        
        dispose();
        PesquisarPaciente prin = new PesquisarPaciente();
       // prin.nivelAcesso(u);
        prin.setVisible(true);
    }//GEN-LAST:event_PesquisarPacienteActionPerformed

    private void CadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastraMouseClicked
        dispose();
        CadastroUsuario1 prin=new CadastroUsuario1();
        prin.setVisible(true);
    }//GEN-LAST:event_CadastraMouseClicked

    private void UnidadeSaudeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnidadeSaudeMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroUnid prin=new CadastroUnid();
        prin.setVisible(true);
    }//GEN-LAST:event_UnidadeSaudeMenuActionPerformed

    private void ExameClinicoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExameClinicoMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        //Usuario u = new Usuario();
        //u.setNivelDeAcesso(nivel.getText());
        
        CadastroExCli Prin = new CadastroExCli();
        //Prin.nivelAcesso(u);
        Prin.setVisible(true);
    }//GEN-LAST:event_ExameClinicoMenuActionPerformed

    private void LaboratorioClinicoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaboratorioClinicoMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroLab lab =new CadastroLab();
        lab.setVisible(true);
    }//GEN-LAST:event_LaboratorioClinicoMenuActionPerformed

    private void DadosAnamineseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DadosAnamineseMenuActionPerformed
        // TODO add your handling code here:
                dispose();
        CadastroAnam prin = new CadastroAnam();
        prin.setVisible(true);
    }//GEN-LAST:event_DadosAnamineseMenuActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
                        dispose();
        PesquisarExameClinico prin = new PesquisarExameClinico();
        prin.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarAna ana=new PesquisarAna();
        ana.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarLab1 p = new PesquisarLab1();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarUnidadeSaude1 uni = new PesquisarUnidadeSaude1();
        uni.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void BuscaAtivaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaAtivaMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroBAtiva ba = new CadastroBAtiva();
        ba.setVisible(true);
    }//GEN-LAST:event_BuscaAtivaMenuActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarBuscaAtiva ba = new PesquisarBuscaAtiva();
        ba.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        dispose();
        RelatorioEC prin = new RelatorioEC();
        prin.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        dispose();
        PesquisarEC prin = new PesquisarEC();
        prin.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void exameCipatologicoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exameCipatologicoMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        CadastroCitopatologico prin = new CadastroCitopatologico();
        prin.setVisible(true);
    }//GEN-LAST:event_exameCipatologicoMenuActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        dispose();
        RelatorioBuscaAtiva re = new RelatorioBuscaAtiva();
        re.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SobreActionPerformed

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
    private javax.swing.JMenuItem BuscaAtivaMenu;
    private javax.swing.JLabel Cadastra;
    private javax.swing.JMenuItem DadosAnamineseMenu;
    private javax.swing.JMenuItem ExameClinicoMenu;
    private javax.swing.JMenuItem LaboratorioClinicoMenu;
    private javax.swing.JMenuItem PacienteMenu;
    private javax.swing.JMenuItem PesquisarPaciente;
    private javax.swing.JMenuItem PesquisarUsuario;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JMenuItem UnidadeSaudeMenu;
    private javax.swing.JMenuItem UsuarioMenu;
    private javax.swing.JMenuItem exameCipatologicoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JLabel nivel;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
