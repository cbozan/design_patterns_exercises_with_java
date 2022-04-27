/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstractfactory.factory;

import creational.abstractfactory.abstractfactory.AtaAbstractFactory;
import creational.abstractfactory.ata.Ata;

/**
 *
 * @author https://github.com/cbozan
 */
public class AtaFactory {
    
    public static Ata getAta(AtaAbstractFactory aaf){
        return aaf.createAta();
    }
    
}
