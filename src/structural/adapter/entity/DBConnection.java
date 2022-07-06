/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.entity;

/**
 *
 * @author https://github.com/cbozan
 */
public class DBConnection {
    private String connection;
    public DBConnection(String connection){
        this.connection = connection;
    }
    public String getConnection(){
        return connection;
    }
    
    public void setConnection(String connection){
        this.connection = connection;
    }
}
