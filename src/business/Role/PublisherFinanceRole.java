/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.EcoSystem;
import business.Organization.Organization;
import business.Organization.PublisherFinance;
import business.enterprise.Enterprise;
import business.enterprise.Publisher;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.PublisherFinanceRole.PublisherFinanceWorkArea;

/**
 *
 * @author Krush
 */
public class PublisherFinanceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PublisherFinanceWorkArea(userProcessContainer, userAccount,(PublisherFinance) organization,(Publisher) enterprise,system);
    }
    
}
