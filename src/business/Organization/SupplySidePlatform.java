/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Exchange.AdSpace;
import business.Role.SSPManagerRole;
import business.Role.Role;
import java.util.ArrayList;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Krush
 */
public class SupplySidePlatform extends Organization {

   

    public SupplySidePlatform() {
        super(OrganizationType.SupplySidePlatform.getValue());
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SSPManagerRole());
        return roles;
    }

}
