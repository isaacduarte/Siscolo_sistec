/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import classJava.anaminese;
import javax.swing.UIManager;
import javax.swing.table.TableRowSorter;
import Dao.AnamineseDao;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Phaser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Caio
 */
public class DadosAnaminese extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarUsuario
     */
    public DadosAnaminese() {
        initComponents();
    }
    public void GerarPdf(){
        Document pdf= new Document();
        try {
            //Cria um pdf na pasta detinada
            PdfWriter.getInstance(pdf, 
            new FileOutputStream("PDF\\Dados Anamnesico do "+Paciente.getText()+".pdf"));
            
            //Abrir o Documento
            pdf.open();
            
            //seta o tamanho da pagina
            pdf.setPageSize(PageSize.A4);
            Font f = new Font(FontFamily.HELVETICA, 20, Font.BOLD);
            Font f2 = new Font (FontFamily.HELVETICA, 14, Font.BOLD);
            Font f3 = new Font (FontFamily.HELVETICA, 14, Font.NORMAL);
            Font f4 = new Font (FontFamily.HELVETICA, 12, Font.BOLD);
            Font f5 = new Font (FontFamily.HELVETICA, 11, Font.NORMAL);
            Paragraph Titulo = new Paragraph("Ministério da Saúde", f);
            Paragraph Footer = new Paragraph("MS/SECRETARIA EXECULTIVA/DATASUS/SIPPS", f3);
            Footer.setAlignment(Element.ALIGN_CENTER);
            Paragraph InfoPaciente = new Paragraph();
            InfoPaciente.setAlignment(Element.ALIGN_CENTER);
            Paragraph line1 = new Paragraph();
            Paragraph Rline1 = new Paragraph();
            Paragraph line2 = new Paragraph();
            Paragraph Rline2 = new Paragraph();
            Paragraph line3 = new Paragraph();
            Paragraph Rline3 = new Paragraph();
            Paragraph subTitulo = new Paragraph();
            Paragraph name1 = new Paragraph("Dados da  Anamnesico",f2);
            name1.setAlignment(Element.ALIGN_CENTER);
            Paragraph espaco = new Paragraph("                ");
            subTitulo.add( new Phrase("   Sistec-  ", f2));
            subTitulo.add(new Phrase("Sistema de Gestão de Informações do Câncer Do Colo De Útero", f3));
            InfoPaciente.add(new Phrase("Nome da Paciente: ", f4));
            InfoPaciente.add(new Phrase(Paciente.getText(), f3));
            InfoPaciente.add(new Phrase("           Municipio: ", f4));
            InfoPaciente.add(new Phrase(Municipio.getText(), f3));
            PdfPTable table = new PdfPTable(2);	
            table.addCell( new Phrase("Motivo do Exame:",f4));
            table.addCell(new Phrase("Já fez tratamento por radiografia?",f4));
            table.addCell(new Phrase(MotivodoExame1.getText(),f3));
            table.addCell(new Phrase(tratemntoRadiografia.getText(),f3));
            table.addCell(new Phrase("Fez o exame preventivo (Pepanicolaou) alguma vez?", f4));
            table.addCell(new Phrase("Usa DIU?", f4));
            table.addCell(new Phrase(fezexamepreventivo.getText(),f3));
            table.addCell(new Phrase(UsaDIU.getText(),f3));
            table.addCell(new Phrase("Está Grávida?",f4));
            table.addCell(new Phrase("Data da última mestruação:", f4));
            table.addCell(new Phrase(estaGravida.getText(),f3));
            table.addCell(new Phrase(dataUtimaMestruacao.getText(),f3));
            table.addCell(new Phrase("Usa pílula anticoncepcional?", f4));
            table.addCell(new Phrase("Usa hormonio/remédio para a menopausa?", f4));
            table.addCell(new Phrase(usaPilula.getText(), f3));
            table.addCell(new Phrase(hr.getText(),f3));
            table.addCell(new Phrase("Tem ou teve algum sangramento após relações sexuais?",f4));
            table.addCell(new Phrase("Tem ou teve algum sangramento após a menopausa?",f4));
            table.addCell(new Phrase(sangramentoSexual.getText(),f3));
            table.addCell(new Phrase(sangramentoMenopausa.getText(),f3));
            pdf.add(Titulo);    
            pdf.add(espaco);
            pdf.add(subTitulo);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
            pdf.add(name1);
            pdf.add(espaco);
            pdf.add(InfoPaciente);
            pdf.add(espaco);
            pdf.add(table);
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
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(espaco);
            pdf.add(new LineSeparator());
            pdf.add(Footer);
            
            
            Desktop desktop = Desktop.getDesktop();    
            desktop.open(new File("PDF\\Dados Anamnesico do "+Paciente.getText()+".pdf"));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Por Favor Feche o PDF Que Esta Aberto");
        } catch (DocumentException ex) {
            Logger.getLogger(DadosAnaminese.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DadosAnaminese.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        pdf.close();
        }
    }
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        labe12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        Paciente = new javax.swing.JLabel();
        MotivodoExame1 = new javax.swing.JLabel();
        fezexamepreventivo = new javax.swing.JLabel();
        UsaDIU = new javax.swing.JLabel();
        usaPilula = new javax.swing.JLabel();
        voltar = new javax.swing.JLabel();
        hr = new javax.swing.JLabel();
        tratemntoRadiografia = new javax.swing.JLabel();
        sangramentoSexual = new javax.swing.JLabel();
        sangramentoMenopausa = new javax.swing.JLabel();
        estaGravida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Municipio = new javax.swing.JLabel();
        PDF = new javax.swing.JLabel();
        dataUtimaMestruacao = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label1.setText("Paciente: ");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        label3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label3.setText("Fez o exame preventivo (Pepanicolaou) alguma vez?");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        label4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label4.setText("Usa DIU?");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        label8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label8.setText("Usa pílula anticoncepcional?");
        getContentPane().add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));

        label9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label9.setText("Usa hormonio/remédio para a menopausa?");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        label10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label10.setText("Já fez tratamento por radiografia?");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        labe12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labe12.setText("Tem ou teve algum sangramento após relações sexuais?");
        getContentPane().add(labe12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 350, -1));

        label13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label13.setText("Tem ou teve algum sangramento após a menopausa?");
        getContentPane().add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 330, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Está Grávida?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, 20));

        label15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label15.setText("Data da última mestruação:");
        getContentPane().add(label15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        label2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label2.setText("Motivo do Exame:");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Paciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Paciente.setText("jLabel1");
        getContentPane().add(Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        MotivodoExame1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MotivodoExame1.setText("jLabel2");
        getContentPane().add(MotivodoExame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        fezexamepreventivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fezexamepreventivo.setText("jLabel3");
        getContentPane().add(fezexamepreventivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        UsaDIU.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UsaDIU.setText("jLabel4");
        getContentPane().add(UsaDIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        usaPilula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usaPilula.setText("jLabel8");
        getContentPane().add(usaPilula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/voltarpng.png"))); // NOI18N
        voltar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                voltarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarMouseClicked(evt);
            }
        });
        getContentPane().add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 80));

        hr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hr.setText("jLabel9");
        getContentPane().add(hr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        tratemntoRadiografia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tratemntoRadiografia.setText("jLabel10");
        getContentPane().add(tratemntoRadiografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        sangramentoSexual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sangramentoSexual.setText("jLabel12");
        getContentPane().add(sangramentoSexual, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        sangramentoMenopausa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sangramentoMenopausa.setText("jLabel13");
        getContentPane().add(sangramentoMenopausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        estaGravida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        estaGravida.setText("jLabel14");
        getContentPane().add(estaGravida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Municipio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        Municipio.setText("jLabel2");
        getContentPane().add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        PDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconesNovos/pdf.png"))); // NOI18N
        PDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PDFMouseClicked(evt);
            }
        });
        getContentPane().add(PDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        dataUtimaMestruacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dataUtimaMestruacao.setText("jLabel15");
        getContentPane().add(dataUtimaMestruacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PesquisarIMG/fundolegal.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Exporta(anaminese ana){
        AnamineseDao dao = new AnamineseDao();
        ana = dao.obter(anaminese.class, ana.getId());
        Paciente.setText(ana.getPaciente().getNomePaciente());
        Municipio.setText(ana.getPaciente().getMunicipio());
        MotivodoExame1.setText(ana.getMotivoExame());
        fezexamepreventivo.setText(ana.getExamePreventivo());
        UsaDIU.setText(ana.getDIU());
        usaPilula.setText(ana.getPAnticoncepcional());
        hr.setText(ana.getRemedioMenopausa());
        tratemntoRadiografia.setText(ana.getRadiografia());
        sangramentoSexual.setText(ana.getSangramentoRelacoesSexuais());
        sangramentoMenopausa.setText(ana.getSangramentoMenopausa());
        estaGravida.setText(ana.getGravida());
        dataUtimaMestruacao.setText(ana.getDUtimaMestruacao());
    }
    private void voltarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_voltarAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarAncestorAdded

    private void voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarMouseClicked
        dispose();
        PesquisarAna Prin = new PesquisarAna();
        Prin.setVisible(true);
    }//GEN-LAST:event_voltarMouseClicked

    private void PDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PDFMouseClicked
        // TODO add your handling code here:
        GerarPdf();
    }//GEN-LAST:event_PDFMouseClicked
TableRowSorter trs ;
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
                new DadosAnaminese().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MotivodoExame1;
    private javax.swing.JLabel Municipio;
    private javax.swing.JLabel PDF;
    private javax.swing.JLabel Paciente;
    private javax.swing.JLabel UsaDIU;
    private javax.swing.JLabel dataUtimaMestruacao;
    private javax.swing.JLabel estaGravida;
    private javax.swing.JLabel fezexamepreventivo;
    private javax.swing.JLabel hr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labe12;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel sangramentoMenopausa;
    private javax.swing.JLabel sangramentoSexual;
    private javax.swing.JLabel tratemntoRadiografia;
    private javax.swing.JLabel usaPilula;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
