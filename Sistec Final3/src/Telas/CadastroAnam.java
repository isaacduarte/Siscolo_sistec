package Telas;

import classJava.anaminese;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Dao.AnamineseDao;
import Dao.PacienteDao;
import classJava.Paciente;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class CadastroAnam extends javax.swing.JFrame {

    public CadastroAnam() {
        initComponents();
        setIcon();
        addcombobox();
        jTextFieldFAPAno.setVisible(false);
        jLabelAno.setVisible(false);

    }
    //setando o nome do paciente na jcomboBox.
    public void addcombobox(){
            PacienteDao dao=new PacienteDao();
            List<Paciente> paciente=dao.pesquisaId();
            boxnomePaciente.addItem("Selecione um Paciente");
            for(Paciente p: paciente){
                boxnomePaciente.addItem(p.getNomePaciente());
            }
            
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBoxMERastreamento = new javax.swing.JCheckBox();
        jCheckBoxMERepeticao = new javax.swing.JCheckBox();
        jCheckBoxMEseguimento = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxFAPSimQ = new javax.swing.JCheckBox();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldDataUMestruacao = new javax.swing.JFormattedTextField();
        jCheckBoxFAPNao = new javax.swing.JCheckBox();
        jCheckBoxFAPNaoS = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBoxUDSim = new javax.swing.JCheckBox();
        jCheckBoxUDNao = new javax.swing.JCheckBox();
        jCheckBoxUDNaoS = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxEGSim = new javax.swing.JCheckBox();
        jCheckBoxEGNao = new javax.swing.JCheckBox();
        jCheckBoxEGNaoS = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxPASim = new javax.swing.JCheckBox();
        jCheckBoxPANao = new javax.swing.JCheckBox();
        jCheckBoxPANaoS = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jCheckBoxHRMSim = new javax.swing.JCheckBox();
        jCheckBoxHRMNao = new javax.swing.JCheckBox();
        jCheckBoxHRMNaoS = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxTRSim = new javax.swing.JCheckBox();
        jCheckBoxTRNao = new javax.swing.JCheckBox();
        jCheckBoxTRNaoS = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFAPAno = new javax.swing.JFormattedTextField();
        jCheckBoxDUMNaoS = new javax.swing.JCheckBox();
        jCheckBoxDUMNaoL = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBoxSRSSim = new javax.swing.JCheckBox();
        jCheckBoxSRSNN = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxSMSim = new javax.swing.JCheckBox();
        jCheckBoxSMNNN = new javax.swing.JCheckBox();
        CAdastra = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JLabel();
        Limpar = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        boxnomePaciente = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Anamnese");
        setMinimumSize(new java.awt.Dimension(710, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Motivo do Exame");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jCheckBoxMERastreamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxMERastreamento.setText("Rastreamento");
        jCheckBoxMERastreamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMERastreamentoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMERastreamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jCheckBoxMERepeticao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxMERepeticao.setText("Repetição(Exame alterado ASCUS/Baixo grau)");
        jCheckBoxMERepeticao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMERepeticaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMERepeticao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jCheckBoxMEseguimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxMEseguimento.setText("Seguimento(Pos diagnóstica calposcopia/Tratamento)");
        jCheckBoxMEseguimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMEseguimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxMEseguimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fez o exame preventivo (Pepanicolaou) alguma vez?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 10));

        jCheckBoxFAPSimQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxFAPSimQ.setText("Sim. Quando fez o último exame?");
        jCheckBoxFAPSimQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFAPSimQActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxFAPSimQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabelAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelAno.setText("Ano:");
        getContentPane().add(jLabelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(jTextFieldDataUMestruacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 79, -1));

        jCheckBoxFAPNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxFAPNao.setText("Não");
        jCheckBoxFAPNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFAPNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxFAPNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jCheckBoxFAPNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxFAPNaoS.setText("Não Sabe");
        jCheckBoxFAPNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFAPNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxFAPNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Usa DIU?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jCheckBoxUDSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxUDSim.setText("Sim");
        jCheckBoxUDSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUDSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxUDSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jCheckBoxUDNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxUDNao.setText("Não");
        jCheckBoxUDNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUDNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxUDNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jCheckBoxUDNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxUDNaoS.setText("Não Sabe");
        jCheckBoxUDNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUDNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxUDNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Está Grávida?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 20));

        jCheckBoxEGSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxEGSim.setText("Sim");
        jCheckBoxEGSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEGSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEGSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jCheckBoxEGNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxEGNao.setText("Não");
        jCheckBoxEGNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEGNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEGNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jCheckBoxEGNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxEGNaoS.setText("Não Sabe");
        jCheckBoxEGNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEGNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxEGNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usa pílula anticoncepcional?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 277, -1, -1));

        jCheckBoxPASim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxPASim.setText("Sim");
        jCheckBoxPASim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPASimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPASim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 294, -1, -1));

        jCheckBoxPANao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxPANao.setText("Não");
        jCheckBoxPANao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPANaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPANao, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 294, -1, -1));

        jCheckBoxPANaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxPANaoS.setText("Não Sabe");
        jCheckBoxPANaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPANaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPANaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 294, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Usa hormonio/remédio para a menopausa?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 319, -1, -1));

        jCheckBoxHRMSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxHRMSim.setText("Sim");
        jCheckBoxHRMSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHRMSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxHRMSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 336, -1, -1));

        jCheckBoxHRMNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxHRMNao.setText("Não");
        jCheckBoxHRMNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHRMNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxHRMNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 336, -1, -1));

        jCheckBoxHRMNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxHRMNaoS.setText("Não Sabe");
        jCheckBoxHRMNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHRMNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxHRMNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 336, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Já fez tratamento por radiografia?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 361, -1, -1));

        jCheckBoxTRSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxTRSim.setText("Sim");
        jCheckBoxTRSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTRSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTRSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 378, -1, -1));

        jCheckBoxTRNao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxTRNao.setText("Não");
        jCheckBoxTRNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTRNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTRNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 378, -1, -1));

        jCheckBoxTRNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxTRNaoS.setText("Não Sabe");
        jCheckBoxTRNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTRNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTRNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 378, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Data da última mestruação");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jTextFieldFAPAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFAPAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFAPAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 79, -1));

        jCheckBoxDUMNaoS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxDUMNaoS.setText("Não Sabe");
        jCheckBoxDUMNaoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDUMNaoSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxDUMNaoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jCheckBoxDUMNaoL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxDUMNaoL.setText("Não Lembra");
        jCheckBoxDUMNaoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDUMNaoLActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxDUMNaoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tem ou teve algum sangramento após relações sexuais? (não considerar a primeira relação sexual na vida)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 403, -1, -1));

        jCheckBoxSRSSim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxSRSSim.setText("Sim");
        jCheckBoxSRSSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSRSSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSRSSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jCheckBoxSRSNN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxSRSNN.setText("Não sabe/Não lembra");
        jCheckBoxSRSNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSRSNNActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSRSNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Tem ou teve algum sangramento após a menopausa? (não considerar o(s) sagramentos) no vigência da reposição hormonal)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 445, -1, -1));

        jCheckBoxSMSim.setText("Sim");
        jCheckBoxSMSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSMSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSMSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 462, -1, -1));

        jCheckBoxSMNNN.setText("Não sabe/Não lembra/Não esta no menopausa");
        jCheckBoxSMNNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSMNNNActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSMNNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        CAdastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/cadastrarcamp.png"))); // NOI18N
        CAdastra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CAdastraMouseClicked(evt);
            }
        });
        getContentPane().add(CAdastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 492, -1, -1));

        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/pesquisarcamp.png"))); // NOI18N
        Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarMouseClicked(evt);
            }
        });
        getContentPane().add(Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 492, -1, -1));

        Limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/limparcamp.png"))); // NOI18N
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 492, -1, -1));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/voltarpng.png"))); // NOI18N
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, 70));

        boxnomePaciente.setModel(boxnomePaciente.getModel());
        boxnomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxnomePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(boxnomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundos/fundoanam.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jCheckBoxMERepeticaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMERepeticaoActionPerformed
        jCheckBoxMERastreamento.setSelected(false);
        jCheckBoxMEseguimento.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMERepeticaoActionPerformed

    private void jCheckBoxMEseguimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMEseguimentoActionPerformed
        jCheckBoxMERepeticao.setSelected(false);
        jCheckBoxMERastreamento.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMEseguimentoActionPerformed

    private void jCheckBoxUDSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUDSimActionPerformed
        jCheckBoxUDNao.setSelected(false);
        jCheckBoxUDNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxUDSimActionPerformed

    private void jCheckBoxMERastreamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMERastreamentoActionPerformed
        jCheckBoxMERepeticao.setSelected(false);
        jCheckBoxMEseguimento.setSelected(false);
    }//GEN-LAST:event_jCheckBoxMERastreamentoActionPerformed

    private void jTextFieldFAPAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFAPAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFAPAnoActionPerformed

    private void jCheckBoxFAPSimQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFAPSimQActionPerformed
        jLabelAno.setVisible(true);
        jTextFieldFAPAno.setVisible(true);
        jCheckBoxFAPNao.setSelected(false);
        jCheckBoxFAPNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxFAPSimQActionPerformed

    private void jCheckBoxFAPNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFAPNaoActionPerformed
        jCheckBoxFAPSimQ.setSelected(false);
        jCheckBoxFAPNaoS.setSelected(false);
        jTextFieldFAPAno.setVisible(false);
        jLabelAno.setVisible(false);
    }//GEN-LAST:event_jCheckBoxFAPNaoActionPerformed

    private void jCheckBoxFAPNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFAPNaoSActionPerformed
        jCheckBoxFAPSimQ.setSelected(false);
        jCheckBoxFAPNao.setSelected(false);
        jTextFieldFAPAno.setVisible(false);
        jLabelAno.setVisible(false);
    }//GEN-LAST:event_jCheckBoxFAPNaoSActionPerformed

    private void jCheckBoxUDNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUDNaoActionPerformed
        jCheckBoxUDSim.setSelected(false);
        jCheckBoxUDNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxUDNaoActionPerformed

    private void jCheckBoxUDNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUDNaoSActionPerformed
        jCheckBoxUDSim.setSelected(false);
        jCheckBoxUDNao.setSelected(false);
    }//GEN-LAST:event_jCheckBoxUDNaoSActionPerformed

    private void jCheckBoxEGSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEGSimActionPerformed
        jCheckBoxEGNao.setSelected(false);
        jCheckBoxEGNaoS.setSelected(false);

    }//GEN-LAST:event_jCheckBoxEGSimActionPerformed

    private void jCheckBoxEGNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEGNaoActionPerformed
        jCheckBoxEGSim.setSelected(false);
        jCheckBoxEGNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxEGNaoActionPerformed

    private void jCheckBoxEGNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEGNaoSActionPerformed
        jCheckBoxEGSim.setSelected(false);
        jCheckBoxEGNao.setSelected(false);
    }//GEN-LAST:event_jCheckBoxEGNaoSActionPerformed

    private void CAdastraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAdastraMouseClicked
        if (!jCheckBoxMERastreamento.isSelected() && !jCheckBoxMERepeticao.isSelected() && !jCheckBoxMEseguimento.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Motivo Do Exame");
        } else if (!jCheckBoxFAPSimQ.isSelected() && !jCheckBoxFAPNao.isSelected() && !jCheckBoxFAPNaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Fez o Exame Preventivo ");
        } else if (!jCheckBoxUDSim.isSelected() && !jCheckBoxUDNao.isSelected() && !jCheckBoxUDNaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Usa DIU ");
        } else if (!jCheckBoxEGSim.isSelected() && jCheckBoxEGNao.isSelected() && jCheckBoxEGNaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Está Grávida");
        } else if (!jCheckBoxPASim.isSelected() && jCheckBoxPANao.isSelected() && jCheckBoxPANaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Usa Pílula Anticoncepcional");
        } else if (!jCheckBoxHRMSim.isSelected() && jCheckBoxHRMNao.isSelected() && jCheckBoxHRMNaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Usa Hormonio/Remédio para a Menopausa");
        } else if (!jCheckBoxTRSim.isSelected() && !jCheckBoxTRNao.isSelected() && !jCheckBoxTRNaoS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Já Fez Tratamento Por Radiografia");
        } else if (!jCheckBoxSRSSim.isSelected() && !jCheckBoxSRSNN.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Tem ou teve algum sangramento após relações sexuais");
        } else if (!jCheckBoxSMSim.isSelected() && !jCheckBoxSMNNN.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções Tem ou teve algum sangramento após a menopausa");
        } else if (jTextFieldDataUMestruacao.equals("") && !jCheckBoxDUMNaoS.isSelected() && !jCheckBoxDUMNaoL.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione Umas Das Opções De Data Da Última Mestruação");
        } else if(boxnomePaciente.equals("Escolha um  Paciente")){
            JOptionPane.showMessageDialog(null, "Escolha um Paciente");
        } else {
            anaminese ana = new anaminese();
            if (jCheckBoxMERastreamento.isSelected()) {
                ana.setMotivoExame(jCheckBoxMERastreamento.getText());
            } else if (jCheckBoxMERepeticao.isSelected()) {
                ana.setMotivoExame(jCheckBoxMERepeticao.getText());
            } else if (jCheckBoxMEseguimento.isSelected()) {
                ana.setMotivoExame(jCheckBoxMEseguimento.getText());
            }
            if (jCheckBoxFAPSimQ.isSelected()) {
                ana.setExamePreventivo(jTextFieldFAPAno.getText());
            } else if (jCheckBoxFAPNao.isSelected()) {
                ana.setExamePreventivo(jCheckBoxFAPNao.getText());
            } else if (jCheckBoxFAPNaoS.isSelected()) {
                ana.setExamePreventivo(jCheckBoxFAPNaoS.getText());
            }
            if (jCheckBoxUDSim.isSelected()) {
                ana.setDIU(jCheckBoxUDSim.getText());
            } else if (jCheckBoxUDNao.isSelected()) {
                ana.setDIU(jCheckBoxUDNao.getText());
            } else if (jCheckBoxUDNaoS.isSelected()) {
                ana.setDIU(jCheckBoxUDNaoS.getText());
            }
            if (jCheckBoxEGSim.isSelected()) {
                ana.setGravida(jCheckBoxEGSim.getText());
            } else if (jCheckBoxEGNao.isSelected()) {
                ana.setGravida(jCheckBoxEGNao.getText());
            } else if (jCheckBoxEGNaoS.isSelected()) {
                ana.setGravida(jCheckBoxEGNaoS.getText());
            }
            if (jCheckBoxPASim.isSelected()) {
                ana.setPAnticoncepcional(jCheckBoxPASim.getText());
            } else if (jCheckBoxPANao.isSelected()) {
                ana.setPAnticoncepcional(jCheckBoxPANao.getText());
            } else if (jCheckBoxPANaoS.isSelected()) {
                ana.setPAnticoncepcional(jCheckBoxPANaoS.getText());
            }
            if (jCheckBoxHRMSim.isSelected()) {
                ana.setRemedioMenopausa(jCheckBoxHRMSim.getText());
            } else if (jCheckBoxHRMNao.isSelected()) {
                ana.setRemedioMenopausa(jCheckBoxHRMNao.getText());
            } else if (jCheckBoxHRMNaoS.isSelected()) {
                ana.setRemedioMenopausa(jCheckBoxHRMNaoS.getText());
            }
            if (jCheckBoxTRSim.isSelected()) {
                ana.setRadiografia(jCheckBoxTRSim.getText());
            } else if (jCheckBoxTRNao.isSelected()) {
                ana.setRadiografia(jCheckBoxTRNao.getText());
            } else if (jCheckBoxTRNaoS.isSelected()) {
                ana.setRadiografia(jCheckBoxTRNaoS.getText());
            }
            if (jCheckBoxSRSSim.isSelected()) {
                ana.setSangramentoRelacoesSexuais(jCheckBoxSRSSim.getText());
            } else if (jCheckBoxSRSNN.isSelected()) {
                ana.setSangramentoRelacoesSexuais(jCheckBoxSRSNN.getText());
            }
            if (jCheckBoxSMSim.isSelected()) {
                ana.setSangramentoMenopausa(jCheckBoxSMSim.getText());
            } else if (jCheckBoxSMNNN.isSelected()) {
                ana.setSangramentoMenopausa(jCheckBoxSMNNN.getText());
            }
            if (!jCheckBoxDUMNaoS.isSelected() && !jCheckBoxDUMNaoL.isSelected()) {
                ana.setDUtimaMestruacao(jTextFieldDataUMestruacao.getText());
            } else if (jCheckBoxDUMNaoS.isSelected()) {
                ana.setDUtimaMestruacao(jCheckBoxDUMNaoS.getText());
            } else if (jCheckBoxDUMNaoL.isSelected()) {
                ana.setDUtimaMestruacao(jCheckBoxDUMNaoL.getText());
            }
            PacienteDao pdao=new PacienteDao();
            List<Paciente> paciente=pdao.pesquisaId();
            for(Paciente p: paciente){
            if(p.getNomePaciente().equals(boxnomePaciente.getSelectedItem())){
                p.setId(p.getId());
            ana.setPaciente(p);
            AnamineseDao dao = new AnamineseDao();
            ana = dao.salvar(ana);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
            dispose();
            CadastroAnam prin = new CadastroAnam();
            prin.setVisible(true);
            break;
            }
            }
            
        }
    }//GEN-LAST:event_CAdastraMouseClicked

    private void jCheckBoxSRSNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSRSNNActionPerformed
        // TODO add your handling code here:
        jCheckBoxSRSSim.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSRSNNActionPerformed

    private void jCheckBoxPASimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPASimActionPerformed
        // TODO add your handling code here:
        jCheckBoxPANao.setSelected(false);
        jCheckBoxPANaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPASimActionPerformed

    private void jCheckBoxPANaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPANaoActionPerformed
        // TODO add your handling code here:
        jCheckBoxPASim.setSelected(false);
        jCheckBoxPANaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPANaoActionPerformed

    private void jCheckBoxPANaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPANaoSActionPerformed
        // TODO add your handling code here:
        jCheckBoxPASim.setSelected(false);
        jCheckBoxPANao.setSelected(false);
    }//GEN-LAST:event_jCheckBoxPANaoSActionPerformed

    private void jCheckBoxHRMSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHRMSimActionPerformed
        // TODO add your handling code here:
        jCheckBoxHRMNao.setSelected(false);
        jCheckBoxHRMNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxHRMSimActionPerformed

    private void jCheckBoxHRMNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHRMNaoActionPerformed
        // TODO add your handling code here:
        jCheckBoxHRMSim.setSelected(false);
        jCheckBoxHRMNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxHRMNaoActionPerformed

    private void jCheckBoxHRMNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHRMNaoSActionPerformed
        // TODO add your handling code here:
        jCheckBoxHRMNao.setSelected(false);
        jCheckBoxHRMSim.setSelected(false);
    }//GEN-LAST:event_jCheckBoxHRMNaoSActionPerformed

    private void jCheckBoxTRSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTRSimActionPerformed
        // TODO add your handling code here:
        jCheckBoxTRNao.setSelected(false);
        jCheckBoxTRNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTRSimActionPerformed

    private void jCheckBoxTRNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTRNaoActionPerformed
        // TODO add your handling code here:
        jCheckBoxTRSim.setSelected(false);
        jCheckBoxTRNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTRNaoActionPerformed

    private void jCheckBoxTRNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTRNaoSActionPerformed
        // TODO add your handling code here:
        jCheckBoxTRSim.setSelected(false);
        jCheckBoxTRNao.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTRNaoSActionPerformed

    private void jCheckBoxSRSSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSRSSimActionPerformed
        // TODO add your handling code here:
        jCheckBoxSRSNN.setSelected(false);

    }//GEN-LAST:event_jCheckBoxSRSSimActionPerformed

    private void jCheckBoxSMSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSMSimActionPerformed
        // TODO add your handling code here:
        jCheckBoxSMNNN.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSMSimActionPerformed

    private void jCheckBoxSMNNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSMNNNActionPerformed
        // TODO add your handling code here:
        jCheckBoxSMSim.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSMNNNActionPerformed

    private void jCheckBoxDUMNaoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDUMNaoSActionPerformed
        // TODO add your handling code here
        jCheckBoxDUMNaoL.setSelected(false);
        jTextFieldDataUMestruacao.setVisible(false);

    }//GEN-LAST:event_jCheckBoxDUMNaoSActionPerformed

    private void jCheckBoxDUMNaoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDUMNaoLActionPerformed
        // TODO add your handling code here:
        jTextFieldDataUMestruacao.setVisible(false);
        jCheckBoxDUMNaoS.setSelected(false);
    }//GEN-LAST:event_jCheckBoxDUMNaoLActionPerformed

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        // TODO add your handling code here:
        jCheckBoxMERastreamento.setSelected(false);
        jCheckBoxMERastreamento.setSelected(false);
        jCheckBoxMEseguimento.setSelected(false);
        //Exame preenventivo
        jCheckBoxFAPSimQ.setSelected(false);
        jCheckBoxFAPNao.setSelected(false);
        jCheckBoxFAPNaoS.setSelected(false);
        jTextFieldFAPAno.setText("");
        //Usa DIU
        jCheckBoxUDSim.setSelected(false);
        jCheckBoxUDNao.setSelected(false);
        jCheckBoxUDNaoS.setSelected(false);
        //Esta gravida
        jCheckBoxEGSim.setSelected(false);
        jCheckBoxEGNao.setSelected(false);
        jCheckBoxEGNaoS.setSelected(false);
        //pilula antconsepsional
        jCheckBoxPASim.setSelected(false);
        jCheckBoxPANao.setSelected(false);
        jCheckBoxPANaoS.setSelected(false);
        //usa hormonios
        jCheckBoxHRMSim.setSelected(false);
        jCheckBoxHRMNao.setSelected(false);
        jCheckBoxHRMNaoS.setSelected(false);
        //tratamento por radiografia
        jCheckBoxTRSim.setSelected(false);
        jCheckBoxTRNao.setSelected(false);
        jCheckBoxTRNaoS.setSelected(false);
        //sangramento a pós relações sexuais
        jCheckBoxSRSSim.setSelected(false);
        jCheckBoxSRSNN.setSelected(false);
        //Tem ou teve algum sangramento após a menopausa
        jCheckBoxSMSim.setSelected(false);
        jCheckBoxSMNNN.setSelected(false);
        //Data da última mestruação
        jCheckBoxDUMNaoS.setSelected(false);
        jCheckBoxDUMNaoL.setSelected(false);
        jTextFieldDataUMestruacao.setText("");

    }//GEN-LAST:event_LimparMouseClicked

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
        dispose();
        PrincipalADM prin = new PrincipalADM();
        prin.setVisible(true);
    }//GEN-LAST:event_VoltarMouseClicked

    private void boxnomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxnomePacienteActionPerformed

    }//GEN-LAST:event_boxnomePacienteActionPerformed

    private void PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarMouseClicked
        // TODO add your handling code here:
        dispose();
        PesquisarAna ana = new PesquisarAna();
        ana.setVisible(true);
    }//GEN-LAST:event_PesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroAnam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAnam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAnam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAnam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAnam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAdastra;
    private javax.swing.JLabel Limpar;
    private javax.swing.JLabel Pesquisar;
    private javax.swing.JLabel Voltar;
    private javax.swing.JComboBox<String> boxnomePaciente;
    private javax.swing.JCheckBox jCheckBoxDUMNaoL;
    private javax.swing.JCheckBox jCheckBoxDUMNaoS;
    private javax.swing.JCheckBox jCheckBoxEGNao;
    private javax.swing.JCheckBox jCheckBoxEGNaoS;
    private javax.swing.JCheckBox jCheckBoxEGSim;
    private javax.swing.JCheckBox jCheckBoxFAPNao;
    private javax.swing.JCheckBox jCheckBoxFAPNaoS;
    private javax.swing.JCheckBox jCheckBoxFAPSimQ;
    private javax.swing.JCheckBox jCheckBoxHRMNao;
    private javax.swing.JCheckBox jCheckBoxHRMNaoS;
    private javax.swing.JCheckBox jCheckBoxHRMSim;
    private javax.swing.JCheckBox jCheckBoxMERastreamento;
    private javax.swing.JCheckBox jCheckBoxMERepeticao;
    private javax.swing.JCheckBox jCheckBoxMEseguimento;
    private javax.swing.JCheckBox jCheckBoxPANao;
    private javax.swing.JCheckBox jCheckBoxPANaoS;
    private javax.swing.JCheckBox jCheckBoxPASim;
    private javax.swing.JCheckBox jCheckBoxSMNNN;
    private javax.swing.JCheckBox jCheckBoxSMSim;
    private javax.swing.JCheckBox jCheckBoxSRSNN;
    private javax.swing.JCheckBox jCheckBoxSRSSim;
    private javax.swing.JCheckBox jCheckBoxTRNao;
    private javax.swing.JCheckBox jCheckBoxTRNaoS;
    private javax.swing.JCheckBox jCheckBoxTRSim;
    private javax.swing.JCheckBox jCheckBoxUDNao;
    private javax.swing.JCheckBox jCheckBoxUDNaoS;
    private javax.swing.JCheckBox jCheckBoxUDSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JFormattedTextField jTextFieldDataUMestruacao;
    private javax.swing.JFormattedTextField jTextFieldFAPAno;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
