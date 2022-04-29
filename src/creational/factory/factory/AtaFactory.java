/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory.factory;

import creational.factory.entity.Ata;
import creational.factory.entity.Child_1;
import creational.factory.entity.Child_2;

/**
 *
 * @author https://github.com/cbozan
 */
public class AtaFactory {
    
    public static Ata getAta(String tip, String p1, String p2){
        
        if(tip.equalsIgnoreCase("Child_1"))
            return new Child_1(p1, p2);
        else if(tip.equalsIgnoreCase("Child_2"))
            return new Child_2(p1, p2);
        else
            return null;
        
    }
    
}
