/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Role;

import business.EcoSystem;
import business.Organization.AdvertiserFinance;
import business.Organization.Organization;
import business.enterprise.Advertiser;
import business.enterprise.Enterprise;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdvertiserFinance.AdvertiserFinanceWorkArea;

/**
 *
 * @author Krush
 */
public class AdvertiserFinanceRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {
         return new AdvertiserFinanceWorkArea(userProcessContainer, userAccount, (AdvertiserFinance)organization, (Advertiser)enterprise, system);
    }
    
}
