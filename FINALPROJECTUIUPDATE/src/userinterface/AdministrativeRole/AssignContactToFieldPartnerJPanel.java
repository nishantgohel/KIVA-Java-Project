/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import business.Enterprise.Enterprise;
import business.Organization.FieldPartnerOrganization;
import business.Organization.Organization;
import business.WorkQueue.NewFieldPartnerWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kunal
 */
public class AssignContactToFieldPartnerJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    /**
     * Creates new form AssignContactToFieldPartnerJPanel
     */
    public AssignContactToFieldPartnerJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;        
        initComponents();
        populatetblWorkRequests();
    }

    
    public void populatetblWorkRequests(){
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel() ;
        model.setRowCount(0);
        
        Object[] row = new Object[4] ;
        for(WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()){
            NewFieldPartnerWorkRequest newFPWR = (NewFieldPartnerWorkRequest) workRequest ;
            
            row[0] = newFPWR ;
            row[1] = newFPWR.getTrustee().getName();
            row[2] = newFPWR.getStatus() ;
            row[3] = newFPWR.getMessage();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnAssignFP = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrgName", "Trustee", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);
        if (tblWorkRequests.getColumnModel().getColumnCount() > 0) {
            tblWorkRequests.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequests.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAssignFP.setBackground(new java.awt.Color(0, 0, 0));
        btnAssignFP.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAssignFP.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignFP.setText("CREATE FIELD PARTNER >>");
        btnAssignFP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        btnAssignFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignFPActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/karandutt/Documents/Java Swing/FINAL/KKL.jpeg")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel2)
                .addContainerGap(682, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAssignFP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssignFP, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignFPActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblWorkRequests.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this,  "Please select a row","Information", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();
        WorkRequest workRequest = (WorkRequest)model.getValueAt(selectedRow, 0);
        NewFieldPartnerWorkRequest NewFPWR = (NewFieldPartnerWorkRequest) workRequest ;
        FieldPartnerOrganization fieldPartnerOrg = (FieldPartnerOrganization) enterprise.getOrganizationDirectory().createOrganization(Organization.Type.FieldPartner) ;
        fieldPartnerOrg.setGeneralDetails(NewFPWR.getGeneralDetails());
        fieldPartnerOrg.setPerformanceDetails(NewFPWR.getPerformanceDetails());
        fieldPartnerOrg.createAccountManagement();
        fieldPartnerOrg.getPersonDirectory().getPersonList().add(NewFPWR.getFieldPartnerContact()) ;
        NewFPWR.setStatus(NewFieldPartnerWorkRequest.Status.Complete);
        
        this.populatetblWorkRequests();
        JOptionPane.showMessageDialog(null, "Field Partner created", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAssignFPActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignFP;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
