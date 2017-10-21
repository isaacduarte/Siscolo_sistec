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
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class CadastroCelulasATI extends javax.swing.JFrame {

    public CadastroCelulasATI() {
        initComponents();
        setIcon();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jCEP = new javax.swing.JCheckBox();
        jCELesao = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCGPossivelmente = new javax.swing.JCheckBox();
        jCGLesao = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCIPossivelmente = new javax.swing.JCheckBox();
        jCILesao = new javax.swing.JCheckBox();
        jCELesaoBaixo = new javax.swing.JCheckBox();
        jCELesaoAlto = new javax.swing.JCheckBox();
        jCELesaoaltonao = new javax.swing.JCheckBox();
        jCEcarcinoma = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCGAdenocarcinoma = new javax.swing.JCheckBox();
        jCGCervical = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jCGEndometria = new javax.swing.JCheckBox();
        jCGSem = new javax.swing.JCheckBox();
        jCIOutras = new javax.swing.JCheckBox();
        jCIPresenca = new javax.swing.JCheckBox();
        jTOutras = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLatipiasCelulasGlandulares = new javax.swing.JLabel();
        jLatipiaCelulasEscamosas = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLadequabilidadeMaterial = new javax.swing.JLabel();
        jLCelulasAtipicas = new javax.swing.JLabel();
        jLidpaci = new javax.swing.JLabel();
        jLSPCitotecnico = new javax.swing.JLabel();
        jLDataResulta = new javax.swing.JLabel();
        jLDiagnostico = new javax.swing.JLabel();
        celulasAtipicas = new javax.swing.JLabel();
        jLObsG = new javax.swing.JLabel();
        jLavaliacaopreAnalitica = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jLIdLab = new javax.swing.JLabel();
        jLIdUni = new javax.swing.JLabel();
        jLMicrobiologia = new javax.swing.JLabel();
        jLOrigemIndefinida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Celulas Atípicas");
        setMinimumSize(new java.awt.Dimension(710, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Atipias em Células Escamosas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jCEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCEP.setText("Possivelmente não neoplásicas (ASC-US)");
        jCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEPActionPerformed(evt);
            }
        });
        getContentPane().add(jCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));

        jCELesao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCELesao.setText("Não se pode afastar lesão de alto grau (ASC-H)");
        jCELesao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCELesaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCELesao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Glandulares:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jCGPossivelmente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCGPossivelmente.setText("Possivelmente não neoplásicas");
        jCGPossivelmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGPossivelmenteActionPerformed(evt);
            }
        });
        getContentPane().add(jCGPossivelmente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jCGLesao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCGLesao.setText("Não se pode afastar lesão de alto grau");
        jCGLesao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGLesaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCGLesao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("De origem indefinida:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jCIPossivelmente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCIPossivelmente.setText("Possivelmente não neoplásicas");
        jCIPossivelmente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCIPossivelmenteActionPerformed(evt);
            }
        });
        getContentPane().add(jCIPossivelmente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jCILesao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCILesao.setText("Não se pode afastar lesão de alto grau");
        jCILesao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCILesaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCILesao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jCELesaoBaixo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCELesaoBaixo.setText("Lesão intra-epitelial de baixo grau (compreendendo efeito citopático pelo HPV e neoplasia intra-epitelial cervical grau I)");
        jCELesaoBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCELesaoBaixoActionPerformed(evt);
            }
        });
        getContentPane().add(jCELesaoBaixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jCELesaoAlto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCELesaoAlto.setText("Lesão intra-epitelial de alto grau (compreendendo neoplasias intraepiteliais cervicais graus II e III");
        jCELesaoAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCELesaoAltoActionPerformed(evt);
            }
        });
        getContentPane().add(jCELesaoAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jCELesaoaltonao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCELesaoaltonao.setText("Lesão intra-epitelial de alto grau, não podendo excluir micro-invasão");
        jCELesaoaltonao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCELesaoaltonaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCELesaoaltonao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jCEcarcinoma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCEcarcinoma.setText("Carcinoma epidermóide invasor");
        jCEcarcinoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCEcarcinomaActionPerformed(evt);
            }
        });
        getContentPane().add(jCEcarcinoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Escamosas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jCGAdenocarcinoma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCGAdenocarcinoma.setText("Adenocarcinoma \"in situ\"");
        jCGAdenocarcinoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGAdenocarcinomaActionPerformed(evt);
            }
        });
        getContentPane().add(jCGAdenocarcinoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jCGCervical.setText("Cervical");
        jCGCervical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGCervicalActionPerformed(evt);
            }
        });
        getContentPane().add(jCGCervical, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Adenocarcinoma Invasor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jCGEndometria.setText("Endometria");
        jCGEndometria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGEndometriaActionPerformed(evt);
            }
        });
        getContentPane().add(jCGEndometria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jCGSem.setText("Sem outras especificações");
        jCGSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCGSemActionPerformed(evt);
            }
        });
        getContentPane().add(jCGSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jCIOutras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCIOutras.setText("OUTRAS NEOPLASIAS MALIGNAS:");
        jCIOutras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCIOutrasActionPerformed(evt);
            }
        });
        getContentPane().add(jCIOutras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jCIPresenca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCIPresenca.setText("PRESENÇA DE CÉLULAS ENDOMETRIAIS (NA PÓS-MENOPAUSA OU ACIMA DE 40 ANOS, FORA DO PERÍODO MENSTRUAL)");
        jCIPresenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCIPresencaActionPerformed(evt);
            }
        });
        getContentPane().add(jCIPresenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));
        getContentPane().add(jTOutras, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 470, -1));

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundocipato.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 570));

        jLatipiasCelulasGlandulares.setText("jLabel9");
        getContentPane().add(jLatipiasCelulasGlandulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 40, -1));

        jLatipiaCelulasEscamosas.setText("jLabel8");
        getContentPane().add(jLatipiaCelulasEscamosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 40, -1));

        jLId.setText("jLabel2");
        getContentPane().add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 40, -1));

        jLadequabilidadeMaterial.setText("jLabel2");
        getContentPane().add(jLadequabilidadeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 40, -1));

        jLCelulasAtipicas.setText("jLabel2");
        getContentPane().add(jLCelulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 40, -1));

        jLidpaci.setText("jLabel2");
        getContentPane().add(jLidpaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 40, -1));

        jLSPCitotecnico.setText("jLabel11");
        getContentPane().add(jLSPCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 50, -1));

        jLDataResulta.setText("jLabel2");
        getContentPane().add(jLDataResulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 40, -1));

        jLDiagnostico.setText("jLabel7");
        getContentPane().add(jLDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 40, -1));

        celulasAtipicas.setText("jLabel6");
        getContentPane().add(celulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 40, -1));

        jLObsG.setText("jLabel10");
        getContentPane().add(jLObsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 50, -1));

        jLavaliacaopreAnalitica.setText("jLabel2");
        getContentPane().add(jLavaliacaopreAnalitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 40, -1));

        jLResponsavel.setText("jLabel12");
        getContentPane().add(jLResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, -1));

        jLIdLab.setText("jLabel1");
        getContentPane().add(jLIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        jLIdUni.setText("jLabel1");
        getContentPane().add(jLIdUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLMicrobiologia.setText("jLabel7");
        getContentPane().add(jLMicrobiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 40, -1));

        jLOrigemIndefinida.setText("jLabel1");
        getContentPane().add(jLOrigemIndefinida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void cadastroCont(citopatologico cito){
    
        citopatologicoDao dao = new citopatologicoDao();
        cito = dao.obter(citopatologico.class, cito.getId());
        jLId.setText(""+cito.getId());
        jLidpaci.setText(""+cito.getPaciente().getId());
        jLIdLab.setText(""+cito.getLaboratorio().getId());
        jLIdUni.setText(""+cito.getUnidadeSaude().getId());
        jLadequabilidadeMaterial.setText(cito.getAdquabilidadeMaterial());
        jLMicrobiologia.setText(cito.getMicrobiologia());
        jLavaliacaopreAnalitica.setText(cito.getAvaliacaoPreAnalitica());
        jLatipiasCelulasGlandulares.setText(cito.getAtipiasCelulasGlandulares());
        jLatipiaCelulasEscamosas.setText(cito.getAtipiasCelulasEscamosas());
        jLOrigemIndefinida.setText(cito.getOrigemIndefinida());
        jLSPCitotecnico.setText(cito.getSPCitotecnico());
        jLResponsavel.setText(cito.getResponsavel());
        jLObsG.setText(cito.getObsG());
        jLDiagnostico.setText(cito.getDiagnosticoDescritivo());
        jLDataResulta.setText(cito.getDataResultado());
        jLCelulasAtipicas.setText(cito.getCelulasAtipicas());
}
    private void jCGSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGSemActionPerformed
        // TODO add your handling code here:
        jCGPossivelmente.setSelected(false);
        jCGAdenocarcinoma.setSelected(false);
        jCGCervical.setSelected(false);
        jCGEndometria.setSelected(false);
        jCGLesao.setSelected(true);
        jCIPresenca.setSelected(false);
    }//GEN-LAST:event_jCGSemActionPerformed

    private void jCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEPActionPerformed
        // TODO add your handling code here:
        jCELesao.setSelected(false);
        jCELesaoAlto.setSelected(false);
        jCELesaoBaixo.setSelected(false);
        jCELesaoaltonao.setSelected(false);
        jCEcarcinoma.setSelected(false);
    }//GEN-LAST:event_jCEPActionPerformed

    private void jCELesaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCELesaoActionPerformed
        // TODO add your handling code here:
        jCEP.setSelected(false);
    }//GEN-LAST:event_jCELesaoActionPerformed

    private void jCELesaoBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCELesaoBaixoActionPerformed
        // TODO add your handling code here:
        jCELesao.setSelected(true);
        jCEP.setSelected(false);
        jCELesaoAlto.setSelected(false);
        jCELesaoaltonao.setSelected(false);
        jCEcarcinoma.setSelected(false);
        
    }//GEN-LAST:event_jCELesaoBaixoActionPerformed

    private void jCELesaoAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCELesaoAltoActionPerformed
        // TODO add your handling code here:
        jCELesao.setSelected(true);
        jCEP.setSelected(false);
        jCELesaoBaixo.setSelected(false);
        jCELesaoaltonao.setSelected(false);
        jCEcarcinoma.setSelected(false);
    }//GEN-LAST:event_jCELesaoAltoActionPerformed

    private void jCELesaoaltonaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCELesaoaltonaoActionPerformed
        // TODO add your handling code here:
        jCELesao.setSelected(true);
        jCEP.setSelected(false);
        jCELesaoAlto.setSelected(false);
        jCELesaoBaixo.setSelected(false);
        jCEcarcinoma.setSelected(false);
    }//GEN-LAST:event_jCELesaoaltonaoActionPerformed

    private void jCEcarcinomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCEcarcinomaActionPerformed
        // TODO add your handling code here:
        jCELesao.setSelected(true);
        jCEP.setSelected(false);
        jCELesaoAlto.setSelected(false);
        jCELesaoBaixo.setSelected(false);
        jCELesaoaltonao.setSelected(false);
    }//GEN-LAST:event_jCEcarcinomaActionPerformed

    private void jCGPossivelmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGPossivelmenteActionPerformed
        // TODO add your handling code here:
        jCGAdenocarcinoma.setSelected(false);
        jCGCervical.setSelected(false);
        jCGEndometria.setSelected(false);
        jCGLesao.setSelected(false);
        jCIPresenca.setSelected(false);
        jCGSem.setSelected(false);
    }//GEN-LAST:event_jCGPossivelmenteActionPerformed

    private void jCGLesaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGLesaoActionPerformed
        // TODO add your handling code here:
        jCGPossivelmente.setSelected(false);
    }//GEN-LAST:event_jCGLesaoActionPerformed

    private void jCGAdenocarcinomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGAdenocarcinomaActionPerformed
        jCGPossivelmente.setSelected(false);
        jCGCervical.setSelected(false);
        jCGEndometria.setSelected(false);
        jCGLesao.setSelected(true);
        jCIPresenca.setSelected(false);
        jCGSem.setSelected(false);
    }//GEN-LAST:event_jCGAdenocarcinomaActionPerformed

    private void jCGCervicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGCervicalActionPerformed
        // TODO add your handling code here:
        jCGPossivelmente.setSelected(false);
        jCGAdenocarcinoma.setSelected(false);
        jCGEndometria.setSelected(false);
        jCGLesao.setSelected(true);
        jCIPresenca.setSelected(false);
        jCGSem.setSelected(false);
    }//GEN-LAST:event_jCGCervicalActionPerformed

    private void jCGEndometriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCGEndometriaActionPerformed
        // TODO add your handling code here:
        jCGPossivelmente.setSelected(false);
        jCGAdenocarcinoma.setSelected(false);
        jCGCervical.setSelected(false);
        jCGLesao.setSelected(true);
        jCIPresenca.setSelected(false);
        jCGSem.setSelected(false);
    }//GEN-LAST:event_jCGEndometriaActionPerformed

    private void jCIPossivelmenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCIPossivelmenteActionPerformed
        // TODO add your handling code here:
        jCILesao.setSelected(false);
        jCIOutras.setSelected(false);
        jCIPresenca.setSelected(false);
    }//GEN-LAST:event_jCIPossivelmenteActionPerformed

    private void jCILesaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCILesaoActionPerformed
        // TODO add your handling code here:
        jCIPossivelmente.setSelected(false);
    }//GEN-LAST:event_jCILesaoActionPerformed

    private void jCIOutrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCIOutrasActionPerformed
        // TODO add your handling code here:
        jCILesao.setSelected(true);
        jCIPossivelmente.setSelected(false);
        jCIPresenca.setSelected(false);
    }//GEN-LAST:event_jCIOutrasActionPerformed

    private void jCIPresencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCIPresencaActionPerformed
        // TODO add your handling code here:
        jCILesao.setSelected(true);
        jCIOutras.setSelected(false);
        jCIPossivelmente.setSelected(false);
    }//GEN-LAST:event_jCIPresencaActionPerformed

    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        if(!jCELesao.isSelected() && !jCEP.isSelected()){
            JOptionPane.showMessageDialog(this, "Campos Obrigatorios não Selecionados");
        }else if(!jCGLesao.isSelected() && !jCGPossivelmente.isSelected()){
            JOptionPane.showMessageDialog(this, "Campos Obrigatorios não Selecionados");
        }else if(!jCILesao.isSelected() && !jCIPossivelmente.isSelected()){
            JOptionPane.showMessageDialog(this, "Campos Obrigatorios não Selecionados");
        }else{
            citopatologico cito = new citopatologico();
            if(jCEP.isSelected()){
                cito.setCelulasAtipicas(jCEP.getText());
            
            }else if(jCELesao.isSelected()){
                cito.setCelulasAtipicas(jCELesao.getText());
                if(jCELesaoAlto.isSelected()){
                    cito.setAtipiasCelulasEscamosas(jCELesaoAlto.getText());
                }else if(jCELesaoBaixo.isSelected()){
                    cito.setAtipiasCelulasEscamosas(jCELesaoBaixo.getText());
                
                }else if(jCELesaoaltonao.isSelected()){
                    cito.setAtipiasCelulasEscamosas(jCELesaoaltonao.getText());
                    }
                else if(jCEcarcinoma.isSelected()){
                    cito.setAtipiasCelulasEscamosas(jCEcarcinoma.getText());
                }
                }//aqui ooooo
            
            if(jCGPossivelmente.isSelected()){
                cito.setCelulasAtipicas(jCGPossivelmente.getText());
            
            }else if(jCGLesao.isSelected()){
                cito.setCelulasAtipicas(jCGLesao.getText());
                if(jCGAdenocarcinoma.isSelected()){
                    cito.setAtipiasCelulasGlandulares(jCGAdenocarcinoma.getText());
                }else if(jCGCervical.isSelected()){
                    cito.setAtipiasCelulasGlandulares("Adenocarcinoma Invasor:"+jCGCervical.getText());
                
                }else if(jCGEndometria.isSelected()){
                    cito.setAtipiasCelulasGlandulares("Adenocarcinoma Invasor:"+jCELesaoaltonao.getText());
                    }
                else if(jCGSem.isSelected()){
                    cito.setAtipiasCelulasGlandulares("Adenocarcinoma Invasor:"+jCGSem.getText());
                }
                }
            
            
            if(jCIPossivelmente.isSelected()){
                cito.setCelulasAtipicas(jCIPossivelmente.getText());
            
            }else if(jCILesao.isSelected()){
                cito.setCelulasAtipicas(jCILesao.getText());
                if(jCIPresenca.isSelected()){
                    cito.setOrigemIndefinida(jCGAdenocarcinoma.getText());
                }else if(jCIOutras.isSelected()){
                    cito.setOrigemIndefinida(jTOutras.getText());
                
                }
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
            
            
            cito.setMicrobiologia(jLMicrobiologia.getText());
            cito.setAvaliacaoPreAnalitica(jLavaliacaopreAnalitica.getText());
            cito.setDataResultado(jLDataResulta.getText());
            cito.setAdquabilidadeMaterial(jLadequabilidadeMaterial.getText());
            cito.setDiagnosticoDescritivo(jLDiagnostico.getText());
            cito.setObsG(jLObsG.getText());
            cito.setResponsavel(jLResponsavel.getText());
            cito.setSPCitotecnico(jLSPCitotecnico.getText());
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            cito.setId(cito.getId());
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            CadastroInfo prin = new CadastroInfo();
            prin.cadastroCont(cito);
            prin.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CadastrarMouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroCitopatologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCitopatologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCitopatologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCitopatologico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCelulasATI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastrar;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel celulasAtipicas;
    private javax.swing.JCheckBox jCELesao;
    private javax.swing.JCheckBox jCELesaoAlto;
    private javax.swing.JCheckBox jCELesaoBaixo;
    private javax.swing.JCheckBox jCELesaoaltonao;
    private javax.swing.JCheckBox jCEP;
    private javax.swing.JCheckBox jCEcarcinoma;
    private javax.swing.JCheckBox jCGAdenocarcinoma;
    private javax.swing.JCheckBox jCGCervical;
    private javax.swing.JCheckBox jCGEndometria;
    private javax.swing.JCheckBox jCGLesao;
    private javax.swing.JCheckBox jCGPossivelmente;
    private javax.swing.JCheckBox jCGSem;
    private javax.swing.JCheckBox jCILesao;
    private javax.swing.JCheckBox jCIOutras;
    private javax.swing.JCheckBox jCIPossivelmente;
    private javax.swing.JCheckBox jCIPresenca;
    private javax.swing.JLabel jLCelulasAtipicas;
    private javax.swing.JLabel jLDataResulta;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLIdLab;
    private javax.swing.JLabel jLIdUni;
    private javax.swing.JLabel jLMicrobiologia;
    private javax.swing.JLabel jLObsG;
    private javax.swing.JLabel jLOrigemIndefinida;
    private javax.swing.JLabel jLResponsavel;
    private javax.swing.JLabel jLSPCitotecnico;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLadequabilidadeMaterial;
    private javax.swing.JLabel jLatipiaCelulasEscamosas;
    private javax.swing.JLabel jLatipiasCelulasGlandulares;
    private javax.swing.JLabel jLavaliacaopreAnalitica;
    private javax.swing.JLabel jLidpaci;
    private javax.swing.JTextField jTOutras;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
