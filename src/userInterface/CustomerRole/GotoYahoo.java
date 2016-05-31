/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole;

import business.Customer.Customer;
import business.EcoSystem;
import business.Exchange.Bid;
import business.Organization.Organization;
import business.enterprise.AdExchange;
import business.enterprise.Advertiser;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krush
 */
public class GotoYahoo extends javax.swing.JPanel {

    /**
     * Creates new form GotoYahoo
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private JFrame frame;
    private Bid bid;
    private Bid bid1;
    private Customer c;
    private String url;

    public GotoYahoo(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, Bid bid, Bid bid1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.c = userAccount.getCustomer();
        this.enterprise = enterprise;
        this.bid = bid;
        this.bid1 = bid1;
        this.system = system;

        buy2jButton1.setVisible(false);

        buy3jButton1.setVisible(false);

        displayAds();

    }

    public void displayAds() {
        if (bid != null && bid1 == null) {

            Image image = new ImageIcon(bid.getFilepath2()).getImage();

            //     System.out.println(adSpacejLabel1.getBounds());
            // Rectangle rec = adSpacejLabel1.getBounds();
            // adSpacejLabel1.setBounds(20, 20, 157, 136);
            //   System.out.println(adSpacejLabel1.getHeight());
            Image scaledImage = image.getScaledInstance(601, 184, Image.SCALE_DEFAULT);
//i=image.getImage();
// Converting the image back to ImageIcon to make it acceptable by picLabel
            // image = new ImageIcon(scaledImage);

            yahoo1jLabel1.setIcon(new ImageIcon(scaledImage));

            clickjButton1.setVisible(false);

        } else if (bid1 != null && bid == null) {
            Image image = new ImageIcon(bid1.getFilepath3()).getImage();
            Image scaledImage = image.getScaledInstance(216, 88, Image.SCALE_DEFAULT);

            yahoo1jLabel2.setIcon(new ImageIcon(scaledImage));

            clickjButton1.setVisible(false);

        } else if (bid != null && bid1 != null) {
            Image image = new ImageIcon(bid.getFilepath2()).getImage();
            Image scaledImage = image.getScaledInstance(601, 184, Image.SCALE_DEFAULT);

            yahoo1jLabel1.setIcon(new ImageIcon(scaledImage));

            Image image1 = new ImageIcon(bid1.getFilepath3()).getImage();
            Image scaledImage1 = image1.getScaledInstance(216, 88, Image.SCALE_DEFAULT);

            yahoo1jLabel2.setIcon(new ImageIcon(scaledImage1));

        } else if (bid == null && bid1 == null) {
            
            
            if(userAccount.getCustomer().getHobbies().equals("Reading")){
            String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\entrepreneur.jpg";
            Image image = new ImageIcon(path).getImage();
                    
            Image scaledImage = image.getScaledInstance(601, 184, Image.SCALE_DEFAULT);

            yahoo1jLabel1.setIcon(new ImageIcon(scaledImage));
            
            String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\godfather.jpg";
             Image image1 = new ImageIcon(path1).getImage();
                    
            Image scaledImage1 = image1.getScaledInstance(216, 88, Image.SCALE_DEFAULT);

            yahoo1jLabel2.setIcon(new ImageIcon(scaledImage1));
            

            }
            else if (userAccount.getCustomer().getHobbies().equals("Music")){
                  String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\skullcandy.png";
            Image image = new ImageIcon(path).getImage();
                    
            Image scaledImage = image.getScaledInstance(601, 184, Image.SCALE_DEFAULT);

            yahoo1jLabel1.setIcon(new ImageIcon(scaledImage));
            
            String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\BeatsByDreCampusHeat101.jpg";
             Image image1 = new ImageIcon(path1).getImage();
                    
            Image scaledImage1 = image1.getScaledInstance(216, 88, Image.SCALE_DEFAULT);

            yahoo1jLabel2.setIcon(new ImageIcon(scaledImage1));
                
                
            }
           
               else if (userAccount.getCustomer().getHobbies().equals("Sports")){
                  String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\Nike_shoes.jpg";
            Image image = new ImageIcon(path).getImage();
                    
            Image scaledImage = image.getScaledInstance(601, 184, Image.SCALE_DEFAULT);

            yahoo1jLabel1.setIcon(new ImageIcon(scaledImage));
            
            String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\puma_logo1.jpg";
             Image image1 = new ImageIcon(path1).getImage();
                    
            Image scaledImage1 = image1.getScaledInstance(216, 88, Image.SCALE_DEFAULT);

            yahoo1jLabel2.setIcon(new ImageIcon(scaledImage1));
                
                
            }
            
            
            
            
            
            
            
            
            
            
           // yahoo1jLabel1.setVisible(false);
            //yahoo1jLabel2.setVisible(false);
            click1jButton2.setVisible(false);
            clickjButton1.setVisible(false);
        }
    }

    public String findUrl(Bid bid) {

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof AdExchange) {
                    AdExchange ax = (AdExchange) e;

                    for (Advertiser a : ax.getAdvertiserList()) {
                        if (bid.getAdvertiserName().equals(a.getName())) {

                            url = a.getProduct().getUrl();

                        }
                    }

                }
            }
        }
        return url;
    }

    public String findUrlNext(Bid bid1) {

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof AdExchange) {
                    AdExchange ax = (AdExchange) e;

                    for (Advertiser a : ax.getAdvertiserList()) {
                        if (bid1.getAdvertiserName().equals(a.getName())) {

                            url = a.getProduct().getUrl();

                        }
                    }

                }
            }
        }
        return url;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yahoo1jLabel1 = new javax.swing.JLabel();
        yahoo1jLabel2 = new javax.swing.JLabel();
        clickjButton1 = new javax.swing.JButton();
        click1jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buy2jButton1 = new javax.swing.JButton();
        buy3jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        clickjButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clickjButton1.setText("Go to Website");
        clickjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickjButton1ActionPerformed(evt);
            }
        });

        click1jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        click1jButton2.setText("Go to Website");
        click1jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click1jButton2ActionPerformed(evt);
            }
        });

        buy2jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buy2jButton1.setText("Order");
        buy2jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy2jButton1ActionPerformed(evt);
            }
        });

        buy3jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buy3jButton1.setText("Order");
        buy3jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy3jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krush\\Desktop\\yahoo.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        backjButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krush\\Desktop\\back-icon.png")); // NOI18N
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(yahoo1jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clickjButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(click1jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buy3jButton1)
                                .addGap(130, 130, 130)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buy2jButton1))
                    .addComponent(yahoo1jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backjButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yahoo1jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickjButton1)
                    .addComponent(buy2jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(yahoo1jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(click1jButton2)
                    .addComponent(buy3jButton1))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clickjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickjButton1ActionPerformed
        // TODO add your handling code here:

        String url1 = findUrl(bid);
           // clickjButton1.setText(url1);
        //   clickjButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        try {
            System.out.println(Desktop.getDesktop());
            URI u = new URI(url1);
            Desktop dt = Desktop.getDesktop();
            // Desktop.getDesktop().browse(new URI(url1));
            dt.browse(u);
        } catch (Exception ex) {
            //It looks like there's a problem
            JOptionPane.showMessageDialog(null, "Website Not Available, Currently Under Maintanence");

        }

        userAccount.getCustomer().setClicks(userAccount.getCustomer().getClicks() + 1);
        System.out.println(userAccount.getCustomer().getClicks());
        if (bid != null) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof AdExchange) {
                        AdExchange ax = (AdExchange) e;
                        for (Advertiser a : ax.getAdvertiserList()) {
                            if (bid.getAdvertiserName().equals(a.getName())) {
                                a.getDsp().setClicksObtained2(a.getDsp().getClicksObtained2() + 1);
                                // a.getDsp().setConvC(a.getDsp().getConvC()+ bid.getBidAmount());

                                int dialogButton = JOptionPane.showConfirmDialog(null, "Want to Buy the Product..??", "Message", JOptionPane.YES_NO_OPTION);
                                if (dialogButton == JOptionPane.YES_OPTION) {

                                    buy2jButton1.setVisible(true);

                                } else if (dialogButton == JOptionPane.NO_OPTION) {

                                    buy2jButton1.setVisible(false);

                                }

                                String search = a.getProduct().getCategory();
                                userAccount.getCustomer().addBrowsingHistory(search, c);

                                System.out.println("CA" + a.getDsp().getConvC());
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_clickjButton1ActionPerformed

    private void click1jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click1jButton2ActionPerformed
        // TODO add your handling code here:

        String url1 = findUrl(bid1);
           // clickjButton1.setText(url1);
        //   clickjButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        try {
            System.out.println(Desktop.getDesktop());
            URI u = new URI(url1);
            Desktop dt = Desktop.getDesktop();
            // Desktop.getDesktop().browse(new URI(url1));
            dt.browse(u);
        } catch (Exception ex) {
            //It looks like there's a problem
            JOptionPane.showMessageDialog(null, "Website Not Available, Currently Under Maintanence");

        }

        userAccount.getCustomer().setClicks(userAccount.getCustomer().getClicks() + 1);
        System.out.println(userAccount.getCustomer().getClicks());
        if (bid1 != null) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof AdExchange) {
                        AdExchange ax = (AdExchange) e;
                        for (Advertiser a : ax.getAdvertiserList()) {
                            if (bid1.getAdvertiserName().equals(a.getName())) {

                                a.getDsp().setClicksObtained3(a.getDsp().getClicksObtained3() + 1);
                                //  a.getDsp().setConvLb(a.getDsp().getConvLb() + bid.getBidAmount());

                                int dialogButton = JOptionPane.showConfirmDialog(null, "Want to Buy the Product..??", "Message", JOptionPane.YES_NO_OPTION);
                                if (dialogButton == JOptionPane.YES_OPTION) {

                                    buy3jButton1.setVisible(true);

                                  //  product3jLabel1.setText(a.getProduct().getProductName());
                                    // price3jTextField1.setText(String.valueOf(a.getProduct().getProductPrice()));
                                } else if (dialogButton == JOptionPane.NO_OPTION) {
                                    // 
                                    buy3jButton1.setVisible(false);

                                }

                                String search = a.getProduct().getCategory();
                                userAccount.getCustomer().addBrowsingHistory(search, c);

                                // System.out.println("LbA"+a.getDsp().getConvLb());
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_click1jButton2ActionPerformed

    private void buy2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy2jButton1ActionPerformed
        // TODO add your handling code here:

        OrderProduct op = new OrderProduct(userProcessContainer, userAccount, organization, enterprise, system, bid);
        userProcessContainer.add("OrderProduct", op);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        buy2jButton1.setVisible(false);

    }//GEN-LAST:event_buy2jButton1ActionPerformed

    private void buy3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy3jButton1ActionPerformed
        // TODO add your handling code here:

        OrderProduct op = new OrderProduct(userProcessContainer, userAccount, organization, enterprise, system, bid);
        userProcessContainer.add("OrderProduct", op);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        /*  if (bid1 != null) {
         for (Network n : system.getNetworkList()) {
         for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
         if (e instanceof AdExchange) {
         AdExchange ax = (AdExchange) e;
         for (Advertiser a : ax.getAdvertiserList()) {
         if (bid1.getAdvertiserName().equals(a.getName())) {
         a.getDsp().setClickp3(a.getDsp().getClickp3() + 1);

         int q = (int) quantity3jSpinner1.getValue();
         if ((q <= 0) || (q > a.getProduct().getQuantity())) {
         JOptionPane.showMessageDialog(null, "Please enter a correct Quantity");
         return;
         }

         a.getDsp().setAmnt3(a.getDsp().getAmnt3() + (q * a.getProduct().getProductPrice()));
         a.getProduct().setQuantity(a.getProduct().getQuantity() - q);
         }
         }
         }
         }
         }
         }

         */
     //   JOptionPane.showMessageDialog(null, "Your Order Placed...ThankYou!!");
        //  product3jLabel1.setVisible(false);
        //   price3jTextField1.setVisible(false);
        buy3jButton1.setVisible(false);
        //  quantity3jSpinner1.setVisible(false);
    }//GEN-LAST:event_buy3jButton1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton buy2jButton1;
    private javax.swing.JButton buy3jButton1;
    private javax.swing.JButton click1jButton2;
    private javax.swing.JButton clickjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel yahoo1jLabel1;
    private javax.swing.JLabel yahoo1jLabel2;
    // End of variables declaration//GEN-END:variables
}
