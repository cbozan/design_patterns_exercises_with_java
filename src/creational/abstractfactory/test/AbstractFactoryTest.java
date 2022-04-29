/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstractfactory.test;

import creational.abstractfactory.entity.Child_n;
import creational.abstractfactory.factory.AtaFactory;
import creational.abstractfactory.factory.Child_nFactory;

/**
 *
 * @author https://github.com/cbozan
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        Child_n child = (Child_n) AtaFactory.getAta(new Child_nFactory("properties1", "properties2"));
        System.out.println(child);
    }
}
