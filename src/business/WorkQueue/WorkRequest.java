/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.WorkQueue;

import business.userAccount.UserAccount;

/**
 *
 * @author Krush
 */
public class WorkRequest {
    
    private UserAccount sender;
    private UserAccount receiver;
   // private UserAccount userAccount;

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

   
    
    
}
