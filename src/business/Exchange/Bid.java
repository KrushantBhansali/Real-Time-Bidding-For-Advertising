/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Exchange;

import business.userAccount.UserAccount;

/**
 *
 * @author Krush
 */
public class Bid {

    private int minAge;
    private int maxAge;
    private String hobbies;
    private int minClick;
    private int maxClick;
    private int minScore;
    private int maxScore;
    private UserAccount userAccount;
    private int bidAmount;
    private String advertiserName ;
    private String filepath;
    private String filepath1;
    private String filepath2;
    private String filepath3;
    private String position;
    private String publisherName;
    private String lastSearched;
    private int qualityScore;
    private String country;
   

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    
  

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMinClick() {
        return minClick;
    }

    public void setMinClick(int minClick) {
        this.minClick = minClick;
    }

    public int getMaxClick() {
        return maxClick;
    }

    public void setMaxClick(int maxClick) {
        this.maxClick = maxClick;
    }

    public String getFilepath1() {
        return filepath1;
    }

    public void setFilepath1(String filepath1) {
        this.filepath1 = filepath1;
    }
    
    
    
     public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
        public String getFilepath2() {
        return filepath2;
    }

    public void setFilepath2(String filepath2) {
        this.filepath2 = filepath2;
    }

    public String getFilepath3() {
        return filepath3;
    }

    public void setFilepath3(String filepath3) {
        this.filepath3 = filepath3;
    }

     public String getLastSearched() {
        return lastSearched;
    }

    public void setLastSearched(String lastSearched) {
        this.lastSearched = lastSearched;
    }

    
      public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    
     public int getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(int qualityScore) {
        this.qualityScore = qualityScore;
    }
    
    
  
    

    @Override
    public String toString() {
        return publisherName ;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   

  


    
   
    
    
    
    
    
    
    

  
           
}
       
        

    
