/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstractfactory.factory;

import creational.abstractfactory.childs.Child_1;
import creational.abstractfactory.abstractfactory.AtaAbstractFactory;
import creational.abstractfactory.ata.Ata;

/**
 *
 * @author https://github.com/cbozan
 */
public class Child_1Factory implements AtaAbstractFactory{
    private String p1;
    private String p2;
    
    public Child_1Factory(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Ata createAta() {
        return new Child_1(p1, p2);
    }
    
    
}
