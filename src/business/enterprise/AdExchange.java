/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.Customer.BrowsingHistory;
import business.EcoSystem;

import business.Exchange.AdSpace;
import business.Exchange.Bid;
import business.Organization.AdvertiserFinance;
import business.Organization.DemandSidePlatform;

import business.Organization.Organization;
import business.Organization.PublisherFinance;
import business.Role.Role;
import business.WorkQueue.RequestPublisherWebsite;
import business.WorkQueue.GenerateInvoice;
import business.network.Network;
import business.userAccount.UserAccount;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Krush
 */
public class AdExchange extends Enterprise {

   
    private ArrayList<Advertiser> advertiserList;
    private ArrayList<Publisher> publisherList;

    public AdExchange(String name) {
        super(name, EnterpriseType.AdExchange);
        advertiserList = new ArrayList<>();
        publisherList = new ArrayList<>();

    }

    public ArrayList<Advertiser> getAdvertiserList() {
        return advertiserList;
    }

    public void setAdvertiserList(ArrayList<Advertiser> advertiserList) {
        this.advertiserList = advertiserList;
    }

    public ArrayList<Publisher> getPublisherList() {
        return publisherList;
    }

    public void setPublisherList(ArrayList<Publisher> publisherList) {
        this.publisherList = publisherList;
    }

    public Publisher addPublisher(Publisher publisher) {
        publisherList.add(publisher);
        return null;

    }

    public Advertiser addAdvertiser(Advertiser advertiser) {

        advertiserList.add(advertiser);

        return null;

    }

    public Bid requestBid(UserAccount ua, EcoSystem system, AdExchange ax, Publisher p, String position, int price) {


        String pos = position;
        int basePrice = price;
        Publisher publisher = p;
        Advertiser adv1 = null;
        Image image1 = null;
        List<Bid> auctionList;
        auctionList = new ArrayList<>();
        Bid b1 = null;
        int qualityScore = 1;
        
        //bidding logic
        for (Advertiser adv : ax.getAdvertiserList()) {
            for (Bid b : adv.getDsp().getBidList()) {
                if (b.getPosition().equals(position)) {
                    qualityScore = 1;
                    boolean flag = true;
                    for (BrowsingHistory bh : ua.getCustomer().getBrowseList()) {
                        if (adv.getProduct().getCategory().equals(bh.getSearch())) {
                            if (ua.getCustomer().getClicks() != 0) {
                                qualityScore = bh.getNoOftimes() * ua.getCustomer().getClicks();
                                flag = false;

                            } else {
                                qualityScore = ua.getCustomer().getClicks();
                            }
                        } else {
                            if (flag == true) {
                                qualityScore = ua.getCustomer().getClicks();
                            }
                        }

                    }

                    if (b.getPublisherName().equals(publisher.getName()) && b.getPosition().equals(position) && (ua.getCustomer().getAge() >= b.getMinAge() && ua.getCustomer().getAge() <= b.getMaxAge())
                            && (ua.getCustomer().getHobbies().equals(b.getHobbies()))
                            // && (ua.getCustomer().getLastSearched().equals(b.getLastSearched()))
                            // && ((ua.getCustomer().getClicks() >= b.getMinClick() && ua.getCustomer().getClicks() <= b.getMaxClick()) )
                            && (qualityScore >= b.getMinScore() && qualityScore <= b.getMaxScore())
                            && (b.getBidAmount() <= adv.getBudget().getRemBudget())) {
                        int x = b.getBidAmount();
                        // adv1 = adv;
                        //publisher = p;
                        // map.put(x, adv1);
                        b.setQualityScore(qualityScore);

                        auctionList.add(b);
                    }

                }
            }
        }

        if (!auctionList.isEmpty()) {
            Collections.sort(auctionList, new Comparator<Bid>() {
                public int compare(Bid one, Bid other) {
                    if (one.getBidAmount() < other.getBidAmount()) {
                        return -1;
                    }
                    if (one.getBidAmount() > other.getBidAmount()) {
                        return 1;
                    }

                    return 0;
                }

            });
        }

        Collections.reverse(auctionList);

        //  int i = auctionList.size();
        for (int i = 0; i < auctionList.size(); i++) {

            if (i == 0) {
                b1 = auctionList.get(i);

            }
        }
        // for same bids
        List<Bid> sameBidList;
        sameBidList = new ArrayList<>();
        for (Bid bid : auctionList) {
            if (b1.getBidAmount() == bid.getBidAmount()) {
                sameBidList.add(bid);
            }
        }
        double x = 0;
        if (sameBidList.size() >= 2) {

            double max = 0;
            Advertiser adv2;
            for (Bid b : sameBidList) {

                for (Advertiser a : ax.getAdvertiserList()) {
                    if (b.getAdvertiserName().equals(a.getName())) {
                        for (Bid ab : a.getDsp().getBidList()) {

                            if (b.getPosition().equals(ab.getPosition()) && b.getQualityScore() >= ab.getMinScore() && b.getQualityScore() <= ab.getMaxScore()
                                    && (ua.getCustomer().getAge() >= ab.getMinAge() && ua.getCustomer().getAge() <= ab.getMaxAge())) {
                                x = a.getDsp().getClicksObtained() + a.getDsp().getClicksObtained1() + a.getDsp().getClicksObtained2() + a.getDsp().getClicksObtained3();
                                if (x >= max) {
                                    max = x;
                                    adv1 = a;
                                    b1 = ab;
                                    break;
                                }

                            }
                        }
                    }
                }
            }

        } else {

            //  if (!auctionList.isEmpty()) {
            for (Advertiser adv : ax.getAdvertiserList()) {
                for (Bid b : adv.getDsp().getBidList()) {
                    if (b == b1) {
                        adv1 = adv;

                    }
                }
            }
        }

        if (adv1 != null) {
            adv1.getDsp().setBidWins(adv1.getDsp().getBidWins() + 1);
            int amnt = b1.getBidAmount();
            if (b1.getPosition().equals("TopRight")) {
                adv1.getDsp().setConvTr(adv1.getDsp().getConvTr() + amnt);
                adv1.getDsp().setTrCount(adv1.getDsp().getTrCount() + 1);
                System.out.println(amnt);
                System.out.println(adv1.getDsp().getAmnt());
                System.out.println("TR" + adv1.getDsp().getTrCount() + 1);

            } else if (b1.getPosition().equals("RightBottom")) {
                adv1.getDsp().setConvRb(adv1.getDsp().getConvRb() + amnt);
                adv1.getDsp().setRbCount(adv1.getDsp().getRbCount() + 1);

                System.out.println(amnt);
                System.out.println(adv1.getDsp().getAmnt1() + amnt);
                System.out.println("RB" + adv1.getDsp().getRbCount());

            } else if (b1.getPosition().equals("Center")) {
                adv1.getDsp().setConvC(adv1.getDsp().getConvC() + amnt);
                adv1.getDsp().setCrCount((adv1.getDsp().getCrCount()) + 1);
                System.out.println(amnt);
                System.out.println(adv1.getDsp().getAmnt2() + amnt);
                System.out.println("C" + adv1.getDsp().getCrCount());
            } else if (b1.getPosition().equals("LeftBottom")) {
                adv1.getDsp().setConvLb(adv1.getDsp().getConvLb() + amnt);
                adv1.getDsp().setLbCount(adv1.getDsp().getLbCount() + 1);
                System.out.println("Lb" + adv1.getDsp().getLbCount());
            }

        }
        if (b1 != null) {
            GenerateInvoice invoicereq = new GenerateInvoice();
            invoicereq.setEnterprise(adv1);
            invoicereq.setInvoiceAmnt(b1.getBidAmount());
            invoicereq.setSender(ua);
            invoicereq.setStatus("Pending");
            invoicereq.setPosition(b1.getPosition());
            invoicereq.setPublisherName(p.getName());
            invoicereq.setAdvemail(adv1.getBudget().getEmail());

            PublisherFinance org = null;

            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equals(publisher.getName())) {
                        for (Organization o : publisher.getOrganizationDir().getOrganizationList()) {
                            if (o instanceof PublisherFinance) {
                                org = (PublisherFinance) o;
                            }
                        }
                    }
                }
            }

            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(invoicereq);

                //  org.getBidValue(userAccount);
            }
        }

        return b1;

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
