/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Exchange;

import business.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class DSP {

    //private Bid bid;
    private ArrayList<Bid> bidList;
    private int bidWins;
    private double clicksObtained;
    private double clicksObtained1;
    private double clicksObtained2;
    private double clicksObtained3;
    private double amnt;
    private double amnt1;
    private double amnt2;
    private double amnt3;
    private int trCount;
    private int rbCount;
    private int crCount;
    private int lbCount;
    private double convTr;
    private double convRb;
    private double convC;
    private double convLb;
    private int clickp;
    private int clickp1;
    private int clickp2;
    private int clickp3;
    

    public DSP() {
        bidList = new ArrayList<>();
    }

    public ArrayList<Bid> getBidList() {
        return bidList;
    }

    public void setBidList(ArrayList<Bid> bidList) {
        this.bidList = bidList;
    }

    public double getClicksObtained() {
        return clicksObtained;
    }

    public double getClicksObtained1() {
        return clicksObtained1;
    }

    public void setClicksObtained1(double clicksObtained1) {
        this.clicksObtained1 = clicksObtained1;
    }

    public void setClicksObtained(double clicksObtained) {
        this.clicksObtained = clicksObtained;
    }

    public double getClicksObtained2() {
        return clicksObtained2;
    }

    public void setClicksObtained2(double clicksObtained2) {
        this.clicksObtained2 = clicksObtained2;
    }

    public double getClicksObtained3() {
        return clicksObtained3;
    }

    public void setClicksObtained3(double clicksObtained3) {
        this.clicksObtained3 = clicksObtained3;
    }

    public int getBidWins() {
        return bidWins;
    }

    public void setBidWins(int bidWins) {
        this.bidWins = bidWins;
    }
    
    

    public Bid addBidValues(String position, int minAge, int maxAge, String hobbies, String country,int bidAmount,String search,int minScore, int maxScore, UserAccount userAccount, String name, String publisher, String filepath, String filepath1, String filepath2, String filepath3) {
        Bid b = new Bid();
        b.setPosition(position);
        b.setMinAge(minAge);
        b.setMaxAge(maxAge);
      //  b.setMinClick(minClick);
       // b.setMaxClick(maxClick);
        
        b.setCountry(country);
        b.setHobbies(hobbies);
        b.setBidAmount(bidAmount);
        b.setLastSearched(search);
        
        b.setMinScore(minScore);
        b.setMaxScore(maxScore);
        b.setUserAccount(userAccount);
        b.setAdvertiserName(name);
        b.setPublisherName(publisher);

        b.setFilepath(filepath);
        b.setFilepath1(filepath1);
        b.setFilepath2(filepath2);
        b.setFilepath3(filepath3);

        bidList.add(b);

        return b;

    }

    public void removeBid(Bid bid) {

        bidList.remove(bid);

    }

    public double getAmnt() {
        return amnt;
    }

    public void setAmnt(double amnt) {
        this.amnt = amnt;
    }

    public double getAmnt1() {
        return amnt1;
    }

    public void setAmnt1(double amnt1) {
        this.amnt1 = amnt1;
    }

    public double getAmnt2() {
        return amnt2;
    }

    public void setAmnt2(double amnt2) {
        this.amnt2 = amnt2;
    }

    public double getAmnt3() {
        return amnt3;
    }

    public void setAmnt3(double amnt3) {
        this.amnt3 = amnt3;
    }

    public int getTrCount() {
        return trCount;
    }

    public void setTrCount(int trCount) {
        this.trCount = trCount;
    }

    public int getRbCount() {
        return rbCount;
    }

    public void setRbCount(int rbCount) {
        this.rbCount = rbCount;
    }

    public int getCrCount() {
        return crCount;
    }

    public void setCrCount(int crCount) {
        this.crCount = crCount;
    }

    public int getLbCount() {
        return lbCount;
    }

    public void setLbCount(int lbCount) {
        this.lbCount = lbCount;
    }

    public double getConvTr() {
        return convTr;
    }

    public void setConvTr(double convTr) {
        this.convTr = convTr;
    }

    public double getConvRb() {
        return convRb;
    }

    public void setConvRb(double convRb) {
        this.convRb = convRb;
    }

    public double getConvC() {
        return convC;
    }

    public void setConvC(double convC) {
        this.convC = convC;
    }

    public double getConvLb() {
        return convLb;
    }

    public void setConvLb(double convLb) {
        this.convLb = convLb;
    }

    public int getClickp() {
        return clickp;
    }

    public void setClickp(int clickp) {
        this.clickp = clickp;
    }

    public int getClickp1() {
        return clickp1;
    }

    public void setClickp1(int clickp1) {
        this.clickp1 = clickp1;
    }

    public int getClickp2() {
        return clickp2;
    }

    public void setClickp2(int clickp2) {
        this.clickp2 = clickp2;
    }

    public int getClickp3() {
        return clickp3;
    }

    public void setClickp3(int clickp3) {
        this.clickp3 = clickp3;
    }

    
    
}
