/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.WorkQueue;

import business.Exchange.AdSpace;

/**
 *
 * @author Krush
 */
public class AdSpaceAvailable extends WorkRequest {
    
    private AdSpace.AdSpaceType adSpace;
    private String publisherName;
    private String status;
    private String position;

    public AdSpace.AdSpaceType getAdSpace() {
        return adSpace;
    }

    public void setAdSpace(AdSpace.AdSpaceType adSpace) {
        this.adSpace = adSpace;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
   
    
    
}
