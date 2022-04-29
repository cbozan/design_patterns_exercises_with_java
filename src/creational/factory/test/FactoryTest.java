/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory.test;

import creational.factory.entity.Child_1;
import creational.factory.factory.AtaFactory;
import java.awt.BorderLayout;

/**
 *
 * @author https://github.com/cbozan
 */
public class FactoryTest {
    
    public static void main(String[] args){
        Child_1 child = (Child_1) AtaFactory.getAta("Child_1", "properties1", "properties2");
        System.out.println(child);
    }
    
    
    
}
