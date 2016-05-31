/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.Role;
import business.WorkQueue.RequestPublisherWebsite;
import business.WorkQueue.GenerateInvoice;
import business.WorkQueue.WorkQueue;
import business.employee.PersonDirectory;
import business.userAccount.UserAccount;
import business.userAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public abstract class Organization {
    private String name;
    private PersonDirectory personDir;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private int organizationId;
    private static int counter;
    
    
    
    public Organization(String name){
        personDir = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        this.name = name;
        organizationId = counter;
        ++counter;
    }

    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }
    
    public enum OrganizationType{
        Admin("Admin Organization"),
        PublisherFinance("Publisher Finance"),
       // PublisherMarketing("Publisher Marketing"),
        SupplySidePlatform("Supply Side Platform"),
        AdvertiserFinance("Advertiser Finance"),
        AdvertiserProduct("Advertiser Product"),
        DemandSidePlatform("Demand Side Platform"),
        AdExchangeOrganization("AdExchange Management");
      //  Customer("Customer Organization");
        
        private String value;
        
        public String getValue(){
            return value;
        }
        
        private OrganizationType(String value){
            this.value = value;
            
        }
    }

    @Override
    public String toString() {
        return name ;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
  
    
    
}
