/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.DSPManagerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class DemandSidePlatform extends Organization {

    public DemandSidePlatform() {
        super(OrganizationType.DemandSidePlatform.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DSPManagerRole());
        return roles;
    }
    
}
