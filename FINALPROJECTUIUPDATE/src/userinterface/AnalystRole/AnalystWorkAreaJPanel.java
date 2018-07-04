/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AnalystRole;

import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Organization.AnalystOrganization;
import business.Organization.Organization;
import business.Organization.TrusteeOrganization;
import business.UserAccount.UserAccount;
import business.WorkQueue.NewFieldPartnerWorkRequest;
import business.WorkQueue.NewLoanCaseWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishant
 */
public class AnalystWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer ;
    private Enterprise business ;
    private UserAccount userAccount ;
    private Employee analyst ;
    
    /**
     * Creates new form AnalystWorkAreaJPanel
     */
    public AnalystWorkAreaJPanel(JPanel userProcessContainer, Enterprise business, UserAccount userAccount, Employee analyst) {
        initComponents();
        this.userProcessContainer = userProcessContainer ;
        this.business = business;
        this.userAccount = userAccount ;
        this.analyst = analyst ;
        populateTblAnalystOrganizationWorkQueue();
    }
    
    public void populateTblAnalystOrganizationWorkQueue(){
        
        DefaultTableModel model = (DefaultTableModel) tblAnalystOrgWorkQueue.getModel() ;
        model.setRowCount(0);
        AnalystOrganization analystOrganization = null;
        
        for(Organization organization : business.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof AnalystOrganization){
                analystOrganization = (AnalystOrganization) organization ;
            }
        }
        
        Object[] row = new Object[5] ;
        for(WorkRequest workRequest : analystOrganization.getWorkQueue().getWorkRequestList()){
           if(!(workRequest.getStatus().equals(NewLoanCaseWorkRequest.Status.Complete.getValue())) || (workRequest.getStatus().equals(NewFieldPartnerWorkRequest.Status.Complete.getValue()))){
            
            row[0] = workRequest ;
            row[1] = workRequest.getMessage() ;
            row[2] = workRequest.getStatus();
            if(workRequest.getTrustee() != null)
            row[3] = workRequest.getTrustee().getName();
            else
            row[3] = "";
            if(workRequest.getAnalyst() != null)
            row[4] = workRequest.getAnalyst().getName();
            else
            row[4] = "";
            model.addRow(row);
        }}        
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
        tblAnalystOrgWorkQueue = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 0));

        tblAnalystOrgWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization / Borrower", "Message", "Status", "Trustee", "Analyst"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnalystOrgWorkQueue);
        if (tblAnalystOrgWorkQueue.getColumnModel().getColumnCount() > 0) {
            tblAnalystOrgWorkQueue.getColumnModel().getColumn(0).setResizable(false);
            tblAnalystOrgWorkQueue.getColumnModel().getColumn(1).setResizable(false);
            tblAnalystOrgWorkQueue.getColumnModel().getColumn(2).setResizable(false);
            tblAnalystOrgWorkQueue.getColumnModel().getColumn(3).setResizable(false);
            tblAnalystOrgWorkQueue.getColumnModel().getColumn(4).setResizable(false);
        }

        btnProcess.setBackground(new java.awt.Color(0, 0, 0));
        btnProcess.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText(" PROCESS >> ");
        btnProcess.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(0, 0, 0));
        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText(" ASSIGN TO ME >> ");
        btnAssign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/karandutt/Documents/Java Swing/FINAL/KKL.jpeg")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        // Get the selected row from the table and the work request in it. 
        int selectedRow = tblAnalystOrgWorkQueue.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,  "Please select a work request first","Information", JOptionPane.INFORMATION_MESSAGE);
            return ;}
        
        WorkRequest workRequest ;
        workRequest = (WorkRequest) tblAnalystOrgWorkQueue.getValueAt(selectedRow, 0);        
        // Check if it is already assigned
        if(workRequest.getAnalyst() != null){
            JOptionPane.showMessageDialog(null, "Analyst already assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // Assign the current analyst to this work request
        workRequest.setAnalyst(analyst);
        JOptionPane.showMessageDialog(null,  "Analyst assigned successfully","Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAnalystOrgWorkQueue.getModel();
        int selectedRow = tblAnalystOrgWorkQueue.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first","Information",  JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        TrusteeOrganization trusteeOrganization = business.getTrusteeOrganization();
        WorkRequest workRequest = (WorkRequest) tblAnalystOrgWorkQueue.getValueAt(selectedRow, 0);
        if(workRequest.getAnalyst() != analyst){
            JOptionPane.showMessageDialog(null, "Please assign to yourself first", "Information", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        if(workRequest instanceof NewFieldPartnerWorkRequest){
            AnalyseFieldPartnerJPanel analyseFieldPartnerJPanel = 
                    new AnalyseFieldPartnerJPanel(userProcessContainer, (NewFieldPartnerWorkRequest) workRequest, 
                                                  trusteeOrganization, analyst);
            userProcessContainer.add("analyseFieldPartnerJPanel",analyseFieldPartnerJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else if(workRequest instanceof NewLoanCaseWorkRequest){
            AnalyseLoanCaseJPanel analyseLoanCaseJPanel = 
                    new AnalyseLoanCaseJPanel(userProcessContainer, business, (NewLoanCaseWorkRequest) workRequest, 
                                                  trusteeOrganization, analyst);
            userProcessContainer.add("analyseLoanCaseJPanel",analyseLoanCaseJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);            
        }        
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnalystOrgWorkQueue;
    // End of variables declaration//GEN-END:variables
}
