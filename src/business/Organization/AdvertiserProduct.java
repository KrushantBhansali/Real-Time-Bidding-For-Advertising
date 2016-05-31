/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.AdvertiserProductManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class AdvertiserProduct extends Organization{

    public AdvertiserProduct() {
        super(Organization.OrganizationType.AdvertiserProduct.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvertiserProductManagerRole());
        return roles;
    }
    
}
