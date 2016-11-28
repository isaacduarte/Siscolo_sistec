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
 * @author Caio
 */
public class UpAdequabilidade extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAvaliaçãoPreAnalitica
     */
    public UpAdequabilidade() {
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

        Cadastro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JCBsatisfatorio = new javax.swing.JCheckBox();
        JCBmaterial = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        JCBsangue = new javax.swing.JCheckBox();
        JCBpiocitos = new javax.swing.JCheckBox();
        JCBartefatos = new javax.swing.JCheckBox();
        JCBcontaminantes = new javax.swing.JCheckBox();
        JCBintensa = new javax.swing.JCheckBox();
        JCBoutros = new javax.swing.JCheckBox();
        JToutros = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        jLadequabilidadeMaterial = new javax.swing.JLabel();
        jLdiagnosticoDescritivo = new javax.swing.JLabel();
        celulasAtipicas = new javax.swing.JLabel();
        jLMicrobiologia = new javax.swing.JLabel();
        jLatipiaCelulasEscamosas = new javax.swing.JLabel();
        jLatipiasCelulasGlandulares = new javax.swing.JLabel();
        jLObsG = new javax.swing.JLabel();
        jLSPCitotecnico = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jLDataResulta = new javax.swing.JLabel();
        jLavaliacaopreAnalitica = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLidpaci = new javax.swing.JLabel();
        jLCelulasAtipicas = new javax.swing.JLabel();
        jLIdLab = new javax.swing.JLabel();
        jLIdUni = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Cadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        JCBsatisfatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBsatisfatorio.setText("Satisfatória");
        JCBsatisfatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBsatisfatorioActionPerformed(evt);
            }
        });
        getContentPane().add(JCBsatisfatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        JCBmaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBmaterial.setText("Material acelular ou hipocelular em menos de 10% do esfregaço");
        JCBmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBmaterialActionPerformed(evt);
            }
        });
        getContentPane().add(JCBmaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Insatisfatório para avaliação ancólica devido ao:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        JCBsangue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBsangue.setText("Sangue em mais de 75% do esfregaço");
        JCBsangue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBsangueActionPerformed(evt);
            }
        });
        getContentPane().add(JCBsangue, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));

        JCBpiocitos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBpiocitos.setText("Piócitos em mais de 75% do esfregaço");
        JCBpiocitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBpiocitosActionPerformed(evt);
            }
        });
        getContentPane().add(JCBpiocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, -1, -1));

        JCBartefatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBartefatos.setText("Artefatos de dessecamento em mais de 75% do esfregaço");
        JCBartefatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBartefatosActionPerformed(evt);
            }
        });
        getContentPane().add(JCBartefatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        JCBcontaminantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBcontaminantes.setText("Contaminantes externos em mais de 75% do esfregaço");
        JCBcontaminantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBcontaminantesActionPerformed(evt);
            }
        });
        getContentPane().add(JCBcontaminantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 169, -1, -1));

        JCBintensa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBintensa.setText("Intensa superposição celular em mais de 75% do esfregaço");
        JCBintensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBintensaActionPerformed(evt);
            }
        });
        getContentPane().add(JCBintensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 192, -1, -1));

        JCBoutros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBoutros.setText("Outros, especificar:");
        JCBoutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoutrosActionPerformed(evt);
            }
        });
        getContentPane().add(JCBoutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));
        getContentPane().add(JToutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, -1));

        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundop15.jpg"))); // NOI18N
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        jLadequabilidadeMaterial.setText("jLabel2");
        getContentPane().add(jLadequabilidadeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 40, -1));

        jLdiagnosticoDescritivo.setText("jLabel5");
        getContentPane().add(jLdiagnosticoDescritivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 40, -1));

        celulasAtipicas.setText("jLabel6");
        getContentPane().add(celulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        jLMicrobiologia.setText("jLabel7");
        getContentPane().add(jLMicrobiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        jLatipiaCelulasEscamosas.setText("jLabel8");
        getContentPane().add(jLatipiaCelulasEscamosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, -1));

        jLatipiasCelulasGlandulares.setText("jLabel9");
        getContentPane().add(jLatipiasCelulasGlandulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, -1));

        jLObsG.setText("jLabel10");
        getContentPane().add(jLObsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 50, -1));

        jLSPCitotecnico.setText("jLabel11");
        getContentPane().add(jLSPCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, -1));

        jLResponsavel.setText("jLabel12");
        getContentPane().add(jLResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, -1));

        jLDataResulta.setText("jLabel2");
        getContentPane().add(jLDataResulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 40, -1));

        jLavaliacaopreAnalitica.setText("jLabel2");
        getContentPane().add(jLavaliacaopreAnalitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        jLId.setText("jLabel2");
        getContentPane().add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 40, -1));

        jLidpaci.setText("jLabel2");
        getContentPane().add(jLidpaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 40, -1));

        jLCelulasAtipicas.setText("jLabel2");
        getContentPane().add(jLCelulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 40, -1));

        jLIdLab.setText("IDLAb");
        getContentPane().add(jLIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLIdUni.setText("jLabel2");
        getContentPane().add(jLIdUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cadastroCont(citopatologico cito2){
    
        citopatologicoDao dao = new citopatologicoDao();
        cito2 = dao.obter(citopatologico.class, cito2.getId());
        jLId.setText(""+cito2.getId());
        jLidpaci.setText(""+cito2.getPaciente().getId());
        jLIdLab.setText(""+cito2.getLaboratorio().getId());
        jLIdUni.setText(""+cito2.getUnidadeSaude().getId());
        
        if(cito2.getAdquabilidadeMaterial().equals(JCBsatisfatorio.getText())){
               JCBsatisfatorio.setSelected(true);
}else if(cito2.getAdquabilidadeMaterial().equals("Insatisfatório para avaliação ancólica devido ao:"+JCBartefatos.getText())){
                JCBartefatos.setSelected(true);
}else if(cito2.getAdquabilidadeMaterial().equals("Insatisfatório para avaliação ancólica devido ao:"+JCBcontaminantes.getText())){
            JCBcontaminantes.setSelected(true);
}else if(cito2.getAdquabilidadeMaterial().equals("Insatisfatório para avaliação ancólica devido ao:"+JCBintensa.getText())){
                JCBintensa.setSelected(true);
}else if(cito2.getAdquabilidadeMaterial().equals("Insatisfatório para avaliação ancólica devido ao:"+JCBmaterial.getText())){
            JCBmaterial.setSelected(true);
}else if(cito2.getAdquabilidadeMaterial().equals("Insatisfatório para avaliação ancólica devido ao:"+JCBpiocitos.getText())){
            JCBsangue.setSelected(true);
            }else {
                JCBoutros.setSelected(true);
                JToutros.setText(cito2.getAdquabilidadeMaterial());
}
        
        jLdiagnosticoDescritivo.setText(cito2.getDiagnosticoDescritivo());
        jLavaliacaopreAnalitica.setText(cito2.getAvaliacaoPreAnalitica());
        jLatipiasCelulasGlandulares.setText(cito2.getAtipiasCelulasGlandulares());
        jLatipiaCelulasEscamosas.setText(cito2.getAtipiasCelulasEscamosas());
        jLSPCitotecnico.setText(cito2.getSPCitotecnico());
        jLResponsavel.setText(cito2.getResponsavel());
        jLObsG.setText(cito2.getObsG());
        jLMicrobiologia.setText(cito2.getMicrobiologia());
        jLDataResulta.setText(cito2.getDataResultado());
        jLCelulasAtipicas.setText(cito2.getCelulasAtipicas());
}
    private void CadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroMouseClicked
        if(!JCBartefatos.isSelected() && !JCBcontaminantes.isSelected() && !JCBintensa.isSelected() && !JCBmaterial.isSelected()
        && !JCBoutros.isSelected() && !JCBpiocitos.isSelected() && !JCBsangue.isSelected() && !JCBsatisfatorio.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções");
        }else {
            citopatologico cito = new citopatologico();
            
            
            if(JCBsatisfatorio.isSelected()){
                cito.setAdquabilidadeMaterial(JCBsatisfatorio.getText());
            }else if(JCBartefatos.isSelected()){
                cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+ JCBartefatos.getText());
            }else if(JCBcontaminantes.isSelected()){
            cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+JCBcontaminantes.getText());
            }else if(JCBintensa.isSelected()){
                cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+JCBintensa.getText());
            }else if(JCBmaterial.isSelected()){
            cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+JCBmaterial.getText());
            }else if(JCBoutros.isSelected()){
            cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+JToutros.getText());
            }else if(JCBpiocitos.isSelected()){
            cito.setAdquabilidadeMaterial("Insatisfatório para avaliação ancólica devido ao:"+JCBsangue.getText());
            }
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
            cito.setDiagnosticoDescritivo(jLdiagnosticoDescritivo.getText());
            cito.setMicrobiologia(jLMicrobiologia.getText());
            cito.setObsG(jLObsG.getText());
            cito.setResponsavel(jLResponsavel.getText());
            cito.setSPCitotecnico(jLSPCitotecnico.getText());
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            cito.setId(cito.getId());
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            UpDiagnostico prin = new UpDiagnostico();
            prin.cadastroCont(cito);
            prin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CadastroMouseClicked

    private void JCBsatisfatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBsatisfatorioActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        
    }//GEN-LAST:event_JCBsatisfatorioActionPerformed

    private void JCBmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBmaterialActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBmaterialActionPerformed

    private void JCBsangueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBsangueActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBsangueActionPerformed

    private void JCBpiocitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBpiocitosActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBpiocitosActionPerformed

    private void JCBartefatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBartefatosActionPerformed

        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBartefatosActionPerformed

    private void JCBcontaminantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBcontaminantesActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBcontaminantesActionPerformed

    private void JCBintensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBintensaActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBoutros.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBintensaActionPerformed

    private void JCBoutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBoutrosActionPerformed
        // TODO add your handling code here:
        JCBartefatos.setSelected(false);
        JCBcontaminantes.setSelected(false);
        JCBintensa.setSelected(false);
        JCBmaterial.setSelected(false);
        JCBpiocitos.setSelected(false);
        JCBsangue.setSelected(false);
        JCBsatisfatorio.setSelected(false);
    }//GEN-LAST:event_JCBoutrosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAdequabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAdequabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAdequabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAdequabilidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpAdequabilidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastro;
    private javax.swing.JCheckBox JCBartefatos;
    private javax.swing.JCheckBox JCBcontaminantes;
    private javax.swing.JCheckBox JCBintensa;
    private javax.swing.JCheckBox JCBmaterial;
    private javax.swing.JCheckBox JCBoutros;
    private javax.swing.JCheckBox JCBpiocitos;
    private javax.swing.JCheckBox JCBsangue;
    private javax.swing.JCheckBox JCBsatisfatorio;
    private javax.swing.JTextField JToutros;
    private javax.swing.JLabel celulasAtipicas;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLadequabilidadeMaterial;
    private javax.swing.JLabel jLatipiaCelulasEscamosas;
    private javax.swing.JLabel jLatipiasCelulasGlandulares;
    private javax.swing.JLabel jLavaliacaopreAnalitica;
    private javax.swing.JLabel jLdiagnosticoDescritivo;
    private javax.swing.JLabel jLidpaci;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
