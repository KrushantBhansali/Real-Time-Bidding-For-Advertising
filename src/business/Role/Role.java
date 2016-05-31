/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.enterprise.Enterprise;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Krush
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin Role"),
        Publisher("Publisher Role"),
        Advertiser("Advertiser Role"),
        AdvertiserFinanceManager("Advertiser Finance Manager"),
        PublisherFinanceManager("Publisher Finance Manager"),
        Customer("Customer Role"),
        AdExchangeManagerRole("AdExchange Manager Role"),
        SSPManagerRole("SSP Manager Role"),
        DSPManagerRole("DSP Manager Role");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }

        @Override
        public String toString() {
            return value ;
        }
        
       
        
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
   
    
    
    
    public  abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system);
        
        
    
}
