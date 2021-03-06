/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Dao.AnamineseDao;
import Dao.BuscaAtivaDao;
import Dao.LaboratorioDao;
import Dao.PacienteDao;
import Dao.UsuarioDao;
import classJava.BuscaAtiva;
import classJava.Laboratorio;
import classJava.Paciente;
import classJava.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import classJava.anaminese;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Caio
 */
public class PesquisarBuscaAtiva extends javax.swing.JFrame {

    public PesquisarBuscaAtiva() {
        initComponents();
        setIcon();
        preechendoTabelaBuscaAtiva();
        
    }
    public void  preechendoTabelaBuscaAtiva(){
    
           BuscaAtivaDao dao=new BuscaAtivaDao();
            List<BuscaAtiva> BA = dao.pesquisaId();
          DefaultTableModel dtmLab = (DefaultTableModel) jTable1.getModel();
          if(BA !=null){
            for(BuscaAtiva BAL: BA){
            Object[] dados={BAL.getUnidadeSaude().getUnidadeSaude(), BAL.getPaciente().getNomePaciente(), BAL.getId(),
                BAL.getRExameCitopatologico(), BAL.getDataExame()};
            dtmLab.addRow(dados);
            
            }}
    }
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Filtra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Novo2 = new javax.swing.JLabel();
        Editar2 = new javax.swing.JLabel();
        ExcluirL = new javax.swing.JLabel();
        voltar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Editar1 = new javax.swing.JLabel();
        Novo1 = new javax.swing.JLabel();
        excluir2 = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Busca Ativa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pesquisar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 20));

        Filtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FiltraKeyTyped(evt);
            }
        });
        getContentPane().add(Filtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 270, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Unidade de Saúde", "Nome do Paciente", "ID", "Repetição de Exame", "Data do Exame"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(180);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 630, 214));

        Novo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/novo32d.png"))); // NOI18N
        Novo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Novo2MouseClicked(evt);
            }
        });
        getContentPane().add(Novo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        Editar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/editar34f.png"))); // NOI18N
        Editar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar2MouseClicked(evt);
            }
        });
        getContentPane().add(Editar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        ExcluirL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/excluirpng23.png"))); // NOI18N
        ExcluirL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExcluirLMouseClicked(evt);
            }
        });
        getContentPane().add(ExcluirL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltaricon.png"))); // NOI18N
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });
        getContentPane().add(voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/pesquisaodsakda13232.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 40));

        Editar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/buttonedit45.png"))); // NOI18N
        Editar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar1MouseClicked(evt);
            }
        });
        getContentPane().add(Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 50, 60));

        Novo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/novopng.png"))); // NOI18N
        Novo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Novo1MouseClicked(evt);
            }
        });
        getContentPane().add(Novo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 40));

        excluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/excluir1png.png"))); // NOI18N
        excluir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluir2MouseClicked(evt);
            }
        });
        getContentPane().add(excluir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 60, 60));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltarpng.png"))); // NOI18N
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/fundolegal.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir2MouseClicked
        
        if(jTable1.getSelectedRow() != 1){
                    DefaultTableModel dtmUsuario = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    BuscaAtiva ba = new BuscaAtiva();
                    BuscaAtivaDao dao = new BuscaAtivaDao();
                    System.out.println(id);
                    dao.remover(BuscaAtiva.class, id);
                    dtmUsuario.removeRow(jTable1.getSelectedRow());
                  }else{
                      JOptionPane.showMessageDialog(null,"seleciona uma linha da tabela.");
                  }

    }//GEN-LAST:event_excluir2MouseClicked

    private void ExcluirLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirLMouseClicked
        
        if(jTable1.getSelectedRow() != 1){
                    DefaultTableModel dtmUsuario = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    BuscaAtiva ba = new BuscaAtiva();
                    BuscaAtivaDao dao = new BuscaAtivaDao();
                    System.out.println(id);
                    dao.remover(BuscaAtiva.class, id);
                    dtmUsuario.removeRow(jTable1.getSelectedRow());
                  }else{
                      JOptionPane.showMessageDialog(null,"seleciona uma linha da tabela.");
                  }
    }//GEN-LAST:event_ExcluirLMouseClicked

    private void Novo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Novo1MouseClicked
        // TODO add your handling code here:
        dispose();
        CadastroBAtiva ba = new CadastroBAtiva();
        ba.setVisible(true);
    }//GEN-LAST:event_Novo1MouseClicked

    private void Novo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Novo2MouseClicked
      
        dispose();
        CadastroBAtiva ba = new CadastroBAtiva();
        ba.setVisible(true);
    }//GEN-LAST:event_Novo2MouseClicked

    private void Editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseClicked
        // TODO add your handling code here:
                if(jTable1.getSelectedRow() != -1){
             dispose();
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    BuscaAtivaDao dao = new BuscaAtivaDao();
                    BuscaAtiva ba = new BuscaAtiva();
                    ba.setId(id);
                    UpBAtiva prin=new UpBAtiva();
                    prin.Exporta(ba);
                    prin.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(this, "selecione uma linha da tabela");
        
        }
    }//GEN-LAST:event_Editar1MouseClicked

    private void Editar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar2MouseClicked
               if(jTable1.getSelectedRow() != -1){
             dispose();
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    BuscaAtivaDao dao = new BuscaAtivaDao();
                    BuscaAtiva ba = new BuscaAtiva();
                    ba.setId(id);
                    UpBAtiva prin=new UpBAtiva();
                    prin.Exporta(ba);
                    prin.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(this, "selecione uma linha da tabela");
        
        }
    }//GEN-LAST:event_Editar2MouseClicked

    private void voltar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltar1MouseClicked
        // TODO add your handling code here:
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_voltar1MouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        // TODO add your handling code here:
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked
TableRowSorter trs ;
    private void FiltraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltraKeyTyped
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        Filtra.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
            trs.setRowFilter(RowFilter.regexFilter(Filtra.getText(), 1));
            }
});
        trs=new TableRowSorter(dtm);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_FiltraKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jTable1.setDefaultEditor(Object.class, null);  // ou usar um TableModel nao  editavel  
        jTable1.addMouseListener(new MouseAdapter() {  
        public void mouseClicked(MouseEvent e)  
        {  
        if (e.getClickCount() == 2)  
        {  
        if(jTable1.getSelectedRow() != -1){
             dispose();
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    AnamineseDao dao = new AnamineseDao();
                    anaminese ana= new anaminese();
                    ana.setId(id);
                    DadosAnaminese prin=new DadosAnaminese();
                    prin.Exporta(ana);
                    prin.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(null, "selecione uma linha da tabela");
        
        }
              }  
    }  
});
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PesquisarLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarLab1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarBuscaAtiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Editar1;
    private javax.swing.JLabel Editar2;
    private javax.swing.JLabel ExcluirL;
    private javax.swing.JTextField Filtra;
    private javax.swing.JLabel Novo1;
    private javax.swing.JLabel Novo2;
    private javax.swing.JLabel excluir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel voltar;
    private javax.swing.JLabel voltar1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
