/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.userAccount;

import business.Customer.Customer;
import business.Role.Role;
import business.WorkQueue.WorkQueue;
import business.employee.Person;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String password){
        for(UserAccount ua: userAccountList){
            if(ua.getUserName().equals(userName) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount creatNewUserAccount(String userName, String password,Person person, Role role){
        UserAccount ua = new UserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setPerson(person);
        //ua.setCustomer(customer);
        ua.setRole(role);
        userAccountList.add(ua);
        return ua;
    }
    
   public UserAccount createNewCustomerAccount (String userName, String password, Customer customer, Role role){
       UserAccount ua = new UserAccount();
       ua.setUserName(userName);
       ua.setPassword(password);
       ua.setCustomer(customer);
       ua.setRole(role);
       
       userAccountList.add(ua);
       return ua;
   }
    
}
