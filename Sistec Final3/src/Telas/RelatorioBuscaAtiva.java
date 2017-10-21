/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Dao.AnamineseDao;
import Dao.BuscaAtivaDao;
import classJava.BuscaAtiva;
import classJava.Paciente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import classJava.anaminese;
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


public class RelatorioBuscaAtiva extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarUsuario
     */
    public RelatorioBuscaAtiva() {
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
                 public void GerarPdf(){
        if(jTable1.getSelectedRow() != -1){
             
                    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                    int id=(int) (jTable1.getValueAt(jTable1.getSelectedRow(), 2));
                    BuscaAtivaDao dao = new BuscaAtivaDao();
                    BuscaAtiva ba = new BuscaAtiva();
                    ba.setId(id);
                    ba = dao.obter(BuscaAtiva.class, ba.getId());
                    
        Document pdf= new Document();
        try {
            //Cria um pdf na pasta detinada
            PdfWriter.getInstance(pdf, 
            new FileOutputStream("PDF\\Relatorio de Busca Ativa do Paciente"+ba.getPaciente().getNomePaciente()+".pdf"));
            
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
            Paragraph nome1 = new Paragraph("Relatório de Busca Ativa", f3);
            Paragraph nome2 = new Paragraph("Mulheres sem Seguimento/Informação", f3);
            nome1.setAlignment(Element.ALIGN_CENTER);
            nome2.setAlignment(Element.ALIGN_CENTER);
            Footer.setAlignment(Element.ALIGN_CENTER);
            Paragraph dataE = new Paragraph();
            dataE.setAlignment(Element.ALIGN_CENTER);
            dataE.add(new Phrase("Data Exame: ", f4));
            dataE.add(new Phrase(ba.getDataExame()+"                                                              ", f5));
            Paragraph InfoUnidadeSaude = new Paragraph();
            InfoUnidadeSaude.setAlignment(Element.ALIGN_CENTER);
            Paragraph subTitulo = new Paragraph();
            Paragraph espaco = new Paragraph("                ");
            subTitulo.add( new Phrase("   Sistec -  ", f2));
            subTitulo.add(new Phrase("Sistema de Gestão de Informações do Câncer Do Colo De Útero", f3));
            InfoUnidadeSaude.add(new Phrase("Unidade de Saúde: ", f4));
            Paragraph TRelatorio = new Paragraph("Relatório de Busca Ativa", f4);
            TRelatorio.setAlignment(Element.ALIGN_CENTER);
            Paragraph tituloInfo = new Paragraph("Mulheres sem Seguimento/Informação", f4);
            tituloInfo.setAlignment(Element.ALIGN_CENTER);
            InfoUnidadeSaude.add(new Phrase(""+ba.getUnidadeSaude().getUnidadeSaude(),f3));
            InfoUnidadeSaude.add(new Phrase("        Município: ",f4));
            InfoUnidadeSaude.add(new Phrase(""+ba.getUnidadeSaude().getMunicipio(),f3));
            PdfPTable table = new PdfPTable(new float[] { 0.50f, 0.50f, 0.18f, 0.18f });
            table.setTotalWidth(500);
            table.setLockedWidth(true);
            
            PdfPTable tablecont = new PdfPTable(new float[] { 0.90f });
            tablecont.setTotalWidth(500);
            tablecont.setLockedWidth(true);
            Paragraph tablec = new Paragraph();
            tablec.add(new Phrase("Referêcia: ", f4));
            tablec.add(new Phrase(ba.getPaciente().getPontoReferencia(),f5));
            tablecont.addCell(tablec);
            
            PdfPTable tableBA = new PdfPTable(new float[] { 0.50f, 0.50f, 0.36f });
            tableBA.setTotalWidth(500);
            tableBA.setLockedWidth(true);
            
            PdfPTable tableBACont = new PdfPTable(new float[] { 1f });
            tableBACont.setTotalWidth(500);
            tableBACont.setLockedWidth(true);
            Paragraph PtableBACont = new Paragraph();
            PtableBACont.add(new Phrase("Repetição do Exame Citopatológico (data e resultado): ", ftt));
            PtableBACont.add(new Phrase(ba.getRExameCitopatologico(), f5));
            Paragraph PtableBACont2 = new Paragraph();
            PtableBACont2.add(new Phrase("Obs.: ", f4));
            PtableBACont2.add(new Phrase(ba.getObs(),f5));
 
            table.addCell(new Phrase("Nome da Mulher",f4));
            table.addCell(new Phrase("Nome da Mãe",f4));
            table.addCell(new Phrase("Apelido",f4));
            table.addCell(new Phrase("Nascido",f4));
            table.addCell(new Phrase(""+ba.getPaciente().getNomePaciente(),f5));
            table.addCell(new Phrase(""+ba.getPaciente().getNomeMae(),f5));
            table.addCell(new Phrase(""+ba.getPaciente().getApelido(),f5));
            table.addCell(new Phrase(""+ba.getPaciente().getDataNacimento(),f5));
            table.addCell(new Phrase("Endereço",f4));
            table.addCell(new Phrase("Bairro", f4));
            table.addCell(new Phrase("Município", f4));
            table.addCell(new Phrase("Numero", f4));
            table.addCell(new Phrase("", f5));
            table.addCell(new Phrase(""+ba.getPaciente().getBairro(), f5));
            table.addCell(new Phrase(""+ba.getPaciente().getMunicipio(), f5));
            table.addCell(new Phrase(""+ba.getPaciente().getNumero(), f5));
            tableBA.addCell(new Phrase("Colposcopia", f4));
            tableBA.addCell(new Phrase("Biópsia", f4));
            tableBA.addCell(new Phrase("Laudo Biópsia", f4));
            tableBA.addCell(new Phrase(""+ba.getColposcopia(), f5));
            tableBA.addCell(new Phrase(""+ba.getBiopsia(), f5));
            tableBA.addCell(new Phrase(""+ba.getLaudoBiopsia(), f5));
            tableBA.addCell(new Phrase("Tratamento", f4));
            tableBA.addCell(new Phrase("Situação do seguimento", f4));
            tableBA.addCell(new Phrase("Informação Obtida", f4));
            tableBA.addCell(new Phrase(""+ba.getTratamento(), f5));
            tableBA.addCell(new Phrase(""+ba.getSituacaoSegmento(), f5));
            tableBA.addCell(new Phrase(""+ba.getInformacaoObtida(), f5));
            tableBACont.addCell(PtableBACont);
            tableBACont.addCell(PtableBACont2);
            pdf.add(Titulo);    
            pdf.add(espaco);
            pdf.add(subTitulo);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
            pdf.add(espaco);
            pdf.add(TRelatorio);
            pdf.add(tituloInfo);
            pdf.add(espaco);
            pdf.add(dataE);
            pdf.add(InfoUnidadeSaude);
            pdf.add(espaco);
            pdf.add(table);
            pdf.add(tablecont);
            pdf.add(espaco);
            pdf.add(tableBA);
            pdf.add(tableBACont);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
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
            desktop.open(new File("PDF\\Relatorio de Busca Ativa do Paciente"+ba.getPaciente().getNomePaciente()+".pdf"));
            }   catch (DocumentException ex) {
            java.util.logging.Logger.getLogger(RelatorioBuscaAtiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Por favor feche o PDF que esta aberto !");
        }   catch (IOException ex) {
                Logger.getLogger(RelatorioBuscaAtiva.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
        pdf.close();
        }
              }else{
        JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela");
        
        }   }

             

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Filtra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        voltar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Editar1 = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório de Busca Ativa");
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

        voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/voltaricon.png"))); // NOI18N
        voltar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltar1MouseClicked(evt);
            }
        });
        getContentPane().add(voltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/pesquisaodsakda13232.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 40));

        Editar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/gerar-relatorio.png"))); // NOI18N
        Editar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Editar1MouseClicked(evt);
            }
        });
        getContentPane().add(Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 60, 60));

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

    private void Editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Editar1MouseClicked
        // TODO add your handling code here:
             GerarPdf();
    }//GEN-LAST:event_Editar1MouseClicked

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
                new RelatorioBuscaAtiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Editar1;
    private javax.swing.JTextField Filtra;
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
