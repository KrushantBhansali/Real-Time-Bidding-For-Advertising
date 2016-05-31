/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Exchange;

import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class SSP {
    
     private AdSpace adSpace;
    
    private ArrayList<AdSpace> adSpaceList;
    
    
    public SSP(){
       adSpaceList = new ArrayList<>();
    }
     public ArrayList<AdSpace> getAdSpaceList() {
        return adSpaceList;
    }

    public void setAdSpaceList(ArrayList<AdSpace> adSpaceList) {
        this.adSpaceList = adSpaceList;
    }
    
       
     public AdSpace getAdSpace() {
        return adSpace;
    }

    public void setAdSpace(AdSpace adSpace) {
        this.adSpace = adSpace;
    }
    
    
    
    
      public ArrayList<AdSpace> createSpaceAvail(AdSpace.AdSpaceType type, int price, String status, String name){
        
        if(type.getValue().equals(AdSpace.AdSpaceType.TopRight.getValue())){
             AdSpace space = new AdSpace();
             space.setPosition(type.getValue());
             space.setPrice(price);
             space.setAvailStatus(status);
             space.setPublisherName(name);
               adSpaceList.add(space);
        }
        else if(type.getValue().equals(AdSpace.AdSpaceType.RightBottom.getValue())) {
             AdSpace space = new AdSpace();
             space.setPosition(type.getValue());
             space.setAvailStatus(status);
             space.setPrice(price);
             space.setPublisherName(name);
               adSpaceList.add(space);
            
        }
        
        else if (type.getValue().equals(AdSpace.AdSpaceType.Center.getValue())) {
             AdSpace space = new AdSpace();
             space.setPosition(type.getValue());
             space.setAvailStatus(status);
             space.setPrice(price);
             space.setPublisherName(name);
               adSpaceList.add(space);
        }
        
            else if (type.getValue().equals(AdSpace.AdSpaceType.LeftBottom.getValue())) {
             AdSpace space = new AdSpace();
             space.setPosition(type.getValue());
             space.setAvailStatus(status);
             space.setPrice(price);
             space.setPublisherName(name);
               adSpaceList.add(space);
        
            }
        return adSpaceList;
        
        
    }

   
    
}
