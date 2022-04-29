/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factory.entity;

/**
 *
 * @author https://github.com/cbozan
 */
public abstract class Ata{
    public abstract String getP1();
    public abstract String getP2();

    @Override
    public String toString() {
        return "P1 : " + getP1() + ", P2 : " + getP2();
    }
}
