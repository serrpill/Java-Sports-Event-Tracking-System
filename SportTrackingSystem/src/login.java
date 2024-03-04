/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class login extends javax.swing.JFrame {
 
    //en başta giriş yapılırken kutucukları doldurmanın zorunlu olduğunu belirten yıldızlar görünmesin
    public login() {
        initComponents();
        jlbl_kullanıcı.setVisible(false);
        jlbl_şifre.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtext_username = new javax.swing.JTextField();
        jtext_password = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbutton_giris = new javax.swing.JButton();
        jbutton_geri = new javax.swing.JButton();
        jlbl_kullanıcı = new javax.swing.JLabel();
        jlbl_şifre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Small", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("SPOR MÜSABAKASI TAKİP SİSTEMİNE HOŞ GELDİNİZ!!");

        jlabel.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jlabel.setText("Kullanıcı Adı :");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel2.setText("Şifre : ");
        jLabel2.setMaximumSize(new java.awt.Dimension(35, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(35, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(35, 16));

        jtext_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_usernameActionPerformed(evt);
            }
        });

        jtext_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_passwordActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 0));
        jCheckBox1.setText("Şifreyi Göster");
        jCheckBox1.setAlignmentY(0.0F);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jbutton_giris.setBackground(new java.awt.Color(76, 179, 102));
        jbutton_giris.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbutton_giris.setText("Giriş Yap");
        jbutton_giris.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbutton_giris.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbutton_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_girisActionPerformed(evt);
            }
        });

        jbutton_geri.setBackground(new java.awt.Color(203, 51, 51));
        jbutton_geri.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jbutton_geri.setText("Temizle");
        jbutton_geri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbutton_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_geriActionPerformed(evt);
            }
        });

        jlbl_kullanıcı.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_kullanıcı.setForeground(new java.awt.Color(204, 0, 0));
        jlbl_kullanıcı.setText("*");

        jlbl_şifre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_şifre.setForeground(new java.awt.Color(204, 0, 0));
        jlbl_şifre.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtext_password, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jtext_username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_kullanıcı, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbl_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jbutton_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbutton_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtext_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlbl_kullanıcı)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtext_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jlbl_şifre)))
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_giris, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_girisActionPerformed
       //başlangıç değerleri false olmalı
        jlbl_kullanıcı.setVisible(false);
        jlbl_şifre.setVisible(false);
        // şifre veya kullanıcı adı kutucukları boş bırakılırsa doldurulması zorunlu anlamına gelen * belirir.
        if (jtext_username.getText().equals("")){
            jlbl_kullanıcı.setVisible(true);
        }
        if (String.valueOf(jtext_password.getText()).equals("")){
            jlbl_şifre.setVisible(true);
        }
        
        //eğer herhangi bir kutucuk boş bırakılmadıysa bu bloğa girer
        else { 
            Connection con = MyConnection.getconnection(); //database'a bağlanır
            PreparedStatement ps;
            try {
                ps = con.prepareStatement("SELECT * FROM kullanıcı WHERE kullanıcı_adı = ? AND şifre = ?"); //kullanıcı adı ve şifre değerlerini databaseden çağırır
                ps.setString(1, jtext_username.getText()); 
                ps.setString(2, String.valueOf(jtext_password.getPassword())); 
            
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Giriş Başarılı!");
                    MainForm mf = new MainForm(); //mainform sayfası açılır
                    mf.setVisible(true);
                    dispose();
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                }
                else{
                    JOptionPane.showMessageDialog(null, "kullanıcı adı veya şifre hatalı");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbutton_girisActionPerformed

    //setEchoChar metodu gizli karakterin ayarlanmasına izin verir
    //şifreyi göster isimli checkbox seçili ise 0 değerini alacaktır bu da karakterin gizlenmemesi gerektiğini ifade eder.
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jtext_password.setEchoChar((char) 0);
        }
        else {
            jtext_password.setEchoChar('*'); //seçili değilse * karakteri ile gizlenecektir.
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jtext_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_usernameActionPerformed

    private void jbutton_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_geriActionPerformed
        jtext_username.setText("");
        jtext_password.setText("");
    }//GEN-LAST:event_jbutton_geriActionPerformed

    private void jtext_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutton_geri;
    private javax.swing.JButton jbutton_giris;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlbl_kullanıcı;
    private javax.swing.JLabel jlbl_şifre;
    private javax.swing.JPasswordField jtext_password;
    private javax.swing.JTextField jtext_username;
    // End of variables declaration//GEN-END:variables
}