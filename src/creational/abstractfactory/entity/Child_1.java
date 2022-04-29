/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.abstractfactory.entity;

import creational.abstractfactory.ata.Ata;

/**
 *
 * @author https://github.com/cbozan
 */
public class Child_1 extends Ata{
    private String p1;
    private String p2;
    
    public Child_1(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    @Override
    public String getP1() {
        return p1;
    }

    @Override
    public String getP2() {
        return p2;
    }
}
