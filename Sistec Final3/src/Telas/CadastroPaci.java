/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Dao.PacienteDao;
import aula11.CPF;
import classJava.Paciente;
import classJava.Usuario;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import formatador.classes.Formatador;
import java.awt.Toolkit;
/**
 *
 * @author Caio
 */
public class CadastroPaci extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPaci
     */
    public CadastroPaci() {
        initComponents();
        setIcon();
        cpf=new Formatador(jTextcpf, "###.###.###-##");
        telefone=new Formatador(jTextFieldTelefone, "(##)#####-####");
        data=new Formatador(jTextFieldDataNasc, "##/##/####");
        cep=new Formatador(jTextFieldCep, "#####-###");
    }
    private final Formatador cpf;
    private final Formatador telefone;
    private final Formatador data;
    private final Formatador cep;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void nivelAcesso(Usuario u){
    nivel.setText(u.getNivelDeAcesso());
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextcartaoSus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextnomePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDataNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextNomeMae = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextcpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextApelido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextNacionalidade = new javax.swing.JTextField();
        jCheckBoxB = new javax.swing.JCheckBox();
        jCheckBoxPreta = new javax.swing.JCheckBox();
        jCheckBoxParda = new javax.swing.JCheckBox();
        jCheckBoxAmarela = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldIndigenaEtnia = new javax.swing.JTextField();
        jCheckBoxEFC = new javax.swing.JCheckBox();
        jCheckBoxEMC = new javax.swing.JCheckBox();
        jCheckBoxESC = new javax.swing.JCheckBox();
        jCheckBoxAnalfabeto = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFielduf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldcodMunicipio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldMunicipio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldPontoReferencia = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CadastrarPaciente = new javax.swing.JLabel();
        PesquisarPaciente = new javax.swing.JLabel();
        limpar = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Paciente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cartão SUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 57, -1, -1));
        getContentPane().add(jTextcartaoSus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 78, 305, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome Completo da Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 112, -1, -1));
        getContentPane().add(jTextnomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 133, 305, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome Completo da Mae");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, -1, -1));
        getContentPane().add(jTextFieldDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, 110, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CPF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 227, -1, -1));

        jTextNomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeMaeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextNomeMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 188, 303, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Data de Nascimento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 282, -1, -1));
        getContentPane().add(jTextcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 248, 303, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Apelido da Paciente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 57, -1, -1));
        getContentPane().add(jTextIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 188, 108, 28));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nacionalidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 112, -1, -1));
        getContentPane().add(jTextApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 78, 235, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Idade");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 167, -1, -1));
        getContentPane().add(jTextNacionalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 133, 235, 28));

        jCheckBoxB.setText("Branca");
        jCheckBoxB.setName("Branca"); // NOI18N
        jCheckBoxB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxB, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 251, -1, -1));

        jCheckBoxPreta.setText("Preta");
        jCheckBoxPreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPretaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPreta, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 251, -1, -1));

        jCheckBoxParda.setText("Parda");
        jCheckBoxParda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPardaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxParda, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 251, -1, -1));

        jCheckBoxAmarela.setText("Amarela");
        jCheckBoxAmarela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAmarelaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAmarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 251, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Raça");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 227, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Indígena/Etnia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 282, -1, -1));
        getContentPane().add(jTextFieldIndigenaEtnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 303, 120, 28));

        jCheckBoxEFC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBoxEFC.setText("Ensino Fundamental Completo");
        jCheckBoxEFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEFCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 339, -1, -1));

        jCheckBoxEMC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBoxEMC.setText("Ensino Medio Completo");
        jCheckBoxEMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEMCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 364, -1, -1));

        jCheckBoxESC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBoxESC.setText("Ensino Superior Completo");
        jCheckBoxESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxESCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 387, -1, -1));

        jCheckBoxAnalfabeto.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBoxAnalfabeto.setText("Analfabeto");
        jCheckBoxAnalfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAnalfabetoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxAnalfabeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 566, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 419, 566, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Logradouro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 57, -1, -1));
        getContentPane().add(jTextFieldComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 133, 193, 28));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Numero");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 112, -1, -1));

        jTextFieldLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLogradouroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 78, 260, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Complemento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 112, -1, -1));
        getContentPane().add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 133, 60, 28));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Bairro");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 167, -1, -1));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 188, 260, 28));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("UF");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 227, -1, -1));
        getContentPane().add(jTextFielduf, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 248, 260, 28));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Codigo do Municipio");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 282, -1, -1));
        getContentPane().add(jTextFieldcodMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 303, 108, 28));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Município");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 282, -1, -1));
        getContentPane().add(jTextFieldMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 303, 140, 28));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("CEP");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 342, -1, -1));
        getContentPane().add(jTextFieldCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 364, 260, 28));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Telefone");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 427, 260, 28));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Ponto de Referencia");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 466, -1, -1));
        getContentPane().add(jTextFieldPontoReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 487, 260, 28));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 0, -1, 537));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/nav4343fdss.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 495, 43));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/navbar332322.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 0, 242, 37));

        CadastrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/cadastrarcamp.png"))); // NOI18N
        CadastrarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarPacienteMouseClicked(evt);
            }
        });
        getContentPane().add(CadastrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 443, -1, -1));

        PesquisarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/pesquisarcamp.png"))); // NOI18N
        PesquisarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarPacienteMouseClicked(evt);
            }
        });
        getContentPane().add(PesquisarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 443, -1, -1));

        limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/limparcamp.png"))); // NOI18N
        getContentPane().add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 443, -1, -1));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/voltarpng.png"))); // NOI18N
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, -1, 70));

        nivel.setText("jLabel19");
        getContentPane().add(nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundolegal585.jpg"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeMaeActionPerformed

    private void jTextFieldLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLogradouroActionPerformed

    private void jCheckBoxBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBActionPerformed
       jCheckBoxPreta.setSelected(false);
       jCheckBoxParda.setSelected(false);
       jCheckBoxAmarela.setSelected(false);
    }//GEN-LAST:event_jCheckBoxBActionPerformed

    private void jCheckBoxPretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPretaActionPerformed
       jCheckBoxB.setSelected(false);
       jCheckBoxParda.setSelected(false);
       jCheckBoxAmarela.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPretaActionPerformed

    private void jCheckBoxPardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPardaActionPerformed

       jCheckBoxPreta.setSelected(false);
       jCheckBoxB.setSelected(false);
       jCheckBoxAmarela.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPardaActionPerformed

    private void jCheckBoxAmarelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAmarelaActionPerformed
        // TODO add your handling code here:
                                                   
       jCheckBoxPreta.setSelected(false);
       jCheckBoxParda.setSelected(false);
       jCheckBoxB.setSelected(false);
    }//GEN-LAST:event_jCheckBoxAmarelaActionPerformed

    private void jCheckBoxEFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEFCActionPerformed
       
        jCheckBoxEMC.setSelected(false);
       jCheckBoxESC.setSelected(false);
       jCheckBoxAnalfabeto.setSelected(false);
       
    }//GEN-LAST:event_jCheckBoxEFCActionPerformed

    private void jCheckBoxEMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEMCActionPerformed
         jCheckBoxEFC.setSelected(false);
       jCheckBoxESC.setSelected(false);
       jCheckBoxAnalfabeto.setSelected(false);
    }//GEN-LAST:event_jCheckBoxEMCActionPerformed

    private void jCheckBoxESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxESCActionPerformed
         jCheckBoxEMC.setSelected(false);
       jCheckBoxEFC.setSelected(false);
       jCheckBoxAnalfabeto.setSelected(false);
    }//GEN-LAST:event_jCheckBoxESCActionPerformed

    private void jCheckBoxAnalfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAnalfabetoActionPerformed
         jCheckBoxEMC.setSelected(false);
       jCheckBoxESC.setSelected(false);
       jCheckBoxEFC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxAnalfabetoActionPerformed

    private void CadastrarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarPacienteMouseClicked
         if(jTextcartaoSus.getText().equals("") || jTextApelido.getText().equals("")|| jTextnomePaciente.getText().equals("")
                 || jTextNomeMae.getText().equals("") || jTextIdade.getText().equals("") || jTextcpf.getText().equals("")
                 || jTextFieldLogradouro.getText().equals("") || jTextFieldcodMunicipio.getText().equals("") || jTextFieldCep.getText().equals("")
                 ||  jTextFieldTelefone.getText().equals("") || jTextFieldPontoReferencia.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo Obrigatorio Deixado em Branco");
         } else if(!jCheckBoxAmarela.isSelected() && !jCheckBoxParda.isSelected() && !jCheckBoxB.isSelected() &&
                   !jCheckBoxPreta.isSelected() ){
                    JOptionPane.showMessageDialog(null,"Selecione Alguma das Opções de Raça ");
         } else if(!jCheckBoxAnalfabeto.isSelected() && !jCheckBoxEFC.isSelected() && !jCheckBoxEMC.isSelected() &&
                 !jCheckBoxESC.isSelected()){
             
                    JOptionPane.showMessageDialog(null,"Selecione Alguma das Opções de Escolaridade ");
         }
         else{
             Paciente p=new Paciente();
             p.setCartaoSus(jTextcartaoSus.getText());
             p.setApelido(jTextApelido.getText());
             p.setNomePaciente(jTextnomePaciente.getText());
             p.setNacionalidade(jTextNacionalidade.getText());
             p.setNomeMae(jTextNomeMae.getText());
             p.setIdade(Integer.parseInt(jTextIdade.getText()));
             CPF pf = new CPF(jTextcpf.getText());
            if(pf.isCPF()){
                p.setCpf(jTextcpf.getText());
                
             if(jCheckBoxB.isSelected()){
                 p.setRaca(jCheckBoxB.getText());
                 
             }else if(jCheckBoxPreta.isSelected()){
             p.setRaca(jCheckBoxPreta.getText());
             }else if(jCheckBoxParda.isSelected()){
                 p.setRaca(jCheckBoxParda.getText());
             }else if(jCheckBoxAmarela.isSelected()){
             p.setRaca(jCheckBoxAmarela.getText());
             }
             p.setDataNacimento(jTextFieldDataNasc.getText());
             p.setIndigenaEtinia(jTextFieldIndigenaEtnia.getText());
             if(jCheckBoxEFC.isSelected()){
                 p.setNivelEscolaridade(jCheckBoxEFC.getText());
                 
             }else if(jCheckBoxEMC.isSelected()){
             p.setNivelEscolaridade(jCheckBoxEMC.getText());
             }else if(jCheckBoxESC.isSelected()){
                 p.setNivelEscolaridade(jCheckBoxESC.getText());
             }else if(jCheckBoxAnalfabeto.isSelected()){
             p.setNivelEscolaridade(jCheckBoxAnalfabeto.getText());
             }
             p.setLogradouro(jTextFieldLogradouro.getText());
             p.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
             p.setComplemento(jTextFieldComplemento.getText());
             p.setBairro(jTextFieldBairro.getText());
             p.setUF(jTextFielduf.getText());
             p.setCodigoMunicipio(jTextFieldcodMunicipio.getText());
             p.setMunicipio(jTextFieldMunicipio.getText());
             p.setCep(jTextFieldCep.getText());
             p.setTelefone(jTextFieldTelefone.getText());
             p.setPontoReferencia(jTextFieldPontoReferencia.getText());
             PacienteDao dao= new PacienteDao();
             p=dao.salvar(p);
             JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
            dispose();
            CadastroPaci Prin = new CadastroPaci();
            Prin.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane,"CPF inválido!");
                
            }
             
         }
        
    }//GEN-LAST:event_CadastrarPacienteMouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
     //Usuario u = new Usuario();
     //String oi = nivel.getText();
        //u.setNivelDeAcesso(nivel.getText());
     //   if(nivel.getText().equals("Administrador")){
       // dispose();
        //PrincipalADM prin = new PrincipalADM();
       // prin.nivelAcesso(u);
       //
        //prin.setVisible(true);
        //}
    /*else if(nivel.getText().equals("Digitador")){
         dispose();
        PrincipalDigitador prin = new PrincipalDigitador();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }else if(nivel.getText().equals("Atendente")){
         dispose();
        PrincipalAtendente prin = new PrincipalAtendente();
        prin.nivelAcesso(u);
        prin.setVisible(true);
        }*/
       dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_VoltarMouseClicked

    private void PesquisarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarPacienteMouseClicked
        // TODO add your handling code here:
         /*Usuario u = new Usuario();
        u.setNivelDeAcesso(nivel.getText());
        
        dispose();
        PesquisarPaciente prin = new PesquisarPaciente();
        prin.nivelAcesso(u);
        prin.setVisible(true);*/
        dispose();
        PesquisarPaciente prin = new PesquisarPaciente();
        prin.setVisible(true);
    }//GEN-LAST:event_PesquisarPacienteMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroPaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadastrarPaciente;
    private javax.swing.JLabel PesquisarPaciente;
    private javax.swing.JLabel Voltar;
    private javax.swing.JCheckBox jCheckBoxAmarela;
    private javax.swing.JCheckBox jCheckBoxAnalfabeto;
    private javax.swing.JCheckBox jCheckBoxB;
    private javax.swing.JCheckBox jCheckBoxEFC;
    private javax.swing.JCheckBox jCheckBoxEMC;
    private javax.swing.JCheckBox jCheckBoxESC;
    private javax.swing.JCheckBox jCheckBoxParda;
    private javax.swing.JCheckBox jCheckBoxPreta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextApelido;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldIndigenaEtnia;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldMunicipio;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPontoReferencia;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldcodMunicipio;
    private javax.swing.JTextField jTextFielduf;
    private javax.swing.JTextField jTextIdade;
    private javax.swing.JTextField jTextNacionalidade;
    private javax.swing.JTextField jTextNomeMae;
    private javax.swing.JTextField jTextcartaoSus;
    private javax.swing.JTextField jTextcpf;
    private javax.swing.JTextField jTextnomePaciente;
    private javax.swing.JLabel limpar;
    private javax.swing.JLabel nivel;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
