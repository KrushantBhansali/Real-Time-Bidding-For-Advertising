/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Validation;

/**
 *
 * @author Krush
 */
public class Validation {
    
    
        public static boolean checkInteger(String s){
        try{
            int i = Integer.parseInt(s);
            
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
 public static boolean checkDouble(String s){
        try{
            double i = Double.parseDouble(s);
            
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
