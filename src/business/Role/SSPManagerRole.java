/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.SupplySidePlatform;
import business.enterprise.Enterprise;
import business.enterprise.Publisher;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.PublisherMarketingRole.ManageAdSpace;
import userInterface.PublisherMarketingRole.SSPManagerWorkArea;

/**
 *
 * @author Krush
 */
public class SSPManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
         return new SSPManagerWorkArea(userProcessContainer, userAccount, (SupplySidePlatform)organization,(Publisher) enterprise,system);
    }
    
}
