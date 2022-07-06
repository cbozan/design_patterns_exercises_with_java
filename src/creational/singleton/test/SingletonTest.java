/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.singleton.test;

import creational.singleton.singleton.BillPughSingleton;
import creational.singleton.singleton.IstekliBaslatma;
import creational.singleton.singleton.StatikBlokBaslatma;
import creational.singleton.singleton.TembelBaslatma;
import creational.singleton.singleton.ThreadGuvenligi;
import java.lang.reflect.Constructor;

/**
 *
 * @author https://github.com/cbozan
 */
public class SingletonTest {
    public static void main(String[] args){
        
        // İstekli başlatma - Eager initialization
        IstekliBaslatma instance1_1 = IstekliBaslatma.getInstance();
        IstekliBaslatma instance1_2 = IstekliBaslatma.getInstance();
        if(instance1_1 == instance1_2){
            System.out.println("Istekli başlatma singleton test sonucu : " + "Aynı nesneye işaret edildiğinden test başarılı.");
        }
        
        //Statik blok başlatma - Static block initialization
        StatikBlokBaslatma instance2_1 = StatikBlokBaslatma.getInstance();
        StatikBlokBaslatma instance2_2 = StatikBlokBaslatma.getInstance();
        if(instance2_1 == instance2_2){
            System.out.println("Statik blok başlatma singleton test sonucu : " + "Aynı nesneye işaret edildiğinden test başarılı.");
        }
        
        // Tembel başlatma - Lazy initialization
        TembelBaslatma instance3_1 = TembelBaslatma.getInstance();
        TembelBaslatma instance3_2 = TembelBaslatma.getInstance();
        if(instance3_1 == instance3_2){
            System.out.println("Tembel başlatma singleton test sonucu : " + "Aynı nesneye işaret edildiğinden test başarılı.");
        }
        
        // Thread güvenliği - Thread safe
        ThreadGuvenligi instance4_1 = ThreadGuvenligi.getInstance();
        ThreadGuvenligi instance4_2 = ThreadGuvenligi.getInstance();
        if(instance4_1 == instance4_2){
            System.out.println("Thread Güvenliği singleton test sonucu : " + "Aynı nesneye işaret edildiğinden test başarılı.");
            
        }
        
        // Bill Pugh Singleton
        BillPughSingleton instance5_1 = BillPughSingleton.getInstance();
        BillPughSingleton instance5_2 = BillPughSingleton.getInstance();
        if(instance5_1 == instance5_2){
            System.out.println("Bill Pugh singleton test sonucu : " + "Aynı nesneye işaret edildiğinden test başarılı.");
            System.out.println("instance5_1 hashcode : " + instance5_1.hashCode());
            System.out.println("instance5_2 hashcode : " + instance5_2.hashCode());
        }
        
        
        
        // BillPughSingleton'ın amacını yok etme
        // BillPughSingleton crack
        BillPughSingleton instance = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = null;
        
        try{
            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                instance2 = (BillPughSingleton)constructor.newInstance();
                break;
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("instance hashcode : " + instance.hashCode());
        System.out.println("instance1 hashcode : " + instance2.hashCode());
    }
}
