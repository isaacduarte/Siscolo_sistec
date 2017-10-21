/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import Dao.BuscaAtivaDao;
import Dao.citopatologicoDao;
import classJava.BuscaAtiva;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import classJava.anaminese;
import classJava.citopatologico;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Caio
 */
public class RelatorioEC extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarUsuario
     */
    public RelatorioEC() {
        initComponents();
        setIcon();
        
        preechendoTabelaAna();
        
    }
    public void  preechendoTabelaAna(){
    
           citopatologicoDao dao=new citopatologicoDao();
            List<citopatologico> citopatologico = dao.pesquisaId();
          DefaultTableModel dtmLab = (DefaultTableModel) jTable1.getModel();
          if(citopatologico !=null){
            for(citopatologico cito: citopatologico){
            Object[] dados={cito.getPaciente().getNomePaciente(), cito.getUnidadeSaude().getUnidadeSaude(),
                cito.getLaboratorio().getNomeLaboratorio(), cito.getId(), cito.getDataResultado()};
            dtmLab.addRow(dados);
            
            }}
    }
             
                 public void GerarPdf(){
        if(jTable1.getSelectedRow() != -1){
             
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 3));
                    citopatologicoDao dao = new citopatologicoDao();
                    citopatologico cito = new citopatologico();
                    cito.setId(id);
                    cito = dao.obter(citopatologico.class, cito.getId());
                    
           
        Document pdf= new Document();
        try {
            //Cria um pdf na pasta detinada
            PdfWriter.getInstance(pdf, 
            new FileOutputStream("PDF\\Laudodo do Exame Citopatológico do "+cito.getPaciente().getNomePaciente()+".pdf"));
            
            //Abrir o Documento
            pdf.open();
            
            //seta o tamanho da pagina
            pdf.setPageSize(PageSize.A4);
            Font f = new Font(FontFamily.HELVETICA, 20, Font.BOLD);
            Font f2 = new Font (FontFamily.HELVETICA, 14, Font.BOLD);
            Font f3 = new Font (FontFamily.HELVETICA, 14, Font.NORMAL);
            Font f4 = new Font (FontFamily.HELVETICA,12, Font.BOLD);
            Font ftt = new Font(FontFamily.HELVETICA, 11, Font.BOLD);
            Font f5 = new Font(FontFamily.HELVETICA, 12, Font.NORMAL);
            Paragraph Titulo = new Paragraph("Ministério da Saúde", f);
            Paragraph Footer = new Paragraph("MS/SECRETARIA EXECULTIVA/DATASUS/SIPPS", f3);
            Footer.setAlignment(Element.ALIGN_CENTER);
            Paragraph subTitulo = new Paragraph();
            Paragraph espaco = new Paragraph("                ");
            subTitulo.add( new Phrase("   Sistec -  ", f2));
            subTitulo.add(new Phrase("Sistema de Gestão de Informações do Câncer do Colo de Útero", f3));
            Paragraph Sub = new Paragraph();
            Sub.add( new Phrase("Laudo Exame Citopatológico do Colo de Útero", f2));
            Sub.setAlignment(Element.ALIGN_CENTER);
            //tabela com informação do paciente
            PdfPTable table = new PdfPTable(new float[] { 0.50f, 0.50f, 0.18f, 0.18f });
            table.setTotalWidth(500);
            table.setLockedWidth(true);
                        table.addCell(new Phrase("Nome da Mulher",f4));
            table.addCell(new Phrase("Nome da Mãe",f4));
            table.addCell(new Phrase("Apelido",f4));
            table.addCell(new Phrase("Nascido",f4));
            table.addCell(new Phrase(""+cito.getPaciente().getNomePaciente(),f5));
            table.addCell(new Phrase(""+cito.getPaciente().getNomeMae(),f5));
            table.addCell(new Phrase(""+cito.getPaciente().getApelido(),f5));
            table.addCell(new Phrase(""+cito.getPaciente().getDataNacimento(),f5));
            table.addCell(new Phrase("Endereço",f4));
            table.addCell(new Phrase("Bairro", f4));
            table.addCell(new Phrase("Municipio", f4));
            table.addCell(new Phrase("Numero", f4));
            table.addCell(new Phrase("", f5));
            table.addCell(new Phrase(""+cito.getPaciente().getBairro(), f5));
            table.addCell(new Phrase(""+cito.getPaciente().getMunicipio(), f5));
            table.addCell(new Phrase(""+cito.getPaciente().getNumero(), f5));
            // a continuação da tabela do paciente mesclado 
             PdfPTable tablecontP = new PdfPTable(new float[] { 1f, 0.36f });
            tablecontP.setTotalWidth(500);
            tablecontP.setLockedWidth(true);
            tablecontP.addCell( new Phrase("Ponto de Referência" , f4));
            tablecontP.addCell(new Phrase("Telefone", f4));
            tablecontP.addCell(new Phrase(""+cito.getPaciente().getPontoReferencia(), f5));
            tablecontP.addCell(new Phrase(""+cito.getPaciente().getTelefone(), f5));
            
            PdfPTable tablecito = new PdfPTable(new float[] { 0.50f, 0.50f });
            tablecito.setTotalWidth(500);
            tablecito.setLockedWidth(true);
            Paragraph citocont = new Paragraph();
            citocont.add(new Phrase("Obs.Gerais: ", f4));
            citocont.add(new Phrase(""+cito.getObsG(), f5));
            PdfPTable tablecitocont = new PdfPTable(new float[] { 1f });
            tablecitocont.setTotalWidth(500);
            tablecitocont.setLockedWidth(true);
            tablecitocont.addCell(citocont);
           
            
            tablecito.addCell(new Phrase("Avaliação Pré-Analítica", f4));
            tablecito.addCell(new Phrase("Adequabilidade do Material", f4));
            tablecito.addCell(new Phrase(""+cito.getAvaliacaoPreAnalitica(), f5));
            tablecito.addCell(new Phrase(""+cito.getAdquabilidadeMaterial(), f5));
            tablecito.addCell(new Phrase("Células Atípicas de Significado Indeterminado", f4));
            tablecito.addCell(new Phrase("Atípias em Células Escamosas", f4));
                tablecito.addCell(new Phrase(""+cito.getCelulasAtipicas(), f5));
          // if(cito.getAtipiasCelulasEscamosas().equals(null)){
            //    tablecito.addCell(new Phrase("", f5));
            //}else{
                tablecito.addCell(new Phrase(""+ cito.getAtipiasCelulasEscamosas(), f5));
            //}
            tablecito.addCell(new Phrase("Atípias em Células Glandulares", f4));
            tablecito.addCell(new Phrase("Diagnóstico Descritivo", f4));
            //if(cito.getAtipiasCelulasGlandulares().equals(null)){
              //  tablecito.addCell(new Phrase("", f5));
            //}else{
                tablecito.addCell(new Phrase(""+ cito.getAtipiasCelulasGlandulares(), f5));
            //}
            
            tablecito.addCell(new Phrase(""+cito.getDiagnosticoDescritivo(), f5));
            tablecito.addCell(new Phrase("Microbiologia",f4 ));
            tablecito.addCell(new Phrase("Data do Resultado",f4));
            tablecito.addCell(new Phrase(""+cito.getMicrobiologia(), f5));
            tablecito.addCell(new Phrase(""+cito.getDataResultado(), f5));
            tablecito.addCell(new Phrase("Responsável pelo Resultado", f4));
            table.addCell(new Phrase("Screenig pelo Citotécnico", f4));
            table.addCell(new Phrase(""+cito.getResponsavel(),f5));
            table.addCell(new Phrase(""+cito.getSPCitotecnico()));
            
             PdfPTable tableuni = new PdfPTable(new float[] { 0.50f, 0.50f });
            tableuni.setTotalWidth(500);
            tableuni.setLockedWidth(true);
            tableuni.addCell(new Phrase("Unidade de Saúde", f4));
            tableuni.addCell(new Phrase("Município",f4));
            tableuni.addCell(new Phrase(""+cito.getUnidadeSaude().getUnidadeSaude(),f5));
            tableuni.addCell(new Phrase(""+cito.getUnidadeSaude().getMunicipio(),f5));
            
            PdfPTable tablelab = new PdfPTable(new float[] { 0.50f, 0.50f });
            tablelab.setTotalWidth(500);
            tablelab.setLockedWidth(true);
            tablelab.addCell(new Phrase("Laboratório", f4));
            tablelab.addCell(new Phrase("Município",f4));
            tablelab.addCell(new Phrase(""+cito.getLaboratorio().getNomeLaboratorio()));
            tablelab.addCell(new Phrase(""+cito.getLaboratorio().getMunicipio()));
            
            pdf.add(Titulo);    
            pdf.add(espaco);
            pdf.add(subTitulo);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
            pdf.add(espaco);
            pdf.add(Sub);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
           pdf.add(espaco);
           pdf.add(tableuni);
           pdf.add(espaco);
           pdf.add(tablelab);
           pdf.add(espaco); 
           pdf.add(table);
            pdf.add(tablecontP);
            pdf.add(espaco);
            pdf.add(tablecito);
            pdf.add(tablecitocont);
                        pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
            pdf.add(Footer);
                        Desktop desktop = Desktop.getDesktop();    
            desktop.open(new File("PDF\\Laudodo do Exame Citopatológico do "+cito.getPaciente().getNomePaciente()+".pdf"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DadosAnaminese.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(DadosAnaminese.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DadosAnaminese.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        pdf.close();
        }
    
             
   }else {
        JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela");
        
        }}
                 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Filtra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Editar1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório Exame Citopatológico");
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
                "Nome do Paciente", "Unidade de Saúde", "Laboratorio", "Id", "Data do Exame"
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(26);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(93);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 630, 214));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltaricon.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/pesquisaodsakda13232.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltarpng.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 40));

        Editar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/gerar-relatorio.png"))); // NOI18N
        Editar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar1MouseClicked(evt);
            }
        });
        getContentPane().add(Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 60, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/fundolegal.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked
TableRowSorter trs ;
    private void FiltraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltraKeyTyped
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        
        Filtra.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
            trs.setRowFilter(RowFilter.regexFilter(Filtra.getText(), 0));
            }
});
        trs=new TableRowSorter(dtm);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_FiltraKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void Editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseClicked
        // TODO add your handling code here:
        GerarPdf();
    }//GEN-LAST:event_Editar1MouseClicked

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
                new RelatorioEC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Editar1;
    private javax.swing.JTextField Filtra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
