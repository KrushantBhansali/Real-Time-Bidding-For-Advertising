/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.WorkQueue;

import business.Exchange.AdSpace;
import business.Exchange.Bid;
import static business.enterprise.Enterprise.EnterpriseType.Publisher;
import business.enterprise.Publisher;
import business.userAccount.UserAccount;

/**
 *
 * @author Krush
 */
public class RequestPublisherWebsite extends WorkRequest {
    
    private String requestPage;
    private Publisher publisher;
    private String publisherName;
    private Bid bid;
    private Bid bid1;

    public String getRequestPage() {
        return requestPage;
    }

    public void setRequestPage(String requestPage) {
        this.requestPage = requestPage;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public Bid getBid1() {
        return bid1;
    }

    public void setBid1(Bid bid1) {
        this.bid1 = bid1;
    }
    
    
    
    
    
    
    
    
}
