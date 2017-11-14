/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts4;

/**
 *
 * @author gigabyte
 */
public class ModelDesigner extends ModelEmployee {
    
    public int bonus;
    
    public void bonusDesigner(int bonus){
        this.bonus = bonus;
    
        System.out.println("Salary Employee Designer = "+salary);
        System.out.println("Bonus Designer = "+bonus);
    }
}
