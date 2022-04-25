/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton;

/**
 *
 * @author https://github.com/cbozan
 */
public class BillPughSingleton {
    
    private BillPughSingleton(){}
    
    // This class, is not loaded into memory unless getInstance() method is called
    // Bu sınıf, getInstance() yöntemi çağrılmadığı sürece hafızaya yüklenmez.
    private static class SingletonYardimcisi /* SingletonHelper */{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonYardimcisi.instance;
    }
}
