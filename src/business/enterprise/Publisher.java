/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.Customer.CustomerDirectory;
import business.Exchange.AdSpace;
import business.Exchange.SSP;
import business.Role.Role;
import business.enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class Publisher extends Enterprise{
    
    private CustomerDirectory customerDir;
   private SSP ssp;
    
    public Publisher(String name){
        super(name,EnterpriseType.Publisher);
       // customerDir = new CustomerDirectory();
         ssp = new SSP();
    }

      public CustomerDirectory getCustomerDir() {
        return customerDir;
    }
      
      
      
       
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SSP getSsp() {
        return ssp;
    }

    public void setSsp(SSP ssp) {
        this.ssp = ssp;
    }

    
    
}
