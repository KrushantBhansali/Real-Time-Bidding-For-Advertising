/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.employee;

/**
 *
 * @author Krush
 */
public class Person {
    
    private String empName;
    private int empId;
    private static int count = 1;

    public Person(){
        empId = count;
        count++;
        
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return empName ;
    }
    
    
    
    
}
