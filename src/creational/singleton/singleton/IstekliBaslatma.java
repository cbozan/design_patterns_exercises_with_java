/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.singleton;

/**
 *
 * @author https://github.com/cbozan
 */
public class IstekliBaslatma /* Eager initialization */ {
    
    // object is created even if not used
    // ihtiyaç duyulmasa bile nesne oluşturulur 
    private static final IstekliBaslatma instance = new IstekliBaslatma();
    
    // private constructor
    private IstekliBaslatma(){}
    
    public static IstekliBaslatma getInstance(){
        return instance;
    }
}
