/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.test;

import creational.prototype.example.SuperUserData;
import creational.prototype.example.UserData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author https://github.com/cbozan
 */
public class PrototypeTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        SuperUserData sud = new SuperUserData(1, 1);
        sud.dataCategory = 2;
        sud.dataNo = 2;
        
        SuperUserData sudClone = (SuperUserData) sud.clone();
        
        UserData ud = new UserData(3, 3);
        ud.dataCategory = 4;
        ud.dataNo = 4;
        
        UserData udClone = (UserData) ud.clone();
       
        System.out.println("sud object : " + sud + " and hashCode : " + sud.hashCode());
        System.out.println("sudClone object : " + sudClone + " and hashCode : " + sudClone.hashCode());
        
        System.out.println("ud object : " + ud + " and hashCode : " + ud.hashCode());
        System.out.println("udClone object : " + udClone + " and hashCode : " + udClone.hashCode());
        
    }  
}
