/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.enterprise;

import business.AdvertiserFinance.Budget;
import business.AdvertiserProduct.Product;
import business.Exchange.DSP;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krush
 */
public class Advertiser extends Enterprise{
    private DSP dsp;
    private Budget budget;
    private Product product;
   // private int budget;
    public Advertiser(String name){
        super(name, EnterpriseType.Advertiser);
         dsp = new DSP();
         budget = new Budget();
         product = new Product();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DSP getDsp() {
        return dsp;
    }

    public void setDsp(DSP dsp) {
        this.dsp = dsp;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
    
  
    
    
    
}
