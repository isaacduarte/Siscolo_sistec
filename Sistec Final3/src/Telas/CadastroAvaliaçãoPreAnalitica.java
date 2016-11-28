
package Telas;

import Dao.AnamineseDao;
import Dao.LaboratorioDao;
import Dao.PacienteDao;
import Dao.UnidadeSaudeDao;
import Dao.citopatologicoDao;
import classJava.Laboratorio;
import classJava.Paciente;
import classJava.UnidadeSaude;
import classJava.citopatologico;
import java.util.List;
import javax.swing.JOptionPane;


public class CadastroAvaliaçãoPreAnalitica extends javax.swing.JFrame {

    
    public CadastroAvaliaçãoPreAnalitica() {
        initComponents();
        addcombobox();
        addcomboboxUnidadeS();
        addcomboboxLab();
    }
public void addcombobox(){
            PacienteDao dao=new PacienteDao();
            List<Paciente> paciente=dao.pesquisaId();
            boxnomePaciente.addItem("Selecione um Paciente");
            for(Paciente p: paciente){
                boxnomePaciente.addItem(p.getNomePaciente());
            }
    }
public void addcomboboxUnidadeS(){
            UnidadeSaudeDao dao=new UnidadeSaudeDao();
            List<UnidadeSaude> UnidadeSaude=dao.pesquisaId();
            boxnomeUnidadeS.addItem("Selecione uma Unidade de Saúde");
            for(UnidadeSaude uni: UnidadeSaude){
                boxnomeUnidadeS.addItem(uni.getUnidadeSaude());
                
            }
    }
public void addcomboboxLab(){
            LaboratorioDao dao=new LaboratorioDao();
            List<Laboratorio> laboratorio=dao.pesquisaId();
            boxnomeLab.addItem("Selecione um Laboratorio");
            for(Laboratorio lab: laboratorio){
                boxnomeLab.addItem(lab.getNomeLaboratorio());
                
            }}
    
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
        Proximo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boxnomeLab = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxnomeUnidadeS = new javax.swing.JComboBox<String>();
        boxnomePaciente = new javax.swing.JComboBox<String>();
        JTCausasAlheias = new javax.swing.JTextField();
        Cancelar = new javax.swing.JLabel();
        JToutrasCoisas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        teste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AVALIAÇÃO PRÉ-ANALÍTICA");
        setMinimumSize(new java.awt.Dimension(650, 410));
        setPreferredSize(new java.awt.Dimension(650, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Eptélios Represantados na Amostra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JCBAeilff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBAeilff.setText("Ausência ou erro na identificação da lâmina, frasco ou formulário");
        JCBAeilff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAeilffActionPerformed(evt);
            }
        });
        getContentPane().add(JCBAeilff, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        JCBlaminaDanificada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBlaminaDanificada.setText("Lâmina danificada ou ausente");
        JCBlaminaDanificada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBlaminaDanificadaActionPerformed(evt);
            }
        });
        getContentPane().add(JCBlaminaDanificada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JCBCausasAlheias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBCausasAlheias.setText("Causas alheias ao laboratório; especificar:");
        JCBCausasAlheias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCausasAlheiasActionPerformed(evt);
            }
        });
        getContentPane().add(JCBCausasAlheias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        JCBoutrasCoisas.setText("Outras causas; especificar:");
        JCBoutrasCoisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBoutrasCoisasActionPerformed(evt);
            }
        });
        getContentPane().add(JCBoutrasCoisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        JCBescamoso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBescamoso.setText("Escamoso");
        JCBescamoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBescamosoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBescamoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        JCBglandular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBglandular.setText("Glandular");
        JCBglandular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBglandularActionPerformed(evt);
            }
        });
        getContentPane().add(JCBglandular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        JCBmetaplasico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JCBmetaplasico.setText("Metaplásico");
        JCBmetaplasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBmetaplasicoActionPerformed(evt);
            }
        });
        getContentPane().add(JCBmetaplasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        Proximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Proximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProximoMouseClicked(evt);
            }
        });
        getContentPane().add(Proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("AMOSTRA REJEITADA POR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user icon.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        boxnomeLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnomeLabActionPerformed(evt);
            }
        });
        getContentPane().add(boxnomeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/laboratoriopng.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        boxnomeUnidadeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnomeUnidadeSActionPerformed(evt);
            }
        });
        getContentPane().add(boxnomeUnidadeS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 240, 30));

        boxnomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnomePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(boxnomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 240, 30));
        getContentPane().add(JTCausasAlheias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 170, -1));

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));
        getContentPane().add(JToutrasCoisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundoba.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        teste.setText("jLabel2");
        getContentPane().add(teste, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

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

    private void boxnomeUnidadeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnomeUnidadeSActionPerformed

    }//GEN-LAST:event_boxnomeUnidadeSActionPerformed

    private void boxnomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxnomePacienteActionPerformed

    private void boxnomeLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnomeLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxnomeLabActionPerformed

    private void ProximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProximoMouseClicked
        // TODO add your handling code here:
                String avaliacaoPreAnalitica = "";
         if (!JCBAeilff.isSelected() && !JCBCausasAlheias.isSelected() && !JCBescamoso.isSelected()
         && !JCBglandular.isSelected() && !JCBlaminaDanificada.isSelected() && !JCBmetaplasico.isSelected() && !JCBoutrasCoisas.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções");
        } else if(boxnomePaciente.equals("Escolha uma  Paciente") || boxnomePaciente.equals("")){
            JOptionPane.showMessageDialog(null, "Escolha um Paciente");
        } else if(boxnomeUnidadeS.equals("Selecione uma Unidade de Saúde") || boxnomeUnidadeS.equals("")){
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade de Saúde");
        } else if(boxnomeLab.equals("Selecione um Laboratorio") ){
            JOptionPane.showMessageDialog(null, "Selecione um Laboratorio");
        }else if(boxnomeLab.equals("")) {
            JOptionPane.showMessageDialog(null, "Você precissa Cadastra um Laboratorio ");
    }else if(boxnomePaciente.equals("")) {
            JOptionPane.showMessageDialog(null, "Você precissa Cadastra um Paciente ");
    }
    else if(boxnomeUnidadeS.equals("")) {
            JOptionPane.showMessageDialog(null, "Você precissa Cadastra uma Unidade de Saúde ");
    }
        else{
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
             
             cito.setAvaliacaoPreAnalitica(avaliacaoPreAnalitica);
             cito.setAdquabilidadeMaterial("");
             cito.setDiagnosticoDescritivo("");
             cito.setCelulasAtipicas("");
             cito.setMicrobiologia("");
             cito.setAtipiasCelulasEscamosas("");
             cito.setAtipiasCelulasGlandulares("");
             cito.setOrigemIndefinida("");
             cito.setObsG("");
             cito.setSPCitotecnico("");
             cito.setResponsavel("");
             cito.setDataResultado("");
            PacienteDao pdao=new PacienteDao();
            List<Paciente> paciente=pdao.pesquisaId();
            for(Paciente p: paciente){
            if(p.getNomePaciente().equals(boxnomePaciente.getSelectedItem())){
                p.setId(p.getId());
            cito.setPaciente(p);
            cito.setId(p.getId());
            }
            }
            UnidadeSaudeDao unidao=new UnidadeSaudeDao();
            List<UnidadeSaude> unidade=unidao.pesquisaId();
            for(UnidadeSaude uni: unidade){
            if(uni.getUnidadeSaude().equals(boxnomeUnidadeS.getSelectedItem())){
                uni.setId(uni.getId());
            cito.setUnidadeSaude(uni);
            }
            }
            
            LaboratorioDao labdao=new LaboratorioDao();
            List<Laboratorio> laboratorio=labdao.pesquisaId();
            for(Laboratorio lab: laboratorio){
            if(lab.getNomeLaboratorio().equals(boxnomeLab.getSelectedItem())){
                lab.setId(lab.getId());
            cito.setLaboratorio(lab);
            }
            }
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            citopatologico cito2 = new citopatologico();
            cito2.setId(cito.getId());
            CadastroAdequabilidade prin = new CadastroAdequabilidade();
            prin.cadastroCont(cito2);
            prin.setVisible(true);
            dispose();
            }
            
         
    }//GEN-LAST:event_ProximoMouseClicked

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CancelarMouseClicked

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
                new CadastroAvaliaçãoPreAnalitica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JCheckBox JCBAeilff;
    private javax.swing.JCheckBox JCBCausasAlheias;
    private javax.swing.JCheckBox JCBescamoso;
    private javax.swing.JCheckBox JCBglandular;
    private javax.swing.JCheckBox JCBlaminaDanificada;
    private javax.swing.JCheckBox JCBmetaplasico;
    private javax.swing.JCheckBox JCBoutrasCoisas;
    private javax.swing.JTextField JTCausasAlheias;
    private javax.swing.JTextField JToutrasCoisas;
    private javax.swing.JLabel Proximo;
    private javax.swing.JComboBox<String> boxnomeLab;
    private javax.swing.JComboBox<String> boxnomePaciente;
    private javax.swing.JComboBox<String> boxnomeUnidadeS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel teste;
    // End of variables declaration//GEN-END:variables
}
