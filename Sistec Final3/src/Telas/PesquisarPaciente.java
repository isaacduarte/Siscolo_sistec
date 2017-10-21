/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Dao.BuscaAtivaDao;
import Dao.PacienteDao;
import Dao.UsuarioDao;
import classJava.BuscaAtiva;
import classJava.Paciente;
import classJava.Usuario;
import classJava.anaminese;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Caio
 */
public class PesquisarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarUsuario
     */
    public PesquisarPaciente() {
        initComponents();
        setIcon();
        
        preechendoTabelaPaciente();
        
    }
    public void  preechendoTabelaPaciente(){
    
             PacienteDao dao=new PacienteDao();
            List<Paciente> paciente = dao.pesquisaId();
          DefaultTableModel dtmPaciente = (DefaultTableModel) jTable1.getModel();
          if(paciente !=null){
            for(Paciente p: paciente){
            Object[] dados={p.getId(), p.getNomePaciente(), p.getApelido(), p.getIdade(), p.getUF(), p.getCep(), p.getMunicipio(), p.getBairro(), p.getNumero(), p.getLogradouro(), p.getTelefone() };
            dtmPaciente.addRow(dados);
            
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
        valtar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Editar1 = new javax.swing.JLabel();
        Novo1 = new javax.swing.JLabel();
        excluir2 = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Paciente");
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
                "Id", "Nome Paciente", "Apelido", "Idade", "UF", "CEP", "Municipio", "Bairro", "Numero", "Logradouro", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(120);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 620, 214));

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

        valtar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltaricon.png"))); // NOI18N
        valtar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valtar1MouseClicked(evt);
            }
        });
        getContentPane().add(valtar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

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

        nivel.setText("jLabel3");
        getContentPane().add(nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluir2MouseClicked
        // TODO add your handling code here:
                    JOptionPane.showMessageDialog(this, "Obs: Só Podera Apagar o Paciente que não estiver Vinculado a Algum Exame ");
                    JOptionPane.showMessageDialog(this, "Obs: Para Apagar o Paciente Precissa Apagar seu Vinculos com Os Exames ");
                    DefaultTableModel dtmUsuario = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                    Paciente p=new Paciente();
                    anaminese ana = new anaminese();
                    p.setId(id);
                    PacienteDao dao=new PacienteDao();
                    dao.remover(Paciente.class, id);
                    System.out.println(id);
                    dtmUsuario.removeRow(jTable1.getSelectedRow());
                  

    }//GEN-LAST:event_excluir2MouseClicked

    private void ExcluirLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExcluirLMouseClicked
        // TODO add your handling code here:
        
        if(jTable1.getSelectedRow() != 1){
             JOptionPane.showMessageDialog(this, "Obs: Só Podera Apagar o Paciente que não estiver Vinculado a Algum Exame ");
                    JOptionPane.showMessageDialog(this, "Obs: Para Apagar o Paciente Precissa Apagar seu Vinculos com Os Exames ");
                   
                    DefaultTableModel dtmUsuario = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                    Paciente p=new Paciente();
                    PacienteDao dao=new PacienteDao();
                    System.out.println(id);
                    dao.remover(Paciente.class, id);
                      System.out.println(p);
                    dtmUsuario.removeRow(jTable1.getSelectedRow());
                  }else{
                      JOptionPane.showMessageDialog(null,"seleciona uma linha da tabela.");
                  }
    }//GEN-LAST:event_ExcluirLMouseClicked

    private void Novo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Novo1MouseClicked
        // TODO add your handling code here:
        
        dispose();
        Usuario u = new Usuario();
        u.setNivelDeAcesso(nivel.getText());
        
        CadastroPaci Prin = new CadastroPaci();
        Prin.nivelAcesso(u);
        Prin.setVisible(true);
    }//GEN-LAST:event_Novo1MouseClicked

    private void Novo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Novo2MouseClicked
        // TODO add your handling code here:
        
        dispose();
        Usuario u = new Usuario();
        u.setNivelDeAcesso(nivel.getText());
        
        CadastroPaci Prin = new CadastroPaci();
        Prin.nivelAcesso(u);
        Prin.setVisible(true);
    }//GEN-LAST:event_Novo2MouseClicked

        
        
    private void Editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseClicked
        // TODO add your handling code here:
                if(jTable1.getSelectedRow() != -1){
             dispose();
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                    PacienteDao dao = new PacienteDao();
                    Paciente p= new Paciente();
                    p.setId(id);
                    Usuario u = new Usuario();
                    u.setNivelDeAcesso(nivel.getText());
                    UpPaci prin=new UpPaci();
    //                prin.nivelAcesso(u);
                    prin.exporta(p);
                    prin.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(this, "selecione uma linha da tabela");
        
        }
    }//GEN-LAST:event_Editar1MouseClicked

    private void Editar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar2MouseClicked
        // TODO add your handling code here:
         if(jTable1.getSelectedRow() != -1){
             dispose();
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                    PacienteDao dao = new PacienteDao();
                    Paciente p= new Paciente();
                    p.setId(id);
                    UpPaci prin=new UpPaci();
                    prin.exporta(p);
                    prin.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(this, "selecione uma linha da tabela");
        
        }
    }//GEN-LAST:event_Editar2MouseClicked

    private void valtar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valtar1MouseClicked
        // TODO add your handling code here:
        /*Usuario u = new Usuario();
        u.setNivelDeAcesso(nivel.getText());
        if(nivel.equals("Administrador")){
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }else if(nivel.equals("Digitador")){
         dispose();
        PrincipalDigitador prin = new PrincipalDigitador();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }else{
         dispose();
        PrincipalAtendente prin = new PrincipalAtendente();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }*/
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_valtar1MouseClicked

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        /*Usuario u = new Usuario();
        u.setNivelDeAcesso(nivel.getText());
        if(nivel.equals("Administrador")){
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }else if(nivel.equals("Digitador")){
         dispose();
        PrincipalDigitador prin = new PrincipalDigitador();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }else{
         dispose();
        PrincipalAtendente prin = new PrincipalAtendente();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }*/
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
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarPaciente().setVisible(true);
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
    private javax.swing.JLabel nivel;
    private javax.swing.JLabel valtar1;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
