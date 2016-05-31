/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Customer.CustomerDirectory;
import business.Organization.Organization;
import business.Role.Role;
import business.Role.SystemAdminRole;
import business.network.Network;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class EcoSystem extends Organization{

    public static EcoSystem business;

    private ArrayList<Network> networkList;
    private CustomerDirectory customerDir;
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;

    }
    
    public EcoSystem(){
        super(null);
       
        networkList = new ArrayList<>();
        customerDir = new CustomerDirectory();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        role.add(new SystemAdminRole());
        return role;
        
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
     public CustomerDirectory getCustomerDir() {
        return customerDir;
    }
    
    
    public Network createNewNewtwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
        
    }

   

}
