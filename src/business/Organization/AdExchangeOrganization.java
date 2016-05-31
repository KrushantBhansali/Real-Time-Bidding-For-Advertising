/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Exchange.AdSpace;
import business.Role.AdExchangeManagerRole;
//import static business.Organization.Organization.OrganizationType.DemandSidePlatform;
import business.Role.Role;
import business.WorkQueue.RequestPublisherWebsite;
import business.WorkQueue.GenerateInvoice;
import business.WorkQueue.WorkRequest;
import business.enterprise.Enterprise;
import business.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class AdExchangeOrganization extends Organization {

   // private PublisherMarketing dsp;
    private static SupplySidePlatform ssp;

    public AdExchangeOrganization() {
        super(OrganizationType.AdExchangeOrganization.getValue());
        ssp = new SupplySidePlatform();
    }


    public SupplySidePlatform getSsp() {
        return ssp;
    }

    public void setSsp(SupplySidePlatform ssp) {
        this.ssp = ssp;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdExchangeManagerRole());
        return roles;
    }



}
