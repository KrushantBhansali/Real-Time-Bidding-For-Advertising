/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createNewOrganization(Organization.OrganizationType type){
        Organization organization = null;
        if(type.getValue().equals(Organization.OrganizationType.PublisherFinance.getValue())){
            organization = new PublisherFinance();
            organizationList.add(organization);       
        }
        else if (type.getValue().equals(Organization.OrganizationType.SupplySidePlatform.getValue())){
            organization = new SupplySidePlatform();
            organizationList.add(organization); 
        }
         else if (type.getValue().equals(Organization.OrganizationType.AdvertiserFinance.getValue())){
            organization = new AdvertiserFinance();
            organizationList.add(organization); 
        }
        else if (type.getValue().equals(Organization.OrganizationType.DemandSidePlatform.getValue())){
            organization = new DemandSidePlatform();
            organizationList.add(organization); 
        }
          /*     
         else if (type.getValue().equals(Organization.OrganizationType.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization); 
         }
                  */
          else if (type.getValue().equals(Organization.OrganizationType.AdExchangeOrganization.getValue())){
            organization = new AdExchangeOrganization();
            organizationList.add(organization); 
          }
        
         else if (type.getValue().equals(Organization.OrganizationType.AdvertiserProduct.getValue())){
            organization = new AdvertiserProduct();
            organizationList.add(organization); 
          }
        
        
        return null;
        
    }
    
}
