package main;

import creational.abstractfactory.abstractfactory.AtaAbstractFactory;
import creational.abstractfactory.ata.Ata;
import creational.abstractfactory.factory.AtaFactory;
import creational.abstractfactory.factory.Child_1Factory;
import creational.singleton.IstekliBaslatma;
import creational.singleton.StatikBlokBaslatma;

/**
 *
 * @author https://github.com/cbozan
 */
public class Main {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(
                AtaFactory.getAta(new Child_1Factory("properties1", "properties1")).toString()
        );
    }
    
}
