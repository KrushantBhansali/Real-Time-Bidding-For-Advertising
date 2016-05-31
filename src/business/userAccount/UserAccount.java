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

/**
 *
 * @author Krush
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private Customer customer;
    
    public UserAccount(){
        workQueue = new WorkQueue();
    }
    
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
     public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
     public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    

    @Override
    public String toString() {
        return userName ;
    }

   
   
    
}
