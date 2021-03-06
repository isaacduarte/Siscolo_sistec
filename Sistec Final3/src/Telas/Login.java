
package Telas;

import Dao.UsuarioDao;
import classJava.Usuario;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordSenha = new javax.swing.JPasswordField();
        boxNivelAcesso = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        ButtonEntra = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoSISTECPNG.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user icon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/key-icon.png"))); // NOI18N

        passwordSenha.setText("jPasswordField1");
        passwordSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordSenhaMouseClicked(evt);
            }
        });
        passwordSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSenhaActionPerformed(evt);
            }
        });

        boxNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o nivel", "Administrador", "Atendente", "Digitador" }));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/niveis.png"))); // NOI18N

        ButtonEntra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/2525.png"))); // NOI18N
        ButtonEntra.setBorderPainted(false);
        ButtonEntra.setContentAreaFilled(false);
        ButtonEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntraActionPerformed(evt);
            }
        });

        ButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NavIMG/254254.png"))); // NOI18N
        ButtonCancelar.setBorderPainted(false);
        ButtonCancelar.setContentAreaFilled(false);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Esqueceu sua Senha?");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ButtonEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(10, 10, 10)
                                    .addComponent(boxNivelAcesso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10)
                                    .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(boxNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(passwordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEntra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(694, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ButtonEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntraActionPerformed

        if(textLogin.getText().equals("") || passwordSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Login ou senha  Deixado em Branco"); 
                    }
        else if( boxNivelAcesso.getSelectedItem().equals("Escolha o nivel")){
            JOptionPane.showMessageDialog(null,"Você não escolheu o nivel de acesso");
        }
        else {
           
            UsuarioDao dao=new UsuarioDao();
            List<Usuario> usuario=dao.conAutenticar();
             if(usuario !=null){
            for(Usuario u: usuario){
               
                    String senha = new String(this.passwordSenha.getPassword());
                    if(u.getLogin().equals(textLogin.getText()) && u.getSenha().equals(senha = new String(this.passwordSenha.getPassword()))){
                        if(u.getNivelDeAcesso().equals(boxNivelAcesso.getSelectedItem())){
                             if(u.getNivelDeAcesso().equals("Administrador")){
                                    dispose();
                                    //u.setNivelDeAcesso(u.getNivelDeAcesso());
                                    PrincipalADM Prin = new PrincipalADM();
                                      //  Prin.nivelAcesso(u);
                                        Prin.setVisible(true);                                     
                                 break;
                             }else if(u.getNivelDeAcesso().equals("Digitador")){
                                 dispose();
                                    PrincipalDigitador Prin = new PrincipalDigitador();
                                        Prin.setVisible(true);
                                 break;
                             }
                             else if(u.getNivelDeAcesso().equals("Atendente")){
                                 dispose();
                                 //u.setNivelDeAcesso(u.getNivelDeAcesso());
                                    PrincipalAtendente Prin = new PrincipalAtendente();
                                   //  Prin.nivelAcesso(u);
                                        Prin.setVisible(true);
                                 break;
                             }
                        }else {
                            JOptionPane.showMessageDialog(this, "este não é seu nivel de acesso");
                            break;
                        }
                    }else if(u.getLogin().equals(textLogin.getText()) && u.getSenha()!= senha ){
                    JOptionPane.showMessageDialog(this, "senha incorreto");
                    break;
                    }else if(u.getLogin()!= textLogin.getText()){
                    JOptionPane.showMessageDialog(this, "login incorreto");
                    break;
                    }
                
            
            
            
        }
            }else{
                    JOptionPane.showMessageDialog(this, "banco Vazio");
                }
             }
    }//GEN-LAST:event_ButtonEntraActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void passwordSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSenhaActionPerformed

    }//GEN-LAST:event_passwordSenhaActionPerformed

    private void passwordSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSenhaMouseClicked
        passwordSenha.setText("");
    }//GEN-LAST:event_passwordSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEntra;
    private javax.swing.JComboBox<String> boxNivelAcesso;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordSenha;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconeframe.png")));
    }

   
}
