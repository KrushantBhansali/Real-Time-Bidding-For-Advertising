/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.employee;

import business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    
      public PersonDirectory(){
          personList = new ArrayList<>();
      }
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person createNewEmployee(String name){
        Person employee = new Person();
        employee.setEmpName(name);
        personList.add(employee);
        return employee;
        
        
    }
    
       public Person createNewCustomer(int age, String gender, String country, String hobbies, String lastSearched){
        Customer customer = new Customer();
       // customer.setEmpName(name);
        customer.setAge(age);
        customer.setGender(gender);
        customer.setCountry(country);
        customer.setHobbies(hobbies);
        customer.setLastSearched(lastSearched);
       
                
        personList.add(customer);
        return customer;
    }
    
}
