/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Dao.citopatologicoDao;
import classJava.Laboratorio;
import classJava.Paciente;
import classJava.UnidadeSaude;
import classJava.citopatologico;
import javax.swing.JOptionPane;

/**
 *
  */
public class UpDiagnostico extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDiagnostico
     */
    public UpDiagnostico() {
        initComponents();
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
        jRsim = new javax.swing.JRadioButton();
        jRnao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jCBinflamacao = new javax.swing.JCheckBox();
        JCBMetaplasia = new javax.swing.JCheckBox();
        JCBReparação = new javax.swing.JCheckBox();
        JCBAtrofia = new javax.swing.JCheckBox();
        JCBRadiacao = new javax.swing.JCheckBox();
        JCBOutros = new javax.swing.JCheckBox();
        Cadastra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToutros = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLidpaci = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jLatipiaCelulasEscamosas = new javax.swing.JLabel();
        jLCelulasAtipicas = new javax.swing.JLabel();
        jLadequabilidadeMaterial = new javax.swing.JLabel();
        jLDataResulta = new javax.swing.JLabel();
        jLMicrobiologia = new javax.swing.JLabel();
        jLSPCitotecnico = new javax.swing.JLabel();
        jLavaliacaopreAnalitica = new javax.swing.JLabel();
        celulasAtipicas = new javax.swing.JLabel();
        jLatipiasCelulasGlandulares = new javax.swing.JLabel();
        jLObsG = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLIdLab = new javax.swing.JLabel();
        jLIdUni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DENTRO DOS LIMITES DA NORMALIDADE NO MATERIAL EXAMINADO?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 451, -1));

        jRsim.setText("Sim");
        jRsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRsimActionPerformed(evt);
            }
        });
        getContentPane().add(jRsim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));

        jRnao.setText("Não");
        jRnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRnaoActionPerformed(evt);
            }
        });
        getContentPane().add(jRnao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 23, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, -1, -1));

        jCBinflamacao.setText("Inflamação");
        jCBinflamacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBinflamacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCBinflamacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        JCBMetaplasia.setText("Metaplasia escamosa imatura");
        JCBMetaplasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMetaplasiaActionPerformed(evt);
            }
        });
        getContentPane().add(JCBMetaplasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        JCBReparação.setText("Reparação");
        JCBReparação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBReparaçãoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBReparação, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        JCBAtrofia.setText("Atrofia com Inflamação");
        JCBAtrofia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAtrofiaActionPerformed(evt);
            }
        });
        getContentPane().add(JCBAtrofia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        JCBRadiacao.setText("Radiação");
        JCBRadiacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBRadiacaoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBRadiacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        JCBOutros.setText("Outros; especificar:");
        JCBOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBOutrosActionPerformed(evt);
            }
        });
        getContentPane().add(JCBOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        Cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Cadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastraMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));
        getContentPane().add(jToutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 197, 324, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundop15c.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 330));

        jLidpaci.setText("jLabel2");
        getContentPane().add(jLidpaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 40, -1));

        jLResponsavel.setText("jLabel12");
        getContentPane().add(jLResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, -1));

        jLatipiaCelulasEscamosas.setText("jLabel8");
        getContentPane().add(jLatipiaCelulasEscamosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, -1));

        jLCelulasAtipicas.setText("jLabel2");
        getContentPane().add(jLCelulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        jLadequabilidadeMaterial.setText("jLabel2");
        getContentPane().add(jLadequabilidadeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 40, -1));

        jLDataResulta.setText("jLabel2");
        getContentPane().add(jLDataResulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 40, -1));

        jLMicrobiologia.setText("jLabel7");
        getContentPane().add(jLMicrobiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        jLSPCitotecnico.setText("jLabel11");
        getContentPane().add(jLSPCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, -1));

        jLavaliacaopreAnalitica.setText("jLabel2");
        getContentPane().add(jLavaliacaopreAnalitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        celulasAtipicas.setText("jLabel6");
        getContentPane().add(celulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        jLatipiasCelulasGlandulares.setText("jLabel9");
        getContentPane().add(jLatipiasCelulasGlandulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, -1));

        jLObsG.setText("jLabel10");
        getContentPane().add(jLObsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 50, -1));

        jLId.setText("jLabel2");
        getContentPane().add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 40, -1));

        jLIdLab.setText("jLabel3");
        getContentPane().add(jLIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLIdUni.setText("jLabel3");
        getContentPane().add(jLIdUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRsimActionPerformed
        jRnao.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_jRsimActionPerformed

    private void jRnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRnaoActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_jRnaoActionPerformed

    private void jCBinflamacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBinflamacaoActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
    }//GEN-LAST:event_jCBinflamacaoActionPerformed

    private void JCBMetaplasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMetaplasiaActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_JCBMetaplasiaActionPerformed

    private void JCBReparaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBReparaçãoActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_JCBReparaçãoActionPerformed

    private void JCBAtrofiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAtrofiaActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_JCBAtrofiaActionPerformed

    private void JCBRadiacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRadiacaoActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBOutros.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_JCBRadiacaoActionPerformed

    private void JCBOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBOutrosActionPerformed
        // TODO add your handling code here:
        jRsim.setSelected(false);
        JCBAtrofia.setSelected(false);
        JCBMetaplasia.setSelected(false);
        JCBRadiacao.setSelected(false);
        JCBReparação.setSelected(false);
        jCBinflamacao.setSelected(false);
    }//GEN-LAST:event_JCBOutrosActionPerformed

    private void CadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastraMouseClicked
if(!JCBAtrofia.isSelected() && !JCBMetaplasia.isSelected() && !JCBOutros.isSelected() && !JCBRadiacao.isSelected()
              && !JCBReparação.isSelected() && !jCBinflamacao.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções");
        }else{
            citopatologico cito = new citopatologico();
            if(jRsim.isSelected()){
            cito.setDiagnosticoDescritivo("DENTRO DOS LIMITES DA NORMALIDADE NO MATERIAL EXAMINADO?"+jRsim.getText());
            }else if(jRnao.isSelected()){
                if(JCBAtrofia.isSelected()){
                cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBAtrofia.getText());
                }else if(JCBMetaplasia.isSelected()){
                cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBMetaplasia);
                }else if(JCBOutros.isSelected()){
                    cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+jToutros.getText());
                }else if(JCBRadiacao.isSelected()){
                   cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBRadiacao);
                }else if(JCBReparação.isSelected()){
                    cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBReparação.getText());
            }else if(jCBinflamacao.isSelected()){
                cito.setDiagnosticoDescritivo("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+jCBinflamacao.getText());
                
            }}
            int i = Integer.parseInt(jLId.getText());
            cito.setId(i);
            
            int ip =Integer.parseInt(jLidpaci.getText());
            Paciente p = new Paciente();
            p.setId(ip);
            cito.setPaciente(p);

            int iUni =Integer.parseInt(jLIdUni.getText());
            UnidadeSaude uni = new UnidadeSaude();
            uni.setId(iUni);
            cito.setUnidadeSaude(uni);
            
            int iLab =Integer.parseInt(jLIdLab.getText());
            Laboratorio lab = new Laboratorio();
            lab.setId(iLab);
            cito.setLaboratorio(lab);
            
            cito.setAtipiasCelulasEscamosas(jLatipiaCelulasEscamosas.getText());
            cito.setAtipiasCelulasGlandulares(jLatipiasCelulasGlandulares.getText());
            cito.setAvaliacaoPreAnalitica(jLavaliacaopreAnalitica.getText());
            cito.setCelulasAtipicas(jLCelulasAtipicas.getText());
            cito.setDataResultado(jLDataResulta.getText());
            cito.setAdquabilidadeMaterial(jLadequabilidadeMaterial.getText());
            cito.setMicrobiologia(jLMicrobiologia.getText());
            cito.setObsG(jLObsG.getText());
            cito.setResponsavel(jLResponsavel.getText());
            cito.setSPCitotecnico(jLSPCitotecnico.getText());
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            cito.setId(cito.getId());
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            UpMicrobio prin = new UpMicrobio();
            prin.cadastroCont(cito);
            prin.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_CadastraMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked
    public void cadastroCont(citopatologico cito){
    
        citopatologicoDao dao = new citopatologicoDao();
        cito = dao.obter(citopatologico.class, cito.getId());
        jLId.setText(""+cito.getId());
        jLidpaci.setText(""+cito.getPaciente().getId());
        jLIdLab.setText(""+cito.getLaboratorio().getId());
        jLIdUni.setText(""+cito.getUnidadeSaude().getId());
        
        if(cito.getDiagnosticoDescritivo().equals("DENTRO DOS LIMITES DA NORMALIDADE NO MATERIAL EXAMINADO?"+jRsim.getText())){
            jRsim.setSelected(true);
            }else{
               jRnao.setSelected(true);
 if(cito.getDiagnosticoDescritivo().equals("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBAtrofia.getText())){
                JCBAtrofia.setSelected(true);
}else if(cito.getDiagnosticoDescritivo().equals("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBMetaplasia.getText())){
                JCBMetaplasia.setSelected(true);
}else if(cito.getDiagnosticoDescritivo().equals("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBRadiacao.getText())){
                   JCBRadiacao.setSelected(true);
}else if(cito.getDiagnosticoDescritivo().equals("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+JCBReparação.getText())){
                    JCBReparação.setSelected(true);
}else if(cito.getDiagnosticoDescritivo().equals("ALTERAÇÕES CELULARES DA NORMALIDADE REATIVAS OU REPARATIVAS"+jCBinflamacao.getText())){
                jCBinflamacao.setSelected(true);
                
            }else{
                JCBOutros.setSelected(true);
                jToutros.setText(cito.getDiagnosticoDescritivo());
}
        }
        
        jLadequabilidadeMaterial.setText(cito.getAdquabilidadeMaterial());
        jLavaliacaopreAnalitica.setText(cito.getAvaliacaoPreAnalitica());
        jLatipiasCelulasGlandulares.setText(cito.getAtipiasCelulasGlandulares());
        jLatipiaCelulasEscamosas.setText(cito.getAtipiasCelulasEscamosas());
        jLSPCitotecnico.setText(cito.getSPCitotecnico());
        jLResponsavel.setText(cito.getResponsavel());
        jLObsG.setText(cito.getObsG());
        jLMicrobiologia.setText(cito.getMicrobiologia());
        jLDataResulta.setText(cito.getDataResultado());
        jLCelulasAtipicas.setText(cito.getCelulasAtipicas());
}
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
            java.util.logging.Logger.getLogger(CadastroDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDiagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpDiagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastra;
    private javax.swing.JCheckBox JCBAtrofia;
    private javax.swing.JCheckBox JCBMetaplasia;
    private javax.swing.JCheckBox JCBOutros;
    private javax.swing.JCheckBox JCBRadiacao;
    private javax.swing.JCheckBox JCBReparação;
    private javax.swing.JLabel celulasAtipicas;
    private javax.swing.JCheckBox jCBinflamacao;
    private javax.swing.JLabel jLCelulasAtipicas;
    private javax.swing.JLabel jLDataResulta;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdLab;
    private javax.swing.JLabel jLIdUni;
    private javax.swing.JLabel jLMicrobiologia;
    private javax.swing.JLabel jLObsG;
    private javax.swing.JLabel jLResponsavel;
    private javax.swing.JLabel jLSPCitotecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLadequabilidadeMaterial;
    private javax.swing.JLabel jLatipiaCelulasEscamosas;
    private javax.swing.JLabel jLatipiasCelulasGlandulares;
    private javax.swing.JLabel jLavaliacaopreAnalitica;
    private javax.swing.JLabel jLidpaci;
    private javax.swing.JRadioButton jRnao;
    private javax.swing.JRadioButton jRsim;
    private javax.swing.JTextField jToutros;
    // End of variables declaration//GEN-END:variables
}