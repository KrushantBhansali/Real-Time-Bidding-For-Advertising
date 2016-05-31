/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.Exchange.AdSpace;
import business.Organization.AdExchangeOrganization;
import business.Organization.Organization;
import business.Organization.OrganizationDirectory;

/**
 *
 * @author Krush
 */
public abstract class Enterprise extends Organization{
    
    private OrganizationDirectory organizationDir;
    private EnterpriseType enterpriseType;
    private AdExchangeOrganization bidModel;

  
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDir = new OrganizationDirectory();
        AdExchangeOrganization adEx = new AdExchangeOrganization();
    }
    
    public enum EnterpriseType{
        Publisher("Publisher"),
        Advertiser("Advertiser"),
        AdExchange("AdExchange");
        
        
        private EnterpriseType(String value){
            this.value = value;
        }
        private String value;
        
        
        public String getValue(){
            return value;
        }

        @Override
        public String toString() {
            return value ;
        }
        
        
    }
      public OrganizationDirectory getOrganizationDir() {
        return organizationDir;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    

    
    
}

