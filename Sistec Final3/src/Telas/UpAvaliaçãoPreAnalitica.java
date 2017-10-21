
package Telas;


import Dao.citopatologicoDao;
import classJava.Laboratorio;
import classJava.Paciente;
import classJava.UnidadeSaude;
import classJava.citopatologico;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class UpAvaliaçãoPreAnalitica extends javax.swing.JFrame {

    
    public UpAvaliaçãoPreAnalitica() {
        initComponents();
         setIcon();
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JCBAeilff = new javax.swing.JCheckBox();
        JCBlaminaDanificada = new javax.swing.JCheckBox();
        JCBCausasAlheias = new javax.swing.JCheckBox();
        JCBoutrasCoisas = new javax.swing.JCheckBox();
        JCBescamoso = new javax.swing.JCheckBox();
        JCBglandular = new javax.swing.JCheckBox();
        JCBmetaplasico = new javax.swing.JCheckBox();
        Cadastra = new javax.swing.JLabel();
        Cancelar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LPaciente = new javax.swing.JLabel();
        LLaboratorio = new javax.swing.JLabel();
        JTCausasAlheias = new javax.swing.JTextField();
        LUnidadeSaude = new javax.swing.JLabel();
        JToutrasCoisas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        teste = new javax.swing.JLabel();
        IDPaciente = new javax.swing.JLabel();
        IdUnidadeSaude = new javax.swing.JLabel();
        IdLaboratorio = new javax.swing.JLabel();
        IdCito = new javax.swing.JLabel();
        jLOrigemIndefinida = new javax.swing.JLabel();
        jLDiagnostico = new javax.swing.JLabel();
        jLCelulasAtipicas = new javax.swing.JLabel();
        jLSPCitotecnico = new javax.swing.JLabel();
        jLadequabilidadeMaterial = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jLavaliacaopreAnalitica = new javax.swing.JLabel();
        celulasAtipicas = new javax.swing.JLabel();
        jLObsG = new javax.swing.JLabel();
        jLMicrobiologia = new javax.swing.JLabel();
        jLatipiaCelulasEscamosas = new javax.swing.JLabel();
        jLatipiasCelulasGlandulares = new javax.swing.JLabel();
        jLDataResulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AVALIAÇÃO PRÉ-ANALÍTICA");
        setMinimumSize(new java.awt.Dimension(650, 410));
        setPreferredSize(new java.awt.Dimension(650, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Eptélios Represantados na Amostra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        JCBAeilff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBAeilff.setText("Ausência ou erro na identificação da lâmina, frasco ou formulário");
        JCBAeilff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAeilffActionPerformed(evt);
            }
        });
        getContentPane().add(JCBAeilff, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        JCBlaminaDanificada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBlaminaDanificada.setText("Lâmina danificada ou ausente");
        JCBlaminaDanificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBlaminaDanificadaActionPerformed(evt);
            }
        });
        getContentPane().add(JCBlaminaDanificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        JCBCausasAlheias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBCausasAlheias.setText("Causas alheias ao laboratório; especificar:");
        JCBCausasAlheias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCausasAlheiasActionPerformed(evt);
            }
        });
        getContentPane().add(JCBCausasAlheias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        JCBoutrasCoisas.setText("Outras causas; especificar:");
        JCBoutrasCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoutrasCoisasActionPerformed(evt);
            }
        });
        getContentPane().add(JCBoutrasCoisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        JCBescamoso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBescamoso.setText("Escamoso");
        JCBescamoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBescamosoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBescamoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        JCBglandular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBglandular.setText("Glandular");
        JCBglandular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBglandularActionPerformed(evt);
            }
        });
        getContentPane().add(JCBglandular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JCBmetaplasico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBmetaplasico.setText("Metaplásico");
        JCBmetaplasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBmetaplasicoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBmetaplasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        Cadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Cadastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastraMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("AMOSTRA REJEITADA POR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user icon.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        LPaciente.setText("jLabel6");
        getContentPane().add(LPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        LLaboratorio.setText("jLabel6");
        getContentPane().add(LLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        getContentPane().add(JTCausasAlheias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, -1));

        LUnidadeSaude.setText("jLabel6");
        getContentPane().add(LUnidadeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));
        getContentPane().add(JToutrasCoisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 250, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundoba.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        teste.setText("jLabel2");
        getContentPane().add(teste, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        IDPaciente.setText("jLabel6");
        getContentPane().add(IDPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        IdUnidadeSaude.setText("jLabel6");
        getContentPane().add(IdUnidadeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        IdLaboratorio.setText("jLabel6");
        getContentPane().add(IdLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        IdCito.setText("jLabel6");
        getContentPane().add(IdCito, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jLOrigemIndefinida.setText("jLabel1");
        getContentPane().add(jLOrigemIndefinida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLDiagnostico.setText("jLabel7");
        getContentPane().add(jLDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, -1));

        jLCelulasAtipicas.setText("jLabel2");
        getContentPane().add(jLCelulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 40, -1));

        jLSPCitotecnico.setText("jLabel11");
        getContentPane().add(jLSPCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, -1));

        jLadequabilidadeMaterial.setText("jLabel2");
        getContentPane().add(jLadequabilidadeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 40, -1));

        jLResponsavel.setText("jLabel12");
        getContentPane().add(jLResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, -1));

        jLavaliacaopreAnalitica.setText("jLabel2");
        getContentPane().add(jLavaliacaopreAnalitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 40, -1));

        celulasAtipicas.setText("jLabel6");
        getContentPane().add(celulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, -1));

        jLObsG.setText("jLabel10");
        getContentPane().add(jLObsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, -1));

        jLMicrobiologia.setText("jLabel7");
        getContentPane().add(jLMicrobiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, -1));

        jLatipiaCelulasEscamosas.setText("jLabel8");
        getContentPane().add(jLatipiaCelulasEscamosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 40, -1));

        jLatipiasCelulasGlandulares.setText("jLabel9");
        getContentPane().add(jLatipiasCelulasGlandulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 40, -1));

        jLDataResulta.setText("jLabel2");
        getContentPane().add(jLDataResulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 40, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JCBAeilffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAeilffActionPerformed
        // TODO add your handling code here:
        JCBCausasAlheias.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBglandular.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBmetaplasico.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBAeilffActionPerformed

    private void JCBlaminaDanificadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBlaminaDanificadaActionPerformed
        // TODO add your handling code here:
        JCBAeilff.setSelected(false);
        JCBCausasAlheias.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBglandular.setSelected(false);
        JCBmetaplasico.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBlaminaDanificadaActionPerformed

    private void JCBCausasAlheiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCausasAlheiasActionPerformed
        // TODO add your handling code here:
        
        JCBAeilff.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBglandular.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBmetaplasico.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBCausasAlheiasActionPerformed

    private void JCBoutrasCoisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBoutrasCoisasActionPerformed
        // TODO add your handling code here:
        
        JCBAeilff.setSelected(false);
        JCBCausasAlheias.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBglandular.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBmetaplasico.setSelected(false);
    }//GEN-LAST:event_JCBoutrasCoisasActionPerformed

    private void JCBescamosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBescamosoActionPerformed
        // TODO add your handling code here:
        
        JCBAeilff.setSelected(false);
        JCBCausasAlheias.setSelected(false);
        JCBglandular.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBmetaplasico.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBescamosoActionPerformed

    private void JCBglandularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBglandularActionPerformed
        // TODO add your handling code here:
        JCBAeilff.setSelected(false);
        JCBCausasAlheias.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBmetaplasico.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBglandularActionPerformed

    private void JCBmetaplasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBmetaplasicoActionPerformed
        // TODO add your handling code here:
        
        JCBAeilff.setSelected(false);
        JCBCausasAlheias.setSelected(false);
        JCBescamoso.setSelected(false);
        JCBglandular.setSelected(false);
        JCBlaminaDanificada.setSelected(false);
        JCBoutrasCoisas.setSelected(false);
    }//GEN-LAST:event_JCBmetaplasicoActionPerformed
public void Exporta(citopatologico cito){
        citopatologicoDao dao = new  citopatologicoDao();
        cito = dao.obter(citopatologico.class, cito.getId());
        LPaciente.setText(cito.getPaciente().getNomePaciente());
        IDPaciente.setText(""+cito.getPaciente().getId());
        LLaboratorio.setText(cito.getLaboratorio().getNomeLaboratorio());
        IdLaboratorio.setText(""+cito.getLaboratorio().getId());
        LUnidadeSaude.setText(cito.getUnidadeSaude().getUnidadeSaude());
        IdUnidadeSaude.setText(""+cito.getUnidadeSaude().getId());
        IdCito.setText(""+cito.getId());
        if(cito.getAvaliacaoPreAnalitica().equals("AMOSTRA REJEITADA POR: "+JCBAeilff.getText())){
            JCBAeilff.setSelected(true);
        }else if(cito.getAvaliacaoPreAnalitica().equals("AMOSTRA REJEITADA POR: "+JCBCausasAlheias.getText())){
                JCBCausasAlheias.setSelected(true);
                JTCausasAlheias.setText(cito.getAvaliacaoPreAnalitica());
             }else if(cito.getAvaliacaoPreAnalitica().equals("Eptélios Represantados na Amostra"+JCBescamoso.getText())){
                JCBescamoso.setSelected(true);
             }else if(cito.getAvaliacaoPreAnalitica().equals("Eptélios Represantados na Amostra"+JCBglandular)){
                JCBglandular.setSelected(true);
             }else if(cito.getAvaliacaoPreAnalitica().equals("AMOSTRA REJEITADA POR: "+JCBlaminaDanificada.getText())){
                JCBlaminaDanificada.setSelected(true);
             }else if(cito.getAvaliacaoPreAnalitica().equals("Eptélios Represantados na Amostra"+JCBmetaplasico.getText())){
                JCBmetaplasico.setSelected(true);
             }else if(cito.getAvaliacaoPreAnalitica().equals("AMOSTRA REJEITADA POR: "+JCBoutrasCoisas.getText())){
                 JCBoutrasCoisas.setSelected(true);
                 JToutrasCoisas.setText(cito.getAvaliacaoPreAnalitica());
             
             }
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
    private void CadastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastraMouseClicked
        // TODO add your handling code here:
        String avaliacaoPreAnalitica = "";
         if (!JCBAeilff.isSelected() && !JCBCausasAlheias.isSelected() && !JCBescamoso.isSelected()
         && !JCBglandular.isSelected() && !JCBlaminaDanificada.isSelected() && !JCBmetaplasico.isSelected() && !JCBoutrasCoisas.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções");
        }else{
             if(JCBAeilff.isSelected()){
                 avaliacaoPreAnalitica="AMOSTRA REJEITADA POR: "+JCBAeilff.getText();
             }else if(JCBCausasAlheias.isSelected()){
                 avaliacaoPreAnalitica="AMOSTRA REJEITADA POR: "+JTCausasAlheias.getText();
             }else if(JCBescamoso.isSelected()){
                avaliacaoPreAnalitica= "Eptélios Represantados na Amostra"+JCBescamoso.getText();
             }else if(JCBglandular.isSelected()){
                 avaliacaoPreAnalitica = "Eptélios Represantados na Amostra"+JCBglandular.getText();
             }else if(JCBlaminaDanificada.isSelected()){
                avaliacaoPreAnalitica = "AMOSTRA REJEITADA POR: "+JCBlaminaDanificada.getText();
             }else if(JCBmetaplasico.isSelected()){
             avaliacaoPreAnalitica = "Eptélios Represantados na Amostra"+JCBmetaplasico.getText();
             }else if(JCBoutrasCoisas.isSelected()){
                 avaliacaoPreAnalitica ="AMOSTRA REJEITADA POR:"+JToutrasCoisas.getText();
             
             }
             
             citopatologico cito = new citopatologico();
             int icito = Integer.parseInt(IdCito.getText());
             cito.setId(icito);
             
             int iPaciente = Integer.parseInt(IDPaciente.getText());
             Paciente p =new Paciente();
             p.setId(iPaciente);
             cito.setPaciente(p);
             
             int iUni = Integer.parseInt(IdUnidadeSaude.getText());
             UnidadeSaude uni = new UnidadeSaude();
             uni.setId(iUni);
             cito.setUnidadeSaude(uni);
             
             int iLab = Integer.parseInt(IdLaboratorio.getText());
             Laboratorio lab = new Laboratorio();
             lab.setId(iLab);
             cito.setLaboratorio(lab);
             
             cito.setAvaliacaoPreAnalitica(avaliacaoPreAnalitica);
             cito.setAdquabilidadeMaterial(jLadequabilidadeMaterial.getText());
             cito.setDiagnosticoDescritivo(jLDiagnostico.getText());
             cito.setCelulasAtipicas(jLCelulasAtipicas.getText());
             cito.setMicrobiologia(jLMicrobiologia.getText());
             cito.setAtipiasCelulasEscamosas(jLatipiaCelulasEscamosas.getText());
             cito.setAtipiasCelulasGlandulares(jLatipiasCelulasGlandulares.getText());
             cito.setOrigemIndefinida(jLOrigemIndefinida.getText());
             cito.setObsG(jLObsG.getText());
             cito.setSPCitotecnico(jLSPCitotecnico.getText());
             cito.setResponsavel(jLResponsavel.getText());
             cito.setDataResultado(jLDataResulta.getText());
            
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            citopatologico cito2 = new citopatologico();
            cito2.setId(cito.getId());
            UpAdequabilidade prin = new UpAdequabilidade();
            prin.cadastroCont(cito2);
            prin.setVisible(true);
            dispose();
            }
            
         
    }//GEN-LAST:event_CadastraMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAvaliaçãoPreAnalitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliaçãoPreAnalitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliaçãoPreAnalitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliaçãoPreAnalitica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpAvaliaçãoPreAnalitica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastra;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel IDPaciente;
    private javax.swing.JLabel IdCito;
    private javax.swing.JLabel IdLaboratorio;
    private javax.swing.JLabel IdUnidadeSaude;
    private javax.swing.JCheckBox JCBAeilff;
    private javax.swing.JCheckBox JCBCausasAlheias;
    private javax.swing.JCheckBox JCBescamoso;
    private javax.swing.JCheckBox JCBglandular;
    private javax.swing.JCheckBox JCBlaminaDanificada;
    private javax.swing.JCheckBox JCBmetaplasico;
    private javax.swing.JCheckBox JCBoutrasCoisas;
    private javax.swing.JTextField JTCausasAlheias;
    private javax.swing.JTextField JToutrasCoisas;
    private javax.swing.JLabel LLaboratorio;
    private javax.swing.JLabel LPaciente;
    private javax.swing.JLabel LUnidadeSaude;
    private javax.swing.JLabel celulasAtipicas;
    private javax.swing.JLabel jLCelulasAtipicas;
    private javax.swing.JLabel jLDataResulta;
    private javax.swing.JLabel jLDiagnostico;
    private javax.swing.JLabel jLMicrobiologia;
    private javax.swing.JLabel jLObsG;
    private javax.swing.JLabel jLOrigemIndefinida;
    private javax.swing.JLabel jLResponsavel;
    private javax.swing.JLabel jLSPCitotecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLadequabilidadeMaterial;
    private javax.swing.JLabel jLatipiaCelulasEscamosas;
    private javax.swing.JLabel jLatipiasCelulasGlandulares;
    private javax.swing.JLabel jLavaliacaopreAnalitica;
    private javax.swing.JLabel teste;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
