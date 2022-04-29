/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.singleton;

/**
 *
 * @author https://github.com/cbozan
 */
public class ThreadGuvenligi /* Thread safe */{
    private static ThreadGuvenligi instance;
    
    // private constructor
    private ThreadGuvenligi(){}
    
    // poor performance, so the double-control locking (or double checked locking) principle is used
    // Zayıf performans, bu nedenle çift kontrollü kilitleme prensibi kullanılır
    public static synchronized ThreadGuvenligi getInstance(){
        if(instance == null){
            instance = new ThreadGuvenligi();
        }
        return instance;
    }
    
    /* double checked locking principle - çift kontrollü kilitleme prensibi
    
    public static ThreadGuvenligi getInstance(){
        if(instance == null){
            synchronized(ThreadGuvenligi.class){
                if(instance == null){
                    instance = new ThreadGuvenligi();
                }
            }
        }
        return instance;
    }
    
    */
}
