/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FieldPartnerRole;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.KivaEnterprise;
import business.Person.FieldPartnerContact;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SignUpBorrowerJPanel;

/**
 *
 * @author kunal
 */
public class FieldPartnerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer ;
    private KivaEnterprise business ;
    private FieldPartnerContact fieldPartnerContact ;
    /**
     * Creates new form FieldPartnerWorkAreaJPanel
     */
    public FieldPartnerWorkAreaJPanel() {
        initComponents();
    }

    public FieldPartnerWorkAreaJPanel(JPanel userProcessContainer, KivaEnterprise enterprise, FieldPartnerContact fieldPartnerContact) {
        initComponents();
        this.userProcessContainer = userProcessContainer ;
        this.business = enterprise ;
        this.fieldPartnerContact = fieldPartnerContact ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateBorrower = new javax.swing.JButton();
        btnViewMyBorrower = new javax.swing.JButton();
        btnCreateBorrowerAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblRisk = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));
        setForeground(new java.awt.Color(153, 153, 0));

        btnCreateBorrower.setBackground(new java.awt.Color(0, 102, 102));
        btnCreateBorrower.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnCreateBorrower.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateBorrower.setText("  CREATE BORROWER LOAN CASE >>  ");
        btnCreateBorrower.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnCreateBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBorrowerActionPerformed(evt);
            }
        });

        btnViewMyBorrower.setBackground(new java.awt.Color(0, 0, 0));
        btnViewMyBorrower.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnViewMyBorrower.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMyBorrower.setText("VIEW MY BORROWERS >>");
        btnViewMyBorrower.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnViewMyBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMyBorrowerActionPerformed(evt);
            }
        });

        btnCreateBorrowerAccount.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateBorrowerAccount.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnCreateBorrowerAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateBorrowerAccount.setText("CREATE BORROWER ACCOUNT >>");
        btnCreateBorrowerAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnCreateBorrowerAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBorrowerAccountActionPerformed(evt);
            }
        });

        lblRisk.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblRisk.setForeground(new java.awt.Color(255, 255, 255));
        lblRisk.setText(" RISK RATING ");
        lblRisk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/karandutt/Documents/Java Swing/FINAL/KKL.jpeg")); // NOI18N
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(756, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateBorrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewMyBorrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateBorrowerAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(lblRisk)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnCreateBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnViewMyBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCreateBorrowerAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblRisk, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBorrowerActionPerformed
        // TODO add your handling code here:
        AddBorrowersDetailsJPanel addBorrowersDetailsJPanel = new AddBorrowersDetailsJPanel(userProcessContainer, business, fieldPartnerContact);
        userProcessContainer.add("addBorrowersDetailsJPanel", addBorrowersDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnCreateBorrowerActionPerformed

    private void btnViewMyBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMyBorrowerActionPerformed
        // TODO add your handling code here:
        ViewMyBorrowersJPanel vmbjp = new ViewMyBorrowersJPanel(userProcessContainer, business, this.fieldPartnerContact);
        userProcessContainer.add("ViewMyBorrowersJPanel", vmbjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);        
    }//GEN-LAST:event_btnViewMyBorrowerActionPerformed

    private void btnCreateBorrowerAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBorrowerAccountActionPerformed
        // TODO add your handling code here:
        EcoSystem system = EcoSystem.getInstance();
        SignUpBorrowerJPanel signUpBorrowerJPanel = new SignUpBorrowerJPanel(userProcessContainer, system);
        userProcessContainer.add("signUpBorrowerJPanel", signUpBorrowerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);          
    }//GEN-LAST:event_btnCreateBorrowerAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateBorrower;
    private javax.swing.JButton btnCreateBorrowerAccount;
    private javax.swing.JButton btnViewMyBorrower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblRisk;
    // End of variables declaration//GEN-END:variables
}
