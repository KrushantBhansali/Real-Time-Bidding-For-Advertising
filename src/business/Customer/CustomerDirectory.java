/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer createNewCustomer(String name, int age, String gender, String hobbies,String lastSearched, int clicks, int noOftimes, String country){
        Customer customer = new Customer();
        
        customer.setName(name);
        customer.setAge(age);
        customer.setGender(gender);
         customer.setCountry(country);
        customer.setHobbies(hobbies);
        
        
        BrowsingHistory b = new  BrowsingHistory();
        
       // b.setClicks(clicks);
        b.setSearch(lastSearched);
        b.setNoOftimes(noOftimes);
        
        customer.getBrowseList().add(b);
        customer.setLastSearched(lastSearched);
        customer.setClicks(clicks);
       
        
       
                
        customerList.add(customer);
        return customer;
    }
    
    
    public void deleteCustomer(Customer c){
        customerList.remove(c);
    }
}
