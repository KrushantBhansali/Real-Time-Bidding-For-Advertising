/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.enterprise.Enterprise;

/**
 *
 * @author Krush
 */
public class GenerateInvoice extends WorkRequest {

    private int invoiceAmnt;
    private String status;
    private Enterprise enterprise;
    private String publisherName;
    private String approval;
    private String advStatus;
    private String position;
    private String advemail;

    public int getInvoiceAmnt() {
        return invoiceAmnt;
    }

    public void setInvoiceAmnt(int invoiceAmnt) {
        this.invoiceAmnt = invoiceAmnt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getAdvStatus() {
        return advStatus;
    }

    public void setAdvStatus(String advStatus) {
        this.advStatus = advStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAdvemail() {
        return advemail;
    }

    public void setAdvemail(String advemail) {
        this.advemail = advemail;
    }

    @Override
    public String toString() {
        return enterprise.getName();
    }

}
