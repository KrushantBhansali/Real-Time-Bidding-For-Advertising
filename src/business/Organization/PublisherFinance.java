/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Organization;

import business.Role.PublisherFinanceRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class PublisherFinance extends Organization{

    public PublisherFinance() {
        super(OrganizationType.PublisherFinance.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PublisherFinanceRole());
        return roles;
    }
    
}
