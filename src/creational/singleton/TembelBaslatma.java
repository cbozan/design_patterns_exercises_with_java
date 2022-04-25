/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton;

/**
 *
 * @author https://github.com/cbozan
 */
public class TembelBaslatma {
    private static TembelBaslatma instance;
    
    // private constructor
    private TembelBaslatma(){}
    
    public static TembelBaslatma getInstance(){
        if(instance == null){
            instance = new TembelBaslatma();
        }
        return instance;
    }
}
