/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.builder.test;

import creational.builder.builder.CokOzellikliNesne;

/**
 *
 * @author https://github.com/cbozan
 */
public class BuilderTest {
    
    public static void main(String[] args){
        
        CokOzellikliNesne.CokOzellikliNesneBuilder builder = new CokOzellikliNesne.CokOzellikliNesneBuilder(3 /* rastgele*/);
        CokOzellikliNesne nesne = builder.setP2("Properties2").setP3(true).build();
        
//        // OR
//         builder = builder.setP2("Properties2");
//         builder = builder.setP3(false);
//         CokOzellikliNesne nesne = builder.build();
        
        System.out.println(nesne.toString());
        
    }
    
}
