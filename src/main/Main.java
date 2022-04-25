package main;

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
        IstekliBaslatma.getInstance();
        StatikBlokBaslatma.getInstance();
    }
    
}
