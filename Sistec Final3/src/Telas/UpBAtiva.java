package Telas;

import Dao.BuscaAtivaDao;
import java.awt.Toolkit;
import javax.swing.UIManager;
import Dao.PacienteDao;
import classJava.Paciente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import classJava.BuscaAtiva;
import Dao.UnidadeSaudeDao;
import classJava.UnidadeSaude;
import java.util.ArrayList;

public class UpBAtiva extends javax.swing.JFrame {

    public UpBAtiva() {
        initComponents();
        setIcon();
        //tira a visualização do laudo da biopsia
        jLabel11.setVisible(false);
        jCheckBoxLBCarc.setVisible(false);
        jCheckBoxLBHPVNIC1.setVisible(false);
        jCheckBoxLBMC.setVisible(false);
        jCheckBoxLBNICII.setVisible(false);
        jCheckBoxLBNICIN.setVisible(false);
        jCheckBoxLBOutNeoplasias.setVisible(false);
        
        /////////////////////////////////////////////
        //tira a visualização não localização e obito//
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaReferencia = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jCheckBoxCanormal = new javax.swing.JCheckBox();
        jCheckBoxCinstisfatorio = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jCheckBoxBsim = new javax.swing.JCheckBox();
        jCheckBoxBnao = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBoxLBHPVNIC1 = new javax.swing.JCheckBox();
        jCheckBoxLBNICII = new javax.swing.JCheckBox();
        jCheckBoxLBNICIN = new javax.swing.JCheckBox();
        jCheckBoxLBCarc = new javax.swing.JCheckBox();
        jCheckBoxLBOutNeoplasias = new javax.swing.JCheckBox();
        jCheckBoxLBMC = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxTratamentoCAF = new javax.swing.JCheckBox();
        jCheckBoxTratamentoConizacao = new javax.swing.JCheckBox();
        jCheckBoxTratamentohistectomia = new javax.swing.JCheckBox();
        jCheckBoxTratamentoCuidosPaliativos = new javax.swing.JCheckBox();
        jCheckBoxTratamentoRádioterapia = new javax.swing.JCheckBox();
        jCheckBoxTratamentoClinico = new javax.swing.JCheckBox();
        jCheckBoxTratamentoquimioterapia = new javax.swing.JCheckBox();
        jCheckBoxTratamentooutros = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jCheckBoxSSRA = new javax.swing.JCheckBox();
        naoLocalizada = new javax.swing.JLabel();
        Obito = new javax.swing.JLabel();
        jCheckBoxssnMudou = new javax.swing.JCheckBox();
        jCheckBoxSSNsem = new javax.swing.JCheckBox();
        jCheckBoxSSNoutros = new javax.swing.JCheckBox();
        jCheckBoxSSOccu = new javax.swing.JCheckBox();
        jCheckBoxSSOdesconhecidas = new javax.swing.JCheckBox();
        jCheckBoxSSOoutrasC = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jCheckBoxIOunidadesaude = new javax.swing.JCheckBox();
        jCheckBoxIOcorrespodencia = new javax.swing.JCheckBox();
        jCheckBoxIOvisitadomiciliar = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRepeticao = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldObs = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JLabel();
        Voltar = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Paciente = new javax.swing.JLabel();
        jTextFieldDataExame = new javax.swing.JTextField();
        UnidadeSaude = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Data do Exame");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Referência");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 132, -1, -1));

        jTextAreaReferencia.setColumns(20);
        jTextAreaReferencia.setRows(5);
        jScrollPane1.setViewportView(jTextAreaReferencia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 153, 817, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Colposcopia");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 199, -1, -1));

        jCheckBoxCanormal.setText("Anormal");
        jCheckBoxCanormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCanormalActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxCanormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 216, -1, -1));

        jCheckBoxCinstisfatorio.setText("Insatisfatória");
        jCheckBoxCinstisfatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCinstisfatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxCinstisfatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 239, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Biópsia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 199, -1, -1));

        jCheckBoxBsim.setText("Sim");
        jCheckBoxBsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBsimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxBsim, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 216, -1, -1));

        jCheckBoxBnao.setText("Não");
        jCheckBoxBnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBnaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxBnao, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 239, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Laudo Biópsia");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jCheckBoxLBHPVNIC1.setText("HPV NIC 1");
        jCheckBoxLBHPVNIC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBHPVNIC1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBHPVNIC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jCheckBoxLBNICII.setText("NIC II");
        jCheckBoxLBNICII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBNICIIActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBNICII, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jCheckBoxLBNICIN.setText("NIC III / IN SITU ");
        jCheckBoxLBNICIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBNICINActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBNICIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jCheckBoxLBCarc.setText("Carc. Epid Invasivo");
        jCheckBoxLBCarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBCarcActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBCarc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jCheckBoxLBOutNeoplasias.setText("Out Neoplasias");
        jCheckBoxLBOutNeoplasias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBOutNeoplasiasActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBOutNeoplasias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jCheckBoxLBMC.setText("Metaplasia/Cervicite");
        jCheckBoxLBMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLBMCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxLBMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Tratamento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jCheckBoxTratamentoCAF.setText("CAF");
        jCheckBoxTratamentoCAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoCAFActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoCAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jCheckBoxTratamentoConizacao.setText("Conização");
        jCheckBoxTratamentoConizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoConizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoConizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jCheckBoxTratamentohistectomia.setText("Histectomia");
        jCheckBoxTratamentohistectomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentohistectomiaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentohistectomia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jCheckBoxTratamentoCuidosPaliativos.setText("Cuidos Paliativos");
        jCheckBoxTratamentoCuidosPaliativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoCuidosPaliativosActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoCuidosPaliativos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jCheckBoxTratamentoRádioterapia.setText("Rádioterapia");
        jCheckBoxTratamentoRádioterapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoRádioterapiaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoRádioterapia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jCheckBoxTratamentoClinico.setText("Clínico");
        jCheckBoxTratamentoClinico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoClinicoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoClinico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jCheckBoxTratamentoquimioterapia.setText("Quimioterapia");
        jCheckBoxTratamentoquimioterapia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentoquimioterapiaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentoquimioterapia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        jCheckBoxTratamentooutros.setText("Outros");
        jCheckBoxTratamentooutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTratamentooutrosActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxTratamentooutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Situação de Segmento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 199, -1, -1));

        jCheckBoxSSRA.setText("Recusa/Abandona");
        jCheckBoxSSRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSRAActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 216, -1, -1));

        naoLocalizada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        naoLocalizada.setText("Não Localizada");
        getContentPane().add(naoLocalizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        Obito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Obito.setText("Óbito");
        getContentPane().add(Obito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        jCheckBoxssnMudou.setText("Mudou");
        jCheckBoxssnMudou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxssnMudouActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxssnMudou, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jCheckBoxSSNsem.setText("Sem End Ou Incor");
        jCheckBoxSSNsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSNsemActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSNsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jCheckBoxSSNoutros.setText("Outros");
        jCheckBoxSSNoutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSNoutrosActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSNoutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jCheckBoxSSOccu.setText("Cancêr/Colo Últero");
        jCheckBoxSSOccu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSOccuActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSOccu, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 262, -1, -1));

        jCheckBoxSSOdesconhecidas.setText("Desconhecidas");
        jCheckBoxSSOdesconhecidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSOdesconhecidasActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSOdesconhecidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 285, -1, -1));

        jCheckBoxSSOoutrasC.setText("Outras Causas");
        jCheckBoxSSOoutrasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSSOoutrasCActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxSSOoutrasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 308, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Informação Obtida");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 199, -1, -1));

        jCheckBoxIOunidadesaude.setText("Unidade de Saúde");
        jCheckBoxIOunidadesaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIOunidadesaudeActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxIOunidadesaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 216, -1, -1));

        jCheckBoxIOcorrespodencia.setText("Correspodencia");
        jCheckBoxIOcorrespodencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIOcorrespodenciaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxIOcorrespodencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 239, -1, -1));

        jCheckBoxIOvisitadomiciliar.setText("Visita Domiciliar");
        jCheckBoxIOvisitadomiciliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxIOvisitadomiciliarActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxIOvisitadomiciliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 262, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Repetição de Exame Citopatológio(Data e Resultado):");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 407, -1, -1));

        jTextAreaRepeticao.setColumns(20);
        jTextAreaRepeticao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaRepeticao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 428, 827, 32));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Obs:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 468, -1, -1));
        getContentPane().add(jTextFieldObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 466, 796, -1));

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/cadastrarcamp.png"))); // NOI18N
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 492, -1, -1));

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/voltarpng.png"))); // NOI18N
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 492, -1, 69));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user icon.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img2/download490.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Paciente");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Unidade de Saúde");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        Paciente.setText("jLabel3");
        getContentPane().add(Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 190, -1));
        getContentPane().add(jTextFieldDataExame, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 140, 30));

        UnidadeSaude.setText("jLabel4");
        getContentPane().add(UnidadeSaude, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 210, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/fundoba.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 870, 570));

        cod.setText("jLabel3");
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void Exporta(BuscaAtiva ba){
        BuscaAtivaDao dao = new BuscaAtivaDao();
        ba = dao.obter(BuscaAtiva.class, ba.getId());
        cod.setText(""+ba.getId());
        Paciente.setText(ba.getPaciente().getNomePaciente());
        UnidadeSaude.setText(ba.getUnidadeSaude().getUnidadeSaude());
        jTextFieldDataExame.setText(ba.getDataExame());
        jTextFieldObs.setText(ba.getObs());
        jTextAreaReferencia.setText(ba.getReferencia());
        jTextAreaRepeticao.setText(ba.getRExameCitopatologico());
            
            if(ba.getColposcopia().equals("Anormal")){
            jCheckBoxCanormal.setSelected(true);
            }else if(ba.getColposcopia().equals("Insatisfatória")){
                jCheckBoxCinstisfatorio.setSelected(true);
            }
            if(ba.getBiopsia().equals("Sim")){
               jCheckBoxBsim.setSelected(true);
               jLabel11.setVisible(true);
        jCheckBoxLBCarc.setVisible(true);
        jCheckBoxLBHPVNIC1.setVisible(true);
        jCheckBoxLBMC.setVisible(true);
        jCheckBoxLBNICII.setVisible(true);
        jCheckBoxLBNICIN.setVisible(true);
        jCheckBoxLBOutNeoplasias.setVisible(true);
        
                    if(ba.getLaudoBiopsia().equals("HPV NIC 1")){
                        jCheckBoxLBHPVNIC1.setSelected(true);
                }else if(ba.getLaudoBiopsia().equals("Carc. Epid Invasivo")){
                    jCheckBoxLBCarc.setSelected(true);
                }else if(ba.getLaudoBiopsia().equals("Metaplasia/Cervicite")){
                   jCheckBoxLBMC.setSelected(true);
                }else if(ba.getLaudoBiopsia().equals("NIC II")){
                    jCheckBoxLBNICII.setSelected(true);
                }else if(ba.getLaudoBiopsia().equals("NIC III / IN SITU ")){
                   jCheckBoxLBNICIN.setSelected(true);
                }else if(ba.getLaudoBiopsia().equals("Out Neoplasias")){
                    jCheckBoxLBOutNeoplasias.setSelected(true);
                }
            
    }       else{
                jCheckBoxBnao.setSelected(true);
            }
            if(ba.getTratamento().equals("CAF")){
                jCheckBoxTratamentoCAF.setSelected(true);
            }else if(ba.getTratamento().equals("Clínico")){
                jCheckBoxTratamentoClinico.setSelected(true);
            }else if(ba.getTratamento().equals("Conização")){
                jCheckBoxTratamentoConizacao.setSelected(true);
            }else if(ba.getTratamento().equals("Cuidos Paliativos")){
               jCheckBoxTratamentoCuidosPaliativos.setSelected(true);
            }else if(ba.getTratamento().equals("Rádioterapia")){
                jCheckBoxTratamentoRádioterapia.setSelected(true);
            }else if(ba.getTratamento().equals("Histectomia")){
                jCheckBoxTratamentohistectomia.setSelected(true);
            }else if(ba.getTratamento().equals("Outros")){
                jCheckBoxTratamentooutros.setSelected(true);
            }else if(ba.getTratamento().equals("Quimioterapia")){
               jCheckBoxTratamentoquimioterapia.setSelected(true);
            }
                jCheckBoxSSRA.setSelected(true);
            if(jCheckBoxSSRA.isSelected()){
                if(ba.getSituacaoSegmento().equals("Outros")){
                    jCheckBoxSSNoutros.setSelected(true);
                }else if(ba.getSituacaoSegmento().equals("Sem End Ou Incor")){
                    jCheckBoxSSNsem.setSelected(true);
                }else if(ba.getSituacaoSegmento().equals("Mudou")){
                   jCheckBoxssnMudou.setSelected(true);
                }
                if(ba.getSituacaoSegmento().equals("Cancêr/Colo Últero")){
                    jCheckBoxSSOccu.setSelected(true);
                }else if(ba.getSituacaoSegmento().equals("Desconhecidas")){
                    jCheckBoxSSOdesconhecidas.setSelected(true);
                }else if(ba.getSituacaoSegmento().equals("Outras Causas")){
                    jCheckBoxSSOoutrasC.setSelected(true);
                }
            }
            if(ba.getInformacaoObtida().equals("Unidade de Saúde")){
                jCheckBoxIOunidadesaude.setSelected(true);
            }else if(ba.getInformacaoObtida().equals("Correspodencia")){
                jCheckBoxIOcorrespodencia.setSelected(true);
            }else if(ba.getInformacaoObtida().equals("Visita Domiciliar")){
                jCheckBoxIOvisitadomiciliar.setSelected(true);
            }
    }
    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
       if(jTextFieldDataExame.equals("")){  
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Deixado em Branco: Data do Exame");
        }else if(jTextAreaReferencia.equals("")){
        
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Deixado em Branco: Referência");
        }else if(jTextAreaRepeticao.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Deixado em Branco: Repetição de Exame Citopatológio(Data e Resultado):");
        }else if(jTextFieldObs.equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Deixado em Branco: OBS");
        }else if(!jCheckBoxCanormal.isSelected() && !jCheckBoxCinstisfatorio.isSelected()){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
        }else if(!jCheckBoxBsim.isSelected() && !jCheckBoxBnao.isSelected()){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
        }else if(!jCheckBoxTratamentoCAF.isSelected() && !jCheckBoxTratamentoClinico.isSelected()
                && !jCheckBoxTratamentoConizacao.isSelected() && !jCheckBoxTratamentoCuidosPaliativos.isSelected()
                && !jCheckBoxTratamentoRádioterapia.isSelected() && !jCheckBoxTratamentohistectomia.isSelected()
                && !jCheckBoxTratamentooutros.isSelected() && !jCheckBoxTratamentoquimioterapia.isSelected()){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
        }else if(!jCheckBoxSSRA.isSelected()){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
        }else if(!jCheckBoxIOcorrespodencia.isSelected() && !jCheckBoxIOunidadesaude.isSelected() && !jCheckBoxIOvisitadomiciliar.isSelected()){
        JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
        }else{
            BuscaAtiva ba = new BuscaAtiva();
            ba.setDataExame(jTextFieldDataExame.getText());
            ba.setReferencia(jTextAreaReferencia.getText());
            ba.setRExameCitopatologico(jTextAreaRepeticao.getText());
            ba.setObs(jTextFieldObs.getText());
            if(jCheckBoxCanormal.isSelected()){
            ba.setColposcopia(jCheckBoxCanormal.getText());
            }else if(jCheckBoxCinstisfatorio.isSelected()){
                ba.setColposcopia(jCheckBoxCinstisfatorio.getText());
            }
            if(jCheckBoxBsim.isSelected()){
                ba.setBiopsia(jCheckBoxBsim.getText());
                if(!jCheckBoxLBHPVNIC1.isSelected() && !jCheckBoxLBCarc.isSelected() && !jCheckBoxLBMC.isSelected()
                   && !jCheckBoxLBNICII.isSelected() && !jCheckBoxLBNICIN.isSelected() && !jCheckBoxLBOutNeoplasias.isSelected()){
                    JOptionPane.showMessageDialog(null, "Campo Obrigatorio Que Não Foi Selecionado");
                }else{
                    if(jCheckBoxLBHPVNIC1.isSelected()){
                        ba.setLaudoBiopsia(jCheckBoxLBHPVNIC1.getText());
                }else if(jCheckBoxLBCarc.isSelected()){
                    ba.setLaudoBiopsia(jCheckBoxLBCarc.getText());
                }else if(jCheckBoxLBMC.isSelected()){
                    ba.setLaudoBiopsia(jCheckBoxLBMC.getText());
                }else if(jCheckBoxLBNICII.isSelected()){
                    ba.setLaudoBiopsia(jCheckBoxLBNICII.getText());
                }else if(jCheckBoxLBNICIN.isSelected()){
                    ba.setLaudoBiopsia(jCheckBoxLBNICIN.getText());
                }else if(jCheckBoxLBOutNeoplasias.isSelected()){
                    ba.setLaudoBiopsia(jCheckBoxLBOutNeoplasias.getText());
                }
            }
    }       else{
                ba.setBiopsia(jCheckBoxBnao.getText());
                ba.setLaudoBiopsia("Não Fez Biópsia");
            }
            if(jCheckBoxTratamentoCAF.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoCAF.getText());
            }else if(jCheckBoxTratamentoClinico.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoClinico.getText());
            }else if(jCheckBoxTratamentoConizacao.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoConizacao.getText());
            }else if(jCheckBoxTratamentoCuidosPaliativos.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoCuidosPaliativos.getText());
            }else if(jCheckBoxTratamentoRádioterapia.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoRádioterapia.getText());
            }else if(jCheckBoxTratamentohistectomia.isSelected()){
                ba.setTratamento(jCheckBoxTratamentohistectomia.getText());
            }else if(jCheckBoxTratamentooutros.isSelected()){
                ba.setTratamento(jCheckBoxTratamentooutros.getText());
            }else if(jCheckBoxTratamentoquimioterapia.isSelected()){
                ba.setTratamento(jCheckBoxTratamentoquimioterapia.getText());
            }
            if(jCheckBoxSSRA.isSelected()){
                if(jCheckBoxSSNoutros.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxSSNoutros.getText());
                }else if(jCheckBoxSSNsem.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxSSNsem.getText());
                }else if(jCheckBoxssnMudou.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxssnMudou.getText());
                }
                if(jCheckBoxSSOccu.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxSSOccu.getText());
                }else if(jCheckBoxSSOdesconhecidas.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxSSOdesconhecidas.getText());
                }else if(jCheckBoxSSOoutrasC.isSelected()){
                    ba.setSituacaoSegmento(jCheckBoxSSOoutrasC.getText());
                }
            }
            if(jCheckBoxIOunidadesaude.isSelected()){
                ba.setInformacaoObtida(jCheckBoxIOunidadesaude.getText());
            }else if(jCheckBoxIOcorrespodencia.isSelected()){
                ba.setInformacaoObtida(jCheckBoxIOcorrespodencia.getText());
            }else if(jCheckBoxIOvisitadomiciliar.isSelected()){
                ba.setInformacaoObtida(jCheckBoxIOvisitadomiciliar.getText());
            }
                        PacienteDao pdao=new PacienteDao();
            List<Paciente> paciente=pdao.pesquisaId();
            for(Paciente p: paciente){
            if(p.getNomePaciente().equals(Paciente.getText())){
                p.setId(p.getId());
                ba.setPaciente(p);
                
                break;
            }else if(p == null){
                JOptionPane.showMessageDialog(null, "Cadastre Primeiro Um Paciente.");
            break;
            }}
            UnidadeSaudeDao unidao=new UnidadeSaudeDao();
            List<UnidadeSaude> unidade = unidao.pesquisaId();
            for(UnidadeSaude uni: unidade){
            if(uni.getUnidadeSaude().equals(UnidadeSaude.getText())){
                uni.setId(uni.getId());
                ba.setUnidadeSaude(uni);
                break;
            }else if(uni == null){
                JOptionPane.showMessageDialog(null, "Cadastre Primeiro Uma Unidade de Saúde.");
            break;
            }}
            int i = Integer.parseInt(cod.getText());
            ba.setId(i);
            List<BuscaAtiva> BuscaAtivas = new ArrayList();
            BuscaAtivas.add(ba);
            UnidadeSaude uni= new UnidadeSaude();
            uni.setBuscaAtiva(BuscaAtivas);
            Paciente p = new Paciente();
            p.setBuscaAtiva(BuscaAtivas);
            BuscaAtivaDao dao = new BuscaAtivaDao();
            ba = dao.salvar(ba);
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso");
            dispose();
            PesquisarBuscaAtiva prin = new PesquisarBuscaAtiva();
            prin.setVisible(true);
                        }
    }//GEN-LAST:event_CadastrarMouseClicked

    private void jCheckBoxCanormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCanormalActionPerformed
        // TODO add your handling code here:
        jCheckBoxCinstisfatorio.setSelected(false);
    }//GEN-LAST:event_jCheckBoxCanormalActionPerformed

    private void jCheckBoxCinstisfatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCinstisfatorioActionPerformed
        // TODO add your handling code here:
        jCheckBoxCanormal.setSelected(false);
    }//GEN-LAST:event_jCheckBoxCinstisfatorioActionPerformed

    private void jCheckBoxBsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBsimActionPerformed
        jCheckBoxBnao.setSelected(false);
        jLabel11.setVisible(true);
        jCheckBoxLBCarc.setVisible(true);
        jCheckBoxLBHPVNIC1.setVisible(true);
        jCheckBoxLBMC.setVisible(true);
        jCheckBoxLBNICII.setVisible(true);
        jCheckBoxLBNICIN.setVisible(true);
        jCheckBoxLBOutNeoplasias.setVisible(true);
    }//GEN-LAST:event_jCheckBoxBsimActionPerformed

    private void jCheckBoxBnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBnaoActionPerformed
        jCheckBoxBsim.setSelected(false);
        jLabel11.setVisible(false);
        jCheckBoxLBCarc.setVisible(false);
        jCheckBoxLBHPVNIC1.setVisible(false);
        jCheckBoxLBMC.setVisible(false);
        jCheckBoxLBNICII.setVisible(false);
        jCheckBoxLBNICIN.setVisible(false);
        jCheckBoxLBOutNeoplasias.setVisible(false);

    }//GEN-LAST:event_jCheckBoxBnaoActionPerformed

    private void jCheckBoxLBHPVNIC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBHPVNIC1ActionPerformed
        jCheckBoxLBCarc.setSelected(false);
        jCheckBoxLBMC.setSelected(false);
        jCheckBoxLBNICII.setSelected(false);
        jCheckBoxLBNICIN.setSelected(false);
        jCheckBoxLBOutNeoplasias.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBHPVNIC1ActionPerformed

    private void jCheckBoxLBNICIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBNICIIActionPerformed
        jCheckBoxLBCarc.setSelected(false);
        jCheckBoxLBHPVNIC1.setSelected(false);
        jCheckBoxLBMC.setSelected(false);
        jCheckBoxLBNICIN.setSelected(false);
        jCheckBoxLBOutNeoplasias.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBNICIIActionPerformed

    private void jCheckBoxLBNICINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBNICINActionPerformed
        jCheckBoxLBCarc.setSelected(false);
        jCheckBoxLBHPVNIC1.setSelected(false);
        jCheckBoxLBMC.setSelected(false);
        jCheckBoxLBNICII.setSelected(false);
        jCheckBoxLBOutNeoplasias.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBNICINActionPerformed

    private void jCheckBoxLBCarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBCarcActionPerformed
        jCheckBoxLBHPVNIC1.setSelected(false);
        jCheckBoxLBMC.setSelected(false);
        jCheckBoxLBNICII.setSelected(false);
        jCheckBoxLBNICIN.setSelected(false);
        jCheckBoxLBOutNeoplasias.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBCarcActionPerformed

    private void jCheckBoxLBOutNeoplasiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBOutNeoplasiasActionPerformed
        jCheckBoxLBCarc.setSelected(false);
        jCheckBoxLBHPVNIC1.setSelected(false);
        jCheckBoxLBMC.setSelected(false);
        jCheckBoxLBNICII.setSelected(false);
        jCheckBoxLBNICIN.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBOutNeoplasiasActionPerformed

    private void jCheckBoxLBMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLBMCActionPerformed
        jCheckBoxLBCarc.setSelected(false);
        jCheckBoxLBHPVNIC1.setSelected(false);
        jCheckBoxLBNICII.setSelected(false);
        jCheckBoxLBNICIN.setSelected(false);
        jCheckBoxLBOutNeoplasias.setSelected(false);
    }//GEN-LAST:event_jCheckBoxLBMCActionPerformed

    private void jCheckBoxTratamentoCAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoCAFActionPerformed
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoCAFActionPerformed

    private void jCheckBoxTratamentoConizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoConizacaoActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoConizacaoActionPerformed

    private void jCheckBoxTratamentohistectomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentohistectomiaActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentohistectomiaActionPerformed

    private void jCheckBoxTratamentoCuidosPaliativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoCuidosPaliativosActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoCuidosPaliativosActionPerformed

    private void jCheckBoxTratamentoRádioterapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoRádioterapiaActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoRádioterapiaActionPerformed

    private void jCheckBoxTratamentoClinicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoClinicoActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoClinicoActionPerformed

    private void jCheckBoxTratamentoquimioterapiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentoquimioterapiaActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentooutros.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentoquimioterapiaActionPerformed

    private void jCheckBoxTratamentooutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTratamentooutrosActionPerformed
        // TODO add your handling code here:
        jCheckBoxTratamentoCAF.setSelected(false);
         jCheckBoxTratamentoClinico.setSelected(false);
         jCheckBoxTratamentoConizacao.setSelected(false);
         jCheckBoxTratamentoCuidosPaliativos.setSelected(false);
         jCheckBoxTratamentoRádioterapia.setSelected(false);
         jCheckBoxTratamentohistectomia.setSelected(false);
         jCheckBoxTratamentoquimioterapia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxTratamentooutrosActionPerformed

    private void jCheckBoxssnMudouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxssnMudouActionPerformed
        // TODO add your handling code here:
        jCheckBoxSSNsem.setSelected(false);
        jCheckBoxSSNoutros.setSelected(false);
        jCheckBoxSSOccu.setSelected(false);
        jCheckBoxSSOdesconhecidas.setSelected(false);
        jCheckBoxSSOoutrasC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxssnMudouActionPerformed

    private void jCheckBoxSSNsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSNsemActionPerformed
        // TODO add your handling code here:
         jCheckBoxssnMudou.setSelected(false);
        jCheckBoxSSNoutros.setSelected(false);
        jCheckBoxSSOccu.setSelected(false);
        jCheckBoxSSOdesconhecidas.setSelected(false);
        jCheckBoxSSOoutrasC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSSNsemActionPerformed

    private void jCheckBoxSSNoutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSNoutrosActionPerformed
        // TODO add your handling code here:
         jCheckBoxssnMudou.setSelected(false);
        jCheckBoxSSNsem.setSelected(false);
        jCheckBoxSSOccu.setSelected(false);
        jCheckBoxSSOdesconhecidas.setSelected(false);
        jCheckBoxSSOoutrasC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSSNoutrosActionPerformed

    private void jCheckBoxSSOccuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSOccuActionPerformed
        // TODO add your handling code here:
         jCheckBoxssnMudou.setSelected(false);
        jCheckBoxSSNsem.setSelected(false);
        jCheckBoxSSNoutros.setSelected(false);
        jCheckBoxSSOdesconhecidas.setSelected(false);
        jCheckBoxSSOoutrasC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSSOccuActionPerformed

    private void jCheckBoxSSOdesconhecidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSOdesconhecidasActionPerformed
        // TODO add your handling code here:
         jCheckBoxssnMudou.setSelected(false);
        jCheckBoxSSNsem.setSelected(false);
        jCheckBoxSSNoutros.setSelected(false);
        jCheckBoxSSOccu.setSelected(false);
        jCheckBoxSSOoutrasC.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSSOdesconhecidasActionPerformed

    private void jCheckBoxSSOoutrasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSOoutrasCActionPerformed
        // TODO add your handling code here:
         jCheckBoxssnMudou.setSelected(false);
        jCheckBoxSSNsem.setSelected(false);
        jCheckBoxSSNoutros.setSelected(false);
        jCheckBoxSSOccu.setSelected(false);
        jCheckBoxSSOdesconhecidas.setSelected(false);
    }//GEN-LAST:event_jCheckBoxSSOoutrasCActionPerformed

    private void jCheckBoxSSRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSSRAActionPerformed
        // TODO add your handling code here:
        Obito.setVisible(true);
        naoLocalizada.setVisible(true);
         jCheckBoxssnMudou.setVisible(true);
        jCheckBoxSSNsem.setVisible(true);
        jCheckBoxSSNoutros.setVisible(true);
        jCheckBoxSSOccu.setVisible(true);
        jCheckBoxSSOdesconhecidas.setVisible(true);
        jCheckBoxSSOoutrasC.setVisible(true);
    }//GEN-LAST:event_jCheckBoxSSRAActionPerformed

    private void jCheckBoxIOunidadesaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIOunidadesaudeActionPerformed
        // TODO add your handling code here:
        jCheckBoxIOcorrespodencia.setSelected(false);
        jCheckBoxIOvisitadomiciliar.setSelected(false);
    }//GEN-LAST:event_jCheckBoxIOunidadesaudeActionPerformed

    private void jCheckBoxIOcorrespodenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIOcorrespodenciaActionPerformed
        // TODO add your handling code here:
          jCheckBoxIOunidadesaude.setSelected(false);
        jCheckBoxIOvisitadomiciliar.setSelected(false);
    }//GEN-LAST:event_jCheckBoxIOcorrespodenciaActionPerformed

    private void jCheckBoxIOvisitadomiciliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxIOvisitadomiciliarActionPerformed
        // TODO add your handling code here:
          jCheckBoxIOunidadesaude.setSelected(false);
        jCheckBoxIOcorrespodencia.setSelected(false);
    }//GEN-LAST:event_jCheckBoxIOvisitadomiciliarActionPerformed

    private void VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseClicked
        // TODO add your handling code here:
        dispose();
        PesquisarBuscaAtiva pa = new PesquisarBuscaAtiva();
        pa.setVisible(true);
    }//GEN-LAST:event_VoltarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroBAtiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroBAtiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroBAtiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroBAtiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new UpBAtiva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadastrar;
    private javax.swing.JLabel Obito;
    private javax.swing.JLabel Paciente;
    private javax.swing.JLabel UnidadeSaude;
    private javax.swing.JLabel Voltar;
    private javax.swing.JLabel cod;
    private javax.swing.JCheckBox jCheckBoxBnao;
    private javax.swing.JCheckBox jCheckBoxBsim;
    private javax.swing.JCheckBox jCheckBoxCanormal;
    private javax.swing.JCheckBox jCheckBoxCinstisfatorio;
    private javax.swing.JCheckBox jCheckBoxIOcorrespodencia;
    private javax.swing.JCheckBox jCheckBoxIOunidadesaude;
    private javax.swing.JCheckBox jCheckBoxIOvisitadomiciliar;
    private javax.swing.JCheckBox jCheckBoxLBCarc;
    private javax.swing.JCheckBox jCheckBoxLBHPVNIC1;
    private javax.swing.JCheckBox jCheckBoxLBMC;
    private javax.swing.JCheckBox jCheckBoxLBNICII;
    private javax.swing.JCheckBox jCheckBoxLBNICIN;
    private javax.swing.JCheckBox jCheckBoxLBOutNeoplasias;
    private javax.swing.JCheckBox jCheckBoxSSNoutros;
    private javax.swing.JCheckBox jCheckBoxSSNsem;
    private javax.swing.JCheckBox jCheckBoxSSOccu;
    private javax.swing.JCheckBox jCheckBoxSSOdesconhecidas;
    private javax.swing.JCheckBox jCheckBoxSSOoutrasC;
    private javax.swing.JCheckBox jCheckBoxSSRA;
    private javax.swing.JCheckBox jCheckBoxTratamentoCAF;
    private javax.swing.JCheckBox jCheckBoxTratamentoClinico;
    private javax.swing.JCheckBox jCheckBoxTratamentoConizacao;
    private javax.swing.JCheckBox jCheckBoxTratamentoCuidosPaliativos;
    private javax.swing.JCheckBox jCheckBoxTratamentoRádioterapia;
    private javax.swing.JCheckBox jCheckBoxTratamentohistectomia;
    private javax.swing.JCheckBox jCheckBoxTratamentooutros;
    private javax.swing.JCheckBox jCheckBoxTratamentoquimioterapia;
    private javax.swing.JCheckBox jCheckBoxssnMudou;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaReferencia;
    private javax.swing.JTextArea jTextAreaRepeticao;
    private javax.swing.JTextField jTextFieldDataExame;
    private javax.swing.JTextField jTextFieldObs;
    private javax.swing.JLabel naoLocalizada;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }
}
