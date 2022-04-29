/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.singleton;

/**
 *
 * @author https://github.com/cbozan
 */
public class StatikBlokBaslatma /* Static block initialization */{
    
    private static StatikBlokBaslatma instance;
    
    // private constructor
    private StatikBlokBaslatma(){}
    
    // static block
    static{
        try{
            instance = new StatikBlokBaslatma();
        } catch(Exception ex){/* Error */}
    }
    
    public static StatikBlokBaslatma getInstance(){
        return instance;
    }
}
