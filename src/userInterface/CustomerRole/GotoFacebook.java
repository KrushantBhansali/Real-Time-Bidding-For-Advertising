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
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import static javafx.scene.input.KeyCode.C;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krush
 */
public class GotoFacebook extends javax.swing.JPanel {

    /**
     * Creates new form GotoFacebook
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

    public GotoFacebook(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system, Bid bid, Bid bid1) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.c = userAccount.getCustomer();
        this.organization = organization;
        this.enterprise = enterprise;
        this.bid = bid;
        this.bid1 = bid1;
        this.system = system;

        // AdInventory ad = new AdInventory();
        //  Image image = ad.Display(adSpacejLabel1,ad);
        buyjButton1.setVisible(false);

        buy1jButton1.setVisible(false);

        namejLabel1.setText(userAccount.getCustomer().getName());

        displayAds();

    }

    public void displayAds() {
        if (bid != null && bid1 == null) {

            Image image = new ImageIcon(bid.getFilepath()).getImage();

            Image scaledImage = image.getScaledInstance(275, 134, Image.SCALE_DEFAULT);

            adSpacejLabel1.setIcon(new ImageIcon(scaledImage));
            click1jButton2.setVisible(false);

        } else if (bid1 != null && bid == null) {
            Image image = new ImageIcon(bid1.getFilepath1()).getImage();
            Image scaledImage = image.getScaledInstance(211, 87, Image.SCALE_DEFAULT);

            adSpace2jLabel2.setIcon(new ImageIcon(scaledImage));

            clickjButton1.setVisible(false);

        } else if (bid != null && bid1 != null) {
            Image image = new ImageIcon(bid.getFilepath()).getImage();
            Image scaledImage = image.getScaledInstance(275, 134, Image.SCALE_DEFAULT);

            adSpacejLabel1.setIcon(new ImageIcon(scaledImage));

            Image image1 = new ImageIcon(bid1.getFilepath1()).getImage();
            Image scaledImage1 = image1.getScaledInstance(211, 87, Image.SCALE_DEFAULT);

            adSpace2jLabel2.setIcon(new ImageIcon(scaledImage1));

        } else if (bid == null && bid1 == null) {

            if (userAccount.getCustomer().getHobbies().equals("Reading")) {
                String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\da_vinci.jpg";
                Image image = new ImageIcon(path).getImage();

                Image scaledImage = image.getScaledInstance(275, 134, Image.SCALE_DEFAULT);

                adSpacejLabel1.setIcon(new ImageIcon(scaledImage));

                String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\time.jpg";
                Image image1 = new ImageIcon(path1).getImage();

                Image scaledImage1 = image1.getScaledInstance(211, 87, Image.SCALE_DEFAULT);

                adSpace2jLabel2.setIcon(new ImageIcon(scaledImage1));

            } else if (userAccount.getCustomer().getHobbies().equals("Music")) {
                String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\Boston_BEATS.jpg";
                Image image = new ImageIcon(path).getImage();

                Image scaledImage = image.getScaledInstance(275, 134, Image.SCALE_DEFAULT);

                adSpacejLabel1.setIcon(new ImageIcon(scaledImage));

                String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\skullcandy_color.jpg";
                Image image1 = new ImageIcon(path1).getImage();

                Image scaledImage1 = image1.getScaledInstance(211, 87, Image.SCALE_DEFAULT);

                adSpace2jLabel2.setIcon(new ImageIcon(scaledImage1));

            } else if (userAccount.getCustomer().getHobbies().equals("Sports")) {
                String path = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\nike.jpg";
                Image image = new ImageIcon(path).getImage();

                Image scaledImage = image.getScaledInstance(275, 134, Image.SCALE_DEFAULT);

                adSpacejLabel1.setIcon(new ImageIcon(scaledImage));

                String path1 = "C:\\Users\\Krush\\Documents\\NetBeansProjects\\Krushant_Bhansali_Final\\puma_logo.jpg";
                Image image1 = new ImageIcon(path1).getImage();

                Image scaledImage1 = image1.getScaledInstance(211, 87, Image.SCALE_DEFAULT);

                adSpace2jLabel2.setIcon(new ImageIcon(scaledImage1));

            }
            // adSpacejLabel1.setVisible(false);
            // adSpace2jLabel2.setVisible(false);
            clickjButton1.setVisible(false);
            click1jButton2.setVisible(false);

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

        adSpacejLabel1 = new javax.swing.JLabel();
        clickjButton1 = new javax.swing.JButton();
        adSpace2jLabel2 = new javax.swing.JLabel();
        click1jButton2 = new javax.swing.JButton();
        buyjButton1 = new javax.swing.JButton();
        buy1jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namejLabel1 = new javax.swing.JLabel();
        backjButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(adSpacejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 112, 275, 134));

        clickjButton1.setText("Go to Website");
        clickjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickjButton1ActionPerformed(evt);
            }
        });
        add(clickjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 264, -1, -1));
        add(adSpace2jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 442, 207, 92));

        click1jButton2.setText("Go to Website");
        click1jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click1jButton2ActionPerformed(evt);
            }
        });
        add(click1jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 540, -1, -1));

        buyjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyjButton1.setForeground(new java.awt.Color(51, 51, 255));
        buyjButton1.setText("Order");
        buyjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyjButton1ActionPerformed(evt);
            }
        });
        add(buyjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        buy1jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buy1jButton1.setForeground(new java.awt.Color(51, 51, 255));
        buy1jButton1.setText("Order");
        buy1jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy1jButton1ActionPerformed(evt);
            }
        });
        add(buy1jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krush\\Desktop\\Welcome to Facebook   Log In  Sign Up or Learn More.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 298, 350));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krush\\Desktop\\img.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, 300, 99));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Welcome to Facebook");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 77, 158, -1));

        namejLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add(namejLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 77, 72, 17));

        backjButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Krush\\Desktop\\Arrow-Back-3-icon.png")); // NOI18N
        backjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton2ActionPerformed(evt);
            }
        });
        add(backjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 46, 43));
    }// </editor-fold>//GEN-END:initComponents

    private void clickjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickjButton1ActionPerformed
        // TODO add your handling code here:
        String url1 = findUrl(bid);

        try {
            System.out.println(Desktop.getDesktop());
            URI u = new URI(url1);
            Desktop dt = Desktop.getDesktop();
            // Desktop.getDesktop().browse(new URI(url1));
            dt.browse(u);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Website Not Available,Currently under Maintanence");
        }
        //int counter = clicks++;
        userAccount.getCustomer().setClicks(userAccount.getCustomer().getClicks() + 1);
        System.out.println(userAccount.getCustomer().getClicks());
        if (bid != null) {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof AdExchange) {
                        AdExchange ax = (AdExchange) e;
                        for (Advertiser a : ax.getAdvertiserList()) {
                            if (bid.getAdvertiserName().equals(a.getName())) {
                                a.getDsp().setClicksObtained(a.getDsp().getClicksObtained() + 1);
                                // a.getDsp().setConvTr(a.getDsp().getConvTr() + bid.getBidAmount());

                                int dialogButton = JOptionPane.showConfirmDialog(null, "Want to Buy the Product..??", "Message", JOptionPane.YES_NO_OPTION);
                                if (dialogButton == JOptionPane.YES_OPTION) {

                                    buyjButton1.setVisible(true);

                                } else if (dialogButton == JOptionPane.NO_OPTION) {

                                    buyjButton1.setVisible(false);
                                }

                                String search = a.getProduct().getCategory();
                                userAccount.getCustomer().addBrowsingHistory(search, c);

                                System.out.println("TRA" + a.getDsp().getConvTr());
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
        //clickjButton1.setText(url1);

        try {
            System.out.println(Desktop.getDesktop());
            URI u = new URI(url1);
            Desktop dt = Desktop.getDesktop();

            dt.browse(u);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Website Not Available,Currently under Maintanence");
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
                                a.getDsp().setClicksObtained1(a.getDsp().getClicksObtained1() + 1);
                                //  a.getDsp().setConvRb(a.getDsp().getConvRb() + bid.getBidAmount());

                                userAccount.getCustomer().setLastSearched(a.getProduct().getCategory());

                                int dialogButton = JOptionPane.showConfirmDialog(null, "Want to Buy the Product..??", "Message", JOptionPane.YES_NO_OPTION);
                                if (dialogButton == JOptionPane.YES_OPTION) {

                                    buy1jButton1.setVisible(true);
                                 //   quantity1jSpinner2.setVisible(true);

                                    //    product1jLabel2.setText(a.getProduct().getProductName());
                                    //     price1jTextField1.setText(String.valueOf(a.getProduct().getProductPrice()));
                                } else if (dialogButton == JOptionPane.NO_OPTION) {
                                    //  product1jLabel2.setVisible(false);
                                    //    price1jTextField1.setVisible(false);
                                    buy1jButton1.setVisible(false);
                                    //    quantity1jSpinner2.setVisible(false);
                                }

                                String search = a.getProduct().getCategory();
                                userAccount.getCustomer().addBrowsingHistory(search, c);

                                System.out.println("RBA" + a.getDsp().getConvRb());
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_click1jButton2ActionPerformed

    private void buyjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyjButton1ActionPerformed
        // TODO add your handling code here:

        OrderProduct op = new OrderProduct(userProcessContainer, userAccount, organization, enterprise, system, bid);
        userProcessContainer.add("OrderProduct", op);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        /*
         if (bid != null) {
         for (Network n : system.getNetworkList()) {
         for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
         if (e instanceof AdExchange) {
         AdExchange ax = (AdExchange) e;
         for (Advertiser a : ax.getAdvertiserList()) {
         if (bid.getAdvertiserName().equals(a.getName())) {
                                
         a.getDsp().setClickp(a.getDsp().getClickp()+1);
                                
         int q = (int) quantityjSpinner1.getValue();
                                   
         if ((q <= 0) || (q > a.getProduct().getQuantity())) {
         JOptionPane.showMessageDialog(null, "Please enter a correct Quantity");
         return;
         }
                                   
         a.getDsp().setAmnt(a.getDsp().getAmnt() + (q * a.getProduct().getProductPrice()));
         a.getProduct().setQuantity( a.getProduct().getQuantity()-q);
         }
         }
         }
         }
         }
         }
        
         JOptionPane.showMessageDialog(null,"Your Order Placed...ThankYou!!");
        
         productjLabel2.setVisible(false);
         pricejTextField1.setVisible(false);
         */
        buyjButton1.setVisible(false);
        // quantityjSpinner1.setVisible(false);

    }//GEN-LAST:event_buyjButton1ActionPerformed

    private void buy1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy1jButton1ActionPerformed
        // TODO add your handling code here:

        OrderProduct op = new OrderProduct(userProcessContainer, userAccount, organization, enterprise, system, bid1);
        userProcessContainer.add("OrderProduct", op);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        buy1jButton1.setVisible(false);

    }//GEN-LAST:event_buy1jButton1ActionPerformed

    private void backjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSpace2jLabel2;
    private javax.swing.JLabel adSpacejLabel1;
    private javax.swing.JButton backjButton2;
    private javax.swing.JButton buy1jButton1;
    private javax.swing.JButton buyjButton1;
    private javax.swing.JButton click1jButton2;
    private javax.swing.JButton clickjButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel namejLabel1;
    // End of variables declaration//GEN-END:variables
}
