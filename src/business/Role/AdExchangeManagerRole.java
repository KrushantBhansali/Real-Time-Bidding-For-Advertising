/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Organization.AdExchangeOrganization;
import business.Organization.Organization;
import business.enterprise.AdExchange;
import business.enterprise.Enterprise;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdExchange.AdExchangeWorkArea;

/**
 *
 * @author Krush
 */
public class AdExchangeManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new AdExchangeWorkArea(userProcessContainer, userAccount, (AdExchangeOrganization) organization, (AdExchange) enterprise, system);
    }
}
