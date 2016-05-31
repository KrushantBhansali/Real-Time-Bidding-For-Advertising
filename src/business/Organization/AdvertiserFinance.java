/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.AdvertiserFinanceRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class AdvertiserFinance extends Organization{

    public AdvertiserFinance() {
        super(OrganizationType.AdvertiserFinance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdvertiserFinanceRole());
        return roles;
    }
    
}
