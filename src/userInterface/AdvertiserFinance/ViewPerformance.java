/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.AdvertiserFinance;

import business.EcoSystem;
import business.Organization.AdvertiserFinance;
import business.enterprise.Advertiser;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Krush
 */
public class ViewPerformance extends javax.swing.JPanel {

    /**
     * Creates new form ViewPerformance
     */
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private AdvertiserFinance organization;
    private Advertiser enterprise;
    private EcoSystem system;
    public ViewPerformance(JPanel userProcessContainer,UserAccount userAccount,AdvertiserFinance organization,Advertiser enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        enterpriseNamejLabel6.setText(enterprise.getName());
        
       
        
        populateFields();
        
        
    }

    public void populateFields(){
         try{
             //System.out.println(enterprise.getDsp().getClicksObtained()/enterprise.getDsp().getTrCount());
               //  System.out.println(enterprise.getDsp().getClicksObtained1()/enterprise.getDsp().getRbCount());   
                 System.out.println(enterprise.getDsp().getClicksObtained2()); 
                 System.out.println(enterprise.getDsp().getClicksObtained3()); 
                 
              System.out.println(enterprise.getDsp().getTrCount());
              System.out.println(enterprise.getDsp().getRbCount());
              System.out.println(enterprise.getDsp().getCrCount());
              System.out.println(enterprise.getDsp().getLbCount());
              
              double a = 0;
              double b = 0;
              double c = 0;
              double d = 0;
              if(enterprise.getDsp().getTrCount()!=0){
              a = (enterprise.getDsp().getClicksObtained()/enterprise.getDsp().getTrCount())*100 ;
             clicksObjTextField1.setText(String.valueOf(a));
              }
              if(enterprise.getDsp().getRbCount() != 0){
             b = (enterprise.getDsp().getClicksObtained1()/enterprise.getDsp().getRbCount())*100;
               clicksObtained1jTextField1.setText(String.valueOf(b));
                
              }
              if(enterprise.getDsp().getCrCount() !=0){
             c = (enterprise.getDsp().getClicksObtained2()/enterprise.getDsp().getCrCount())*100;
              centerjTextField1.setText(String.valueOf(c));
              }
              
              if(enterprise.getDsp().getLbCount() !=0){
              d = (enterprise.getDsp().getClicksObtained3()/enterprise.getDsp().getLbCount())*100;
                  leftBottomjTextField2.setText(String.valueOf(d));
              }
      
      
       
      
        totalBidWinsjTextField1.setText(String.valueOf(enterprise.getDsp().getBidWins()));
       
      double  x = enterprise.getDsp().getClicksObtained()+ enterprise.getDsp().getClicksObtained1()+ enterprise.getDsp().getClicksObtained2()+enterprise.getDsp().getClicksObtained3();
      double   y = enterprise.getDsp().getBidWins();
      double   z = x/y;
      
      double p1 = (enterprise.getDsp().getClickp());
       double p2 =  (enterprise.getDsp().getClickp1());
       double p3 = (enterprise.getDsp().getClickp2());
       double p4 = (enterprise.getDsp().getClickp3());
       
      conversionRatejTextField1.setText(String.valueOf(x));
             System.out.println("tr"+enterprise.getDsp().getConvTr() );
               System.out.println("rb"+enterprise.getDsp().getConvRb() );
                System.out.println("c"+enterprise.getDsp().getConvC() );
                 System.out.println("lb"+enterprise.getDsp().getConvLb() );
                 
                tpAvgjTextField1.setText(String.valueOf(p1));
                rbAvgjTextField2.setText(String.valueOf(p2));
                cAvgjTextField3.setText(String.valueOf(p3));
                lbAvgjTextField4.setText(String.valueOf(p4));
        }
        catch(Exception e){
         
         JOptionPane.showMessageDialog(null,"Error in Data to show Analysis");
         return;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clicksObjTextField1 = new javax.swing.JTextField();
        clicksObtained1jTextField1 = new javax.swing.JTextField();
        backjButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        conversionRatejTextField1 = new javax.swing.JTextField();
        enterpriseNamejLabel6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        centerjTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        leftBottomjTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalBidWinsjTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tpAvgjTextField1 = new javax.swing.JTextField();
        rbAvgjTextField2 = new javax.swing.JTextField();
        cAvgjTextField3 = new javax.swing.JTextField();
        lbAvgjTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        viewAnalysisjButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Performance Report");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setEnabled(false);

        jLabel3.setText("TopRight Conversion Rate");

        clicksObjTextField1.setEnabled(false);
        clicksObjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicksObjTextField1ActionPerformed(evt);
            }
        });

        clicksObtained1jTextField1.setEnabled(false);
        clicksObtained1jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicksObtained1jTextField1ActionPerformed(evt);
            }
        });

        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("RightBottom Conversion Rate");

        jLabel5.setText("Total Converted Bid");

        conversionRatejTextField1.setEnabled(false);

        enterpriseNamejLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setText("Center Conversion Rate");

        centerjTextField1.setEnabled(false);
        centerjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centerjTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("LeftBottom Conversion Rate");

        leftBottomjTextField2.setEnabled(false);
        leftBottomjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftBottomjTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("View Click Distribution");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Click Analysis");

        jLabel9.setText("Total Bid Wins");

        totalBidWinsjTextField1.setEnabled(false);
        totalBidWinsjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBidWinsjTextField1ActionPerformed(evt);
            }
        });

        jLabel10.setText("TopRight ");

        jLabel11.setText("RightBottom");

        jLabel12.setText("Center");

        jLabel13.setText("LeftBottom");

        tpAvgjTextField1.setEnabled(false);
        tpAvgjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpAvgjTextField1ActionPerformed(evt);
            }
        });

        rbAvgjTextField2.setEnabled(false);
        rbAvgjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAvgjTextField2ActionPerformed(evt);
            }
        });

        cAvgjTextField3.setEnabled(false);
        cAvgjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAvgjTextField3ActionPerformed(evt);
            }
        });

        lbAvgjTextField4.setEnabled(false);
        lbAvgjTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbAvgjTextField4ActionPerformed(evt);
            }
        });

        jLabel15.setText("Clicks Leading To Purchase");

        jLabel16.setText("Value Analysis");

        viewAnalysisjButton2.setText("View Analysis");
        viewAnalysisjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnalysisjButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Clicks Obtained On Ads");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseNamejLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clicksObjTextField1)
                                    .addComponent(clicksObtained1jTextField1)
                                    .addComponent(conversionRatejTextField1)
                                    .addComponent(centerjTextField1)
                                    .addComponent(leftBottomjTextField2)
                                    .addComponent(totalBidWinsjTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backjButton1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(viewAnalysisjButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cAvgjTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(lbAvgjTextField4)
                                .addComponent(rbAvgjTextField2)
                                .addComponent(tpAvgjTextField1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel15)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(enterpriseNamejLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tpAvgjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rbAvgjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cAvgjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAvgjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clicksObjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(clicksObtained1jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(centerjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(leftBottomjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conversionRatejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(viewAnalysisjButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalBidWinsjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clicksObjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicksObjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clicksObjTextField1ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
           userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void centerjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centerjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centerjTextField1ActionPerformed

    private void leftBottomjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftBottomjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftBottomjTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("TopRight", enterprise.getDsp().getClicksObtained());
         pieDataset.setValue("RightBottom", enterprise.getDsp().getClicksObtained1());
         pieDataset.setValue("Center", enterprise.getDsp().getClicksObtained2()); 
         pieDataset.setValue("LeftBottom", enterprise.getDsp().getClicksObtained3());
         
         JFreeChart chart = ChartFactory.createPieChart("Clicks Analysis", pieDataset);
         PiePlot p = (PiePlot)chart.getPlot();
         
         ChartFrame frame = new ChartFrame("Clicks Analysis",chart);
         frame.setVisible(true);
         frame.setSize(450,500);
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalBidWinsjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBidWinsjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBidWinsjTextField1ActionPerformed

    private void rbAvgjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAvgjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAvgjTextField2ActionPerformed

    private void cAvgjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAvgjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAvgjTextField3ActionPerformed

    private void lbAvgjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbAvgjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAvgjTextField4ActionPerformed

    private void viewAnalysisjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnalysisjButton2ActionPerformed
        // TODO add your handling code here:
         int i = 0;
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        JFreeChart barChart = null;

        
        
            
            barChartData.setValue(enterprise.getDsp().getAmnt() , "TotalSales Value" ,"TopRight" );
            barChartData.setValue(enterprise.getDsp().getConvTr(),"TotalBid Value","TopRight" );

            barChart = ChartFactory.createBarChart("Position Wise Value Analysis", "AdSpace Position", "Total Cost", barChartData, PlotOrientation.VERTICAL, true , true, true);

            CategoryPlot bar = barChart.getCategoryPlot();
            bar.setRangeGridlinePaint(Color.YELLOW);
            
            
            
              barChartData.setValue(enterprise.getDsp().getAmnt1() , "TotalSales Values" ,"RightBottom" );
            barChartData.setValue(enterprise.getDsp().getConvRb(),"TotalBid Values","RightBottom" );

            barChart = ChartFactory.createBarChart("Position Wise Value Analysis", "AdSpace Position", "Total Cost", barChartData, PlotOrientation.VERTICAL, true , true, true);

            CategoryPlot bar1 = barChart.getCategoryPlot();
            bar1.setRangeGridlinePaint(Color.YELLOW);
            
              barChartData.setValue(enterprise.getDsp().getAmnt2() , "TotalSales Values" ,"Center" );
            barChartData.setValue(enterprise.getDsp().getConvC(),"TotalBid Value","Center" );

            barChart = ChartFactory.createBarChart("Position Wise Value Analysis", "AdSpace Position", "Total Cost",barChartData, PlotOrientation.VERTICAL, true , true, true);

            CategoryPlot bar2 = barChart.getCategoryPlot();
            bar2.setRangeGridlinePaint(Color.YELLOW);
        
              barChartData.setValue(enterprise.getDsp().getAmnt3() , "TotalSales Value" ,"LeftBottom" );
            barChartData.setValue(enterprise.getDsp().getConvLb(),"TotalBid Value","LeftBottom" );

            barChart = ChartFactory.createBarChart("Position Wise Value Analysis",  "AdSpace Position","Total Cost", barChartData, PlotOrientation.VERTICAL, true , true, true);

            CategoryPlot bar3 = barChart.getCategoryPlot();
            bar3.setRangeGridlinePaint(Color.YELLOW);

      
        ChartFrame frame = new ChartFrame("Return On Investment Chart", barChart);
        frame.setVisible(true);
        frame.setSize(500, 500);
    
    }//GEN-LAST:event_viewAnalysisjButton2ActionPerformed

    private void tpAvgjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpAvgjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpAvgjTextField1ActionPerformed

    private void clicksObtained1jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clicksObtained1jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clicksObtained1jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField cAvgjTextField3;
    private javax.swing.JTextField centerjTextField1;
    private javax.swing.JTextField clicksObjTextField1;
    private javax.swing.JTextField clicksObtained1jTextField1;
    private javax.swing.JTextField conversionRatejTextField1;
    private javax.swing.JLabel enterpriseNamejLabel6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbAvgjTextField4;
    private javax.swing.JTextField leftBottomjTextField2;
    private javax.swing.JTextField rbAvgjTextField2;
    private javax.swing.JTextField totalBidWinsjTextField1;
    private javax.swing.JTextField tpAvgjTextField1;
    private javax.swing.JButton viewAnalysisjButton2;
    // End of variables declaration//GEN-END:variables
}
