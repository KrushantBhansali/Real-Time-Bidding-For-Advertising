/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.network.Network;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

  public Enterprise createNewEnterprise(String name,Network network, Enterprise.EnterpriseType type){
      Enterprise enterprise = null;
      if(type==Enterprise.EnterpriseType.Publisher){
         enterprise = new Publisher(name);
         enterpriseList.add(enterprise);
         for(Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()){
              if(ep instanceof AdExchange){
                  AdExchange ax = (AdExchange) ep;
                  ax.addPublisher((Publisher) enterprise);
                  
              }
          }
      }
      else if (type==Enterprise.EnterpriseType.Advertiser){
          enterprise = new Advertiser(name);
          enterpriseList.add(enterprise);
           for(Enterprise ep : network.getEnterpriseDirectory().getEnterpriseList()){
              if(ep instanceof AdExchange){
                  AdExchange ax = (AdExchange) ep;
                  ax.addAdvertiser((Advertiser) enterprise);
                  
              }
          }
          
      }
        else if (type==Enterprise.EnterpriseType.AdExchange){
          enterprise = new AdExchange(name);
          enterpriseList.add(enterprise);
         
      }
          
      
        return enterprise;
      
  }
}
