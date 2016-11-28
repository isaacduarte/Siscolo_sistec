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
public class UpInfo extends javax.swing.JFrame {

    /**
     * Creates new form CadastroMicrobio
     */
    public UpInfo() {
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

        Cadastrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTOBSG = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTSCitotecnico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTResponsavel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTDataResultado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLOrigemIndefinida = new javax.swing.JLabel();
        jLMicrobiologia = new javax.swing.JLabel();
        jLIdUni = new javax.swing.JLabel();
        jLIdLab = new javax.swing.JLabel();
        jLResponsavel = new javax.swing.JLabel();
        jLavaliacaopreAnalitica = new javax.swing.JLabel();
        jLObsG = new javax.swing.JLabel();
        celulasAtipicas = new javax.swing.JLabel();
        jLDiagnostico = new javax.swing.JLabel();
        jLDataResulta = new javax.swing.JLabel();
        jLSPCitotecnico = new javax.swing.JLabel();
        jLidpaci = new javax.swing.JLabel();
        jLCelulasAtipicas = new javax.swing.JLabel();
        jLadequabilidadeMaterial = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLatipiaCelulasEscamosas = new javax.swing.JLabel();
        jLatipiasCelulasGlandulares = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/proximo.png"))); // NOI18N
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/cancelar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Observações Gerais:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTOBSG.setColumns(20);
        jTOBSG.setRows(5);
        jScrollPane1.setViewportView(jTOBSG);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 565, 55));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Screening pelo citotécnico:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(jTSCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 318, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Responsável:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));
        getContentPane().add(jTResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 361, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Data do Resultado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(jTDataResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 124, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundocelugland2.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 300));

        jLOrigemIndefinida.setText("jLabel1");
        getContentPane().add(jLOrigemIndefinida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLMicrobiologia.setText("jLabel7");
        getContentPane().add(jLMicrobiologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, -1));

        jLIdUni.setText("jLabel1");
        getContentPane().add(jLIdUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLIdLab.setText("jLabel1");
        getContentPane().add(jLIdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLResponsavel.setText("jLabel12");
        getContentPane().add(jLResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, -1));

        jLavaliacaopreAnalitica.setText("jLabel2");
        getContentPane().add(jLavaliacaopreAnalitica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 40, -1));

        jLObsG.setText("jLabel10");
        getContentPane().add(jLObsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 50, -1));

        celulasAtipicas.setText("jLabel6");
        getContentPane().add(celulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, -1));

        jLDiagnostico.setText("jLabel7");
        getContentPane().add(jLDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 40, -1));

        jLDataResulta.setText("jLabel2");
        getContentPane().add(jLDataResulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 40, -1));

        jLSPCitotecnico.setText("jLabel11");
        getContentPane().add(jLSPCitotecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 50, -1));

        jLidpaci.setText("jLabel2");
        getContentPane().add(jLidpaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 40, -1));

        jLCelulasAtipicas.setText("jLabel2");
        getContentPane().add(jLCelulasAtipicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 40, -1));

        jLadequabilidadeMaterial.setText("jLabel2");
        getContentPane().add(jLadequabilidadeMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 40, -1));

        jLId.setText("jLabel2");
        getContentPane().add(jLId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 40, -1));

        jLatipiaCelulasEscamosas.setText("jLabel8");
        getContentPane().add(jLatipiaCelulasEscamosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 40, -1));

        jLatipiasCelulasGlandulares.setText("jLabel9");
        getContentPane().add(jLatipiasCelulasGlandulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 40, -1));

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
        
        jTDataResultado.setText(cito.getDataResultado());
        jTOBSG.setText(cito.getObsG());
        jTResponsavel.setText(cito.getResponsavel());
        jTSCitotecnico.setText(cito.getSPCitotecnico());
        
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
    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        if(jTDataResultado.equals("") && jTOBSG.equals("") && jTSCitotecnico.equals("") && jTResponsavel.equals("")){
            JOptionPane.showMessageDialog(this, "Campos Deixados em Brnaco");
        }else{
            citopatologico cito = new citopatologico();
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
            
            
            cito.setCelulasAtipicas(jLCelulasAtipicas.getText());
            cito.setOrigemIndefinida(jLOrigemIndefinida.getText());
            cito.setAtipiasCelulasEscamosas(jLatipiaCelulasEscamosas.getText());
            cito.setAtipiasCelulasGlandulares(jLatipiasCelulasGlandulares.getText());
            cito.setMicrobiologia(jLMicrobiologia.getText());
            cito.setAvaliacaoPreAnalitica(jLavaliacaopreAnalitica.getText());
            cito.setDataResultado(jTDataResultado.getText());
            cito.setAdquabilidadeMaterial(jLadequabilidadeMaterial.getText());
            cito.setDiagnosticoDescritivo(jLDiagnostico.getText());
            cito.setObsG(jTOBSG.getText());
            cito.setResponsavel(jTResponsavel.getText());
            cito.setSPCitotecnico(jTSCitotecnico.getText());
            citopatologicoDao dao = new citopatologicoDao();
            cito = dao.salvar(cito);
            JOptionPane.showMessageDialog(null, "Passo efetuado com sucesso");
            dispose();
        }
        
        
    }//GEN-LAST:event_CadastrarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastrar;
    private javax.swing.JLabel celulasAtipicas;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLadequabilidadeMaterial;
    private javax.swing.JLabel jLatipiaCelulasEscamosas;
    private javax.swing.JLabel jLatipiasCelulasGlandulares;
    private javax.swing.JLabel jLavaliacaopreAnalitica;
    private javax.swing.JLabel jLidpaci;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDataResultado;
    private javax.swing.JTextArea jTOBSG;
    private javax.swing.JTextField jTResponsavel;
    private javax.swing.JTextField jTSCitotecnico;
    // End of variables declaration//GEN-END:variables
}
