/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.WorkQueue;

/**
 *
 * @author Krush
 */
public class MakePayment extends WorkRequest {
    private String publisherName;
    private int amountDue;
    private String result;
    private String status;
    private GenerateInvoice genInv;
    
    
    
    

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(int amountDue) {
        this.amountDue = amountDue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
     @Override
    public String toString() {
        return publisherName ;
    }

    public GenerateInvoice getGenInv() {
        return genInv;
    }

    public void setGenInv(GenerateInvoice genInv) {
        this.genInv = genInv;
    }
    
}
