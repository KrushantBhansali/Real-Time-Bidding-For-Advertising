/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Customer;

import business.employee.Person;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class Customer  extends Person{
    
   private String name;
    private int age;
    private String gender;
    private String country;
    private String hobbies;
    private String lastSearched;
   private Person person;
   private int clicks;
   private ArrayList<BrowsingHistory> browseList;
    
    //public  int clicks;
  
   
   public Customer(){
       browseList = new ArrayList<>();
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getLastSearched() {
        return lastSearched;
    }

    public void setLastSearched(String lastSearched) {
        this.lastSearched = lastSearched;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

   
   
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

  

    public ArrayList<BrowsingHistory> getBrowseList() {
        return browseList;
    }

    public void setBrowseList(ArrayList<BrowsingHistory> browseList) {
        this.browseList = browseList;
    }
    
    
     
   public void addBrowsingHistory(String search, Customer c){
     boolean  flag = false;
       
           
           for(BrowsingHistory b : c.getBrowseList()){
               if(b.getSearch().equals(search)){
                   b.setNoOftimes(b.getNoOftimes()+1);
                 flag = true;
                  
               }
              
           }
        
           
     if (flag == false){  
       
       BrowsingHistory bh = new BrowsingHistory();
       
       bh.setSearch(search);
       bh.setNoOftimes(1);
       c.getBrowseList().add(bh);
      // browseList.add(bh);
       
       }
       
   }
    
}
