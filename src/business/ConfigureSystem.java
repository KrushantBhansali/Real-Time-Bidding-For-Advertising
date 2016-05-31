/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business;


import business.Role.CustomerRole;
import business.Role.SystemAdminRole;
import business.employee.Person;
import business.userAccount.UserAccount;

/**
 *
 * @author Krush
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
    EcoSystem system =  EcoSystem.getInstance();
    
    Person employee = system.getPersonDir().createNewEmployee("krush");
        UserAccount ua = system.getUserAccountDirectory().creatNewUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
       
       // Person customer = system.getPersonDir().createNewEmployee("C");
     //  Person customer = system.getPersonDir().createNewCustomer( 16,"Male", "US", "Sports", "Shoes");
      // UserAccount ua1 = system.getUserAccountDirectory().creatNewUserAccount("c", "c", customer, new CustomerRole());
       return system;
        
    
    }
}
