/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Seller_Views;

import Models.Entities.User;
import Utilities.Paths;
import Views.AccountSettingsPanel;
import Views.Login;
import Views.Register;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hfyh
 */
public class SellerControlFrame extends javax.swing.JFrame {

    /**
     * Creates new form SellerControlFrame
     */
    ImageIcon homeUnfocus = new ImageIcon("src\\main\\java\\Images\\home-unfocus.png");
    ImageIcon homeFocus = new ImageIcon("src\\main\\java\\Images\\home-focus.png");
    private User seller;
    
    public SellerControlFrame() {
        initComponents();
    }
    
    public SellerControlFrame(User seller) {
        this.seller = seller;
        initComponents();
        panelControlContent.setLayout(new BorderLayout());
        logoImage.setIcon(new ImageIcon(Paths.PONY_LOGO));
        btnHome.setIcon(homeUnfocus);
        panelControlContent.add(new HomeSellerPanel(this, seller));
        setLocationRelativeTo(null);
        loadHome();
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
        jPanel2 = new javax.swing.JPanel();
        logoImage = new org.edisoncor.gui.panel.PanelImage();
        btnHome = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnNewAdmin = new javax.swing.JButton();
        btnUnlog = new javax.swing.JButton();
        panelControlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout logoImageLayout = new javax.swing.GroupLayout(logoImage);
        logoImage.setLayout(logoImageLayout);
        logoImageLayout.setHorizontalGroup(
            logoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        logoImageLayout.setVerticalGroup(
            logoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(120, 135, 152));
        btnHome.setText("Panel de control");
        btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnAccount.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(120, 135, 152));
        btnAccount.setText("Ajustes de cuenta");
        btnAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccountMouseExited(evt);
            }
        });
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnNewAdmin.setBackground(new java.awt.Color(102, 153, 255));
        btnNewAdmin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnNewAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnNewAdmin.setText("Nuevo Cliente");
        btnNewAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAdminActionPerformed(evt);
            }
        });

        btnUnlog.setBackground(new java.awt.Color(105, 108, 255));
        btnUnlog.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnUnlog.setForeground(new java.awt.Color(255, 255, 255));
        btnUnlog.setText("Cerrar sesión");
        btnUnlog.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnlogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(btnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(521, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        panelControlContent.setBackground(new java.awt.Color(245, 245, 249));

        javax.swing.GroupLayout panelControlContentLayout = new javax.swing.GroupLayout(panelControlContent);
        panelControlContent.setLayout(panelControlContentLayout);
        panelControlContentLayout.setHorizontalGroup(
            panelControlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelControlContentLayout.setVerticalGroup(
            panelControlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(panelControlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadHome(){
        panelControlContent.removeAll();

        // Añadir el nuevo panel (homePanel)
        panelControlContent.add(new HomeSellerPanel(this, seller));

        // Actualizar la interfaz gráfica
        panelControlContent.updateUI();
    }

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        changeFocusGained(btnHome);
        btnHome.setIcon(homeFocus);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        changeFocusLost(btnHome);
        btnHome.setIcon(homeUnfocus);
    }//GEN-LAST:event_btnHomeMouseExited

    private void changeFocusGained(JButton btn){
        btn.setBackground(Color.decode("#e7e7ff"));
        btn.setForeground(Color.decode("#6b6eff"));
    }
    private void changeFocusLost(JButton btn){
        btn.setBackground(Color.WHITE);
        btn.setForeground(Color.decode("#788798"));
    }
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        loadHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseEntered
        // TODO add your handling code here:
        changeFocusGained(btnAccount);
    }//GEN-LAST:event_btnAccountMouseEntered

    private void btnAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccountMouseExited
        // TODO add your handling code here:
        changeFocusLost(btnAccount);
    }//GEN-LAST:event_btnAccountMouseExited

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        panelControlContent.removeAll();

        // Añadir el nuevo panel (succursalPanel)
        panelControlContent.add(new AccountSettingsPanel(seller));

        // Actualizar la interfaz gráfica
        panelControlContent.updateUI();

    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAdminActionPerformed
        // TODO add your handling code here:
        new Register(seller).setVisible(true);
    }//GEN-LAST:event_btnNewAdminActionPerformed

    private void btnUnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnlogActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUnlogActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadHome();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SellerControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerControlFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerControlFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNewAdmin;
    private javax.swing.JButton btnUnlog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.PanelImage logoImage;
    private javax.swing.JPanel panelControlContent;
    // End of variables declaration//GEN-END:variables
}