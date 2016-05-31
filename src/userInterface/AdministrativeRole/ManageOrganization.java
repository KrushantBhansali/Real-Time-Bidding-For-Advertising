/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdministrativeRole;

import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.Organization.OrganizationType;
import business.Organization.OrganizationDirectory;
import business.enterprise.AdExchange;
import business.enterprise.Advertiser;
import business.enterprise.Enterprise;
import business.enterprise.Publisher;
import business.network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krush
 */
public class ManageOrganization extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganization
     */
    private JPanel userProcessConatainer;
    private OrganizationDirectory organizationDir;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageOrganization(JPanel userProcessConatainer, Enterprise enterprise, OrganizationDirectory organizationDir, EcoSystem system) {
        initComponents();
        this.userProcessConatainer = userProcessConatainer;
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        this.system = system;

        populateTable();
        populateOrgCombobox();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) organizationjTable1.getModel();
        dtm.setRowCount(0);

        for (Organization organization : organizationDir.getOrganizationList()) {
            Object row[] = new Object[2];
            row[0] = organization.getOrganizationId();
            row[1] = organization.getName();
            dtm.addRow(row);
        }
    }

    public void populateOrgCombobox() {
        organizationjComboBox1.removeAllItems();

        // for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
        //if (enterprise instanceof Publisher) {
        //for (Organization organization : enterprise.getOrganizationDir().getOrganizationList()) {
       // for (Network n : system.getNetworkList()) {
         //   for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof Publisher) {
                    for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                        if (!type.getValue().equals(Organization.OrganizationType.Admin.getValue()) && !type.getValue().equals(Organization.OrganizationType.AdvertiserFinance.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.DemandSidePlatform.getValue()) && !type.getValue().equals(Organization.OrganizationType.AdExchangeOrganization.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.AdvertiserProduct.getValue())) {
                            organizationjComboBox1.addItem(type);

                        }
                    }
                }

                if (enterprise instanceof Advertiser) {
                    for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                        if (!type.getValue().equals(Organization.OrganizationType.Admin.getValue()) && !type.getValue().equals(Organization.OrganizationType.PublisherFinance.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.SupplySidePlatform.getValue()) && !type.getValue().equals(Organization.OrganizationType.AdExchangeOrganization.getValue())) {
                            organizationjComboBox1.addItem(type);

                        }
                    }
                }

                if (enterprise instanceof AdExchange) {
                    for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
                        if (!type.getValue().equals(Organization.OrganizationType.Admin.getValue()) && !type.getValue().equals(Organization.OrganizationType.PublisherFinance.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.SupplySidePlatform.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.AdvertiserFinance.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.DemandSidePlatform.getValue())
                                && !type.getValue().equals(Organization.OrganizationType.AdvertiserProduct.getValue())) {
                            organizationjComboBox1.addItem(type);

                        }
                    }
                }
            }
      //  }

   // }
    //  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationjTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationjComboBox1 = new javax.swing.JComboBox();
        backjButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        organizationjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization ID", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationjTable1);

        jLabel1.setText("Organization Type");

        organizationjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backjButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(organizationjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButton2)))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(organizationjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        OrganizationType type = (OrganizationType) organizationjComboBox1.getSelectedItem();

        for (Organization o : enterprise.getOrganizationDir().getOrganizationList()) {
            if (o.getName().equals(type.getValue())) {
                JOptionPane.showMessageDialog(null, "Organization already exists in enterprise " + enterprise.getName());
                return;
            }
        }

        organizationDir.createNewOrganization(type);
        populateTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:

        userProcessConatainer.remove(this);
        CardLayout layout = (CardLayout) userProcessConatainer.getLayout();
        layout.previous(userProcessConatainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationjComboBox1;
    private javax.swing.JTable organizationjTable1;
    // End of variables declaration//GEN-END:variables
}
